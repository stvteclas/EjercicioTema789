import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String texto = "Texto de ejemplo";
        reverse(texto);
        //4. si utilizamos un vector con la capacidad po defecto y agregamos
        // 1000 elementos en el generara tantas copias como le sean necesarias
        // para lograr tener un nuevo array de 1000 elementos, lo que vuelve lento a
        // todo el proceso por el uso de recursos.

        //5 crear un ArrayList y copiarlo en un Linkedlist
        ArrayList arrayList = new ArrayList();
        arrayList.add("perro");
        arrayList.add("gato");
        arrayList.add("conejo");
        arrayList.add("loro");

        LinkedList<String> list = new LinkedList<>(arrayList);
        System.out.println("linkedlist copiada = " + list.toString());
        System.out.println("arrayList = " + arrayList.toString());
        //6 Arraylist tipo int

        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i=0; i<10; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el numero" + i+ ":");
            int numero = input.nextInt();
            numeros.add(numero);
        }
        for (int i=0; i< numeros.size(); i++ ) {
            if(numeros.get(i) % 2 ==0){
                numeros.remove(i);
            } else if (numeros.get(i)%2!=0) {
                System.out.println("numero = " + numeros.get(i));
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el dividendo:");
        int num1= input.nextInt();
        System.out.println("ingrese el divisor");
        int num2 = input.nextInt();

        int resultado = dividePorCero(num1,num2);
    }
    public static String reverse(String texto){
        String [] libros = {"viaje al centro de la tierra", "De  la tierra a la luna", "20000 leguas de viaje submarino", "la isla misteriosa", "La vuelta al mundo en 80 dias"};
        for (String libro:libros
             ) {
            System.out.println("libro = " + libro);

        }


        Vector libroVector = new Vector();
        for (int i=0; i< libros.length; i++){
            libroVector.add(libros[i]);
        }
        System.out.println("libroVector = " + libroVector.toString());
        libroVector.remove(1);
        libroVector.remove(2);
        System.out.println("libroVector = " + libroVector);
        return texto;
    }

    //7 dos formas de hacer division por cero no de error
    public static int dividePorCero(int num1, int num2) {
        try{
            int resultado = num1 / num2;
            System.out.println("resultado = " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Esto no se puede hacer"+ e.getMessage());
        }
        return num1;
    }
}