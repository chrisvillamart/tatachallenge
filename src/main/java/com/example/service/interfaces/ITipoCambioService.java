package com.example.service.interfaces;

import com.example.dto.ResultDTO;
import com.example.dto.TipoCambioDTO;

public interface ITipoCambioService {

	ResultDTO getTipoCambio(String monedaOrigen, String monedaDestino, Double monto);

	ResultDTO insertTipoCambio(TipoCambioDTO tipoCambioDTO);
 

}
