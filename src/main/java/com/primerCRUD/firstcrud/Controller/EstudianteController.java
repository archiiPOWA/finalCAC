package com.primerCRUD.firstcrud.Controller;
import com.primerCRUD.firstcrud.Entity.Estudiante;
import com.primerCRUD.firstcrud.Service.EstudianteServicio;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//indico a Spring que esta clase sera la controladora
//aqui voy a controlar los Endpoints de la aplicacion
@Controller


public class EstudianteController {

    //Le inyecto la clase EstudianteServicio para poder invocarla y traer sus metodos
    @Autowired
    private EstudianteServicio servicio;

    //aca indico que cuando por navegador ingrese por el serverport del proyecto por:
    //localhost:9090/estudiantes
    @GetMapping({"/estudiantes", "/"})
    public String ListarEstudiantes(Model modelo) {
        modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
        return "estudiantes";
    }

    //es decir cuando le demos click al boton que indiquemos no va a enviar al
    //endpoint que se ve a continuacion "/estudiantes/nuevo"
    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormularioDeRegistrarEstudiante(Model modelo) {
        Estudiante estudiante = new Estudiante(); //creo un objeto estudiante
        modelo.addAttribute("estudiante", estudiante); //aca paso el objeto creado anteriormente al modelo para que sea mostrado
        return "crear_estudiante"; //simplemente retornamos a este html
    }

    //creo el controlador para guardar por lo que uso el notador PostMapping
    @PostMapping("/estudiantes")
    // ahora utilizo @ModelAttribute para vincular automáticamente los datos del formulario al objeto estudiante.
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) { //aca @ModelAttribute recibe el campo estudiante desde el formulario html, y lo guarda
        servicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo){
        modelo.addAttribute("estudiante", servicio.obtenerEstudiantePorID(id));
        return "editar_estudiante";
    }
    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante, Model modelo){
            Estudiante estudianteExistente = servicio.obtenerEstudiantePorID(id);
            estudianteExistente.setId(id);
            estudianteExistente.setNombre(estudiante.getNombre());
            estudianteExistente.setApellido(estudiante.getApellido());
            estudianteExistente.setEmail(estudiante.getEmail());
            servicio.actualizarEstudiante(estudianteExistente);
            return "redirect:/estudiantes";
        }



        @GetMapping("/estudiantes/{id}")
        public String eliminarEstudiante(@PathVariable Long id){
            servicio.eliminarEstudiante(id);
            return"redirect:/estudiantes";
        }

        }

