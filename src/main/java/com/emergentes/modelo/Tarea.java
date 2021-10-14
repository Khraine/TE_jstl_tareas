package com.emergentes.modelo;
public class Tarea {
   private int id;
   private String tarea;
   private String prioridad;
    public Tarea() {
        id=0;
        tarea="";
        prioridad="";
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    public int getId() {
        return id;
    }
    public String getTarea() {
        return tarea;
    }
    public String getPrioridad() {
        return prioridad;
    }
}
