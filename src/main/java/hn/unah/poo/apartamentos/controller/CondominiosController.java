package hn.unah.poo.apartamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.apartamentos.dtos.CondominiosDTO;
import hn.unah.poo.apartamentos.dtos.DueniosDTO;
import hn.unah.poo.apartamentos.servicio.CondominiosServicio;

@RestController
@RequestMapping("/api/duenio")
public class CondominiosController {

    
    @Autowired
    private CondominiosServicio cServicio;

    @PostMapping("/insertar/nuevo")
    public String insertarC(@RequestBody CondominiosDTO entity) {
        return this.cServicio.insertarC(entity);
            
    }
}
