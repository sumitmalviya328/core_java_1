package com.oop2;

//public final class Test7 {
    public  class Emp {
    int a = 10000;
}
class Account extends Emp
{
    int a = 4000;

    public static void main(String[] args)
    {
        Account t1 = new Account();

        System.out.println(t1.a);
    }
}
class Hr extends Emp
{

    int a = 5000;
    public static void main(String[] args)
    {
        Hr t1 = new Hr();

        System.out.println(t1.a);
    }
}
