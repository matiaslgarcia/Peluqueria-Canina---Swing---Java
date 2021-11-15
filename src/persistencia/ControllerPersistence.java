package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Controladora;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControllerPersistence {
    
    MascotaJpaController mascotaJPA = new MascotaJpaController ();
    
    public void crearMascota(Mascota alu){
        
        try {
            mascotaJPA.create(alu);
        } catch (Exception ex) {
            System.out.println("No se pudo Registrar a su Msacota");
        }
        
    }

}
