/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo.controler;

/**
 *
 * @author Yasmina
 */
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import pojo.service.servicioPersona;

@Named
@ViewScoped
public class ReadPojo implements Serializable {
    private static final long serialVersionUID=1L;
    
   // @EJB
   // private serPersona serPersona;
    @PostConstruct
    public void init(){
        
    }
    
}
