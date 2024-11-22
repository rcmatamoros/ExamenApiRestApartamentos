package hn.unah.poo.apartamentos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import hn.unah.poo.apartamentos.modelo.Mensualidades;

@Repository
public interface MensualidadesRepositorio  extends JpaRepository<Mensualidades, Integer>{

}
