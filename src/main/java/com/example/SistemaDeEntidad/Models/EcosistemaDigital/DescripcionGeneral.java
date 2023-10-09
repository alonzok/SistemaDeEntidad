package com.example.SistemaDeEntidad.Models.EcosistemaDigital;


import com.example.SistemaDeEntidad.Constants.TipoDisparador;
import com.example.SistemaDeEntidad.Constants.TipoEcosistema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
public abstract class DescripcionGeneral {
    @Id
    protected String id;
    protected int cantidadUsuarios;
    protected String nombreDelEcosistema;
    protected String idAutor;
    protected String descripcion;

    protected TipoDisparador tipoDisparador;
    protected TipoEcosistema tipoEcosistema;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public void setCantidadUsuarios(int cantidadUsuarios) {
        this.cantidadUsuarios = cantidadUsuarios;
    }

    public String getNombreDelEcosistema() {
        return nombreDelEcosistema;
    }

    public void setNombreDelEcosistema(String nombreDelEcosistema) {
        this.nombreDelEcosistema = nombreDelEcosistema;
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

    public TipoEcosistema getTipoEcosistema() {
        return tipoEcosistema;
    }

    public void setTipoEcosistema(TipoEcosistema tipoEcosistema) {
        this.tipoEcosistema = tipoEcosistema;
    }

    public TipoDisparador getTipoDisparador() {
        return tipoDisparador;
    }

    public void setTipoDisparador(TipoDisparador tipoDisparador) {
        this.tipoDisparador = tipoDisparador;
    }
}
