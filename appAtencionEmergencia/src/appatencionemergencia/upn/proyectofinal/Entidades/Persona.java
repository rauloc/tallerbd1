/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appatencionemergencia.upn.proyectofinal.Entidades;

/**
 *
 * @author Eduard Marquez
 */
public class Persona {
        private int id; 
	private String nombre; 
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String dni; 
	private String telefono; 
	private Tipo_Persona objTipoPersona;
        
         public Persona(){
        this(0, "", "", "", "", "", new Tipo_Persona());
    }
    
    public Persona(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, Tipo_Persona objTipoPersona) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.telefono = telefono;
        this.objTipoPersona = objTipoPersona;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Tipo_Persona getObjTipoPersona() {
        return objTipoPersona;
    }

    public void setObjTipoPersona(Tipo_Persona objTipoPersona) {
        this.objTipoPersona = objTipoPersona;
    }
}
