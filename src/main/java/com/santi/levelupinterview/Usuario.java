package com.santi.levelupinterview;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
//DECIMOS A QUE TABLA LE PERTENECE
@Table(name = "usuarios")
public class Usuario {

    @Id //QUE APUNTE AL ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para usar identity en Oracle 12c+
    private int id;
    //QUE APUNTE AL NOMBRE
    @Column(name = "nombre")
    private String nombre;
    //QUE APUNTE AL EMAIL
    @Column(name = "email")
    private String email;
    //QUE APUNTE A LA CONTRASENA
    @Column(name = "contrasena")
    private String contrasena;

    // Constructor vacío obligatorio para JPA
    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Constructor con parámetros (opcional)
    public Usuario(int id, String nombre, String email, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    public Usuario() {

    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }


    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}