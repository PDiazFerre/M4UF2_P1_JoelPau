/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 */
public class Calculadora {
 
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //DECLARACIÓ DE VARIABLES
        
        Scanner sc = new Scanner(System.in);
        double res = 0;
        String operacion;
        boolean comprobar = false;

        
        //CODI QUE DEMANA INTRODUIR EL PRIMER NÚMERO
        
        
        do {

            String numero1;
            do {
                System.out.println("Introdueix el primer número:");
                numero1 = sc.nextLine();
                
            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume1 = Double.parseDouble(numero1);
            double n1 = new Double(numero1);
            
                    
        //CODI QUE DEMANA INTRODUIR UN SIGNE PER REALITZAR LA OPERACIÓ
        
            System.out.println();       //SALT DE LÍNIA

            do {
                System.out.println("Indica el signe de l'operació de que vulguis realitzar: \n");
                System.out.println("+ = sumar \n "
                        + "- = restar \n"
                        + " x = multiplicar \n "
                        + "/ = dividir \n "
                        + "* = elevar primer num al segon num. \n"
                        + " % = residu \n");
                operacion = sc.nextLine();
                
                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                        || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                        || operacion.equals("*")) {
                    comprobar = true;
                    
                } else {
                    comprobar = false;
                    
                }
            } while (comprobar != true);
            
            
            System.out.println();       //SALT DE LÍNIA
            
            
            //CODI QUE DEMANA INTRODUIR UN SEGON NÚMERO
            
            String numero2;
            
            do {
                
                System.out.println("Introdueix el segon número:");
                numero2 = sc.nextLine();
                
            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume2 = Double.parseDouble(numero2);
            double n2 = new Double(numero2);
            
            
            //CODI QUE REALITZA LES OPERACIONS

            do {
                
                comprobar = true;
                
                switch (operacion) {
                    
                    case "+":
                        res = n1 + n2;
                        break;
                        
                    case "-":
                        res = n1 - n2;
                        break;
                        
                    case "x":
                        
                    case "X":
                        res = n1 * n2;
                        break;
                        
                    case "/":
                                                
                        while (n2 == 0) {
                            do {
                                System.err.println("Al denominador hi ha un zero, "
                                        + "per a evitar errors, col·loca un altre valor.");
                                numero2 = sc.nextLine();
                                
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            nume2 = Double.parseDouble(numero2);
                            n2 = new Double(numero2);
                        }
                                                                 
                        res = n1 / n2;
                        break;
                        
                    case "*":
                        res = Math.pow(n1, n2);
                        break;
                        
                    case "%":
                        while (n2 == 0) {
                            
                            do {
                                System.err.println("Al denominador hi ha un zero, "
                                        + "per a evitar errors, col·loca un altre valor.");
                                numero2 = sc.nextLine();
                                
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            nume2 = Double.parseDouble(numero2);
                            n2 = new Double(numero2);
                            
                        }
                        res = n1 % n2;
                        break;
                }
                
                
                
            //IMPRESION DE RESULTADOS
            
            } while (comprobar != true);

            System.out.println();       //SALT DE LÍNIA
            
            
            System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            System.out.println("\nVols continuar operant? \n");
            System.out.println("[s/n]");
            
            
            //CONTINUAR CON EL PROGRAMA O FINALIZAR
            
            do {
                comprobar = true;
                operacion = sc.nextLine();

                switch (operacion) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\nError, posa un valor vàlid. \n");
                        comprobar = false;
                }
            } while (comprobar != true);
        } while (operacion.equals("s") || operacion.equals("S"));
    }
}


