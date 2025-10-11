package com.example.SistemaDeEntidad.Repositories.Marcador;

import com.example.SistemaDeEntidad.Models.Marcador.MarcadorModel;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repositorio para gestionar las operaciones CRUD de los marcadores en la base de datos MongoDB.
 */
public interface MarcadorRepository extends MongoRepository<MarcadorModel, String> {
}
