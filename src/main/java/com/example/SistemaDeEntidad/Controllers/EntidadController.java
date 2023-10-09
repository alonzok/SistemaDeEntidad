package com.example.SistemaDeEntidad.Controllers;

import com.example.SistemaDeEntidad.Models.Entidades.EntidadModel;
import com.example.SistemaDeEntidad.Services.Entidad.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EntidadController {

    @Autowired
    private EntidadService entidadService;

    @PostMapping("/postEntity")
    public ResponseEntity<EntidadModel> postPutEntidad(@RequestBody EntidadModel entidadModel){

        return new ResponseEntity<>(entidadService.postPutEntidad(entidadModel), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAllEntity")
    public ResponseEntity<List<EntidadModel>> getAllEntidad(){
        return new ResponseEntity<List<EntidadModel>>(entidadService.getAllEntidad(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getEntity/{id}")
    public ResponseEntity<Optional<EntidadModel>> getEntidad(@PathVariable("id") String id){
        return new ResponseEntity<Optional<EntidadModel>>(entidadService.getEntidad(id), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getEntityByEcosistema/{id}")
    public ResponseEntity<List<EntidadModel>> getEcosistema(@PathVariable("id") String id){
        return new ResponseEntity<>(entidadService.getAllEntidadByEcosistema(id), HttpStatus.ACCEPTED);
    }
//
//    @DeleteMapping(path = "/deleteEcosistema/{id}")
//    public boolean eliminarActuador(@PathVariable("id") String id) {
//        return entidadService.deleteEcosistema(id);
//    }

}
