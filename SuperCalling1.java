package AssingmentsViVa;

class Mintra {
    void add() {
        System.out.println("Parent class");
    }
}

public class SuperCalling1 extends Mintra {
    SuperCalling1() {
        super(); // This calls the parent class (Mintra) constructor, even if it's not explicitly defined
        System.out.println("Child class");
    }
    
    public static void main(String[] args) {
        SuperCalling1 sc1 = new SuperCalling1();
        sc1.add();
    }
}