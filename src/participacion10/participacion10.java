package participacion10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MacbookAir
 */
public class Rubentest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner name=new Scanner(System.in);
    int calificacion[]=new int [6];  
    int cantalum, suma=0;
    float promedio;
    System.out.println("ingrese la cantidad de alumnos");        
    cantalum=name.nextInt();
    String Pepsi []=new String[cantalum];
    String nombres []=new String [cantalum];
    int average[]=new int [cantalum];
    for (int i = 0; i < cantalum; i++) {
    System.out.println("ingrese el nombre del alumno");
    nombres[i]=name.next();

    System.out.println("Ingrese calificacion de Matematicas Discretas");
    calificacion[0]=name.nextInt();
    System.out.println("Ingrese calificacion de Taller de Etica");
    calificacion[1]=name.nextInt();
    System.out.println("Ingrese calificacion de Calculo Diferencial");
    calificacion[2]=name.nextInt();
    System.out.println("Ingrese calificacion de Fundamentos de Programacion");
    calificacion[3]=name.nextInt();
    System.out.println("Ingrese calificacion de Fundamentos de Investigacion");
    calificacion[4]=name.nextInt();
    System.out.println("Ingrese calificacion de Taller de Administracion");
    calificacion[5]=name.nextInt();
    
    
     for (int j = 0; j <calificacion.length; j++) {
            suma+=calificacion[j];
        }
    promedio=(suma/calificacion.length); 
    average[i]=(int) promedio;
    suma=0;
    }
    
    // array problem
     int temp;
     Map<String, Integer> mapvalues = new HashMap<String, Integer>();

     
     
    for (int i = 0; i < average.length; i++) {
     mapvalues.put(nombres[i], average[i]);
    }
    

    Object[] a = mapvalues.entrySet().toArray();
    Arrays.sort(a, new Comparator() {
        public int compare(Object o1, Object o2) {
            return ((Map.Entry<String, Integer>) o2).getValue()
                       .compareTo(((Map.Entry<String, Integer>) o1).getValue());
        }
    });
    for (Object e : a) {
        System.out.println("Alumno: " + ((Map.Entry<String, Integer>) e).getKey() + " : "
                + ((Map.Entry<String, Integer>) e).getValue());
    }
    // array problem
        
    }
    
}

