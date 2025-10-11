package com.example.SistemaDeEntidad.Models.Subscriber;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Modelo que representa un suscriptor en el sistema.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriberModel {
    @Id
    private String id;
    private String url;
    private int codigoEvento;
}
