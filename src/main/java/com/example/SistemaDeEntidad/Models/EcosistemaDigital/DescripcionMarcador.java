package com.example.SistemaDeEntidad.Models.EcosistemaDigital;

import com.example.SistemaDeEntidad.Constants.TipoMarcadores;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DescripcionMarcador extends DescripcionGeneral{
    protected String marcadorId;
    protected TipoMarcadores tipoMarcador;

    public String getMarcador() {
        return marcadorId;
    }

    public void setMarcador(String marcadorId) {
        this.marcadorId = marcadorId;
    }

    public TipoMarcadores getTipoMarcador() {
        return tipoMarcador;
    }

    public void setTipoMarcador(TipoMarcadores tipoMarcador) {
        this.tipoMarcador = tipoMarcador;
    }

}
