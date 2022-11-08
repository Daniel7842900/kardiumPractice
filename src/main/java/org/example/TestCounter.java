package org.example;

import java.util.Set;

public class TestCounter extends CategoryCounter {
    @Override
    public int count(Set<String> inputStrings) {
        for (String str:
                inputStrings) {
            for(Test requirementSubstring : Test.values()) {
                if(str.matches(requirementSubstring.getValue()))  {
                    super.incrementCount();
                }
            }
        }

        return super.getCount();
    }

}
