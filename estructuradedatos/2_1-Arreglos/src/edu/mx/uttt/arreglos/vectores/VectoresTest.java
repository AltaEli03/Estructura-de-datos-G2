package edu.mx.uttt.arreglos.vectores;

public class VectoresTest {
    public static void main(String[] args) {
        //Crea un opjeto de la clase vectores enteros
        VectoresEnteros ve = new VectoresEnteros(3);
        int[] v1 = {3,5,10};
        ve.setV1(v1);
        VectoresEnteros2 ve2 = new VectoresEnteros2(3);
        int [] v2 = {4,5,6};
        ve2.setV1(v1);
        

         String resultado ="";
         resultado ="Vector Original:"+vectorFormating(ve.getV1())+
         "\nVector Inverso: "+ vectorFormating(ve.invertirVector());
         System.out.println(resultado);
       
    }


    public static String vectorFormating (int []v1){
        String formato = "";
        for(int i = 0; i<v1.length;i++){
            if(i==v1.length-1){
                formato+=v1[i];
            }else{
                formato+=v1[i]+",";
            }
        }
        formato+="]";
        return formato;
    }

}
