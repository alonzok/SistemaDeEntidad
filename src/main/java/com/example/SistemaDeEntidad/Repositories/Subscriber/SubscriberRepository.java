package com.example.SistemaDeEntidad.Repositories.Subscriber;

import com.example.SistemaDeEntidad.Models.Subscriber.SubscriberModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriberRepository extends MongoRepository<SubscriberModel, Integer> {

    List<SubscriberModel> findByCodigoEvento(int codigoEvento);
}
