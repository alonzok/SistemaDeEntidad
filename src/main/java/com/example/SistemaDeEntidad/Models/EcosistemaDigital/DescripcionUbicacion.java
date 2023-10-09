package com.example.SistemaDeEntidad.Models.EcosistemaDigital;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DescripcionUbicacion extends DescripcionGeneral{
    protected double longitud;
    protected double latitud;
    protected double altitud;
    protected double rangoDiametro;

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

    public double getRangoDiametro() {
        return rangoDiametro;
    }

    public void setRangoDiametro(double rangoDiametro) {
        this.rangoDiametro = rangoDiametro;
    }
}
