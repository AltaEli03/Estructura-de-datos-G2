package edu.mx.uttt.arreglos.vectores;

public class VectoresEnteros {
    private int []v1;
    private int []v2;
    private int tamanio;
    public VectoresEnteros(int tamanio){
        if (tamanio>0) {
            v1=new int [tamanio];
        }else{
            v1=new int [1];
            v2=new int [1];
        }
    }
    public int[] getV1() {
        return v1;
    }
    public int[] getV2() {
        return v2;
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
    public void setV2(int[] v2) {
        if (v2.length==tamanio) {
            for(int i=1;i<v2.length;i++){
             this.v2[i]=v2[i];
            }
        }
    }
    public int [] suma(){
        int []suma = new int[tamanio];
        for(int i = 0;i<tamanio;i++){
         suma[i] =(v1[i]+v2[i]);        
     }
     return suma;
    }
     public int Escalar(){
      int productoEscalar =0;
      for(int i=0; i<tamanio;i++){
      productoEscalar += v1[i] * v2[i];
      }
      return productoEscalar;
     }

     public int [] invertido(){
        int []invertido = new int [tamanio];
        for (int i= 0;i<tamanio;i++){
      invertido[i]=( v1[tamanio -1 -i]);
        }
        return invertido;
     }
     
     public int []Multiplicar(){
        int [] multi = new int[tamanio];
     for(int i =0; i<tamanio;i++){
        multi[i] = v1[i] *Escalar();
     }
     return multi;
     }
     //Solucion profe
     public int [] invertirVector(){
        int j =0;
        int [] vectorInverso = new int[tamanio];
        for (int i = this.tamanio-1;i>=0;i++){
         vectorInverso[j]=this.v1[i];
         j++;
        }
        return vectorInverso;
     }
}
