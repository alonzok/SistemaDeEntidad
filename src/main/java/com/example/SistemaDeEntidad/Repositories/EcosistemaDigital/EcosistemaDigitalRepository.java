package com.example.SistemaDeEntidad.Repositories.EcosistemaDigital;

import com.example.SistemaDeEntidad.Models.EcosistemaDigital.DescripcionGeneral;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EcosistemaDigitalRepository extends MongoRepository<DescripcionGeneral, String> {
}
