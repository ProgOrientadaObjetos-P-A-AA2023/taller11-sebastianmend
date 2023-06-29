/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author sebas nombre del plato valor del menú valor inicial del menú valor de
 * postre valor de bebida
 */
public class MenuDia extends Menu {

    public double val_postre;
    public double val_bebida;

    public MenuDia( String n,double v, double vp,
            double vb) {
        super( n, v);
        val_postre = vp;
        val_bebida = vb;

    }

    public void establecerVal_postre(double val_postre) {
        this.val_postre = val_postre;
    }

    public void establecerVal_bebida(double val_bebida) {
        this.val_bebida = val_bebida;
    }
    @Override
    public void establecerValorMenu() {
        val_menu = val_inicial + val_bebida + val_postre;
    }


    public double obtenerVal_postre() {
        return val_postre;
    }

    public double obtenerVal_bebida() {
        return val_bebida;
    }
    
     @Override
    public String toString() {

        String mensaje = String.format("Menu del dia: \n"
                + "%s"
                + "Valor bebida: %.2f\n"
                + "Valor postre: %.2f\n"
                + "Valor del menu: %.2f\n", super.toString(),
                 obtenerVal_bebida(),
                 obtenerVal_postre(), 
                 obtenerVal_menu());

        return mensaje;
    }

    
    
    

}
