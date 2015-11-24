/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2_figura_geometrica;

public class DEBERFIGURAS {

    public static void main(String[] args) {
       System.out.println("****************************************************************");
       System.out.println("                   RECTANGULO");
       RECTANGULO AREA1 =new RECTANGULO (2,4);
       AREA1.AREARECTANGULO();
       AREA1.PERIMETRORECTANGULO();
       System.out.println("****************************************************************");
       System.out.println("                   CUADRADO");
       CUADRADO AREA2 = new CUADRADO(4);
       AREA2.AREACUADRADO();
       AREA2.PERIMETROCUADRADO();
       System.out.println("****************************************************************");
       System.out.println("                   TRIANGULO");
       TRIANGULO AREA3 =new TRIANGULO(2,4);
       AREA3.AREATRIANGULO();
       AREA3.PERIMETROTRIANGULO();
       System.out.println("****************************************************************");
       System.out.println("                   CIRCULO");
       CIRCULO AREA4 = new CIRCULO(5);
       AREA4.AREACIRCULO();
       AREA4.PERIMETROCIRCULO();
       System.out.println("****************************************************************");
       System.out.println("                   CONO");
       CONO AREA5 = new CONO(5,6,7);
       AREA5.AREACONO();
       AREA5.PERIMETROCONO();
       
       
       
       }
    
}
