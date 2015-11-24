/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2_figura_geometrica;

public class CONO extends FIGURAS_GEOMETRICA {

    public CONO() {
    }
    public CONO (double generatriz,double radio,double altura) {
              this.setGeneratriz(generatriz);
              this.setRadio(radio);
              this.setAltura(altura);
    }
       public void AREACONO(){
       double area=3.1416*this.getRadio()*(this.getRadio()+this.getGeneratriz());
       System.out.println("EL RADIO INGRESADO ES:"+this.getRadio()+"\nLA ALTURA INGRESADA ES:"+this.getAltura()+"\nLA GENERATRIZ INGRESADA ES:"+this.getGeneratriz()+"\n");
       System.out.println("EL AREA DEL CONO ES :"+area);
    }

       public void PERIMETROCONO(){
       double v=(3.1416*this.getRadio()*this.getAltura())/3;
       System.out.println("EL PERIMETRO DEL CONO ES :"+v);
    }
    
}
