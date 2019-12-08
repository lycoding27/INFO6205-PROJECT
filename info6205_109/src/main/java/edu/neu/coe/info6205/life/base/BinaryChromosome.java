package edu.neu.coe.info6205.life.base;

import java.util.Arrays;

public class BinaryChromosome {
    int[] gx;
    int[] gy;


    public String getBinaryChromesome(){

        int length = Math.max(this.gx.length, this.gy.length);
        String[] str=new String[length];
        for(int i = 0; i<this.gy.length; i++){
            int x =this.gx[i];
            int y =this.gy[i];
            str[i]=x+" "+y;
        }
        return Arrays.toString(str).substring(1, Arrays.toString(str).length() - 1);
    }




    public BinaryChromosome(int[] x, int[] y){
        this.gx = x.clone();
        this.gy = y.clone();
    }

}
