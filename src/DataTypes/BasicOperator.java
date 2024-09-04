package DataTypes;

public class BasicOperator {
    public static void main(String[] args) {

        //Postfix Unarary operator ++, --
        //Rule 1 -postfix incremental ++ increase value by 1
        // Rule 2 - apply only variables only
        // Rule 3 - not apply for number
        int a =10; // intital values
        int b =a++; //first assign the value and then increment so b=10 and now a =11 left to right
        int c =b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int d=20;
        int e=d--;
        int f= e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //Prefix Unaranry operator
        int g=10;
        int h=++g;
        int i= h;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        
    }
}
