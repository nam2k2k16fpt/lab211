
package j1.s.p0008;

import java.util.HashMap;

public class Infor {
    private String str;
    private HashMap<String,Integer> wordCountMap;
    private HashMap<Character,Integer> characterCountMap;
     

    public Infor(String str) {
        this.str = str;
        this.wordCountMap = new HashMap<>();
        this.characterCountMap = new HashMap<>();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public HashMap<String, Integer> getWordCountMap() {
        return wordCountMap;
    }

    public void setWordCountMap(HashMap<String, Integer> wordCountMap) {
        this.wordCountMap = wordCountMap;
    }

    public HashMap<Character, Integer> getCharacterCountMap() {
        return characterCountMap;
    }

    public void setCharacterCountMap(HashMap<Character, Integer> characterCountMap) {
        this.characterCountMap = characterCountMap;
    }
    

    
    
    
}
