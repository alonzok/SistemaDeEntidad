package com.example.SistemaDeEntidad.Repositories.Actuador;

import com.example.SistemaDeEntidad.Models.Actuador.ActuadorModel;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repositorio para gestionar las operaciones CRUD de los actuadores en la base de datos MongoDB.
 */
public interface ActuadorRepository extends MongoRepository<ActuadorModel, Integer> {
}
