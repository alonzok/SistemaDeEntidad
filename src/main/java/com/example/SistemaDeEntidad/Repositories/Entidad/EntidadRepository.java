package com.example.SistemaDeEntidad.Repositories.Entidad;

import com.example.SistemaDeEntidad.Models.Entidades.EntidadModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EntidadRepository extends MongoRepository<EntidadModel, String> {
    List<EntidadModel> findByIdEcosistema(String idEcosistema);
}
