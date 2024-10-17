public class piscinas {
    public static void main(String[] args) {
      
      int largo1 = 300; //declaración de variables
      int ancho1 = 150;
      int profundidad1 = 20;
      
      int largo2 = 300;
      int ancho2 = 80;
      int profundidad2 = 35;
   
      int area1 = ancho1 * largo1;  //área de la piscina 1
      int area2 = ancho2 * largo2;  //área de la piscina 2
  
      int volumen1 = area1 * profundidad1;  //volumen de la piscina 1
      int volumen2 = area2 * profundidad2;  //volumen de la piscina 2
  
      int anchoTotal = ancho1 + ancho2; //ancho de las dos piscinas juntas
  
      int areaTotal = anchoTotal * largo1;  //área de las dos piscinas juntas
      
      int volumenTotal = volumen1 + volumen2; //volumen de las dos piscinas juntas
  
      System.out.println("El área de la piscina 1 es: " + area1 + " m²"); //muestra de resultados
      System.out.println("El área de la piscina 2 es: " + area2 + " m²");
      System.out.println("El volumen de la piscina 1 es: " + volumen1 + " m³");
      System.out.println("El volumen de la piscina 2 es: " + volumen2 + " m³");
      System.out.println("El ancho total de ambas piscinas es: " + anchoTotal + " m");
      System.out.println("El área total de las dos piscinas es: " + areaTotal + " m²");
      System.out.println("El volumen total de las dos piscinas es: " + volumenTotal + " m³");
  
      int temp = profundidad1;  //intercambio de datos entre piscinas
      profundidad1 = profundidad2;
      profundidad2 = temp;
    
      volumen1 = area1 * profundidad1;  //volumen de la piscina 1 con los datos cambiados
      volumen2 = area2 * profundidad2;  //volumen de la piscina 2 con los datos cambiados
  
      System.out.println("El nuevo volumen de la piscina 1 es: " + volumen1 + " m³"); //muestra de los nuevos resultados
      System.out.println("El nuevo volumen de la piscina 2 es: " + volumen2 + " m³");
    }
  }