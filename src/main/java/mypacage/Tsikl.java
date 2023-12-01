package mypacage;

import javax.lang.model.element.Element;

public class Tsikl {
    public static void main(String[] args) {
        System.out.println("Start program");
        for (int i=0; i<5; i++ ){
            System.out.println(i*10);
        }

        System.out.println("End program");

        for (int i=10; i>0; i-- ) {
            System.out.println(i);
        }

        int[] array = new int [10];
        for (int i =0; i<10; i++) {
            array[i] = i*2;
        }

        for (int i=0; i<10; i++) {
            System.out.println("Element with index " + i +" is " + array[i]);
        }
        System.out.println();
        for (int element: array) {
            System.out.println(element);
        }
        System.out.println();
        int i=0;
        boolean bool = true;
 //       while (i<10) {
        while (bool) {
            System.out.println("While: " +i);
            i++;
            if (i==5) bool = false;
        }

        i=0;
        do {
            System.out.println("Do: " + i);
            i++;
        }    while (i<5);

    }
}
