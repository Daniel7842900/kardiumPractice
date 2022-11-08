package org.example;

import java.util.Set;

public class DesignOutputCounter extends CategoryCounter {
    @Override
    public int count(Set<String> inputStrings) {
        for (String str:
                inputStrings) {
            for(DesignOutput designOutputSubstring : DesignOutput.values()) {
                if(str.matches(designOutputSubstring.getValue()))  {
                    super.incrementCount();
                }
            }
        }

        return super.getCount();
    }
}
