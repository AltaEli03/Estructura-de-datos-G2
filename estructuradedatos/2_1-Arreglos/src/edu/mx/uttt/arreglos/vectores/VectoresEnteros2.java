package edu.mx.uttt.arreglos.vectores;

public class VectoresEnteros2 {
    private int []v1;
    private int tamanio;
    public VectoresEnteros2(int tamanio){
        if (tamanio>0) {
            v1=new int [tamanio];
        }else{
            v1=new int [1];
        }
    }
    public int[] getV1() {
        return v1;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setV1(int[] v1) {
        if (v1.length==tamanio) {
            for(int i=1;i<v1.length;i++){
             this.v1[i]=v1[i];
            }
        }
    }
   public int vectorMaxMin(){
    int max = v1[0];
        int min = v1[0];
    for (int i = 1; i < tamanio; i++) {
        if (v1[i] > max) {
            max = v1[i];
        }
        if (v1[i] < min) {
            min = v1[i];
        }
    }
    return max ;
    
   }
}
