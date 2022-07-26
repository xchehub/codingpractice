    
class A{
    public static void printString() {
        System.out.println("In class A"); 
    }
}

class B extends A {
    public static void printString() {
        System.out.println("In class B");
        }
}

class C extends A {
    public static void printString() {
        System.out.println("In class C");
    }

    public void cPrintString() {
        System.out.println("My Print String");
        }
}

class myPro{
    public static void main(String[] args){
        A a = new B();
        System.out.print("Line L1: ");
        a.printString(); //Line L1
        
        B b = new B();
        System.out.print("Line L2: ");
        b.printString(); //Line L2

        System.out.print("Line L3: ");
        B b1 = (B) a; //Line L3

        System.out.print("Line L4: ");
        b1.printString(); //Line L4
        
        C c1 = new C();

        System.out.print("Line L5: ");
        c1.printString(); //Line L5

        System.out.print("Line L6: ");
        c1.cPrintString(); //Line L6
        A a1 = c1;

        System.out.print("Line L7: ");
        a1.printString(); //Line L7
    }
}