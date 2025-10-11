package com.example.SistemaDeEntidad.Services.Subscriber;

import com.example.SistemaDeEntidad.Models.Subscriber.SubscriberModel;
import com.example.SistemaDeEntidad.Repositories.Subscriber.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

/**
 * Servicio para gestionar las operaciones relacionadas con los suscriptores.
 */
@Service
public class SubscriberService {

    @Autowired
    private SubscriberRepository subscriberRepository;

    public SubscriberModel subscribe(SubscriberModel subscriberModel){
        List<SubscriberModel> subscriberModelList = subscriberRepository.findAll();
        for (SubscriberModel subscriber: subscriberModelList) {
            if(subscriber.getUrl().equals(subscriberModel.getUrl()) && subscriber.getCodigoEvento() == subscriberModel.getCodigoEvento()){
                return subscriberModel;
            }
        }
        return subscriberRepository.save(subscriberModel);
    }

    public boolean unsubscribe(SubscriberModel subscriberModel){
        try {
            List<SubscriberModel> subscriberModelList = subscriberRepository.findAll();
            for (SubscriberModel subscriber: subscriberModelList) {
                if(subscriber.getUrl().equals(subscriberModel.getUrl()) && subscriber.getCodigoEvento() == subscriberModel.getCodigoEvento()){
                    System.out.println(subscriberModelList);
                    subscriberRepository.delete(subscriber);
                    return true;
                }
            }
            return true;
        } catch (Exception err) {
            System.out.println(err);
            return false;
        }
    }

    public void notify(int codigoEvento){
        try {
            List<SubscriberModel> subscriberModelList = subscriberRepository.findByCodigoEvento(codigoEvento);
            for (SubscriberModel subscriber: subscriberModelList) {

                RestTemplate restTemplate = new RestTemplate();
                String uri = subscriber.getUrl(); // or any other uri
                String result = restTemplate.postForObject(uri, null, String.class, codigoEvento);
                System.out.println(result);

            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}
