/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.laboratorio6p2_salvadormacias;

import java.util.ArrayList;

/**
 *
 * @author Apple
 */
public abstract class usuario {

    private String nombre;
    private String usuario;
    private String contrasena;
    private double dinero;
    private int cuenta;
    private ArrayList<Transaccion> transacciones = new ArrayList<>();

    public usuario() {
    }

    public usuario(String nombre, String usuario, String contrasena, double dinero, int cuenta) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.dinero = dinero;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public abstract void transferir(usuario emisor, double cantidad);

    protected void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", usuario=" + usuario + ", contrasena=" + contrasena + ", dinero=" + dinero + ", cuenta=" + cuenta + ", transacciones=" + transacciones + '}';
    }

}
