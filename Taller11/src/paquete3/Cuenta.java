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
/*
Factura
Cliente: René Elizalde
Menu de Niños:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu de Niños:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/

