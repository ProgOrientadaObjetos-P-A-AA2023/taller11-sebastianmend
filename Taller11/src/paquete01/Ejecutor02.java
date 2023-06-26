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
        
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"},
        };
        
        String[][] datos002 = {{"Econo 001", "4", "25"}, 
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };
        
        String[][] datos003 = { {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"},
        };
        
        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"}, 
            {"Carta 002", "7", "1.7", "2.1", "5"}, 
            {"Carta 003", "8", "1.9", "2.2", "5"}, 
            {"Carta 004", "9", "2.5", "2.9", "5"}, 
        };
                
        
        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();
        
        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        ArrayList<Menu> aux = convertir(datos001);
        for (int i=0;i<aux.size();i++) {
            lista.add(aux.get(i));
        }
        
        ArrayList<Menu> aux2 = convertir(datos002);
        for (int i=0;i<aux2.size();i++) {
            lista.add(aux2.get(i));
        }
        
        ArrayList<Menu> aux3 = convertir(datos003);
        for (int i=0;i<aux3.size();i++) {
            lista.add(aux3.get(i));
        }
        
        ArrayList<Menu> aux4 = convertir(datos004);
        for (int i=0;i<aux4.size();i++) {
            lista.add(aux4.get(i));
        }
        
        // Fin de solución
        
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularVal_menu();
        }
        
        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);
    }
    
    public static ArrayList<Menu> convertir (String [][] datos) {
        String nombre = "";
        double valor1=0.00;
        double valor2=0.00;
        double valor3=0.00;
        double valor4=0.00;
        Menu objeto1;
        ArrayList<Menu> objetos = new ArrayList<>();
        
        for (int i=0; i<datos.length; i++) {
            for (int j=0;j<datos[0].length;j++) {
                if(j==0) {
                    nombre = datos[i][j];
                }
                if (j==1) {
                    valor1=Double.parseDouble(datos[i][j]);
                }
                if (j==2) {
                    valor2=Double.parseDouble(datos[i][j]);
                }
                if (j==3) {
                    valor3=Double.parseDouble(datos[i][j]);
                }
                if (j==4) {
                    valor4=Double.parseDouble(datos[i][j]);
                }
            }
            if (datos[0].length==3) {
                objeto1 = new MenuEconomico(nombre, valor1, valor2);
                objetos.add(objeto1);
            }
            if (datos[0].length==4) {
                if (datos[0][0].equals("Niños 01"))
                    objeto1 = new MenuNinios(nombre, valor1, valor2, valor3);
                else 
                    objeto1 = new MenuDia(nombre, valor1, valor2, valor3);

                objetos.add(objeto1);
            }
            if (datos[0].length==5) {
                objeto1 = new MenuCarta(nombre, valor1, valor2, valor3, valor4);
                objetos.add(objeto1);
            }
        }
        return objetos;
    }
}
/*
        ArrayList<Menu> objetos = new ArrayList<>();
        int num2 = datos[0].length;
        Menu objeto1;
                
        for (int i=0;i<datos.length;i++) {
            String nombre = "";
            double valor1=0.00;
            double valor2=0.00;
            double valor3=0.00;
            double valor4=0.00;
            for (int j=0;j<datos[0].length;j++) {
                if (j==0) {
                    nombre = datos[i][j];
                } else {
                    switch (num2) {
                        case 2:
                            valor1=Double.parseDouble(datos[i][j]);
                            j++;
                            valor2=Double.parseDouble(datos[i][j]);
                            j++;
                            break;
                        case 3:
                            valor1=Double.parseDouble(datos[i][j]);
                            j++;
                            valor2=Double.parseDouble(datos[i][j]);
                            j++;
                            valor3=Double.parseDouble(datos[i][j]);
                            j++;
                            break;
                        case 4:
                            valor1=Double.parseDouble(datos[i][j]);
                            j++;
                            valor2=Double.parseDouble(datos[i][j]);
                            j++;
                            valor3=Double.parseDouble(datos[i][j]);
                            j++; 
                            valor4=Double.parseDouble(datos[i][j]);
                            j++;
                            break;
                    }
                }
            }
            if (num2==2) {
                    objeto1 = new MenuEconomico(nombre, valor1, valor2);
                    objetos.add(objeto1);
            } else if (num2==3) {
                if (datos[0][0].equals("Niños 01"))
                    objeto1 = new MenuNinios(nombre, valor1, valor2, valor3);
                else 
                    objeto1 = new MenuDia(nombre, valor1, valor2, valor3);

                objetos.add(objeto1);
            } else {
                objeto1 = new MenuCarta(nombre, valor1, valor2, valor3, valor4);
                objetos.add(objeto1);
            } 
*/
