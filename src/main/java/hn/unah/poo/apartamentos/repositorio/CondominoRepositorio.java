package hn.unah.poo.apartamentos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.poo.apartamentos.modelo.Condominios;

@Repository
public interface CondominoRepositorio extends JpaRepository<Condominios, Integer>{

}
