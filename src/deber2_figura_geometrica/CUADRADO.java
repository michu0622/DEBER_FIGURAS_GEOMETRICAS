/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2_figura_geometrica;

public class CUADRADO extends FIGURAS_GEOMETRICA{

    public CUADRADO() {
    }
    
     public CUADRADO(double lado) {
          this.setLado(lado);
    }
     
       public void AREACUADRADO(){
       double area=this.getLado()*this.getLado();
       System.out.println("EL LADO INGRESADO ES:"+this.getLado()+"\n");
       System.out.println("EL AREA DEL CUADRADO ES :"+area);
    }

       public void PERIMETROCUADRADO(){
       double perimetro=4*this.getLado();
       System.out.println("EL PERIMETRO DEL CUADRADO ES :"+perimetro);
    }
 
}
