package data;

public class Ejercicio12 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int aux;
        int limite = 51;

        System.out.println(n1);
        System.out.println(n2);

        while (n2 + n1 <= limite) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;

            System.out.println(n2);
        }
    }
}
