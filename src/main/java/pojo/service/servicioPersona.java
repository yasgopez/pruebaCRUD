/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import pojo.model.TipoDocumento;
import pojo.model.persona;

/**
 *
 * @author Yasmina
 */
@Stateless
public class servicioPersona {
    
    private List<persona> listapersonas = new ArrayList<persona>();
    
    public void create(persona p){
        p.setId(listapersonas.size()+1);
        listapersonas.add(p);          
    }

    public List<persona> getListapersonas() {
         listapersonas.add(new persona(1,"pepe","perez"));
        return listapersonas;
    }

    public void setListapersonas(List<persona> listapersonas) {
        this.listapersonas = listapersonas;
    }
    public void update(){
      }
    public void list() {
        
    }
    
    private List<TipoDocumento> ListaDocumento;
    
    public void  ListaDocumento(){
        this.ListaDocumento = new ArrayList<>(3);        
        this.ListaDocumento.add(new TipoDocumento(1,"Cedula"));
        this.ListaDocumento.add(new TipoDocumento(2,"Tarjeta de Identidad"));
        this.ListaDocumento.add(new TipoDocumento(3,"Pasaporte"));
                   
    }
    
    public void delete(){
      
    }
}