package com.example.SistemaDeEntidad.Models.Actuador;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Modelo que representa un actuador en el sistema.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActuadorModel {

    private int id;
    private String nombre;
    private boolean activo;

}
