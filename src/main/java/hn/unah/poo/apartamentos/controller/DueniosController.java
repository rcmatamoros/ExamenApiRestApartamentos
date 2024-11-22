package hn.unah.poo.apartamentos.controller;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.apartamentos.dtos.DueniosDTO;
import hn.unah.poo.apartamentos.modelo.Duenios;
import hn.unah.poo.apartamentos.servicio.CondominiosServicio;
import hn.unah.poo.apartamentos.servicio.DueniosServicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




 //method=RequestMethod.GE)




 @RestController
 @RequestMapping("/api/duenio")
public class DueniosController {

 @Autowired
    private DueniosServicio dServicio;

    @PostMapping("/insertar/nuevo")
    public String insertar(@RequestBody DueniosDTO entity) {
        return this.dServicio.insertar(entity);
            
    }

     @GetMapping("/obtener/{dni}")
     public Optional<DueniosDTO> buscar(@PathVariable(name="dni")   String dni) {

         return this.dServicio.buscar(dni);
        }


     @GetMapping("/obtener/todos")
     
    public List<Duenios> obtenerTodos(){

       return this.dServicio.obtenerTodos.findAll();
   }
     


    }
/*3.1.Para el método crear el parámetro deberá ser de tipo @requestbody
3.2.Para el método buscar por id el parámetro será un @pathvariable
3.3.Para el método obtener todos no recibirá parámetro */