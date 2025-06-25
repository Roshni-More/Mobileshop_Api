package com.rt.serviceinterface;

import com.rt.DTO.UpdateRequestDTO;
import com.rt.DTO.UpdateResponseDTO;


public  interface UpdateInterface {

	UpdateResponseDTO showUpdate(int id);

	UpdateResponseDTO showinsertdata(UpdateRequestDTO updatereqdto);

	boolean deleteById(int id);

}
