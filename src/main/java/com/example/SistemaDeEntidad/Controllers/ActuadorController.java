package com.example.SistemaDeEntidad.Controllers;

import com.example.SistemaDeEntidad.Models.Actuador.ActuadorModel;
import com.example.SistemaDeEntidad.Services.Actuador.ActuadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ActuadorController{

    @Autowired
    private ActuadorService actuadorService;

    @PostMapping
    public ResponseEntity<ActuadorModel> postPutActuador(@RequestBody ActuadorModel actuador){

        return new ResponseEntity<ActuadorModel>(actuadorService.postPutActuador(actuador), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAllActuador")
    public ResponseEntity<List<ActuadorModel>> getTodoActuador(){
        return new ResponseEntity<List<ActuadorModel>>(actuadorService.getTodoActuador(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getActuador/{id}")
    public ResponseEntity<Optional<ActuadorModel>> getActuador(@PathVariable("id") int id){
        return new ResponseEntity<Optional<ActuadorModel>>(actuadorService.getActuador(id), HttpStatus.ACCEPTED);
    }

    @GetMapping("/setActiveActuador")
    public ResponseEntity<Boolean> setActiveActuador(){
        return new ResponseEntity<Boolean>(actuadorService.setActiveActuador(), HttpStatus.ACCEPTED);
    }

//    @PutMapping("/updateActuador/{id}")
//    public ResponseEntity<Optional<ActuadorModel>> putActuador(@PathVariable("id") int id, ActuadorModel actuador){
//        return new ResponseEntity<Optional<ActuadorModel>>(actuadorService.putActuador(id, actuador), HttpStatus.ACCEPTED);
//    }

    @DeleteMapping(path = "/deleteActuador/{id}")
    public boolean eliminarActuador(@PathVariable("id") int id) {
        return actuadorService.deleteActuador(id);
    }

}
