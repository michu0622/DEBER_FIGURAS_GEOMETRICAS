/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2_figura_geometrica;


 public class CIRCULO extends FIGURAS_GEOMETRICA{

    public CIRCULO() {
    }
     public CIRCULO (double radio) {
              this.setRadio(radio);
    }
       public void AREACIRCULO(){
       double area=this.getRadio()*3.1416;
       System.out.println("EL RADIO INGRESADO ES:"+this.getRadio()+"\n");
       System.out.println("EL AREA DEL CIRCULO ES :"+area);
    }

       public void PERIMETROCIRCULO(){
       double longitud=2*(3.1416*this.getRadio());
       System.out.println("LA LONGITUD DEL CIRCULO ES :"+longitud);
    }
    
    
    
}
