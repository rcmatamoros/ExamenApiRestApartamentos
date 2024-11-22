package hn.unah.poo.apartamentos.servicio;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.apartamentos.dtos.DueniosDTO;
import hn.unah.poo.apartamentos.modelo.Duenios;
import hn.unah.poo.apartamentos.repositorio.DueniosRepositorio;

@Service
public class DueniosServicio {

    @Autowired
    private DueniosRepositorio dRepositorio;

    private ModelMapper modelMapper;


    public String insertar(DueniosDTO nvoDuenio){
        if (this.dRepositorio.existsById(nvoDuenio.getDni())) {
            return "Ya existe el dueño";
        }

        modelMapper = new ModelMapper();

        Duenios duenioBd = this.dRepositorio.modelMapper.map(nvoDuenio, Duenios.class);
        this.dRepositorio.save(duenioBd);
                return "Dueño agregado Correctamente";
    }

    //deleteById
    public String eliminar(String id){
        if (!this.dRepositorio.existsById(id){
            return "No existe";
        }
        this.dRepositorio.deleteById(id);
            return "Eliminado satisfactoriamnete";
        }
       
    

    public List<Duenios> obtenerTodos(){

       return this.dRepositorio.findAll();
   }

   public Optional<DueniosDTO> buscar(String id){

   Optional<Duenios> duenio = this.dRepositorio.existsById(id);
    
   
    Duenios duenioDto =  this.dRepositorio.modelMapper.map( duenio, DueniosDTO.class);

    return Optional.ofNullable(duenioDto);
   }

    /*o (insertar, buscar, obtener
todos y eliminar) para la entidad Duenios. */
}
