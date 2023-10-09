package com.example.SistemaDeEntidad.Services.EcosistemaDigital;

import com.example.SistemaDeEntidad.Models.EcosistemaDigital.DescripcionGeneral;
import com.example.SistemaDeEntidad.Models.Subscriber.SubscriberModel;
import com.example.SistemaDeEntidad.Repositories.EcosistemaDigital.EcosistemaDigitalRepository;
import com.example.SistemaDeEntidad.Repositories.Subscriber.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

@Service
public class EcosistemaDigitalService {

    @Autowired
    private EcosistemaDigitalRepository ecosistemaDigitalRepository;
    @Autowired
    private SubscriberRepository subscriberRepository;

    public DescripcionGeneral postPutEcosistema(DescripcionGeneral ecosistemaModel){
        //notify(0);
        return ecosistemaDigitalRepository.save(ecosistemaModel);
    }

    public List<DescripcionGeneral> getAllEcosistema(){
        notify(2);
        return ecosistemaDigitalRepository.findAll();
    }

    public Optional<DescripcionGeneral> getEcosistema(String id){
//        SubscriberService subscriberService = new SubscriberService();
//        subscriberService.notify("ecosistema", 1);
        return ecosistemaDigitalRepository.findById(id);
    }

    public boolean deleteEcosistema(String id) {
        try {
//            SubscriberService.notify(2);
//            SubscriberService subscriberService = new SubscriberService();
//            subscriberService.notify("ecosistema", 2);
            ecosistemaDigitalRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    public String getEcosistemaModelJson(int type){
        switch(type){
            case 0:
                Path filePath = Path.of("src/main/java/com/example/SistemaDeEntidad/DescriptorsFile/EcosistemaDigitalMarcador.json");
                String content = null;
                try {
                    content = Files.readString(filePath);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return content;
            case 1:
                filePath = Path.of("src/main/java/com/example/SistemaDeEntidad/DescriptorsFile/EcosistemaDigitalMarcador.json");
                content = null;
                try {
                    content = Files.readString(filePath);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return content;
            default:
                filePath = Path.of("src/main/java/com/example/SistemaDeEntidad/DescriptorsFile/EcosistemaDigitalUbicacion.json");
                try {
                    content = Files.readString(filePath);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return content;
        }

    }

    private void notify(int codigoEvento){
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
