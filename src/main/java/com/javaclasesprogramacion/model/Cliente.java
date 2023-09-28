package com.javaclasesprogramacion.model;

public class Cliente {

    private String nombreCliente;
    private int numeroDocumento;
    private String direccion;
    private int numeroContacto;

    public Cliente() {

    }

    public Cliente(String nombre, int numeroDocumento, String direccion, int numeroContacto) {
        this.nombreCliente = nombre;
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
    }

    public void setNombre(String nombre) {
        this.nombreCliente = nombre;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreCliente == null) ? 0 : nombreCliente.hashCode());
        result = prime * result + numeroDocumento;
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + numeroContacto;
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
        Cliente other = (Cliente) obj;
        if (nombreCliente == null) {
            if (other.nombreCliente != null)
                return false;
        } else if (!nombreCliente.equals(other.nombreCliente))
            return false;
        if (numeroDocumento != other.numeroDocumento)
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        if (numeroContacto != other.numeroContacto)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombreCliente + ", numeroDocumento=" + numeroDocumento + ", direccion=" + direccion
                + ", numeroContacto=" + numeroContacto + "]";
    }

}
