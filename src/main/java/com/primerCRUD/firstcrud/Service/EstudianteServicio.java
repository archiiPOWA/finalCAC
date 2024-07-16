package com.primerCRUD.firstcrud.Service;
import com.primerCRUD.firstcrud.Entity.Estudiante;
import com.primerCRUD.firstcrud.Repository.IEstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

//le doy a la clase notacion de entidad Servicio
@Service
//Implemento los metodos de la Interface IEstudianteServicio
public class EstudianteServicio implements IEstudianteServicio {

    //Hago inyeccion de del repositorio JPA (nota:!revisar este concepto que esta poco claro!!!!!<<<<<<<<<<<<<<<<<)
    @Autowired
    private IEstudianteRepository repositorio;

    //Creo el primer Metodo de Servicio para mostrar los estudiantes
    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
        return repositorio.findAll();
    }

    //de igua manera creo el metodo para guardar
    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    //asimismo el resto de los metodos para las acciones correspondientes
    // TODOS ESTOS METODOS DEBERAN SER IMPLEMENTADOS EN EstudianteServicio
    @Override
    public Estudiante obtenerEstudiantePorID(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        repositorio.deleteById(id);
    }


}
