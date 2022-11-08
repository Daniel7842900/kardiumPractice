package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 *  Kardium take-home assignment
 *  Write a function that accepts a set of strings.
 *  Parse them into categories.
 *  Return the register value that displays the total number of strings in each category.
 *
 *  Condition to fall under each category:
 *  If a string contains one of the substrings associated with a category.
 *
 */
public class Main {

    public static void main(String[] args) {
        Set<String> inputStrings = new HashSet<>();
        inputStrings.add("Requirement");
        inputStrings.add("Specification");
        inputStrings.add("Requirements");
        inputStrings.add("Specifications");
        inputStrings.add("Specificationsaddle");
        inputStrings.add("Specification Requirements");
        inputStrings.add("Design Output");
        inputStrings.add("Design output");
        inputStrings.add("design output");
        inputStrings.add("Specification Design output");
        inputStrings.add("Part");
        inputStrings.add("System");
        inputStrings.add("Test protocol");
        inputStrings.add("Test Step");
        inputStrings.add("Test Steps");
        inputStrings.add("Test Protocol Result");

        LEDModuleDisplay display = new LEDModuleDisplay();
        System.out.println(display.displayCategoryTotals(inputStrings));
    }
}
/**
 * 1. We take in the input strings into a set
 * 2. we go through every string to find a specific substring.
 *  - case-insensitive
 *  - requirement 1, engineering 2, test 3 (priority)
 *  -
 * 3. As we go through the string, we count the category.
 * 4. After we count all string, we convert the number to 7 segment display
 * 5. Print the number.
 *
 * Classes we need:
 * 1. 7 segment display
 * 2.
 *
 *
 *
 */