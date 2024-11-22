package hn.unah.poo.apartamentos.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="mensualidades")
public class Mensualidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensualidad;

    private int numeroCondominio;
    private double monto;
    private char estado;
    private LocalDate fechaPago;

    @ManyToOne
    private Condominios condominiosMensual;
    
}
/* create table mensualidades(
     idMensualidad int AUTO_INCREMENT PRIMARY key,
     numeroCondominio int,
     monto decimal(14,2),
     estado char(1),
     fechaPago date,
     FOREIGN KEY(numeroCondominio) REFERENCES condominios(numeroCondominio)
     ); */