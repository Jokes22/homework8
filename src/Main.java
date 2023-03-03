import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int [] number = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.println(number[i]);
        }
        double [] drop = {1.57, 7.654, 9.986};
        for (int a = 0; a < 3; a++) {
            System.out.println(drop[a]);
        }
        int [] tap = {21, 43};
        for (int i = 0; i < 2; i++) {
            System.out.println(tap[i]);
        }
    }


    public static void task2 () {
        System.out.println("Задача 2");
        int [] number = {1, 2, 3};
        {
            System.out.println(Arrays.toString(number));}

        double [] drop = {1.57, 7.654, 9.986};
        {
            System.out.println(Arrays.toString(drop));


        }


        int [] tap = {21, 43};
        { System.out.println(Arrays.toString(tap));

        }
    }




    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        int [] number = {3, 2, 1};
        {
            System.out.println(Arrays.toString(number));}

        double [] drop = {9.986, 7.654, 1.57};
        {
            System.out.println(Arrays.toString(drop));


        }


        int [] tap = {43, 21};
        { System.out.println(Arrays.toString(tap));

        }
    }



    public static void task4 () {
        System.out.println("Задача 4");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        int i;
        for (i = 0; i < 3; i++) {
           if (number[i]% 2 != 0){
               number[i] +=1;
           }
        }
        System.out.println(Arrays.toString(number));





        double[] drop = new double[3];
        drop[0] = 1.57;
        drop[1] = 7.654;
        drop[2] = 9.986;
        int a;
        for (a = 0; a < drop.length; a++) {
            if (drop[a] % 2 != 0) {
                drop[a] += 1;

            }}
            System.out.println(Arrays.toString(drop));



        int[] tap = {21, 43};
        int s;
        for (s = 0; s < tap.length; s++) {
            if (tap[s] % 2 != 0) {
                tap[s] += 1;

            }
        }
        System.out.println(Arrays.toString(tap));

}}