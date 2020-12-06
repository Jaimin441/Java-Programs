abstract class Test {
  abstract void callme();
  void callmetoo() {
    System.out.println("This is a concrete method.");
  }
}
class Test2 extends Test {
   void callme() {
       System.out.println("B's implementation of callme.");
   }
}
class AbstractDemo {
    public static void main(String args[]) {
       Test2 b = new Test2();
       b.callme();
       b.callmetoo();
    }
}
