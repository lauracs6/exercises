import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Numero de prendas:");
    int numPrendas = input.nextInt();

    
    System.out.println("Importe sin descuento:");
    float importeInicial = input.nextFloat();
          
      float importeDescontado;
      float importeFinal;
      int Descuento1 = 25;
      int Descuento2 = 50;

       
      if (numPrendas <= 3) {
        importeDescontado = importeInicial * Descuento1 / 100.0f;
      } else {
        importeDescontado = importeInicial * Descuento2 / 100.0f;
      }
  
      importeFinal = importeInicial - importeDescontado;
  
      System.out.println(importeFinal + " es el total de la compra.");

    
    }
  }
