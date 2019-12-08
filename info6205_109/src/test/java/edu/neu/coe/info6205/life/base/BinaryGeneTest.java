package edu.neu.coe.info6205.life.base;
import org.junit.Test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinaryGeneTest {

    @Test
    public void testGene(){
        int[] x={1,1,2,2};
        BinaryGene binaryGene =new BinaryGene(x);
        assertEquals(x[0], binaryGene.getGene()[0]);
        assertEquals(x[1], binaryGene.getGene()[1]);
        assertEquals(x[2], binaryGene.getGene()[2]);
        assertEquals(x[3], binaryGene.getGene()[3]);
    }

    @Test
    public void testEvolution(){
        int[] x={1,1,2,2};
        BinaryGene binaryGene =new BinaryGene(x);
        boolean flag = false;
        int[] after = new int[binaryGene.getGene().length];
        for(int a = 0; a< binaryGene.getGene().length; a++){
            after[a]= binaryGene.getGene()[a];
        }
        after= binaryGene.evolution(after);
        for(int i = 0; i< binaryGene.getGene().length; i++){
            if(after[i]!=x[i]){
                flag=true;
                break;
            }
        }
        for(int j: binaryGene.getGene()){System.out.print(j);}

        System.out.println("");
        for(int k:after){System.out.print(k);}

        assertTrue(flag);

    }
}
