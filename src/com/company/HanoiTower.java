package com.company;

public class HanoiTower {
    private Peg peg1;
    private Peg peg2;
    private Peg peg3;
    private int numDiscs;

    public HanoiTower(int num)
    {
        // TODO implement constructor
        numDiscs = num;
        peg1 = new Peg(1, num);
        peg2 = new Peg(2, num);
        peg3 = new Peg(3, num);

    }
    public void solveTower()
    {
        moveTower(peg1, peg3, peg2, numDiscs);
    }

    private void moveTower(Peg startPeg, Peg endPeg, Peg extraPeg, int numtoMove)
    {
        if (numtoMove == 1) {
            int y = startPeg.popDisc();
            endPeg.addDisc(y);
            System.out.println("Moving disc " + numtoMove + " from " + startPeg + " to " + endPeg);
            //System.out.println("Moving disc 1 from " + peg1 + " to " + peg3);
        }
        else {
            moveTower(startPeg, extraPeg, endPeg, numtoMove-1);
            System.out.println("Moving disc " + numtoMove + " from " + startPeg + " to " + endPeg);
            endPeg.addDisc(startPeg.popDisc());
            moveTower(extraPeg, endPeg, startPeg, numtoMove-1);
        }
        // TODO move discs(number input) from the start peg to the end peg

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //start with 2 for num, then 3, then work up to 5
        HanoiTower ht = new HanoiTower(5);
        ht.solveTower();
    }

}
/*
output for num=2:
Moving disc 1 from Peg 1 to Peg 2
Moving disc 2 from Peg 1 to Peg 3
Moving disc 1 from Peg 2 to Peg 3

num=3:
Moving disc 1 from Peg 1 to Peg 3
Moving disc 2 from Peg 1 to Peg 2
Moving disc 1 from Peg 3 to Peg 2
Moving disc 3 from Peg 1 to Peg 3
Moving disc 1 from Peg 2 to Peg 1
Moving disc 2 from Peg 2 to Peg 3
Moving disc 1 from Peg 1 to Peg 3

num=4:
Moving disc 1 from Peg 1 to Peg 2
Moving disc 2 from Peg 1 to Peg 3
Moving disc 1 from Peg 2 to Peg 3
Moving disc 3 from Peg 1 to Peg 2
Moving disc 1 from Peg 3 to Peg 1
Moving disc 2 from Peg 3 to Peg 2
Moving disc 1 from Peg 1 to Peg 2
Moving disc 4 from Peg 1 to Peg 3
Moving disc 1 from Peg 2 to Peg 3
Moving disc 2 from Peg 2 to Peg 1
Moving disc 1 from Peg 3 to Peg 1
Moving disc 3 from Peg 2 to Peg 3
Moving disc 1 from Peg 1 to Peg 2
Moving disc 2 from Peg 1 to Peg 3
Moving disc 1 from Peg 2 to Peg 3

num=5:
Moving disc 1 from Peg 1 to Peg 3
Moving disc 2 from Peg 1 to Peg 2
Moving disc 1 from Peg 3 to Peg 2
Moving disc 3 from Peg 1 to Peg 3
Moving disc 1 from Peg 2 to Peg 1
Moving disc 2 from Peg 2 to Peg 3
Moving disc 1 from Peg 1 to Peg 3
Moving disc 4 from Peg 1 to Peg 2
Moving disc 1 from Peg 3 to Peg 2
Moving disc 2 from Peg 3 to Peg 1
Moving disc 1 from Peg 2 to Peg 1
Moving disc 3 from Peg 3 to Peg 2
Moving disc 1 from Peg 1 to Peg 3
Moving disc 2 from Peg 1 to Peg 2
Moving disc 1 from Peg 3 to Peg 2
Moving disc 5 from Peg 1 to Peg 3
Moving disc 1 from Peg 2 to Peg 1
Moving disc 2 from Peg 2 to Peg 3
Moving disc 1 from Peg 1 to Peg 3
Moving disc 3 from Peg 2 to Peg 1
Moving disc 1 from Peg 3 to Peg 2
Moving disc 2 from Peg 3 to Peg 1
Moving disc 1 from Peg 2 to Peg 1
Moving disc 4 from Peg 2 to Peg 3
Moving disc 1 from Peg 1 to Peg 3
Moving disc 2 from Peg 1 to Peg 2
Moving disc 1 from Peg 3 to Peg 2
Moving disc 3 from Peg 1 to Peg 3
Moving disc 1 from Peg 2 to Peg 1
Moving disc 2 from Peg 2 to Peg 3
Moving disc 1 from Peg 1 to Peg 3
 */