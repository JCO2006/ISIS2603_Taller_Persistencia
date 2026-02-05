package co.edu.uniandes.dse.TallerPersistencia.repositories;

import org.springframework.stereotype.Repository;
import co.edu.uniandes.dse.TallerPersistencia.entities.DesarrolladorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface DesarrolladorRepository extends JpaRepository<DesarrolladorEntity, Long> {
    
    //seleccionar desarrolladores por nombre
    List<DesarrolladorEntity> findByName(String name);
}
