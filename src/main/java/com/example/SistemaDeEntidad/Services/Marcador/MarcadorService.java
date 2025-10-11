package com.example.SistemaDeEntidad.Services.Marcador;

import com.example.SistemaDeEntidad.Models.Marcador.MarcadorModel;
import com.example.SistemaDeEntidad.Repositories.Marcador.MarcadorRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Servicio para gestionar las operaciones relacionadas con los marcadores.
 */
@Service
public class MarcadorService {

    @Autowired
    private MarcadorRepository marcadorRepository;

    public String addMarcador(MultipartFile file) throws IOException {

        MarcadorModel marcadorModel = new MarcadorModel();
        marcadorModel.setImage(
                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        return marcadorRepository.insert(marcadorModel).getId();
    }

    public MarcadorModel getPhoto(String id) {
        return marcadorRepository.findById(id).get();
    }

}
