package com.example.SistemaDeEntidad.Services.Actuador;

import com.example.SistemaDeEntidad.Models.Actuador.ActuadorModel;
import com.example.SistemaDeEntidad.Repositories.Actuador.ActuadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class ActuadorService {

    @Autowired
    private ActuadorRepository actuadorRepository;

    public ActuadorModel postPutActuador(ActuadorModel actuador){
        return actuadorRepository.save(actuador);
    }

    public List<ActuadorModel> getTodoActuador(){
        return actuadorRepository.findAll();
    }

    public Optional<ActuadorModel> getActuador(int id){
        return actuadorRepository.findById(id);
    }

    public boolean setActiveActuador(){
        RestTemplate restTemplate = new RestTemplate();

        String uri = "http://192.168.100.117:8080"; // or any other uri

        String result = restTemplate.getForObject(uri, String.class);
        return result.equalsIgnoreCase("True");

    }

    public boolean deleteActuador(int id) {
        try {
            actuadorRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
