package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * LEDModuleDisplay
 * Take the LEDModule and convert bits to numbers.
 */
public class LEDModuleDisplay {
    LEDModule emptyModule = new LEDModule();
    LEDModule requirementsModule = new LEDModule();
    LEDModule designModule = new LEDModule();
    LEDModule testModule = new LEDModule();


    public void decodeHexToDecimal() {

    }
    
    public Set<String> toUpper(Set<String> inputStrings) {
        Set<String> result = new HashSet<>();

        for (String input:
             inputStrings) {
            result.add(input.toUpperCase());
        }

        return result;
    }

    public int displayCategoryTotals(Set<String> inputStrings) {
        int result = 0;
        inputStrings = toUpper(inputStrings);
        for(String s : inputStrings) {
            System.out.println(s);
        }

        CategoryCounter rc = new RequirementCounter();
        int requirementCount = rc.count(inputStrings);
        CategoryCounter dc = new DesignOutputCounter();
        int designCount = dc.count(inputStrings);
        CategoryCounter tc = new TestCounter();
        int testCount = tc.count(inputStrings);
        System.out.println(requirementCount);
        System.out.println(designCount);
        System.out.println(testCount);

        String combined = "" + requirementCount + designCount + testCount;
        System.out.println(combined);
        result = Integer.parseInt(combined);

        return result;
    }
}
