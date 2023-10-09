package com.example.SistemaDeEntidad.Controllers;

import com.example.SistemaDeEntidad.Models.EcosistemaDigital.DescripcionGeneral;
import com.example.SistemaDeEntidad.Models.EcosistemaDigital.DescripcionMarcador;
import com.example.SistemaDeEntidad.Models.EcosistemaDigital.DescripcionUbicacion;
import com.example.SistemaDeEntidad.Models.Marcador.MarcadorModel;
import com.example.SistemaDeEntidad.Services.EcosistemaDigital.EcosistemaDigitalService;
import com.example.SistemaDeEntidad.Services.Marcador.MarcadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class EcosistemaDigitalController {

    @Autowired
    private EcosistemaDigitalService ecosistemaDigitalService;
    @Autowired
    private MarcadorService marcadorService;

    @PostMapping("/postEcosistemaUbicacion")
    public ResponseEntity<DescripcionGeneral> postPutEcosistemaUbicacion(@RequestBody DescripcionUbicacion Ecosistema){

        return new ResponseEntity<DescripcionGeneral>(ecosistemaDigitalService.postPutEcosistema(Ecosistema), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/postEcosistemaMarcador",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<DescripcionGeneral> postPutEcosistemaMarcador(@RequestPart("ecosistemaMarcador") DescripcionMarcador ecosistema, @RequestPart("archivo") MultipartFile file){
        MarcadorModel marcadorModel;
        try {
            ecosistema.setMarcador(marcadorService.addMarcador(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ResponseEntity<DescripcionGeneral>(ecosistemaDigitalService.postPutEcosistema(ecosistema), HttpStatus.ACCEPTED);
    }

    @PostMapping("/upload")
    public ResponseEntity<Optional<DescripcionGeneral>> upload(@RequestParam("archivo") MultipartFile file){
        return new ResponseEntity<Optional<DescripcionGeneral>>(ecosistemaDigitalService.getEcosistema("1"), HttpStatus.ACCEPTED);
    }

    @PostMapping("/postEcosistemaDigitalAumentado")
    public ResponseEntity<DescripcionGeneral> postPutEcosistema(@RequestBody DescripcionGeneral Ecosistema){

        return new ResponseEntity<DescripcionGeneral>(ecosistemaDigitalService.postPutEcosistema(Ecosistema), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAllEcosistema")
    public ResponseEntity<List<DescripcionGeneral>> getAllEcosistema(){
        return new ResponseEntity<List<DescripcionGeneral>>(ecosistemaDigitalService.getAllEcosistema(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getEcosistema/{id}")
    public ResponseEntity<Optional<DescripcionGeneral>> getEcosistema(@PathVariable("id") String id){
        return new ResponseEntity<Optional<DescripcionGeneral>>(ecosistemaDigitalService.getEcosistema(id), HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/deleteEcosistema/{id}")
    public ResponseEntity<Boolean> eliminarActuador(@PathVariable("id") String id) {
        return new ResponseEntity<Boolean>(ecosistemaDigitalService.deleteEcosistema(id), HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/ecosistemaDigital/getJSON/{type}")
    public ResponseEntity <String> getEcosistemaModelJson(@PathVariable("type") int type){
        return new ResponseEntity<String> (ecosistemaDigitalService.getEcosistemaModelJson(type), HttpStatus.ACCEPTED);
    }
}
