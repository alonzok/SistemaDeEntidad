package com.example.SistemaDeEntidad.Models.Subscriber;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriberModel {
    @Id
    private String id;
    private String url;
    private int codigoEvento;
}
