package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCliente;
    
    @Basic
    private String nombreMascota;
    private String razaMascota;
    private String colorMascota;
    private String esAlergico;
    private String atencionEspecial;
    private String nombreDueño;
    private String celularDueño;
    private String observaciones;
    
    
    public Mascota() {
    }

    public Mascota(int idCliente, String nombreMascota, String razaMascota, String colorMascota, String esAlergico, String atencionEspecial, String nombreDueño, String celularDueño, String observaciones) {
        this.idCliente = idCliente;
        this.nombreMascota = nombreMascota;
        this.razaMascota = razaMascota;
        this.colorMascota = colorMascota;
        this.esAlergico = esAlergico;
        this.atencionEspecial = atencionEspecial;
        this.nombreDueño = nombreDueño;
        this.celularDueño = celularDueño;
        this.observaciones = observaciones;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRazaMascota() {
        return razaMascota;
    }

    public void setRazaMascota(String razaMascota) {
        this.razaMascota = razaMascota;
    }

    public String getColorMascota() {
        return colorMascota;
    }

    public void setColorMascota(String colorMascota) {
        this.colorMascota = colorMascota;
    }

    public String getEsAlergico() {
        return esAlergico;
    }

    public void setEsAlergico(String esAlergico) {
        this.esAlergico = esAlergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getCelularDueño() {
        return celularDueño;
    }

    public void setCelularDueño(String celularDueño) {
        this.celularDueño = celularDueño;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    

}
