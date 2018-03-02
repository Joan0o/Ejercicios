package co.edu.miscelanea;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ejercicios {

    Scanner entrada = new Scanner(System.in);
    private double[] entradas;
    private String[] entradasString;

    public void getEntradas() {
        
        entradasString = this.entrada.next().split(",");
        
        try{
        this.entradas = new double[entradasString.length];
        for (int i = 0; i < entradasString.length; i++) 
            this.entradas[i] = Double.parseDouble(entradasString[i]);
        }
        catch (Exception e) {}
    }

    public ejercicios(String ejercicio) {

        switch (ejercicio) {
            case "1":
                _1AreaTriangulo();
                break;
            case "2":
                _2sumar();
                break;
            case "3":
                _3elevar();
                break;
            case "4":
                _4ejerciciosp();
                break;
            case "5":
                _5conversion();
                break;
            case "6":
                _6AreaRectangulo();
                break;
            case "7":
                _7AreaYPerimetro();
                break;
            case "8":
                _8AreaYVolumen();
                break;
            case "9":
                _9AreaYLongitud();
                break;
            case "10":
                _10Promedio();
                break;
            case "11":
                _11fracciones();
                break;
            case "12":
                _12PotenciaEnecima();
                break;
            case "17":
                _17mayormenor();
                break;
            case "18":
                _18mayormenor();
                break;
            case "19":
                _19mayormenor();
                break;
            case "20":
                _20empelado();
                break;
            case "21":
                _21sumaOresta();
                break;
            case "22":
                _22division();
                break;
            case "23":
                _23Dia();
                break;
            case "24":
                _24equilatero();
                break;
            case "25":
                _25mulsum();
                break;
            case "26":
                _26signo();
                break;
            case "27":
                _27();
                break;
            case "28":
                _28descuentos();
                break;
            case "29":
                _29Hospital();
                break;
            case "30":
                _30EstadosCiviles();
                break;
            case "31":
                _31();
                break;    
            case "32":
                _32();
                break;
            case "33":
                _33();
                break;
            case "34":
                _34();
                break;
            case "35":
                _35();
                break;
            case "36":
                _36();
                break;
            case "37":
                _37();
                break; 
            case "38":
                _38();
                break; 
            case "39":
                _39();
                break; 
            case "40":
                _40();
                break; 
            case "41":
                _41();
                break; 
            case "42":
                _42();
                break; 
            case "43":
                _43();
                break; 
            case "44":
                _44();
                break; 
            case "45":
                _45();
                break;     
        }

    }
    
    // <editor-fold defaultstate="collapsed" desc="1-12">
    private void _1AreaTriangulo() {
        System.out.println("Digite los valores en el orden: Base, Altura");
        getEntradas();
        System.out.println(" El area es de: " + (entradas[0] * entradas[1]) / 2
                + " ---- (" + entradas[0] + " * " + entradas[1] + " /2)");

    }
    private void _2sumar() {

        System.out.println("Digite los valores en el orden: Digito 1, Digito 2");
        getEntradas();
        System.out.println(entradas[0] + " + " + entradas[1] + " = " + entradas[0] + entradas[1]);

    }
    private void _3elevar() {

        System.out.println("Digite el número que deasea elevar");
        getEntradas();
        System.out.println(entradas[0] + " ^2 " + " = " + Math.pow(entradas[0], 2));

    }
    private void _4ejerciciosp() {

        System.out.println("Suma           : " + (1234 + 532)
                + "\n Resta         :" + (1234 - 532)
                + "\n Multiplicación:" + 1234 * 532
                + "\n División      :" + 1234 / 532
        );

    }
    private void _5conversion() {

        System.out.println("Dolares: \n");
        getEntradas();
        System.out.println("Euros : " + entradas[0] * 0.8425);

    }
    private void _6AreaRectangulo() {

        System.out.println("Digite los valores en el orden: Base, Altura");
        getEntradas();
        System.out.println(" El area es de: " + (entradas[0] * entradas[1]) + " ---- (" + entradas[0] + " * " + entradas[1] + " )");

    }
    private void _7AreaYPerimetro() {

        System.out.println("Valor del lado");
        getEntradas();
        System.out.println(" El area es de: " + (entradas[0] * entradas[0]) + " ---- El perimetro es de: " + entradas[0] * 4);

    }
    private void _8AreaYVolumen() {

        System.out.println("Digite los valores en el orden: Radio, Altura");
        getEntradas();
        System.out.println(" El volumen es de: "
                + (Math.pow(entradas[0], 2) * Math.PI) * entradas[1]
                + " --\n -- El area es de: "
                + ((2 * entradas[0] * Math.PI) * (entradas[1]))
                + ((entradas[0] * entradas[0]) * Math.PI * 2));

    }
    private void _9AreaYLongitud() {

        System.out.println("Valor del radio");
        getEntradas();
        System.out.println(" Area: " + (Math.pow(entradas[0], 2) * Math.PI) + " --\n"
                + "-- Longitud:  " + 2 * entradas[0] * Math.PI);

    }
    private void _10Promedio() {

        System.out.println("Digite los valores en el orden: dato 1, dato 2, dato 3");
        getEntradas();
        System.out.println(" el promedio es de:  " + (entradas[0] + entradas[1] + entradas[2]) / 3);

    }
    private void _11fracciones() {

        System.out.println("Digite los valores en el orden: Numerador 1, Denominador 1, Numerador 2, Denominador 2");
        getEntradas();
        System.out.println(" Suma: " + ((entradas[0] * entradas[3]) + (entradas[1] * entradas[2])) / (entradas[1] * entradas[3])
                + "--- (" + entradas[0] + "/" + entradas[1] + " + " + entradas[2] + "/" + entradas[3] + " )");

    }
    private void _12PotenciaEnecima() {

        System.out.println("Digite los valores en el orden: Base, Potencia");
        getEntradas();
        System.out.println(" Resultado: " + Math.pow(entradas[0], entradas[1]));

    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="17-32">
    private void _17mayormenor() {

        System.out.println("Digite el número");
        getEntradas();
        System.out.println((entradas[0] < 0) ? "Negativo" : "Positivo");

    }
    private void _18mayormenor() {

        System.out.println("Digite los valores en el orden: Digito 1, Digito 2");
        getEntradas();
        System.out.println((entradas[0] < entradas[1]) ? entradas[0]
                + " < " + entradas[1] : entradas[0] + " > " + entradas[1]);

    }
    private void _19mayormenor() {

        System.out.println("Digite los valores en el orden: Digito 1, Digito 2");
        getEntradas();
        double mayor = -9999, menor = 9999;
        for (int i = 0; i < entradas.length; i++) {
            if (entradas[i] > mayor) {
                mayor = entradas[i];
            }
            if (entradas[i] < menor) {
                menor = entradas[i];
            }
        }
        System.out.println("Mayor: " + mayor + " -- menor: " + menor);

    }
    private void _20empelado() {

        Map<String, double[]> empleado = new HashMap<String, double[]>();
        Scanner otroEmpleado = new Scanner(System.in);
        boolean otro = true;
        while (otro) {
            System.out.println("Nombre del empleado");
            String nombre;
            nombre = new Scanner(System.in).next();

            System.out.println("Digite los valores en el orden: horas normales trabajadas, horas extra");
            getEntradas();
            empleado.put(nombre, entradas);
            System.out.println("¿Desea registrar otro empleado? \n 1:Si - 2:No");
            if ("2".equals(otroEmpleado.next())) {
                otro = false;
            }
        }

        for (Map.Entry entry : empleado.entrySet()) {
            double[] value = empleado.get(entry.getKey());
            System.out.println("\n" + entry.getKey() + ": " + value[0] + ", " + value[1] + " \n Sueldo: " + (value[0] * 4 + value[1] * 8));
        }

    }
    private void _21sumaOresta() {

        System.out.println("Digite los valores en el orden: Digito 1, Digito 2");
        getEntradas();
        System.out.println((entradas[0] < entradas[1]) ? "Suma: "
                + (entradas[0] + entradas[1]) : "Resta: "
                + (entradas[0] - entradas[1]));

    }
    private void _22division() {

        System.out.println("Digite los valores en el orden: Dividendo, Divisor");
        getEntradas();
        System.out.println((entradas[1] != 0) ? entradas[0] / entradas[1]
                : "No se puede dividir entre cero");

    }
    private void _23Dia() {

        System.out.println("digite el número del día");
        String dia = null;
        switch (this.entrada.next()) {
            case "1":
                dia = "Lunes";
                break;
            case "2":
                dia = "Martes";
                break;
            case "3":
                dia = "Miercoles";
                break;
            case "4":
                dia = "Jueves";
                break;
            case "5":
                dia = "Viernes";
                break;
            case "6":
                dia = "Sabado";
                break;
            case "7":
                dia = "Domingo";
                break;
        }
        System.out.println(dia);

    }
    private void _24equilatero() {

        System.out.println("Digite los valores en el orden: Lado 1, Lado 2, Lado 3");
        getEntradas();
        System.out.println((entradas[0] == entradas[1] && entradas[1] == entradas[2])
                ? "Es equilatero" : "No es equilatero");

    }
    private void _25mulsum() {

        System.out.println("Digite los valores en el orden: Digito 1, Digito 2");
        getEntradas();
        System.out.println((entradas[0] < 0 || entradas[1] < 0)
                ? "Suma: " + (entradas[0] + entradas[1])
                : "Multiplicación: " + (entradas[0] * entradas[1]));

    }
    private void _26signo() {

        System.out.println("Digite los valores en el orden: Día, Mess");
        getEntradas();
        String signo = null;

        int day = (int) entradas[0];
        int month = (int) entradas[1];

        if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
            System.out.println("Capricornio");
        } else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 17)) {
            System.out.println("Aquario");
        } else if ((month == 2 && day >= 18 && day <= 29) || (month == 3 && day >= 1 && day <= 19)) {
            System.out.println("Picis");
        } else if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
            System.out.println("Aries");
        } else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
            System.out.println("Tauro");
        } else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("Geminis");
        } else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
            System.out.println("Cancer");
        } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
            System.out.println("Leo");
        } else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
            System.out.println("Virgo");
        } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
            System.out.println("Libra");
        } else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
            System.out.println("Escorpio");
        } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
            System.out.println("Sagitario");
        } else {
            System.out.println("Fecha nula");
        }

        // código tomado de "https://introcs.cs.princeton.edu/java/13flow/Zodiac.java.html"
        System.out.println();

    }
    private void _27() {

        System.out.println("Digite los valores en el orden: Base, Altura");
        getEntradas();
        System.out.println((entradas[0] == entradas[1]) ? "Cuadrado " : "Rectangulo ");
        System.out.println("Area = " + entradas[0] * entradas[1]);
        System.out.println("Perimetro = " + entradas[0] * 2 + entradas[1] * 2);

        System.out.println();

    }
    private void _28descuentos() {

        System.out.println("Ingrese el precio total");
        getEntradas();
        double descuento;
        if (entradas[0] < 100) {
            descuento = .5;
        } else if (entradas[0] < 200) {
            descuento = .10;
        } else {
            descuento = .15;
        }
        System.out.println("Decuento: " + entradas[0] * descuento + "\nTotal: " + (entradas[0] - entradas[0] * descuento));

    }
    private void _29Hospital() {

        System.out.println("Digite los valores en el orden: Día, Mes, Año, Sexo (1:Masculino 2:Femenino)");
        getEntradas();
        int hombres = 0, mujeres = 0;

        for (int i = 0; i < entradas.length / 4; i += 4) {
            if (entradas[4] == 1) {
                hombres++;
            } else {
                mujeres++;
            }
        }
        System.out.println("Hombres: " + hombres + " Mujeres: " + mujeres + " Total: " + hombres + mujeres);

    }
    private void _30EstadosCiviles() {

        Scanner otro = new Scanner(System.in);
        int[] M = {0,0,0,0,0};
        int[] F = {0,0,0,0,0};

        do {

            System.out.println("Ingrese los valores en el ordern: Sexo(m:Masculino f:Femenino), Estado Civil(s,c,v,d)");
            getEntradas();
            
            int poc = suitch(entradasString[1]);
            if (entradasString[0].equals("m")) {
                M[poc]++;
            } else {
                F[poc]++;
            }

            System.out.println("Ingresar otro usuario 1:si 2:no");

        } while ("1".equals(otro.next()));
        
        M[4] = IntStream.of(M).sum();
        System.out.println("Total hombres: " + (M[4]));
        System.out.println("Solteros: " + (M[0]*100)/M[4]);
        System.out.println("Casados: " + (M[0]*100)/M[4]);
        System.out.println("Viudos: " + (M[0]*100)/M[4]);
        System.out.println("Divorciados: " + (M[0]*100)/M[4]);
        F[4] = IntStream.of(F).sum();
        System.out.println("Total mujeres: " + F[4]);
        System.out.println("Solteras: " + (F[0]*100)/F[4]);
        System.out.println("Casadas: " + (F[1]*100)/F[4]);
        System.out.println("Viudas: " + (F[2]*100)/F[4]);
        System.out.println("Divorciadas: " + (F[3]*100)/F[4]);
    }
    private void _31() {

        System.out.println("Digite el año");
        getEntradas();
        if ((entradas[0] % 4 == 0 && entradas[0] % 100 != 0) || entradas[0] % 400 == 0)
        {
            System.out.println(entradas[0]+" es biciesto");
        }else{
            System.out.println(entradas[0]+" no es biciesto");
        }

    }
    private void _32() {

        System.out.println("Digite los valores en el orden: Día, Mes, Día2, Mes2 ");
        getEntradas();
        double total1 = entradas[0] + (entradas[1]*30);
        double total2 = entradas[2] + (entradas[3]*30);
        int diferencia = (int) (total2-total1);

        if(total1<total2){
            
             System.out.println((total2-total1 > 30) ? diferencia/30+" Meses y "+diferencia%30+" Días" : (int)diferencia+"Días");
            
        }

    }
    
    
    private int suitch(String EstCiv){
        int d = 0;
        switch(EstCiv){
            case "s":
                d = 0;
                break;
            case "c":
                d = 1;
                break;
            case "v":
                d = 2;
                break;
            case "d":
                d = 3;
                break;    
        }
        return d;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="33-48">
    private void _33() {

        System.out.println("Digite los valores en el orden: H,M,S(Entrada),H,M,S(Salida)");
        getEntradas();
        double total1 = entradas[2] + (entradas[1]*60) + (entradas[0]*3600);
        double total2 = entradas[5] + (entradas[4]*60) + (entradas[3]*3600);
        
        int h = (entradas[5] - entradas[2]>0)?(int)(entradas[5] - entradas[2]):0;
        int m = (entradas[4] - entradas[1]>0)?(int)(entradas[4] - entradas[1]):0;
        int s = (entradas[3] - entradas[0]>0)?(int)(entradas[3] - entradas[0]):0;

 
        System.out.println(h+":"+m+":"+s);

    }
    private void _34() {
        
        for (int i = 3; i <= 1000; i += 3) {
            System.out.println(i);
        }

    }
    private void _35() {
        
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }

    }
    private void _36() {
        
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

    }
    private void _37() {
        
        for (int i = 1; i <= 3; i ++) {
            System.out.println(i);
        }

    }
    private void _38() {
        
        for (int i = 1; i <= 9; i ++) {
            System.out.println(i);
        }

    }
    private void _39() {
        
        for (int i = 1; i <= 10000; i ++) {
            System.out.println(i);
        }

    }
    private void _40() {
        
        for (int i = 5; i <= 10; i ++) {
            System.out.println(i);
        }

    }
    private void _41() {
        
        for (int i = 5; i <= 15; i ++) {
            System.out.println(i);
        }

    }
    private void _42() {
        
        for (int i = 5; i <= 15000; i ++) {
            System.out.println(i);
        }

    }
    private void _43() {
        
        for (int i = 0; i < 200; i ++) {
            System.out.println("Hola " + i);
        }

    }
    private void _44() {
        
        for (int i = 1; i <= 30; i ++) {
            System.out.println(i+"^"+"2 = "+i*i);
        }

    }
    private void _45() {
        int last = 1;
        for (int i =1; i <= 20; i ++) {
            System.out.print(last + " * " + i+" = "+last*i+"\n" );
            last *= i;
        }

    }
    private void _46() {
        int last = 1;
        for (int i =1; i <= 100; i ++) {
            System.out.print(i + " ^ 2 = "+Math.pow(i,2) );
            last += Math.pow(i,2);
        }
        System.out.println("Suma = "+last);

    }
    
    // </editor-fold>
}

