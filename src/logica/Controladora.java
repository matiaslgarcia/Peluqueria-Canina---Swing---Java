package logica;

import java.util.List;
import persistencia.ControllerPersistence;

public class Controladora {
    
    ControllerPersistence control = new ControllerPersistence();
    
    public void altaMascota(String nombreMascota, String razaMascota, String colorMascota,String mascotaAlergica, String mascotaAtencionEspecial, String nombreDueño, String celDueño, String observaciones){
        Mascota mascota = new Mascota();
        mascota.setNombreMascota(nombreMascota);
        mascota.setRazaMascota(razaMascota);
        mascota.setColorMascota(colorMascota);
        mascota.setEsAlergico(mascotaAlergica);
        mascota.setAtencionEspecial(mascotaAtencionEspecial);
        mascota.setNombreDueño(nombreDueño);
        mascota.setCelularDueño(celDueño);
        mascota.setObservaciones(observaciones);
        
        control.crearMascota(mascota);
    }   
}
