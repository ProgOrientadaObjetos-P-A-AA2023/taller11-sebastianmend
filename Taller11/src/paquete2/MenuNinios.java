/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author sebas
 */
public class MenuNinios extends Menu {
    /*
    nombre del plato
    valor del menú
    valor inicial del menú
    valor de porción de helado
    valor de porción de pastel
    */
    private double valorHelado;
    private double valorPastel;

    public MenuNinios(String n, double vi, double vh, double vp) {
        super(n, vi);
        valorHelado = vh;
        valorPastel = vp;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public void establecerValorHelado(double n) {
        valorHelado = n;
    }

    public double obtenerValorPastel() {
        return valorPastel;    }


    public void establecerValorPastel(double n) {
        valorPastel = n;
    }
    
    @Override
    public void establecerValorMenu() {
        val_menu = val_inicial+valorPastel+valorHelado;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu de Niños:\n"
                + "%s"
                + "Valor helado: %.2f\n"
                + "Valor pastel: %.2f\n"
                + "Valor del Menú: %.2f\n", 
                super.toString(), 
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenerVal_menu());
        return cadena;
    }
}
/*
Menu de Niños:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50
*/