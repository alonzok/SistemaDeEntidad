package com.example.SistemaDeEntidad.Repositories.EcosistemaDigital;

import com.example.SistemaDeEntidad.Models.EcosistemaDigital.DescripcionGeneral;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para gestionar las operaciones CRUD de las descripciones generales de ecosistemas digitales en la base de datos MongoDB.
 */
@Repository
public interface EcosistemaDigitalRepository extends MongoRepository<DescripcionGeneral, String> {
}
