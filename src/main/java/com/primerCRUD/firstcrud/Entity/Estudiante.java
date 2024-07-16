package com.primerCRUD.firstcrud.Entity;

import jakarta.persistence.*;

@Entity
//aca le indico el nombre de la cabecera que tendra la tabla en la base de datas, en plural
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    // con la notacion column le doy el nombre a la columna, no puede ser nulo y su tamaño
    @Column(name = "nombre", nullable = false, length =50)
    private String nombre;

    @Column(name = "apellido", nullable = false, length =50)
    private String apellido;
    // a diferencia del resto le agrego un unique true para que el email no se pueda repetir
    @Column(name = "email", nullable = false, length =50, unique = true)
    private String email;


    // en este caso no voy a usar el proyecto Lombok y los Getter,Setter,ToString y Constructores  son hecho a mano
    //agrego constructor vacio por la nomeclatura de los javaBeans
    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    public Estudiante( String nombre, String apellido, String email) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
