package com.tobesimpler.test.h202002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    // to meet this requirement, 'and' is added into the dictionary and 'man go' is divided to 'man' and 'go'
    private final List<String> DICTIONARY = Arrays.asList("i, like, sam, sung, samsung, mobile, ice, cream, man, go, and".split(", "));

    public List<String> stage1(String input) {
        System.out.println("input: " + input);
                
        WordBreak wordBreak = new WordBreak();
        List<String> output = wordBreak.wordBreak(input, DICTIONARY);
        
        System.out.println("output: " + output);
        
        return output;
    }
    
    public List<String> stage2(String input, String dictionaryString) {
        System.out.println("input: " + input);
                
        List<String> dictionary = Arrays.asList(dictionaryString.split(", "));
        
        WordBreak wordBreak = new WordBreak();
        List<String> output = wordBreak.wordBreak(input, dictionary);
        
        System.out.println("output: " + output);
        
        return output;
    }
    
    public List<String> stage3(String input, String dictionaryString) {
        System.out.println("input: " + input);
                
        ArrayList<String> dictionary = new ArrayList<String>();
        dictionary.addAll(DICTIONARY);
        dictionary.addAll(Arrays.asList(dictionaryString.split(", ")));
        
        WordBreak wordBreak = new WordBreak();
        List<String> output = wordBreak.wordBreak(input, dictionary);
        
        System.out.println("output: " + output);
        
        return output;
    }
    
    public static void main( String[] args )
    {
        // stage1
        App app = new App();
        System.out.println("#stage1");
        app.stage1("ilikesamsungmobile");
        app.stage1("ilikeicecreamandmango");
        System.out.println();
        
        // customized dictionary
        // to meet this requirement, 'and' is added into the dictionary
        String customizedDictionary = "i, like, sam, sung, mobile, icecream, man, go, mango, and";
        
        // stage2
        System.out.println("#stage2");
        app.stage2("ilikesamsungmobile", customizedDictionary);
        app.stage2("ilikeicecreamandmango", customizedDictionary);
        System.out.println();
        
        // stage3
        System.out.println("#stage3");
        app.stage3("ilikesamsungmobile", customizedDictionary);
        app.stage3("ilikeicecreamandmango", customizedDictionary);
        System.out.println();
    }
}
