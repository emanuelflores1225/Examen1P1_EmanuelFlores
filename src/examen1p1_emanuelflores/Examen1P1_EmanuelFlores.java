package examen1p1_emanuelflores;
import java.util.Scanner;
import java.security.SecureRandom;

public class Examen1P1_EmanuelFlores {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("--------------------");
            System.out.println("Menu");
            System.out.println("1. Divisores primos");
            System.out.println("2. Contorno de piramides");
            System.out.println("3. Vecinos");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Ingrese un numero primo: ");
                    int num = leer.nextInt();
                    primos (num);
                }
                case 2->{
                    System.out.println("Ingrese el numero de filas: ");
                    int num = leer.nextInt();
                    contorno (num);
                }
                case 3->{
                    
                    System.out.println("Ingrese una string SOLO CON LETRAS: ");
                    String palabra = leer.next();
                    vecinos (palabra);                    
                }
                
                case 4->{
                    System.out.println("Saliendo");
                }
            }
        }while (opcion != 4);
    }
    public static String primos (int num){
        String resp="";
        if (num >= 1){       
            int n1 = 1;
            int n2 = 2;
            int n3 = num/2;
            int n4 = num;
            boolean visited = false;
            String num1 = String.valueOf(n1);
            String num2 = String.valueOf(n2);
            String num3 = String.valueOf(n3);
            String num4 = String.valueOf(n4);
            if (num == 0 || num == 1 || num == 4) {
                visited = false;
                }
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0){
                    visited = false;
                    }
                else{
                    visited = true;   
                    }
            }
            if ( visited = false){
                System.out.println("El numero no es primo");
                }
            else{
                System.out.println("El numero " + num + " tiene los divisores: " + num1 + "," + num2 + "," + num3 + "," + num4);
                resp += "Los divisores son: " + num1  + "," + num2 + "," + num3 + "," + num4;
                }
        }
        return resp;
    }        
    public static void contorno (int num ){
            int k = 0;
            System.out.println();
            for (int i = num; i > 0;i--){
                for (int j = 1; j <=i;j++){
                    System.out.print("*"); 
                }
                for (int j = 1; j <= k; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i;j++){
                    System.out.print("*");
                }
                //imprime los dos triangulos de ambos lados
                System.out.println();
                k += 2;
                }
            for (int i = 0; i < 1; i++){
                for (int j = 0; j < num*2; j++){
                    System.out.print("*");
                }
                System.out.println();
            }//imprime los asteriscos de abajo           
    }
    public static String vecinos(String palabra){
        String nose="";
        SecureRandom random = new SecureRandom();
        boolean visited = false;
        //Random aleatorio = new Random();
        int r = random.nextInt(2);
        //int alea = num.nextInt(1);
        for (int i = 0; i < palabra.length();i++){
            char letter = palabra.toUpperCase().charAt(i);
            int valorASCII = (int) letter;
            visited = (valorASCII != 165 && valorASCII < 65 || valorASCII > 90);
            if (r == 0){
                System.out.println(letter = palabra.charAt(i-1));
            }
            else if (r == 1){
                System.out.println(letter = palabra.charAt(i+1));
            }
        }
        if (visited == false){
            System.out.println("SOLO DEBE INGRESAR LETRAS");
            }
        return nose; 
    }
}
