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
public class Tipo_Persona {

    private int id;
    private String descripcion;
    
    public Tipo_Persona(){
    this(0, "");
    }
    public Tipo_Persona(int id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
}
