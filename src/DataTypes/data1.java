package DataTypes;

public class data1 {

    public static void main(String[] args) {
        boolean a=true;  //1-bit
        System.out.println(a);
        char b= 'a'; //2-byte character
        System.out.println(b);
        byte bt = 127; //1- byte  -128to127
        System.out.println(bt);
        short s = 7845; //2byte -32768 to 32767 short
        System.out.println(s);
        int h = 888888; //4-byte -2147483648 to 214783647 integer
        System.out.println(h);
        long g = 8888888800008L; //8-bytes long
        double n =8585855; //16-byte double

        float f= 10.5F; //4-byte include sufix F float

        double k=10000.5656;  //8-byte

        int bcg=1000; //valida identifier [A-Z] indetifier
        float NBA=15.2f; //valid identifier [a-z] indetifier
        int Ab7n= 2000; //valid alaphanumeric indetifier
        System.out.println(Ab7n);
      //  int 899v= 5666; //invalid indetifier not start with numebr

        int Z_67z$ =895;  // valid underscore dollar indetifier
        System.out.println(Z_67z$);

       // int b c =56; //space not allowed for identifier

        int p = 0xfa8;  // Hexadeciaml literal start with "0X" range 0 to F
        System.out.println(p);

        int v = 0b11; //binary lieral start with prefix 0b only 01
        System.out.println(v);

        String pl="Hello";  // string literals
        System.out.println(pl);





    }
}








