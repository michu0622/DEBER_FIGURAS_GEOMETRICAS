/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2_figura_geometrica;

public class TRIANGULO extends FIGURAS_GEOMETRICA {

    public TRIANGULO() {
    }
       public TRIANGULO(double altura,double base) {
              this.setAltura(altura);
              this.setBase(base);
    }
       public void AREATRIANGULO(){
       double area=(this.getAltura()* this.getBase())/2;
       System.out.println("LA ALTURA INGRESADA ES:"+this.getAltura()+"\nLA BASE INGRESADA ES:"+this.getBase()+"\n");
       System.out.println("EL AREA DEL RECTANGULO ES :"+area);
    }

       public void PERIMETROTRIANGULO(){
       double perimetro=3* this.getBase();
       System.out.println("EL PERIMETRO DEL RECTANGULO ES :"+perimetro);
    }
    
}

