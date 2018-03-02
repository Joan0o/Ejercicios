
package ciclosprohibidos;

import java.util.Scanner;

public class CiclosProhibidos {
    
    public static String[] inputs;
    public static float[] numbers;
    public static Member n = new Member();

    public static void main(String[] args) {
        
        System.out.println("Ingrese los numeros separados por una coma (1,2,3,4,...,n)");
        
        CiclosProhibidos.inputs = new Scanner(System.in).next().split(",");
        CiclosProhibidos.numbers = new float[inputs.length];
        CiclosProhibidos.getEntradas(CiclosProhibidos.inputs.length-1);
        
        n.list = numbers;
        n.operaciones(numbers.length-1);
        
    }
    
    public static void getEntradas(int n){
        if(n >= 0){
            numbers[n] = Float.parseFloat(inputs[n]);
            getEntradas(n-1);
        }
        
    }
    
}

