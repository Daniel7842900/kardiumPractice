package org.example;

import java.util.Set;

public class RequirementCounter extends CategoryCounter {
    @Override
    public int count(Set<String> inputStrings) {
        for (String str:
             inputStrings) {
            for(Requirement requirementSubstring : Requirement.values()) {
                if(str.matches(requirementSubstring.getValue()))  {
                    super.incrementCount();
                }
            }
        }

        return super.getCount();
    }
}
