
package edu.cuc.hastTable;


public class Persona {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correos;
    private String celular;

    public Persona() {
    }

    public Persona(String cedula, String nombres,String apellidos,String correos, String celular) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correos = correos;
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getCorreos() {
        return correos;
    }

    public void setCorreos(String correos) {
        this.correos = correos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Persona: " + "cedula: " + cedula 
                + " nombres: " + nombres 
                + " apellidos: " + apellidos 
                + " correos: " + correos 
                + " celular: " + celular + '}';
    }
    
    public String getNombreCompleo(){
        return nombres + " " + apellidos;
    }
    
}
