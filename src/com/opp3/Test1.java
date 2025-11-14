package com.opp3;

public class Test1 {
    void show()
    {
        System.out.println("Method-1");
    }
    void show(int a)
    {
        System.out.println("Method-2");
    }

    public static void main(String[] args)
    {
      Test1 t1 = new Test1();
      t1.show();
      t1.show(100);
    }
}
