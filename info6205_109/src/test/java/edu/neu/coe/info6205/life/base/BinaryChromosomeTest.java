package edu.neu.coe.info6205.life.base;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryChromosomeTest {

    @Test
    public void testGetChromosome(){
        int[] x={1,1,2,2};
        int[] y={1,2,2,1};
        BinaryChromosome binaryChromosome = new BinaryChromosome(x,y);
        assertEquals("1 1, 1 2, 2 2, 2 1", binaryChromosome.getBinaryChromesome());
    }
}
