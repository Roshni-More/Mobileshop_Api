package com.rt.serviceinterface;

import java.util.List;

import com.rt.DTO.RepairRespDTO;

public interface RepairInterface {

	RepairRespDTO repairproduct(RepairRespDTO repairdto);

	List<RepairRespDTO> getallproducts();

}
