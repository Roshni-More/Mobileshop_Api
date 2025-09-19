package com.rt.serviceinterface;

import java.util.List;

import com.rt.DTO.RepairReqDTO;
import com.rt.DTO.RepairRespDTO;

public interface RepairInterface {

	RepairRespDTO repairproduct(RepairRespDTO repairdto);

	List<RepairRespDTO> getallproducts();

	boolean deleteById(int repairId);

	RepairRespDTO showupdate(int repairId);

	RepairRespDTO showdata(RepairReqDTO repairreqdto);

}
