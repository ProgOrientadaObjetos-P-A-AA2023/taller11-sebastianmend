/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;
import paquete2.*;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Cuenta {
     private String nombreCliente; 
    private double iva; 
    private ArrayList<Menu> listaCartas = new ArrayList<>();
    private double valorCancelar;
    private double subtotal;

    public Cuenta(String n, ArrayList<Menu> l, double iv) {
        nombreCliente = n;
        listaCartas = l;
        iva = iv;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public double obtenerIva() {
        return iva;
    }

    public void establecerIva(double n) {
        iva = n;
    }

    public ArrayList<Menu> obtenerListaCartas() {
        return listaCartas;
    }

    public void establecerListaCartas(ArrayList<Menu> n) {
        listaCartas = n;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public void establecerSubtotal() {
        double suma=0;
        for (int i=0;i<obtenerListaCartas().size();i++){
            suma+=listaCartas.get(i).obtenerVal_menu();
        }
        subtotal = suma;
    }
    
    public double obtenerValorCancelar() {
        
        return valorCancelar;
    }
    
    public void establecerValorCancelar() {
        valorCancelar = (subtotal*(iva/100))+subtotal;
    }
    
    @Override
    public String toString() {        
        String cadena = String.format("Factura\n"
                + "Cliente: %s",
                obtenerNombreCliente());
        
        for (int i=0;i<obtenerListaCartas().size();i++){
            cadena = String.format("%s\n%s", 
                    cadena,
                    obtenerListaCartas().get(i));
        }
        cadena = String.format("%s\nSubtotal: %.1f\n"
                + "IVA: %.1f\n"
                + "Total a pagar: %.3f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelar());
        return cadena;
    }
}

