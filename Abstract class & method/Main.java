
// --------- CLASS: ANIMAL ------------------
// Abstract class with abstract method
abstract class Animal {
    public void canRun() {
        System.out.println("Animal can run");
    }

    // Abstract method - has no definition
    public abstract void canFly();

    public abstract void canSwin();
}

// --------- CLASS: LION --------------------
// Abstract class with abstract method
// So Lion has total 3 methods in it to call
class Lion extends Animal {
    public void canFly() {
        System.out.println("Lion cannot fly");
    }

    public void canSwin() {
        System.out.println("Lion can swim");
    }
}

// --------- CLASS: MAIN --------------------
// Abstract class with abstract method
// So Lion has total 3 methods in it to call
class Main {
    public static void main(String args[]) {
        Lion obj = new Lion();
        obj.canFly();
        obj.canRun();
        obj.canSwin();
    }

}