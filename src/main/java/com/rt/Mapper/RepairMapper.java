package com.rt.Mapper;

import org.springframework.stereotype.Component;

import com.rt.DTO.RepairReqDTO;
import com.rt.DTO.RepairRespDTO;
import com.rt.Entity.Repair;

@Component
public class RepairMapper {

    // ReqDTO → Entity
    public Repair toEntity(RepairReqDTO reqDto) {
        Repair repair = new Repair();
        repair.setCustomerName(reqDto.getCustomerName());
        repair.setProductName(reqDto.getProductName());
        repair.setImei(reqDto.getImei());
        repair.setIssueDescription(reqDto.getIssueDescription());
        repair.setRepairStatus(reqDto.getRepairStatus());
        repair.setRepairDate(reqDto.getRepairDate());
        repair.setDeliveryDate(reqDto.getDeliveryDate());
        repair.setRepairCost(reqDto.getRepairCost());
        return repair;
    }

    // RespDTO → Entity (optional, only if needed)
    public Repair toEntity(RepairRespDTO repairdto) {
        Repair repair = new Repair();
        repair.setRepairId(repairdto.getRepairId());
        repair.setCustomerName(repairdto.getCustomerName());
        repair.setProductName(repairdto.getProductName());
        repair.setImei(repairdto.getImei());
        repair.setIssueDescription(repairdto.getIssueDescription());
        repair.setRepairStatus(repairdto.getRepairStatus());
        repair.setRepairDate(repairdto.getRepairDate());
        repair.setDeliveryDate(repairdto.getDeliveryDate());
        repair.setRepairCost(repairdto.getRepairCost());
        return repair;
    }

    // Entity → RespDTO
    public RepairRespDTO toDto(Repair dataadd) {
        RepairRespDTO dto = new RepairRespDTO();
        dto.setRepairId(dataadd.getRepairId());
        dto.setCustomerName(dataadd.getCustomerName());
        dto.setProductName(dataadd.getProductName());
        dto.setImei(dataadd.getImei());
        dto.setIssueDescription(dataadd.getIssueDescription());
        dto.setRepairStatus(dataadd.getRepairStatus());
        dto.setRepairDate(dataadd.getRepairDate());
        dto.setDeliveryDate(dataadd.getDeliveryDate());
        dto.setRepairCost(dataadd.getRepairCost());
        return dto;
    }
}
