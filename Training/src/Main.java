import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*System.out.println("Мне плохо!");
        int one = GetMinTwo(123, 8);
        System.out.println(one);
        int two = GetMinTwo(144, 178);
        System.out.println(two);
        System.out.println(GetMinTwo(one,two));*/

       /* Try3( " Take it, boy!"); */

        /*My_birthday("December", 28, 2002); */

        /*
        Zerg Anton = new Zerg();
        Zerg Vasya = new Zerg();
        Zerg Shlepa = new Zerg();
        Zerg Boy = new Zerg(); */

        //MultiplyOneToTen();

        //SumTenNumberLineBeLine();


    }

    //DAY 1
    public static int GetMinTwo(int a, int b){
        if (a < b)
            return a;
        else
            return b;
    }

    public static void Try3(String application){
        System.out.print(application);
        System.out.print(application);
        System.out.print(application);
    }

    //DAY 2
    public static void My_birthday(String month, int day, int year){
        System.out.println("Your birthday is " + month + " " + day + " " + year);
    }

    public static void MultiplyOneToTen(){
        int result = 1*2*3*4*5*6*7*8*9*10;
        System.out.println(result);
    }

    public static void SumTenNumberLineBeLine(){
        System.out.println(1);
        System.out.println(1+2);
        System.out.println(1+2+3);
        System.out.println(1+2+3+4);
        System.out.println(1+2+3+4+5);
        System.out.println(1+2+3+4+5+6);
        System.out.println(1+2+3+4+5+6+7);
        System.out.println(1+2+3+4+5+6+7+8);
        System.out.println(1+2+3+4+5+6+7+8+9);
        System.out.println(1+2+3+4+5+6+7+8+9+10);
    }
}


