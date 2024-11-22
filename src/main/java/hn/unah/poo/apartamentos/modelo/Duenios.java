package hn.unah.poo.apartamentos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name="duenios")
public class Duenios {
    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

 @OneToMany
private  Condominios condominiosDuenio;

}
/*create table duenios(
    dni varchar(18) PRIMARY KEY,
    nombre varchar(50),
    apellido varchar(50),
    telefono varchar(50)
    
); */