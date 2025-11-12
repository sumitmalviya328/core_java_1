package com.oop;

public class Outer5 {
    String name = "Jamse";
    class Inner1
    {
        String name = "Peret";
        void show()
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args)
    {
        
        new Outer5().new Inner1().show();
    }
}


