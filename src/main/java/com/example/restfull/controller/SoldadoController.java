package com.example.restfull.controller;

import com.example.restfull.controller.request.SoldadoEditRequest;
import com.example.restfull.dto.Soldado;
import com.example.restfull.service.SoldadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;

    public SoldadoController(SoldadoService soldadoService) {
        this.soldadoService = soldadoService;
    }

    @GetMapping("/{level}")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable Integer level) {
        Soldado soldado = soldadoService.buscarSoldado(level);
        return ResponseEntity.ok(soldado);
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado) {
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{level}")
    public ResponseEntity editarSoldado(@PathVariable Integer level, @RequestBody SoldadoEditRequest soldado) {
        soldadoService.editarSoldado(level, soldado);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{level}")
    public ResponseEntity deletarSoldado(@PathVariable Integer level) {
        soldadoService.deletarSoldado(level);
        return ResponseEntity.ok().build();
    }
}
