/**
 * 
 */
package com.tobesimpler.test.h202002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhoufan
 * @version 2020-02-28 03:59:40
 * @see https://algorithmsandme.com/word-break-problem/
 * 
 */
public class WordBreak {
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        return wordBreakUtil(s, wordDict, map);
    }

    /**
     * 
     * @author zhoufan
     * @see https://algorithmsandme.com/word-break-problem/
     * 
     * @param s the part of the word
     * @param wordDict the word dictionary
     * @param map if the part of the word has been broken once, it is stored in this map
     * @return
     */
    private List<String> wordBreakUtil(String s, List<String> wordDict, Map<String, List<String>> map) {

        // if the part of the word has been broken once, just get it instead of breaking it again
        if (map.containsKey(s)){
            return map.get(s);
        }

        // if the part of the word is just in the dictionary, add it into the result
        List<String> result = new ArrayList<String>();
        if (wordDict.contains(s)){
            result.add(s);
        }

        // divide the part of the word into prefix and other part
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (wordDict.contains(prefix)){
                List<String> returnStringsList = wordBreakUtil(s.substring(i), wordDict, map);

                // add up prefix and all possible other part 
                for (String returnString : returnStringsList ){
                    result.add(prefix + " " + returnString);
                }
            }
        }
        map.put(s,result);
 
        return result;
    }
}
