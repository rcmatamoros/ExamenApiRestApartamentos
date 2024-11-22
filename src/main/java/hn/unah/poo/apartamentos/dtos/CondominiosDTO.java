package hn.unah.poo.apartamentos.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CondominiosDTO {

    private int numeroCondominio ;
    private int nivel;
   private double area;
   private String color;
   private int parqueos;
   private String dni; 
}
