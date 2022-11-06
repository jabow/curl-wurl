package com.bowen.homepage;

import java.util.HashMap;
import java.util.Map;

public class EnglishToWelsh {
    static Map<String, String> eToWConversion = new HashMap<String, String>();


    public EnglishToWelsh() {
        eToWConversion.put("ok", "iawn");
        eToWConversion.put("no", "dim");
    }

    static String getWelsh(String englishWord) {
        eToWConversion.put("ok", "iawn");
        eToWConversion.put("no", "dim");
        return eToWConversion.getOrDefault(englishWord, "Not Found");
    }

}



