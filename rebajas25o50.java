public class MainClass {
  public static void main(String[] args) {
        
    int numPrendas = 4; // 
    float importeInicial = 54.26f; // 
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
