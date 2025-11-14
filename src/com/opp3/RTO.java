package com.opp3;

public class RTO {
    void numberPlate()
    {
        System.out.println("White in color");
    }
}
class Army extends RTO
{
    void numberPlate()
    {
        System.out.println("Black in color");
    }
    public static void main(String[] args)
    {
        RTO a1 = new Army();
        a1.numberPlate();
    }
}
