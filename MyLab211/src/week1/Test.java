package week1;

import java.util.Map;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //        System.out.println("Enter number of array:");
        //        Scanner sc = new Scanner(System.in);
        //
        //        int size = sc.nextInt();
        //        LinearSearch ls = new LinearSearch(size);
        //
        //        ls.addValue(size);
        //        System.out.println("Enter search value:");
        //        int value = sc.nextInt();
        //        int result = ls.searchValue(value);
        //        System.out.println("The value");
        //        ls.showArray();
        //        System.out.println("Found " + value + " at index: " + result);

        // Tạo đối tượng Scanner để nhận chuỗi từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập chuỗi
        System.out.println("Enter your content:");
        String input = scanner.nextLine(); // Nhận chuỗi từ người dùng

        // Tạo đối tượng của class WordAndCharacterCounter
        CountWC counter = new CountWC(input);

        // Gọi hàm đếm từ và ký tự
        Map<String, Integer> wordCount = counter.countWords();
        Map<Character, Integer> charCount = counter.countCharacter();

        // In kết quả đếm từ
        System.out.print("{");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue());
        }
        System.out.print("}");

        // In kết quả đếm ký tự
        System.out.print("\n{");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue());
        }
        System.out.print("}");

        // Đóng đối tượng Scanner
        scanner.close();

    }

}
