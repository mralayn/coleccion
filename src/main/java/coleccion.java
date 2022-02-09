import java.util.*;
import java.util.Random;
public class coleccion {


    public static void main(String[] args) {

        Random numAzar = new Random();
        Scanner key = new Scanner(System.in);
        int tam,num;

        System.out.println("Ingrese Tamaño de arreglo");
        tam=key.nextInt();
        int A[]=new int[tam];
        for(int i=0; i<A.length; i++){
            num= (int)(numAzar.nextDouble()*100);
            A[i]=num;
        }



        int aux;
        for(int i=1; i<=A.length; i++) {
            for(int j=0; j<A.length-i; j++) {
                if( A[j] > A[j+1] ) {
                    aux   = A[j];
                    A[j]  = A[j+1];
                    A[j+1]= aux;
                }
            }
        }




        System.out.println("\nArray A ordenado: ");
        for(int i=0; i<A.length; i++)
            System.out.println( A[i] );
        int suma=0;
        for (int i = 0; i < A.length; i++) {
            suma = suma+A[i];
        }
        System.out.println("La suma del arreglo es :" + suma);
    }
}