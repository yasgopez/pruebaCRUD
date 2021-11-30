/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo.controler;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import static org.primefaces.component.focus.FocusBase.PropertyKeys.context;
import pojo.model.TipoDocumento;
import pojo.model.persona;

/**
 *
 * @author Yasmina
 */
@Named
@RequestScoped
public class createperson {
    
    private static ArrayList<persona> listapersonas = new ArrayList<persona>();
    private persona mipersona;
    private List<TipoDocumento> documentostipo;
    private List<TipoDocumento> documentostipoE;

    public List<TipoDocumento> getDocumentostipoE() {
        this.documentostipoE = new ArrayList<TipoDocumento>(3);        
        this.documentostipoE.add(new TipoDocumento(1,"Cedula"));
        this.documentostipoE.add(new TipoDocumento(2,"Tarjeta de Identidad"));
        this.documentostipoE.add(new TipoDocumento(3,"Pasaporte"));
        return documentostipoE;
    }

    public void setDocumentostipoE(List<TipoDocumento> documentostipoE) {
        this.documentostipoE = documentostipoE;
    }
    private int tipodocu;

    public int getTipodocuE() {
        return tipodocuE;
    }

    public void setTipodocuE(int tipodocuE) {
        this.tipodocuE = tipodocuE;
    }
    private int tipodocuE;

    public int getTipodocu() {
        return tipodocu;
    }

    public void setTipodocu(int tipodocu) {
        this.tipodocu = tipodocu;
    }

    public List<TipoDocumento> getDocumentostipo() {
        this.documentostipo = new ArrayList<TipoDocumento>(3);        
        this.documentostipo.add(new TipoDocumento(1,"Cedula"));
        this.documentostipo.add(new TipoDocumento(2,"Tarjeta de Identidad"));
        this.documentostipo.add(new TipoDocumento(3,"Pasaporte"));
        return documentostipo;       
    }

    public void setDocumentostipo(List<TipoDocumento> documentostipo) {
        this.documentostipo = documentostipo;
    }

    public TipoDocumento getTipodoc_selec() {
        return tipodoc_selec;
    }

    public void setTipodoc_selec(TipoDocumento tipodoc_selec) {
        this.tipodoc_selec = tipodoc_selec;
    }
    private TipoDocumento tipodoc_selec;
    

    public createperson() {
        mipersona=new persona();
    }
    
    public String eliminarpersona(persona p) {
        listapersonas.remove(p); 
        return null;
    }
    
    public String desctipodocumento(TipoDocumento t){
        return t.getnomdoc();
    }
     public int idtipodocumento(TipoDocumento t){
         return t.getiddoc();
     }
     
     public void actualizapersona(persona p){
         p.setTypeDocumento(tipodocuE);
     }
     
     public void actualizatipodocumento(int t, persona p) throws IOException {
         p.setTypeDocumento(tipodoc_selec);
         ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
         context.redirect("index.xhtml");
     }
    public String formatotecha (Date d) {
         SimpleDateFormat objSDF = new SimpleDateFormat("dd/MM/yyyy"); 
        return objSDF.format(d); 
    }
     public void agregarpersona() throws IOException {          
      mipersona.setId(listapersonas.size()+1);
      mipersona.setTypeDocumento(new TipoDocumento(tipodocu));
      listapersonas.add(mipersona); 
      mipersona = new persona();
      
    }
     
    
    public ArrayList<persona> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(ArrayList<persona> listapersonas) {
        this.listapersonas = listapersonas;
    }

    public persona getMipersona() {
        return mipersona;
    }

    public void setMipersona(persona mipersona) {
        this.mipersona = mipersona;
    }
    
}
