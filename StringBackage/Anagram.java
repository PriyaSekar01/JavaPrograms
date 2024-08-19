package StringBackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    List<String> findAnagram(String[] words, String word){
        List<String> anagrams = new ArrayList<>();
        char[]  targetChars = word.toLowerCase().toCharArray();
        Arrays.sort(targetChars);

        for(String w : words){
            if(w.length()!=word.length()){
                continue;
            }
            char[] chars = w.toLowerCase().toCharArray();
            Arrays.sort(chars);

            if(Arrays.equals(chars,targetChars)){
                anagrams.add(w);
            }
        }
        return anagrams;
    }

    public static void main (String args[]){
        Anagram anagram = new Anagram();
        String[] words = {"listen", "silent", "enlist", "inlets", "google", "apple"};
        String word = "listen";
        List<String> result = anagram.findAnagram(words, word);

        System.out.println("Anagrams of " + word + ": " + result);
    }

}
