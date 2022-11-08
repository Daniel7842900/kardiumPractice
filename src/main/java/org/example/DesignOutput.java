package org.example;

public enum DesignOutput {
    DESIGN_OUTPUT("DESIGN OUTPUT"),
    PART("PART"),
    SYSTEM("SYSTEM");

    private String value;

    private DesignOutput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
