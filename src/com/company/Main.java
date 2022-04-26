package com.company;

//      1ден 300го чейинки сандардын арасында 3ко, 4ко жана 5ке
//      (баарына) калдыксыз
//      болунгон сандардын суммасын табыныз.

public class Main {
    public static void main(String[] args) {

        for (int i =1; i < 300; i++) {
            if (i/3 && i/4 && i/5)
            System.out.println();
        }

        int [] array =new int[]{1,3,5};
        int counter = 0;
        for (int a : array) {
            counter += a;
        }
        System.out.println("Среднее арифметическое " + counter / array.length);
    }
}









//        String m="NuRbekov";
//
//        System.out.println(m.toLowerCase(Locale.ROOT));
//        System.out.println(a.toUpperCase(Locale.ROOT));
//       }
//    }











//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
