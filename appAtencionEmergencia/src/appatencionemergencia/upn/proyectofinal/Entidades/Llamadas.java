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
public class Llamadas {
        private int id;
	private String fechallamada;
	private String horaLlamada;
	private String razon;
	private String lugarEmergencia;
	private Persona objPersona;
	private Trabajador objTrabajador;
        
        public Llamadas(){
        this(0, "", "", "", "", new Persona(),new Trabajador());
    }
    
    public Llamadas(int id, String fechaLlamada, String horaLlamada, String razon, String lugarEmergencia, Persona objPersona, Trabajador objTrabajador) {
        this.id = id;
        this.fechallamada = fechaLlamada;
        this.horaLlamada = horaLlamada;
        this.razon = razon;
        this.objPersona = objPersona;
        this.objTrabajador = objTrabajador;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechallamada() {
        return fechallamada;
    }

    public void setFechallamada(String fechallamada) {
        this.fechallamada = fechallamada;
    }

    public String getHoraLlamada() {
        return horaLlamada;
    }

    public void setHoraLlamada(String horaLlamada) {
        this.horaLlamada = horaLlamada;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getLugarEmergencia() {
        return lugarEmergencia;
    }

    public void setLugarEmergencia(String lugarEmergencia) {
        this.lugarEmergencia = lugarEmergencia;
    }

    public Persona getObjPersona() {
        return objPersona;
    }

    public void setObjPersona(Persona objPersona) {
        this.objPersona = objPersona;
    }

    public Trabajador getObjTrabajador() {
        return objTrabajador;
    }

    public void setObjTrabajador(Trabajador objTrabajador) {
        this.objTrabajador = objTrabajador;
    }
}
