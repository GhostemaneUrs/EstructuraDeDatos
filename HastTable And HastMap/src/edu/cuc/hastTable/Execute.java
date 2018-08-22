/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.hastTable;


/**
 *
 * @author ajaramil
 */
public class Execute {
    public static void main(String[] args) {
        Persona personaUno = new Persona("1.140.903.322","Andres Felipe",
                "Jaramillo Gonzalez","JaramilloG1999@outlook.com", "3012517135");
        
        Persona personaDos = new Persona("1.140.902.225","Jesus David",
                "Urueta Cantillo", "davichu@gmail.com", "3013435657");
        
        Persona personaTres = new Persona("1.140.903.254","Jesica",
                "Paramilitar", "jesica@gmail.com", "3013435657");
        
        Persona personaCuatro = new Persona("1.140.902.225","Danny Joel",
                "Ospino", "Danny@gmail.com", "3013435657");
        
        Contacto verContactos = new Contacto();
        verContactos.adicionarContactos(personaUno);
        verContactos.adicionarContactos(personaDos);
        verContactos.adicionarContactos(personaTres);
        verContactos.adicionarContactos(personaCuatro);
        
        System.out.println(verContactos.buscarContactos("1.140.903.322").getNombreCompleo());
        
        verContactos.mostrarContactos();
        
    }
}
