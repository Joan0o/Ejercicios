package co.edu.miscelanea;

import java.util.Scanner;

public class Miscelanea {

    public static void main(String[] args) {
        
        boolean a =  true;

        while(a){
            
            ejercicios ejercicios = new ejercicios(miscelanea(menú()));
            
            System.out.println("\nIngrese 1 si deasea salir, 2 si desea continuar");
            if("1".equals(new Scanner(System.in).next())){
                a = false;
            }
            
        }
        
    }
    
    public static String menú() {
        
        System.out.print("Seleccione una de las opciones según su número: \n\n"
                + "1 : Operadores (ejercicios del 1 as 16)\n"
                + "2 : Condicionales 1 (ejercicios del 17 al 32)\n"
                + "3 : Condicionales 2 (ejercicios del 33 al 48)\n"
                + "4 : Condicionales 3 (ejercicios del 49 al 64)\n"
                + "5 : Condicionales 4 (ejercicios del 65 al 80)\n");
        
        return new Scanner(System.in).next();
   
    }
    
    public static String miscelanea(String num){
        switch(num){
            case "1":
                System.out.print("Seleccione una de las opciones según su número: \n\n"
                + "1 : Area de triangulo\n"
                + "2 : Sumar 2 números\n"
                + "3 : Elevar al cuadrado \n"
                + "4 : Operaciones entre 1234  y 532 \n"
                + "5 : Convertir Euro a Dolar\n"
                + "6 : Area de un rectangulo \n"
                + "7 : Area y perimetro de un cuadrado \n"
                + "8 : Area y volumen de un cilindro \n"
                + "9 : Area y longitud de un circulo \n"
                + "10 : Promedio de 3 numeros \n"
                + "11 : Suma de fracciones \n"
                + "12 : Potencia enésima \n");
                break;
            case "2":
                System.out.print("Seleccione una de las opciones según su número: \n\n"
                + "17 : Derminar si un numero es positivo o negativo\n"
                + "18 : Determinar el numero mayor y el menor (2 numeros)\n"
                + "19 : Determinar el numero mayor y el menor (3 numeros)\n"
                + "20 : Calcular sueldo de empleado \n"
                + "21 : Suma y resta según numero mayor\n"
                + "22 : Dividir, condicion de division entre cero \n"
                + "23 : Nombre del día de la semana según número \n"
                + "24 : Determinar si trianguo es equilatero \n"
                + "25 : Sumar o multiplicar / condición  \n"
                + "26 : Su signo según su día y mes de nacimiento \n"
                + "27 : Cuadrado o rectangulo - perimetro y area \n"
                + "28 : Descuentos \n"
                + "29 : Nacidos en un hospital \n"
                + "30 : Espectaculo \n"
                + "31 : Año biciesto \n"
                + "32 : Lapso de días entre fechas \n");
                break;
            case "3":
                System.out.print("Seleccione una de las opciones según su número: \n\n"
                + "33 : Derminar si un numero es positivo o negativo\n"
                + "34 : Determinar el numero mayor y el menor (2 numeros)\n"
                + "35 : Determinar el numero mayor y el menor (3 numeros)\n"
                + "36 : Calcular sueldo de empleado \n"
                + "37 : Suma y resta según numero mayor\n"
                + "38 : Dividir, condicion de division entre cero \n"
                + "39 : Nombre del día de la semana según número \n"
                + "40 : Determinar si trianguo es equilatero \n"
                + "41 : Sumar o multiplicar / condición  \n"
                + "42 : Su signo según su día y mes de nacimiento \n"
                + "43 : Cuadrado o rectangulo - perimetro y area \n"
                + "44 : Descuentos \n"
                + "45 : Nacidos en un hospital \n"
                + "46 : Espectaculo \n"
                + "47 : Año biciesto \n"
                + "48 : Lapso de días entre fechas \n");
                break;
            case "4":
                System.out.print("Seleccione una de las opciones según su número: \n\n"
                + "49 : Derminar si un numero es positivo o negativo\n"
                + "50 : Determinar el numero mayor y el menor (2 numeros)\n"
                + "51 : Determinar el numero mayor y el menor (3 numeros)\n"
                + "52 : Calcular sueldo de empleado \n"
                + "53 : Suma y resta según numero mayor\n"
                + "54 : Dividir, condicion de division entre cero \n"
                + "55 : Nombre del día de la semana según número \n"
                + "56 : Determinar si trianguo es equilatero \n"
                + "57 : Sumar o multiplicar / condición  \n"
                + "58 : Su signo según su día y mes de nacimiento \n"
                + "59 : Cuadrado o rectangulo - perimetro y area \n"
                + "60 : Descuentos \n"
                + "61 : Nacidos en un hospital \n"
                + "62 : Espectaculo \n"
                + "63 : Año biciesto \n"
                + "64 : Lapso de días entre fechas \n");
                break;
            case "5":
                System.out.print("Seleccione una de las opciones según su número: \n\n"
                + "65 : Derminar si un numero es positivo o negativo\n"
                + "66 : Determinar el numero mayor y el menor (2 numeros)\n"
                + "67 : Determinar el numero mayor y el menor (3 numeros)\n"
                + "68 : Calcular sueldo de empleado \n"
                + "69 : Suma y resta según numero mayor\n"
                + "70 : Dividir, condicion de division entre cero \n"
                + "71 : Nombre del día de la semana según número \n"
                + "72 : Determinar si trianguo es equilatero \n"
                + "73 : Sumar o multiplicar / condición  \n"
                + "74 : Su signo según su día y mes de nacimiento \n"
                + "75 : Cuadrado o rectangulo - perimetro y area \n"
                + "76 : Descuentos \n"
                + "77 : Nacidos en un hospital \n"
                + "78 : Espectaculo \n"
                + "79 : Año biciesto \n"
                + "80 : Lapso de días entre fechas \n");
                break;
        }
                return new Scanner(System.in).next();
    }   
}
