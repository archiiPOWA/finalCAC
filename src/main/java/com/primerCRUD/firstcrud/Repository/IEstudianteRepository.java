package com.primerCRUD.firstcrud.Repository;

import com.primerCRUD.firstcrud.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// mediante extends va a heredar todos los metodos JPA repositorio, como saveall, findall, todas las acciones que me permite realizar un CRUD o ABML con la Base de Datos
public interface IEstudianteRepository extends JpaRepository<Estudiante,Long> {
}
