package superkeyword;

class X {
    
    int a;
    int b;

    public X(int a) {
        this.a = a;
    } 

    public X(int a, int b) {
        this.a = a;
        this.b = b;
    }  
}

class Y extends X {

    int a;

    public Y() {
        super(0,0);  //Here we must call one of the constructor from the constructors defined inside the present class
        System.out.println("Y Class: 0 - Constructor...");
    }

    public Y(int a) {
        super(0); //Here we must call one of the constructor from the constructors defined inside the present class
        this.a = a;
        System.out.println("Y Class: 1 - Constructor : " + a);
    }

}

public class SuperKeyword {

    public static void main(String[] args) {
        // TODO code application logic here
        Y y1 = new Y();

        Y y2 = new Y(10);
    }
}
