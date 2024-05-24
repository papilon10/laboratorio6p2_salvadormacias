/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.laboratorio6p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class premium extends usuario {

    public premium() {
    }

    public premium(String nombre, String usuario, String contrasena, double dinero, int cuenta) {
        super(nombre, usuario, contrasena, dinero, cuenta);
    }

    @Override
    public void transferir(www.laboratorio6p2_salvadormacias.usuario emisor, double cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
