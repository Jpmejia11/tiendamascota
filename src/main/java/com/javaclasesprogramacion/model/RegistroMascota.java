package com.javaclasesprogramacion.model;

public class RegistroMascota {

    private String nombreMascota;
    private String raza;
    private int edadMascota;
    private String tipoMascota;

    public RegistroMascota() {

    }

    public RegistroMascota(String nombreMascota, String raza, int edadMascota, String tipoMascota) {
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.edadMascota = edadMascota;
        this.tipoMascota = tipoMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreMascota == null) ? 0 : nombreMascota.hashCode());
        result = prime * result + ((raza == null) ? 0 : raza.hashCode());
        result = prime * result + edadMascota;
        result = prime * result + ((tipoMascota == null) ? 0 : tipoMascota.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RegistroMascota other = (RegistroMascota) obj;
        if (nombreMascota == null) {
            if (other.nombreMascota != null)
                return false;
        } else if (!nombreMascota.equals(other.nombreMascota))
            return false;
        if (raza == null) {
            if (other.raza != null)
                return false;
        } else if (!raza.equals(other.raza))
            return false;
        if (edadMascota != other.edadMascota)
            return false;
        if (tipoMascota == null) {
            if (other.tipoMascota != null)
                return false;
        } else if (!tipoMascota.equals(other.tipoMascota))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RegistroMascota [nombreMascota=" + nombreMascota + ", raza=" + raza + ", edadMascota=" + edadMascota
                + ", tipoMascota=" + tipoMascota + "]";
    }

}
