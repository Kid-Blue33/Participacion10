package participacion10;
import java.util.*;
public class participacion10 {
public static void main(String[]args){ 
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
 int temp;
   for (int i = 1; i < average.length; i++) {
    for (int j = i; j > 0; j--) {
           temp = average[j];
           
        if (average[j] < average [j - 1]) {
      average[j] = average[j - 1];
      Pepsi[j - 1] =nombres[j] + "  " + Integer.toString(temp);
     }else{
      Pepsi[cantalum-1]=nombres[j] +"  "+ Integer.toString(temp);   
     }
     }
   }
System.out.println("El resultado es el siguiente ");

System.out.println("El promedio de "+Pepsi[cantalum-1]);
for (int i = 0; i < cantalum; i++) {
        if (i<cantalum-1){

               System.out.println("El promedio de "+Pepsi[i]);
        }
              
}
    }
}


