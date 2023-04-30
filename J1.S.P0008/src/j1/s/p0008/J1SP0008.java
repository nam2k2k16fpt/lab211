/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0008;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class J1SP0008 {

    private Map<Character, Integer> charCounter
            = new HashMap<Character, Integer>();

    private Map<String, Integer> wordCounter
            = new HashMap<String, Integer>();

    public static void main(String[] args) {
//        J1SP0008 js = new J1SP0008();
//        js.Countletter("nam quốc sơn hà nam đế cư");
//        js.PrintLetterMap();
//        js.Countcharacter("nam quốc sơn hà nam đế cư");
//        js.PrintCharacterMap();
           
           ManageCounter  strcount = new ManageCounter();
           //User enter to string
           Infor infor = new Infor(strcount.InputString());
           
          //count letter
          strcount.Countletter(infor);
          strcount.DisplayWordMap(infor);
          //count character
          strcount.Countcharacter(infor);
          strcount.DisplayCharacterMap(infor);
    }

    public void Countletter(String str) {
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (wordCounter.containsKey(token)) {
                wordCounter.put(token, wordCounter.get(token) + 1);  //Trả về giá trị của key được chỉ định.
            } else {
                wordCounter.put(token, 1);
            }

        }

    }

    public void Countcharacter(String str) {
//        /*c1*/
//        str = str.replaceAll("\\s", "");  //loại bổ tất cả các khoảng trắng
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (charCounter.containsKey(ch)) {
//                charCounter.put(ch, charCounter.get(ch) + 1);  //Trả về giá trị của key được chỉ định.
//            } else {
//                charCounter.put(ch, 1);
//            }
//        }

        /*c2*/
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (charCounter.containsKey(ch)) {
                    charCounter.put(ch, charCounter.get(ch) + 1);  //Trả về giá trị của key được chỉ định.
                } else {
                    charCounter.put(ch, 1);
                }
            }
        }
    }

    public void PrintLetterMap() {
        System.out.println(wordCounter);
    }

    public void PrintCharacterMap() {
        System.out.println(charCounter);
    }

}
