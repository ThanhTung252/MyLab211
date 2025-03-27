package week3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dang Thanh Tung
 */
// Class for Bubble Sort
public class BubbleSort {

    private int array[];

    public BubbleSort() {
        this.array = array;
    }

    public void generateRandomArray(int size) {
        array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length); 
        }
    }

    void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    void sort(){
        int n = array.length;
        for(int i = 0; i< n -1; i++){
            for(int y = 0; y< n- 1- i; y++){
                if(array[y] > array[y+1]){
                    int temp = array[y];
                    array[y] = array[y+1];
                    array[y+1] = temp;
                }
            }
        }
    }
}
