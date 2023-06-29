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
public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001
                = {{"Niños 01", "2.00", "1", "1.5"},
                {"Niños 02", "3.00", "1", "1.5"},
                {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002
                = {{"Econo 001", "4", "25"},
                {"Econo 002", "4", "15"},
                {"Econo 003", "4", "35"}
                };

        String[][] datos003
                = {{"Dia 001", "5", "1", "1"},
                {"Dia 002", "6", "2", "2"},
                {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004
                = {{"Carta 001", "6", "1.5", "2", "10"},
                {"Carta 002", "7", "1.7", "2.1", "5"},
                {"Carta 003", "8", "1.9", "2.2", "5"},
                {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        String nombrePlato = null;
        double valorInicial = 0;
        double valorHelado = 0;
        double valorPastel = 0;
        double porcentajeDescuento = 0;
        double valorBebida = 0;
        double valorPostre = 0;
        double valorGuarnicion = 0;
        double porcentajeAdicional = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    nombrePlato = (datos001[i][j]);
                }
                if (j == 1) {
                    valorInicial = Double.parseDouble(datos001[i][j]);
                }

                if (j == 2) {
                    valorHelado = Double.parseDouble(datos001[i][j]);
                }
                if (j == 3) {
                    valorPastel = Double.parseDouble(datos001[i][j]);
                }
            }
            MenuNinios menuNinos = new MenuNinios(nombrePlato, valorInicial, valorHelado, valorPastel);
            menuNinos.establecerValorMenu();
            lista.add(menuNinos);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    nombrePlato = (datos002[i][j]);
                }
                if (j == 1) {
                    valorInicial = Double.parseDouble(datos002[i][j]);
                }

                if (j == 2) {
                    porcentajeDescuento = Double.parseDouble(datos002[i][j]);
                }
            }
            MenuEconomico menuEco = new MenuEconomico(nombrePlato, valorInicial, porcentajeDescuento);
            menuEco.establecerValorMenu();
            lista.add(menuEco);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    nombrePlato = (datos003[i][j]);
                }
                if (j == 1) {
                    valorInicial = Double.parseDouble(datos003[i][j]);
                }
                if (j == 2) {
                    valorBebida = Double.parseDouble(datos003[i][j]);
                }
                if (j == 3) {
                    valorPostre = Double.parseDouble(datos003[i][j]);
                }
            }
            MenuDia menuDia = new MenuDia(nombrePlato, valorInicial, valorBebida, valorPostre);
            menuDia.establecerValorMenu();
            lista.add(menuDia);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    nombrePlato = (datos004[i][j]);
                }
                if (j == 1) {
                    valorInicial = Double.parseDouble(datos004[i][j]);
                }

                if (j == 2) {
                    valorGuarnicion = Double.parseDouble(datos004[i][j]);
                }
                if (j == 3) {
                    valorBebida = Double.parseDouble(datos004[i][j]);
                }
                if (j == 4) {
                    porcentajeAdicional = Double.parseDouble(datos004[i][j]);
                }

            }
            MenuCarta menuCarta = new MenuCarta(nombrePlato, valorInicial, valorGuarnicion, valorBebida, porcentajeAdicional);
            menuCarta.establecerValorMenu();
            lista.add(menuCarta);
        }

        // Fin de solución
        for (int i = 0; i < lista.size(); i++) {
            //lista.get(i).calcularValorMenu();
            lista.get(i).establecerValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);

    }
}
