package edu.mx.uttt.arreglos.matrices;

public class MatrizEntera {
 //Variables de Intancia
 private int [][] ma;
 private int tamanio;
//Constructor no tiene valor de retorno 
// y se debe llamar igual que la clase 
 public MatrizEntera (int tamanio){
    if(tamanio>2){
        this.tamanio = tamanio;
        ma = new int[tamanio][this.tamanio];
    }else{
        this.tamanio = 2;
        ma = new int[tamanio][this.tamanio];
    }
 }
public int[][] getMa() {
    return ma;
}
public void setMa(int[][] ma) {
    if(ma.length==this.tamanio && ma[0].length==this.ma[0].length){
       for(int j =0;j<this.ma.length;j++){
        for (int i = 0; i < this.ma.length; i++) {
            this.ma[i][j] = ma[i][j];
        }
       }
    }
    this.ma = ma;
}
public int getTamanio() {
    return tamanio;
}
 
}
