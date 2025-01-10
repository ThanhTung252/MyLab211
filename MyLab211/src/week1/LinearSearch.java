package week1;

import java.util.Random;

public class LinearSearch {

    private int[] array;
    

    public LinearSearch(int n) {
        this.array = new int[n];
    }

    void addValue(int x) {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(array.length);
        }

    }

    void showArray() {
        for(int n: array){
            System.out.print(n +" ");
        }
        System.out.println();
    }

    int searchValue(int number) {
        for (int i = 0; i < array.length; i++) {
            if (number == i) {

                return i;
            }

        }

        return -1;
    }

}
