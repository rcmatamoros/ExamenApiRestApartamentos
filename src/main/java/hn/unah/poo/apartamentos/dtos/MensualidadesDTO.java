package hn.unah.poo.apartamentos.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MensualidadesDTO {

    private int idMensualidad;

    private int numeroCondominio;
    private double monto;
    private char estado;
    private LocalDate fechaPago; 
}
