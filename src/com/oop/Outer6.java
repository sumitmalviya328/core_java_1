package com.oop;

public class Outer6 {
    String name = "Jamse";
    class Inner1
    {
        String name = "Peret";
        void show()
        {
            System.out.println(Outer6.this.name);
        }
    }

    public static void main(String[] args)
    {
        
        new Outer6().new Inner1().show();
    }
}


