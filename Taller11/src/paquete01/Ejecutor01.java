/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete2.*;

import paquete3.*;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    
    public static void main(String[] args) {
        ArrayList<Menu> lista = new ArrayList<>();
        
        Menu menuNi = new MenuNinios("Niños 01", 2.00, 1.00, 1.50);
        Menu menuNi2 = new MenuNinios("Niños 02", 3.00, 1.00, 1.50);
        Menu menuEc = new MenuEconomico("Econo001", 4.00, 25.00);
        Menu menuDia = new MenuDia("Dia 001", 5.00, 1.00, 1.00);
        Menu menuCarta = new MenuCarta("Carta 001", 6.0, 1.5, 2.0, 10.00);
        
        lista.add(menuNi);
        lista.add(menuNi2);
        lista.add(menuEc);
        lista.add(menuDia);
        lista.add(menuCarta);
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularVal_menu();
        }
        
        Cuenta miCuenta = new Cuenta("René Elizalde", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);
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