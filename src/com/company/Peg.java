package com.company;

import java.util.Arrays;

public class Peg {
    private int pegNum;
    private int numDiscs;
    private int[] discs;
    private int count;    //the number of discs currently on the peg.

    public Peg(int p, int num)
    {
        pegNum = p;
        numDiscs = num;
        discs = new int[num];
        count = 0;
    }

    public int getPegNum()
    {
        return pegNum;
    }
    public int getNumDiscs()
    {
        return numDiscs;
    }

    public String toString()
    {
        String s = "Peg " + pegNum;
        return s;
    }

    public boolean addDisc(int whichOne)
    {
        if (count == 0 || whichOne < discs[count-1]) {
            discs[count++] = whichOne;
            return true;
        }


        return false;

        // TODO add the disc with the given number to the peg.
        // don't forget to make sure the move is valid (no disc on top of a smaller one)
    }

    public int popDisc()
    {
        if (count == 0) {
            return 0;
        }
        else {
            count -= 1;
            int x = discs[count];
            discs[count] = 0;
            return x;

        }

        // TODO remove the top disc from the peg.  Return its value.

    }
    public boolean moveTopDisc(Peg newPeg)
    {
        int disc = popDisc();
        if (newPeg.addDisc(disc))
        {
            System.out.println("Moving disc " + disc + " from peg " + pegNum + " to peg " + newPeg.getPegNum());
            return true;
        }
        else{
            System.out.println("Bad Move");
            return false;
        }
    }
    public static void main(String [] arg) {
        Peg p1 = new Peg(1,5);
        boolean retVal;
        retVal = p1.addDisc(3);
        System.out.println(Arrays.toString(p1.discs) + " retVal: " + retVal);
        retVal = p1.addDisc(2);
        System.out.println(Arrays.toString(p1.discs) + " retVal: " + retVal);
        retVal = p1.addDisc(4);
        System.out.println(Arrays.toString(p1.discs) + " retVal: " + retVal);
        int discNum = p1.popDisc();
        System.out.println(Arrays.toString(p1.discs) + " discNum: " + discNum);

        //tried some additional output validation
    }


}
/*
[3, 0, 0, 0, 0] retVal: true
[3, 2, 0, 0, 0] retVal: true
[3, 2, 0, 0, 0] retVal: false
[3, 0, 0, 0, 0] discNum: 2
 */