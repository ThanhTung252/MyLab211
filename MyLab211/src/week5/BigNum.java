///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package week5;
//
///**
// *
// * @author Dang Thanh Tung
// */
//public class Number {
//
//    private String value;
//
//    public String getValue() {
//        return value;
//    }
//
//    public Number(String value) {
//        this.value = value;
//    }
//
//    public Number addTwoNumb(Number other) {
//        return new Number(addLargeNumber(this.value, other.value));
//    }
//
//    private String addLargeNumber(String so1, String so2) {
//        int max = Math.max(so1.length(), so2.length());
//        so1 = String.format("%" + max + "s", so1).replace(' ', '0');
//        so2 = String.format("%" + max + "s", so2).replace(' ', '0');
//        StringBuilder result = new StringBuilder();
//        // gia su 2 so co do dai bang nhau
//        int sodu = 0;
//        for (int i = so1.length() - 1; i >= 0; i--) {
//            int s1 = so1.charAt(i) - '0';
//            int s2 = so2.charAt(i) - '0';
//            int sum = s1 + s2 + sodu;
//            result.append(sum % 10);
//            sodu = sum / 10;
//        }
//        if (sodu > 0) {
//            result.append(sodu);
//        }
//        return result.reverse().toString();
//    }
//
//    public static String multiplyLargeNumbers(String num1, String num2) {
//        int len1 = num1.length();
//        int len2 = num2.length();
//        int[] result = new int[len1 + len2];
//
//        // Nhân từng chữ số của num1 với từng chữ số của num2
//        for (int i = len1 - 1; i >= 0; i--) {
//            for (int j = len2 - 1; j >= 0; j--) {
//                int digit1 = num1.charAt(i) - '0';
//                int digit2 = num2.charAt(j) - '0';
//                int product = digit1 * digit2 + result[i + j + 1];
//
//                result[i + j + 1] = product % 10; // Lưu phần dư
//                result[i + j] += product / 10;   // Thêm phần nhớ vào vị trí trước đó
//            }
//        }
//
//        // Chuyển mảng kết quả thành chuỗi
//        StringBuilder sb = new StringBuilder();
//        for (int num : result) {
//            if (!(sb.length() == 0 && num == 0)) { // Bỏ qua các số 0 ở đầu
//                sb.append(num);
//            }
//        }
//
//        return sb.length() == 0 ? "0" : sb.toString();
//    }
//
//}
package week5;

public class BigNum {

    static String plus(String str1, String str2) {
        String result = "";
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = str1;
        }
        while (str1.length() != str2.length()) {
            str2 = "0" + str2;
        }
        int temp = 0;
        for (int i = str1.length() - 1; i >= 0; i--) {
            int num1 = str1.charAt(i) - '0', num2 = str2.charAt(i) - '0';
            int res = temp + num1 + num2;
            temp = res / 10;
            res %= 10;
            result += (char) (res + '0') + result;
        }
        if (temp > 0) {
            result += (char) (temp + '0') + result;
        }
        return result;
    }

    static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    static String multiplication(String str1, String str2) {
        String result = "";
        int n = str1.length() - 1, m = str2.length() - 1;
        int carry = 0;
        for (int i = 0; i <= m + n || carry != 0; i++) {
            for (int j = max(0, i - m); j <= min(i, n); j++) {
                carry += (str1.charAt(n - j) - '0') * (str2.charAt(m - i + j) - '0');
            }

            result = (char) (carry % 10 + '0') + result;
            carry /= 10;
        }
        return result;
    }
}
