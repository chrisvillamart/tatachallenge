package com.example.service;
import com.example.service.interfaces.ITipoCambioService;
import com.example.dto.ResultDTO;
import com.example.dto.TipoCambioDTO;
import com.example.model.TipoCambio;
import com.example.repository.interfaces.ITipoCambioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoCambioService implements ITipoCambioService{
    @Autowired
    private ITipoCambioRepository tipoCambioRepository;

	@Override
	public ResultDTO getTipoCambio(String monedaOrigen, String monedaDestino, Double monto) { 

		ResultDTO result = new ResultDTO();
		try {
			TipoCambioDTO tipoCambioDTO = new TipoCambioDTO(monedaOrigen,monedaDestino,monto);
			
			Double factor = tipoCambioRepository.getFactor(monedaOrigen, monedaDestino);
			 
			tipoCambioDTO.setTipoCambio(factor); 
			if(factor == 0) {
				result.setCode(0);
				result.setMessage("No se encuentra el tipo de cambio indicado");
			}else {
				result.setCode(1);
				result.setMessage("Tipo de cambio encontrado"); 
				tipoCambioDTO.setMontoTipoCambio( tipoCambioDTO.getMonto() * factor);
			}  
			
			result.setResult(tipoCambioDTO); 
		}catch(Exception e) {
			result.setCode(0);
			result.setMessage("No se encuentra el tipo de cambio indicado"); 
		}
		
		return result;
	}

	@Override
	public ResultDTO insertTipoCambio(TipoCambioDTO tipoCambioDTO) {
		TipoCambio _tipoCambio = tipoCambioRepository
				.save(new TipoCambio(tipoCambioDTO.getMonedaOrigen(),tipoCambioDTO.getMonedaDestino(), tipoCambioDTO.getTipoCambio()));
		
		ResultDTO result = new ResultDTO();
		result.setCode(0);
		result.setMessage("Tipo de cambio Insertado");
		result.setResult(_tipoCambio);
		
		return result;
	}
 
}
