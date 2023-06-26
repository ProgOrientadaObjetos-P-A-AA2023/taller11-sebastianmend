/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author sebas nombre del plato valor del menú valor inicial del menú valor de
 * porción de guarnición valor de bebida porcentaje adicional por servicio en
 * relación del valor inicial del menú
 */
public class MenuCarta extends Menu {

    public double val_guarnicion;
    public double val_bebida;
    public double porcentaje;

    public MenuCarta(String n,double v, double vg,
            double vb, double p) {
        super(n, v);
        val_guarnicion = vg;
        val_bebida = vb;
        porcentaje = p;

    }

    public void establecerVal_guarnicion(double val_guarnicion) {
        this.val_guarnicion = val_guarnicion;
    }

    public void establecerVal_bebida(double val_bebida) {
        this.val_bebida = val_bebida;
    }

    public void establecerPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void calcularVal_menu() {
        val_menu = (val_inicial + val_bebida + val_guarnicion)+(val_inicial*porcentaje/100);
    }

    public double obtenerVal_guarnicion() {
        return val_guarnicion;
    }

    public double obtenerVal_bebida() {
        return val_bebida;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Menu del dia: \n"
                + "%s"
                + "Valor bebida: %.2f\n"
                + "Valor guarnicion: %.2f\n"
                + "Porcentaje adicional: %.2f\n"
                + "Valor del menu: %.2f\n", super.toString(),
                 obtenerVal_bebida(),
                 obtenerVal_guarnicion(), 
                  obtenerPorcentaje(),
                 obtenerVal_menu());

        return mensaje;
    }

}
