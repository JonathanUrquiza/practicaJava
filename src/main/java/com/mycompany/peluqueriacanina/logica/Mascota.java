package com.mycompany.peluqueriacanina.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    private String nombre_mascota;
    private String color;
    private String raza;
    private String alergico;
    private String atencion_especia;
    private String observaciones;
    @OneToOne
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre_mascota, String color,String raza, String alergico, String atencion_especia, String observaciones, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especia = atencion_especia;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especia() {
        return atencion_especia;
    }

    public void setAtencion_especia(String atencion_especia) {
        this.atencion_especia = atencion_especia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "num_cliente = " + num_cliente + ", nombre_mascota = " + nombre_mascota + ", color = " + color + ", alergico = " + alergico + ", atencion_especia = " + atencion_especia + ", observaciones = " + observaciones + ", unDuenio = " + unDuenio + '}';
    }
    
    
    
    
    
    
}
