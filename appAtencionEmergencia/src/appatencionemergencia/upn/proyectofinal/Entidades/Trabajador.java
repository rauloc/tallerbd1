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
public class Trabajador {

        private int id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nroColegiatura;
	private String telefono;
	private String usuario;
	private String clave ;
	private Tipo_Trabajador objTipoTrabajador;
        
        public Trabajador(){
        this(0, "", "", "", "", "", "", "", new Tipo_Trabajador());
    }
    
    public Trabajador(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String nroColegiatura, String telefono, String usuario, String clave, Tipo_Trabajador objTipo_Trabajador) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nroColegiatura = nroColegiatura;
        this.telefono = telefono;
        this.usuario = usuario;
        this.clave = clave;
        this.objTipoTrabajador = objTipoTrabajador;
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

    public String getNroColegiatura() {
        return nroColegiatura;
    }

    public void setNroColegiatura(String nroColegiatura) {
        this.nroColegiatura = nroColegiatura;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Tipo_Trabajador getObjTipoTrabajador() {
        return objTipoTrabajador;
    }

    public void setObjTipoTrabajador(Tipo_Trabajador objTipoTrabajador) {
        this.objTipoTrabajador = objTipoTrabajador;
    }
}
