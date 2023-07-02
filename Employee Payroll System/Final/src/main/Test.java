
package main;

class A
{
    int var = 10;
    public void test()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
   int var = 20;
    public void test()
    {
        System.out.println("Class B");
    } 
    public static void main(String args[])
    {
        A object = new B ();
        object.test();
        System.out.println("object.var");
    }
}