package edu.mx.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class TestVectores {
public static void main(String[] args) {
    
//     //Declaracion Vectores
//     int tam = 4;

//     int [] x = new int[3];
//     System.out.println(x[1]);

//     double y[] = new double[tam];
//     System.out.println(y[3]);


//     boolean z1 [];
//     z1 =new boolean[4];
//     System.out.println(z1[3]);

//     char x1 [],x2[],x3[];
//     x1= new char[tam];
//     tam =8 ;
//     x2 = new char[tam];
//     System.out.println(x2[3]);

//     String zz[] = {"Luis", "William","Ezequiel","Arcadia"};
// try{
//     System.out.println(zz[4]);
// }catch(ArrayIndexOutOfBoundsException ex){
// System.out.println("Error:"+ ex.getMessage());
// }

// zz[1]= "Bart";
// System.out.println(zz[1]);
int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce le tamaño del arreglo"));
    double estaturas []=  new double[tam];
    llenarArreglo(estaturas);
    imprimir(estaturas);

}
public static void  imprimir(double arr[]){
 for(int i =0; i<arr.length;i++){
  System.out.print(arr[i]+" -> ");
 }
}
public static void  llenarArreglo(double arr[]){
    int i =0;
    while (i<=arr.length) {
        arr[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del arreglo ["+(i+1)+"]"));
        i++;
    }
}
public static double sumarValores(double arr[]){
double suma = 0.0;
   for(int i = 1;i<arr.length;i++){
    suma +=suma;
    System.out.println(suma);
   }
    return suma;
}
// public static double calcularMedia(){

// }
// public static double obtenerValoMaximo(){

// }
}
