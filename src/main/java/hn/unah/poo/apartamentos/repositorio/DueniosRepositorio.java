package hn.unah.poo.apartamentos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import hn.unah.poo.apartamentos.modelo.Duenios;

@Repository
public interface DueniosRepositorio extends JpaRepository<Duenios, String>{

}
