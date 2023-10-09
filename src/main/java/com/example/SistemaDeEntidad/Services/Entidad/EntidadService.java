package com.example.SistemaDeEntidad.Services.Entidad;

import com.example.SistemaDeEntidad.Models.EcosistemaDigital.DescripcionGeneral;
import com.example.SistemaDeEntidad.Models.Entidades.EntidadModel;
import com.example.SistemaDeEntidad.Repositories.Entidad.EntidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOptions;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.lookup;

@Service
public class EntidadService {

    @Autowired
    private EntidadRepository entidadRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public EntidadModel postPutEntidad(EntidadModel entidadModel){
        return entidadRepository.save(entidadModel);
    }

    public List<EntidadModel> getAllEntidadByEcosistema(String id){
        return entidadRepository.findByIdEcosistema(id);
    }

    public List<EntidadModel> getAllEntidad(){
        return entidadRepository.findAll();
    }

    public Optional<EntidadModel> getEntidad(String id){
        return entidadRepository.findById(id);
    }

    public boolean deleteEntidad(String id) {
        try {
            entidadRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
