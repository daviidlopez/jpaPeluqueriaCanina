package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nomMascota, String raza, String color, String observaciones, String alergico, String atEspecial, String nomDuenio, String celDuenio) {
        Duenio duenio = new Duenio(nomDuenio, celDuenio);
        Mascota mascota = new Mascota(nomMascota, raza, color, alergico, atEspecial, observaciones, duenio);
        controlPersis.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota buscarMascota(int num_cliente) {
        return controlPersis.buscarMascota(num_cliente);
    }
    
    public Duenio buscarDuenio(int num_cliente) {
        return controlPersis.buscarDuenio(num_cliente);
    }

    public void editarMascota(Mascota mascota) {
        controlPersis.editarMascota(mascota);
    }
    
}

