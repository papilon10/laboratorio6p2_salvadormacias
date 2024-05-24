/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.laboratorio6p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class Transaccion {

    private String emisor;
    private String tipo_transferencia;
    double cantidad_dinero;

    public Transaccion() {
    }

    public Transaccion(String emisor, String tipo_transferencia, double cantidad_dinero) {
        this.emisor = emisor;
        this.tipo_transferencia = tipo_transferencia;
        this.cantidad_dinero = cantidad_dinero;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getTipo_transferencia() {
        return tipo_transferencia;
    }

    public void setTipo_transferencia(String tipo_transferencia) {
        this.tipo_transferencia = tipo_transferencia;
    }

    public double getCantidad_dinero() {
        return cantidad_dinero;
    }

    public void setCantidad_dinero(double cantidad_dinero) {
        this.cantidad_dinero = cantidad_dinero;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "emisor=" + emisor + ", tipo_transferencia=" + tipo_transferencia + ", cantidad_dinero=" + cantidad_dinero + '}';
    }

}
