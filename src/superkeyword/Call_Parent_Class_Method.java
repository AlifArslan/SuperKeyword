
package superkeyword;
class A
{
    float pie = 2.14f;
    void m1()
    {
        System.out.println("Parent class m1 Method...");
        System.out.println("Pie Value is  : "+pie);
    }
}
class B extends A
{
    void m1()
    {
        System.out.println("Child class m1 Method...");
        super.m1(); //It is not necessary to make super is the first statement inside the methods ...unlike constructors
    }
}
public class Call_Parent_Class_Method {
      public static void main(String[] args) {
        // TODO code application logic here
        
        B b = new B();
        b.m1();
    } 
}

