package com.example.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.TipoCambio;

@Repository
public interface ITipoCambioRepository extends JpaRepository<TipoCambio,Double> {
    @Query("SELECT t.tipoCambio FROM TipoCambio t WHERE t.monedaOrigen = :monedaOrigen AND t.monedaDestino = :monedaDestino")
    Double getFactor(@Param("monedaOrigen") String monedaOrigen, @Param("monedaDestino") String monedaDestino);
}
