package com.rt.serviceimp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.SaleRequestDTO;
import com.rt.DTO.SaleResponseDTO;
import com.rt.Dao.CustomerDao;
import com.rt.Dao.ProductDao;
import com.rt.Dao.SalesDao;
import com.rt.Entity.Customer;
import com.rt.Entity.ProductEntity;
import com.rt.Entity.Sales;
import com.rt.Mapper.SalesMapper;
import com.rt.serviceinterface.SaleInterface;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SaleImp implements SaleInterface {

	@Autowired
	private SalesDao salesdao;

	@Autowired
	private ProductDao productdao;

	@Autowired
	private CustomerDao customerdao;

	@Autowired
	private SalesMapper salesmapper;

	@Override
	public SaleResponseDTO salemanage(SaleRequestDTO salereqdto) {
		ProductEntity product = productdao.findById(salereqdto.getProductId())
				.orElseThrow(() -> new RuntimeException("Product not found"));

		Customer customer = customerdao.findById(salereqdto.getCustomerId())
				.orElseThrow(() -> new RuntimeException("Customer not found"));
		Sales sale = salesmapper.toEntity(salereqdto, product, customer);
		Sales savedSale = salesdao.save(sale);
		return salesmapper.toDto(savedSale);

	}

	@Override
	public List<SaleResponseDTO> getAllPrducts() {
		List<Sales> entityList = salesdao.findByIsDeletedFalse();
		List<SaleResponseDTO> dtoList = new ArrayList<>();

		for (Sales sale : entityList) {
			SaleResponseDTO dto = salesmapper.toDto(sale);
			dtoList.add(dto);
		}

		return dtoList;
	}

	@Override
	public SaleResponseDTO getSaleById(int id) {
		Sales sale = salesdao.findBySaleId(id).orElseThrow(() -> new RuntimeException("Sale not found with id " + id));

		return new SaleResponseDTO(sale.getSaleId(), sale.getCustomer().getCustomerName(), sale.getProduct().getName(),
				sale.getQuantity(), sale.getSaleDate());
	}

	@Override
	public SaleResponseDTO updateSale(SaleRequestDTO saleRequest) {
		Sales sale = salesdao.findBySaleId(saleRequest.getSaleId())
				.orElseThrow(() -> new EntityNotFoundException("Sale not found with id " + saleRequest.getSaleId()));

		Customer customer = customerdao.findById(saleRequest.getCustomerId()).orElseThrow(
				() -> new EntityNotFoundException("Customer not found with id " + saleRequest.getCustomerId()));

		ProductEntity product = productdao.findById(saleRequest.getProductId()).orElseThrow(
				() -> new EntityNotFoundException("Product not found with id " + saleRequest.getProductId()));

		sale.setQuantity(saleRequest.getQuantity());
		sale.setSaleDate(saleRequest.getSaleDate());
		sale.setCustomer(customer);

		sale.setProduct(product);

		Sales updated = salesdao.save(sale);

		return new SaleResponseDTO(updated.getSaleId(), updated.getCustomer().getCustomerName(),
				updated.getProduct().getName(), updated.getQuantity(), updated.getSaleDate());
	}

	@Override
	public boolean deleteById(int saleId) {
		Optional<Sales> optionalSales = salesdao.findById(saleId);
		if (optionalSales.isPresent()) {
			Sales sales = optionalSales.get();
			sales.setDeleted(true);
			salesdao.save(sales);
			return true;
		}
		return false;
	}

}
