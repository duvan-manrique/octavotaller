/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.Serializable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
 *
 * @author duvan
 */
@Named(value = "vistac")
@Dependent
public class Vistac implements Serializable{

    /**
     * Creates a new instance of Vistac
     */
    
    @Size(min=2, max=30,message="debe tener de 2 a 30 caracteres")
    String nom;
    
    @NotNull (message="no puede ser null")
    String ape;
    
    @Past(message="fecha no valida")
    @Temporal(TemporalType.DATE)
    //@Future
    Date fech;
    
    
    @Pattern(regexp=".+@.+\\.[a-z]+", message="Invalid email address!")
   String ema;
    
    @NotNull @Min(4) @Max(100)
     int num;
    
    @DecimalMin(value = "1.00", message = "Cantidad minima es invalida")
    @DecimalMax(value = "100000.00", message = "Cantidad maxima es invalida")
    double mone;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public Date getFech() {
        return fech;
    }

    public void setFech(Date fech) {
        this.fech = fech;
    }

    public String getEma() {
        return ema;
    }

    public void setEma(String ema) {
        this.ema = ema;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMone() {
        return mone;
    }

    public void setMone(double mone) {
        this.mone = mone;
    }

    
    public Vistac() {
    }
    
}
