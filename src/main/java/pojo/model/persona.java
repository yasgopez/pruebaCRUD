/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo.model;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Yasmina
 */

  
public class persona {
           
    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento TypeDocumento;
    private String numeroDocumento;
    private Date fechaDeNacimiento;

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
   
   
    public Date getFechaDeNacimiento() {
          return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    
     public persona(){            
        }
    
    public persona(int id, String nombres, String apellidos, TipoDocumento TypeDocumento, String numeroDocumento, Date fechaDeNacimiento){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.TypeDocumento = TypeDocumento;
        this.numeroDocumento=numeroDocumento;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public persona(int id, String nombres, String apellidos, TipoDocumento TypeDocumento, String numeroDocumento){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.TypeDocumento = TypeDocumento;
        this.numeroDocumento=numeroDocumento;
    
    }
    
    public persona(int id, String nombres, String apellidos){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public TipoDocumento getTypeDocumento(){
            return TypeDocumento;
        }
    public void setTypeDocumento(TipoDocumento n) {
            TypeDocumento=n;            
        }
     public void setTypeDocumento(int n) {
            TypeDocumento.setiddoc(n);            
        }

     
    
}


