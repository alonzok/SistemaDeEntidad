package com.example.SistemaDeEntidad.Models.Entidades;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Modelo que representa una entidad en el sistema.
 */
@NoArgsConstructor
@AllArgsConstructor
public class EntidadModel {
    private String id;
    private String idAutor;
    private String descripcion;
    private String idEcosistema;
    private double longitud;
    private double latitud;
    private double altitud;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdEcosistema() {
        return idEcosistema;
    }

    public void setIdEcosistema(String idEcosistema) {
        this.idEcosistema = idEcosistema;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
}
