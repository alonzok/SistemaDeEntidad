package com.example.SistemaDeEntidad.Repositories.Marcador;

import com.example.SistemaDeEntidad.Models.Marcador.MarcadorModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MarcadorRepository extends MongoRepository<MarcadorModel, String> {
}
