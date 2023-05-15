package com.example.controller; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.TipoCambioDTO;
import com.example.dto.ResultDTO;
import com.example.service.interfaces.ITipoCambioService;

@RestController
@RequestMapping("/api")
public class TipoCambioController {

    @Autowired
    private ITipoCambioService tipoCambioService;
    
    @GetMapping("/tipoCambio")
    public ResponseEntity<ResultDTO> getTipoCambio(@RequestParam("monedaOrigen") String monedaOrigen, @RequestParam("monedaDestino") String monedaDestino,@RequestParam("monto") Double monto ) { 
    	ResultDTO resultadoGet = tipoCambioService.getTipoCambio(monedaOrigen, monedaDestino, monto);
  
        return ResponseEntity.ok(resultadoGet);
    }
    @PostMapping("/tipoCambio")
    public ResponseEntity<ResultDTO> insertTipoCambio(@RequestBody TipoCambioDTO tipoCambioDTO) {
    	ResultDTO resultadoInsert = tipoCambioService.insertTipoCambio(tipoCambioDTO); 
        return ResponseEntity.ok(resultadoInsert);
    }
     
    
}
