package j1.s.p0008;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ManageCounter {

    //count letter
    public void Countletter(Infor x) {
        //initinalize Stringtokenizer for input String
        StringTokenizer st = new StringTokenizer(x.getStr(), " ");
        //use loop loop over tokens with string StringTokenizer just stored
        while (st.hasMoreElements()) {
            //declare variable temporary to store the next token value
            String token = st.nextToken();
            //Check if the hashmap have this key
            if (x.getWordCountMap().containsKey(token)) {
                x.getWordCountMap().put(token, x.getWordCountMap().get(token) + 1);  //return value of key current
            } else {
                x.getWordCountMap().put(token, 1);
            }
        }

    }

    //count character
    public void Countcharacter(Infor x) {
        String str = x.getStr().replaceAll("\\s", "");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (x.getCharacterCountMap().containsKey(ch)) {
                x.getCharacterCountMap().put(ch, x.getCharacterCountMap().get(ch) + 1);  //Trả về giá trị của key được chỉ định.
            } else {
                x.getCharacterCountMap().put(ch, 1);
            }
        }
    }

    //Print
    public void DisplayWordMap(Infor x) {
        System.out.println(x.getWordCountMap());
    }

    public void DisplayCharacterMap(Infor x) {
        System.out.println(x.getCharacterCountMap());
    }

    //Input
        public String InputString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your content:");
        return sc.nextLine();
    }
        
        
}
