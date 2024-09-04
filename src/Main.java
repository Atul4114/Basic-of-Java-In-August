public class Main {

    static class child extends Parent {

        @Override
        public void greet() {
            System.out.println("method in child");
        }
    }


    public static void main(String[] args) {

        System.out.println("Hello world!");
        child obj1 = new child();
        child1 obj4= new child1();
        obj4.base();
        obj4.greet();
        obj1.greet();
        obj1.base();
        Child2 obj2 =new Child2();
        obj2.greet();

    }
}