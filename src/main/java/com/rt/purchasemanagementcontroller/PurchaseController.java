package com.rt.purchasemanagementcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.PurchaseRequestDTO;
import com.rt.DTO.PurchaseRespDTO;
import com.rt.purchaseInterface.PurchaseInterface;

@RestController
@CrossOrigin("*")
public class PurchaseController {
	 @Autowired
	    private PurchaseInterface purchaseinterface;

	    // 🔹 Save a new purchase
	    @PostMapping("/save")
	    public PurchaseRespDTO purchaseProduct(@RequestBody PurchaseRequestDTO purchaseRequestDTO) {
	        PurchaseRespDTO purchaseRespDTO = purchaseinterface.pruchasemanage(purchaseRequestDTO);
	        System.out.println(purchaseRespDTO);
	        return purchaseRespDTO;
	    }

	    // 🔹 Get all purchases
	    @GetMapping("/list")
	    public List<PurchaseRespDTO> getAllPurchases() {
	        List<PurchaseRespDTO> purchaseData = purchaseinterface.getAllPrducts();
	        System.out.println("Purchases " + purchaseData);
	        return purchaseData;
	    }
	
}
