package com.example.SistemaDeEntidad.Repositories.Actuador;

import com.example.SistemaDeEntidad.Models.Actuador.ActuadorModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActuadorRepository extends MongoRepository<ActuadorModel, Integer> {
}
