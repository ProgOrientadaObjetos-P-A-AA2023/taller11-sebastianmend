/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author sebas
 *
 * nombre del plato valor del menú valor inicial del menú valor de porción de
 * guarnición valor de bebida porcentaje adicional por servicio en relación del
 * valor inicial del menú
 */
public abstract class Menu {

    protected double val_menu;
    protected double val_inicial;
    protected String nombrePlato;

    public Menu(String n, double v) {
        nombrePlato = n;
        val_inicial = v;

    }

    public abstract void establecerValorMenu();

    public void establecerVal_inicial(double val_inicial) {
        this.val_inicial = val_inicial;
    }

    public void establecerNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double obtenerVal_menu() {
        return val_menu;
    }

    public double obtenerVal_inicial() {
        return val_inicial;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    @Override
    public String toString() {

        String mensaje = String.format("----Platos: %s\n"
                + "Valor inicial: %.2f\n",
                obtenerNombrePlato(),
                obtenerVal_inicial());

        return mensaje;

    }

}
