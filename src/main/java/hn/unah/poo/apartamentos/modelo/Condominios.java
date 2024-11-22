package hn.unah.poo.apartamentos.modelo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name="condominios")
public class Condominios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroCondominio ;
    private int nivel;
   private double area;
   private String color;
   private int parqueos;
   private String dni; 


   //@JoinColumn( referencedColumnName "dni")//error
    @OneToMany
   private Mensualidades mensualidadCon;

   @JsonIgnore
   @ManyToOne
   private List<Duenios> dueniosCon;
}
/*create table condominios(
    numeroCondominio int AUTO_INCREMENT PRIMARY key,
    nivel int,
    area decimal(14,2),
    color varchar(15),
    parqueos int,
    dni varchar(18),
    FOREIGN KEY(dni) REFERENCES duenios(dni)
 );
  */


/*200*1.5
  cambiara fechaPago
  2024-11-21
  2024-12-1 */

  