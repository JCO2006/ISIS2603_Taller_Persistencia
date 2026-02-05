package co.edu.uniandes.dse.TallerPersistencia.repositories;

import org.springframework.stereotype.Repository;
import co.edu.uniandes.dse.TallerPersistencia.entities.ProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ProyectoRepository extends JpaRepository<ProyectoEntity, Long> {

    //seleccionar proyectos por nombre
    List<ProyectoEntity> findByName(String name);
    
}
