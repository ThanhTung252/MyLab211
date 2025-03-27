package week3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dang Thanh Tung
 */
// target  =4
//12345
public class BinarySearch {

    int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            //
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;

            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
