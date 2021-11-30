/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo.model;

/**
 *
 * @author Yasmina
 */
public class TipoDocumento {
 
        private int iddoc ;
        private String nomdoc;

    public void setNomdoc(int i) {
        if (i==1) {
                nomdoc="Cedula";
            }  else if (i==2)    {
                nomdoc="Tarjeta";
            }  else if (i==3)    {
                nomdoc="Pasaporte";
            }   else      {
                nomdoc="No Aplica";  
                }
    }
        
        public TipoDocumento(){            
        }
        
        public TipoDocumento(int i, String n){
            iddoc=i;
            nomdoc=n;            
        }
        
         public TipoDocumento(int i){
            iddoc=i;
            if (i==1) {
                nomdoc="Cedula";
            }  else if (i==2)    {
                nomdoc="Tarjeta";
            }  else if (i==3)    {
                nomdoc="Pasaporte";
            }   else      {
                nomdoc="No Aplica";  
                }
        }
        
        public int getiddoc(){
            return iddoc;
        }
        public void setiddoc(int i) {
             iddoc=i;
            if (i==1) {
                nomdoc="Cedula";
            }  else if (i==2)    {
                nomdoc="Tarjeta";
            }  else if (i==3)    {
                nomdoc="Pasaporte";
            }   else      {
                nomdoc="No Aplica";  
                }            
        }
        
         public String getnomdoc(){
            return nomdoc;
        }
        
        
    }

    
