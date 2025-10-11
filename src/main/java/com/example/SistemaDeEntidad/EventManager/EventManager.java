package com.example.SistemaDeEntidad.EventManager;

import com.example.SistemaDeEntidad.Listener.EventListener;
import com.example.SistemaDeEntidad.Models.Subscriber.SubscriberModel;
import com.example.SistemaDeEntidad.Services.Subscriber.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase que gestiona eventos y suscriptores en el sistema.
 */
@RestController
public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    @Autowired
    private SubscriberService subscriberService;

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update();
        }
    }

    @PostMapping(path = "/subscribe")
    public ResponseEntity<SubscriberModel> subscribe(@RequestBody SubscriberModel subscriberModel){

        return new ResponseEntity<SubscriberModel> (subscriberService.subscribe(subscriberModel), HttpStatus.ACCEPTED);
    }

    @PostMapping(path = "/unsubscribe")
    public ResponseEntity<Boolean> unsubscribe(@RequestBody SubscriberModel subscriberModel){
        return new ResponseEntity<Boolean>(subscriberService.unsubscribe(subscriberModel), HttpStatus.ACCEPTED);
    }

}
