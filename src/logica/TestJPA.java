package logica;

import IGU.IGU;
import java.util.Date;
import java.util.List;
import persistencia.ControllerPersistence;

public class TestJPA {
    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        IGU principal = new IGU(control);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
              
    }
}
