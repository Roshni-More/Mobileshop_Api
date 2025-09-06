package com.rt.serviceinterface;

import java.util.List;

import com.rt.DTO.SaleRequestDTO;
import com.rt.DTO.SaleResponseDTO;

public interface SaleInterface {

	SaleResponseDTO salemanage(SaleRequestDTO salereqdto);

	List<SaleResponseDTO> getAllPrducts();

	SaleResponseDTO getSaleById(int id);

	SaleResponseDTO updateSale(SaleRequestDTO request);

}
