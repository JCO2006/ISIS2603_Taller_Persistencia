package co.edu.uniandes.dse.TallerPersistencia.repositories;

import org.springframework.stereotype.Repository;
import co.edu.uniandes.dse.TallerPersistencia.entities.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<TareaEntity, Long> {
    
    //seleccionar tareas por estado
    List<TareaEntity> findByEstado(String estado);

}
