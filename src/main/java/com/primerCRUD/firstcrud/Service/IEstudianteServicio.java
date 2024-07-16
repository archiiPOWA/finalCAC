package com.primerCRUD.firstcrud.Service;
import com.primerCRUD.firstcrud.Entity.Estudiante;
import java.util.List;


// Creo esta Clase  Interface, que contiene todos los metos que vamos a implementar en EstudianteServicios

public interface IEstudianteServicio {
    public List<Estudiante> listarTodosLosEstudiantes();
    public Estudiante guardarEstudiante(Estudiante estudiante);
    public Estudiante obtenerEstudiantePorID(Long id);
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Long id);

}
