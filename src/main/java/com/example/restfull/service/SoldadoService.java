package com.example.restfull.service;

import com.example.restfull.controller.request.SoldadoEditRequest;
import com.example.restfull.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(Integer id) {
        Soldado soldado = new Soldado();
        soldado.setLevel(1);
        soldado.setNome("Arthur");
        soldado.setArma("Machado");
        soldado.setRaca("Orc");
        return soldado;
    }

    public void criarSoldado(Soldado soldado) {

    }

    public void editarSoldado(Integer level, SoldadoEditRequest soldado) {

    }

    public void deletarSoldado(Integer level) {

    }
}
