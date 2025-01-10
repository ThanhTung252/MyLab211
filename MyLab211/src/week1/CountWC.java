/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dang Thanh Tung
 */
public class CountWC {

    private String input;

    public CountWC(String input) {
        this.input = input;
    }

    Map<String, Integer> countWords() {
        Map<String, Integer> wordcount = new HashMap<>();
        String[] words = input.toLowerCase().split("\\s");
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            wordcount.put(word, wordcount.getOrDefault(words, 0) + 1);
        }
        return wordcount;

    }

    Map<Character, Integer> countCharacter() {
        Map<Character, Integer> charcount = new HashMap<>();
        char[] charac = input.toLowerCase().toCharArray();
        for (char c : charac) {
            charcount.put(c, charcount.getOrDefault(c, 0) + 1);
        }

        return charcount;
    }
}
//
//   Hàm countWords:
//Chuyển chuỗi về chữ thường (toLowerCase()).
//Dùng split("\\W+") để tách từ dựa trên các ký tự không phải chữ cái hoặc số.
//Dùng HashMap để lưu số lần xuất hiện của từng từ.
//Hàm countCharacters:
//Chuyển chuỗi về chữ thường.
//Dùng vòng lặp để duyệt qua từng ký tự và chỉ đếm chữ cái hoặc số (Character.isLetterOrDigit()).
//Dùng HashMap để lưu số lần xuất hiện của từng ký tự.