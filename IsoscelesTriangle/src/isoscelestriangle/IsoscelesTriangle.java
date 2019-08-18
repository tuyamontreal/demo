/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isoscelestriangle;

/**
 *
 * @author Yaya
 */
public class IsoscelesTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int row=5;
       for(int i=0;i<row;i++){
           for(int j=0;j<row-i;j++){
               System.out.print(" ");           
           }
           for(int j=0;j<i*2+1;j++){
               System.out.print("*");
           }
           System.out.println("");
               
    }
    }
    
}
