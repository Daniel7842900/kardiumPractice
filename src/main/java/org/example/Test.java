package org.example;

public enum Test {
    TEST_PROTOCOL("TEST PROTOCOL"),
    TEST_STEP("TEST STEP"),
    TEST_PROTOCOL_RESULT("TEST PROTOCOL RESULT");

    private String value;

    private Test(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
