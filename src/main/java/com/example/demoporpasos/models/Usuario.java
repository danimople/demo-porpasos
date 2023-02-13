package com.example.demoporpasos.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

    @Getter @Setter @Id
    @Column(name= "id")
    private Long id;
    @Getter @Setter @Column(name= "nombre")
    private  String nombre;
    @Getter @Setter @Column(name= "apellidos")
    private  String apellido;
    @Getter @Setter @Column(name= "email")
    private  String email;
    @Getter @Setter @Column(name= "telefono")
    private  String telefono;
    @Getter @Setter @Column(name= "password")
    private  String password;

}
