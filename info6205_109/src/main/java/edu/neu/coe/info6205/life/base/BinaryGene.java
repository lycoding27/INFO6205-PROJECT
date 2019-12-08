package edu.neu.coe.info6205.life.base;

public class BinaryGene {
    private int[] gene;

    public BinaryGene(int[] gene){
        this.gene = gene;
    }

    public BinaryGene(){}

    public int[] getGene(){
        return this.gene;
    }

    public int[] evolution(int[] g) {

        int i = (int) Math.random() * (g.length);


        if (g[i] < 0) {
            g[i] += ((int) Math.random() * 20 + 1);
        } else if (g[i] > 0) {
            g[i] -= ((int) Math.random() * 20 + 1);
        }

        double mutatePossibility = 0.05+Math.random()*0.03;
        if (Math.random() < mutatePossibility) {
            g = mutation(g);
        }

        return g;
    }


    public int[] getFirstRandomGene() {

        int genelength = 20;
        int[] genes = new int[genelength];
        for (int i = 0; i < genes.length; i++) {
            int g = (int) (Math.random() * 40) - 20;
            genes[i] = g;
        }
        return genes;
    }
    //a chromosome is combined by two genes
    public int[] mutation(int[] g) {
        int i = (int) Math.random() * (g.length);
        g[i] += (int) (Math.random() * 40) - 20;
        return g;
    }
}
