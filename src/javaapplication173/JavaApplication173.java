/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication173;

import java.util.Arrays;

/**
 *
 * @author L410-S01
 */
public class JavaApplication173 {

    /**
     * @param args the command line arguments
     */
    //public static void printRev(int[] a, )
    public static int[] printRevRec(int[] a, int c, int[]n_a) {
        
        if(c > -1) {
            System.out.println(a[c]);
            n_a[c] = a[c];
            System.out.print(n_a[c]);
            System.out.print(" = ");
            System.out.print(a[c]);
            System.out.println("");
            printRevRec(a,c-1,n_a);
            System.out.println(n_a[c]);
            
        }
        return n_a;
    }
    public static int[] printRev(int[] a) {
        int i2 = a.length - 1;
        for(int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = a[i2];
            a[i2] = temp;
        }
        
        
        
        return a;
    }
    
    
    public static boolean contains(int[] a, int check, int index) {
        if (index < a.length) {
            if (a[index] == check) {
                return true;
            } else {
                return contains(a, check, index + 1);
            }
        }
        return false;
    }
    
    public static int max(int[] a, int index) {
        if (index < (a.length)) {
            if (a[index+1] > a[index]) {
                return max(a,index + 1);
            } else {
                return max(a,index);
            }
        }
        return a[index];
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] temp = {100, 90, 0, 4, 89};
        int[] new_temp = new int[temp.length];
        //maximum(temp,temp.length-1);
        //System.out.println(maximum(temp,temp.length-1));
        
        System.out.println(Arrays.toString(printRevRec(temp,temp.length-1,new_temp)));
       // System.out.println(Arrays.toString(printRev(temp)));
    }

}
