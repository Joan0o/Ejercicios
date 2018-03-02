package com.crap;

import java.util.Random;
import java.util.Scanner;

public class proceso {
    Random n = new Random();
    private int resultado = 0;
    private int lanzamiento = 0;
    private int lastResultado = 0;
    Scanner l = new Scanner(System.in);
    public int resultadoGet(){ return resultado;}
    public void resultadoSet(int value){ this.resultado = value+1; lanzamiento++; }

    public void jugar(){
        
        do{
            do{
                System.out.println("Lanzar");
                new Scanner(System.in).nextLine();
                resultadoSet(n.nextInt(11));
                System.out.println("Resultado: "+resultado);
                System.out.println("Resultado anterior: "+lastResultado+"!ª$%&/()=");
                if(resultado == 11 || resultado == 7){
                    System.out.println("Youwon!");
                    lastResultado = 0;                    
                }else if(resultado == 2 || resultado == 3 || resultado == 12){
                    System.out.println("YouLose!");
                    lastResultado = 0;
                }else if(resultado == lastResultado){
                    System.out.println("Youwon!");
                    lastResultado = 0;
                }else {
                    System.out.println("BONUS!");
                    lastResultado = resultado;
            }
            }while(lastResultado != 0);
            System.out.println("1:siguiente turno 2:terminar");
        }while("1".equals(l.next()));
        
    }
    
} 
