package hn.unah.poo.apartamentos.servicio;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.apartamentos.dtos.CondominiosDTO;
import hn.unah.poo.apartamentos.dtos.DueniosDTO;
import hn.unah.poo.apartamentos.modelo.Condominios;
import hn.unah.poo.apartamentos.modelo.Duenios;
import hn.unah.poo.apartamentos.repositorio.CondominoRepositorio;

@Service
public class CondominiosServicio {

    @Autowired
    private CondominoRepositorio cRepositorio;

    private ModelMapper modelMapper;

     public String insertarC(CondominiosDTO nvoCondominio){
        if (this.cRepositorio.existsById(nvoCondominio.getNumeroCondominio())) {
            return "Ya existe el dueño";
        }

        modelMapper = new ModelMapper();

        Condominios coBd = this.cRepositorio.modelMapper.map(nvoCondominio, Condominios.class);
        this.cRepositorio.save(coBd);
                return "Dueño agregado Correctamente";
    }




}


