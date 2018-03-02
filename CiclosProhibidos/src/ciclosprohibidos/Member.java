package ciclosprohibidos;

public class Member {

    public float[] list;
    private float suma = 0, mayor = -999999, menor = 999999;

    public void operaciones(int n) {

        suma += list[n];
        mayor = (list[n] > mayor) ? list[n] : mayor;
        menor = (list[n] < menor) ? list[n] : menor;

        if (n != 0) {
            operaciones(n - 1);
        } else {
            System.out.println("Promedio: " + suma / list.length);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        }
    }

}
