
package edu.cuc.hastTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Contacto {
     private Hashtable<String,Persona> contactos;

    public Contacto() {
        contactos = new Hashtable<String,Persona>();
    }
     
    public void adicionarContactos(Persona persona){
        contactos.put(persona.getCedula(), persona);
    } 
    
    public boolean eliminarContactos(String cedula) {
        if (contactos.isEmpty()) {
            return false;
        } else {
            if (contactos.containsKey(cedula)) {
                contactos.remove(cedula);
                return true;
            } else {
                return false;
            }
        }
    }
    
    public Persona buscarContactos(String cedula){
        if (contactos.isEmpty()) {
            return null;
        } else {
            if (contactos.containsKey(cedula)) {
               return contactos.get(cedula);
            } else {
                return null;
            }
        }       
    }
    
    public void mostrarContactos(){
        Enumeration<Persona> elementosPersonas = contactos.elements();
        while (elementosPersonas.hasMoreElements()) {            
            System.out.println(elementosPersonas.nextElement().toString());
        }
    }
    
    public void eliminarTodosContactos(){
        
    }
    
    public boolean modificarContactos(String cedula, Persona persona){
        return true;
    }
}
