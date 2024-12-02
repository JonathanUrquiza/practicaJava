package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa =new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
   
        //crear en la bd el dueño
        duenioJpa.create(duenio);

        //crear en la bd la mascota
        mascotaJpa.create(mascota);
    }
}
