package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();         

    public void guardar(String nombreMascota, String razas, String colores, String duenios, String celDuenios, String obs, String alergias, String especiales) {
        
        //crea el dueño y asignma sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(duenios);
        duenio.setCel_duenio(celDuenios);
        
        //creamos la mascota y asigna los valores
        Mascota mascota = new Mascota();
        mascota.setNombre_mascota(nombreMascota);
        mascota.setColor(colores);
        mascota.setRaza(razas);
        mascota.setAlergico(alergias);
        mascota.setAtencion_especia(duenios);
        mascota.setObservaciones(especiales);
        mascota.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, mascota);
    }
}
