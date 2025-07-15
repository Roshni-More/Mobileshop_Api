package com.rt.purchaseInterface;

import java.util.List;


import com.rt.DTO.PurchaseRequestDTO;
import com.rt.DTO.PurchaseRespDTO;


public interface PurchaseInterface {
	// Save new purchase
    PurchaseRespDTO pruchasemanage(PurchaseRequestDTO purchaserequestdto);

    // Get all purchase records
    List<PurchaseRespDTO> getAllPrducts();

    PurchaseRespDTO getPurchaseById(int id);

	PurchaseRespDTO updatePurchase(PurchaseRequestDTO dto);
}
