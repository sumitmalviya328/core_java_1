package com.opp3;

public class Test2 {
    void show()
    {
        System.out.println("Method-1");
    }
    int  show(int a)
    {
        System.out.println("Method-2");
        return 100;
    }

    public static void main(String[] args)
    {
      Test2 t1 = new Test2();
      t1.show();
      t1.show(100);
    }
}
