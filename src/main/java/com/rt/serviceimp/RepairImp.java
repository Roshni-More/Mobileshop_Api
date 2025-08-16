package com.rt.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.RepairRespDTO;
import com.rt.Dao.RepairDao;
import com.rt.Entity.Repair;
import com.rt.Mapper.RepairMapper;
import com.rt.serviceinterface.RepairInterface;

@Service
public class RepairImp implements RepairInterface{

	@Autowired
	private RepairDao repairdao;
	
	@Autowired
	private RepairMapper repairmapper;
	
	@Override
	public RepairRespDTO repairproduct(RepairRespDTO repairdto) {
		Repair entity=repairmapper.toEntity(repairdto);
		Repair dataadd=repairdao.save(entity);
		RepairRespDTO respdto=repairmapper.toDto(dataadd);
		return respdto;
	}

	@Override
	public List<RepairRespDTO> getallproducts() {
		List<Repair> entitylist=repairdao.findAll();
		List<RepairRespDTO> dtolist=new ArrayList<>();
		
		for(Repair entity:entitylist) {
			RepairRespDTO dto=new RepairRespDTO();
			dto.setRepairId(entity.getRepairId());
	        dto.setCustomerName(entity.getCustomerName());
	        dto.setProductName(entity.getProductName());
	        dto.setImei(entity.getImei());
	        dto.setIssueDescription(entity.getIssueDescription());
	        dto.setRepairStatus(entity.getRepairStatus());
	        dto.setRepairDate(entity.getRepairDate());
	        dto.setDeliveryDate(entity.getDeliveryDate());
	        dto.setRepairCost(entity.getRepairCost());

	        dtolist.add(dto);
	    }
		return dtolist;
	}

}
