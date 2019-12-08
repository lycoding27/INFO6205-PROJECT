package edu.neu.coe.info6205.life.base;



import java.util.Arrays;


public class Transit {

    public String randomString(){
        int length = (int)( 10 * Math.random())+20;
        String[] s=new String[length];
        for(int i=0;i<length;i++){
            int x =(int)(Math.random()*40)-20;
            int y =(int)(Math.random()*40)-20;
            s[i]=x+" "+y;
        }
        return Arrays.toString(s).substring(1, Arrays.toString(s).length() - 1);
    }

    public static void main(String[] args) {
        Transit str=new Transit();
        System.out.println(str.randomString());
    }
}
