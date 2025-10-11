package com.example.SistemaDeEntidad.Repositories.Subscriber;

import com.example.SistemaDeEntidad.Models.Subscriber.SubscriberModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para gestionar las operaciones CRUD de los suscriptores en la base de datos MongoDB.
 */
@Repository
public interface SubscriberRepository extends MongoRepository<SubscriberModel, Integer> {

    List<SubscriberModel> findByCodigoEvento(int codigoEvento);
}
