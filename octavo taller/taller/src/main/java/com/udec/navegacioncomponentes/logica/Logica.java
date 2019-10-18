/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.navegacioncomponentes.logica;

/**
 *
 * @author ivan camilo
 */
public class Logica {
    
    String mensaje;
    public Logica() {
        
    }
    
    public boolean validarTamaño(String frase){
        if(frase.length()<8){
            this.setMensaje("El tamaño de la frase debe ser mayor a 8 caracteres");   
            return false;
        }else{
        return  true;
        }
    }
    
    public boolean ValidarCorreo(String frase){
        if(frase.contains("@gmail.com") || frase.contains("@hotmail.com") ||frase.contains("@yahoo.com") || frase.contains("@udecundinamarca.edu.co") ){
            return  true;
            
        }else{
            this.setMensaje("El Correo no es valido");   
            return false;
        }
    }
    
    public boolean ValidarNumeros(String frase){
        try{
            long i = Long.parseLong(frase);
            return i >= 18;
        }catch(Exception e){
              this.setMensaje("El numero no es valido");   
            return false;
        }
    }
    
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
