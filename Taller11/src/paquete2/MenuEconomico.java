/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author sebas nombre del plato valor del menú valor inicial del menú
 * porcentaje de descuento, en referencia al valor inicial del menú
 *
 */
public class MenuEconomico extends Menu {

    private double porcentaje;

    public MenuEconomico( String n,double v, double p) {
        super(n, v);

        porcentaje = p;

    }

    public void establecerPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    @Override
    public void establecerValorMenu() {
        val_menu = val_inicial - (val_inicial * porcentaje/100);
    }

    @Override
    public String toString() {

        String mensaje = String.format("Menu Economico: \n"
                + "%s"
                + "Porcentaje adicional: %.2f\n"
                + "Valor del menu: %.2f\n", super.toString(),
                obtenerPorcentaje(),
                obtenerVal_menu());

        return mensaje;
    }

}
