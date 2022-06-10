/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

/**
 *
 * @author Gazty
 */
public class Estudiante {
    String id;
    String nombre;
    String curso;
    String especialidad;

    
    
    public Estudiante() {
    }

    public Estudiante(String id, String nombre, String curso, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.especialidad = especialidad;
    }
    
   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
