/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2_figura_geometrica;

public class RECTANGULO extends FIGURAS_GEOMETRICA{
     
    public RECTANGULO() {
        
 
    }
        public RECTANGULO(double altura,double base) {
              this.setAltura(altura);
              this.setBase(base);
    }
       public void AREARECTANGULO(){
       double area=this.getAltura()* this.getBase();
       System.out.println("LA ALTURA INGRESADA ES:"+this.getAltura()+"\nLA BASE INGRESADA ES:"+this.getBase()+"\n");
       System.out.println("EL AREA DEL RECTANGULO ES :"+area);
    }

       public void PERIMETRORECTANGULO(){
       double perimetro=2*(this.getBase()+this.getAltura());
       System.out.println("EL AREA DEL RECTANGULO ES :"+perimetro);
    }
 

    
}
