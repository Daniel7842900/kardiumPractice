package org.example;

public enum Requirement {
    REQUIREMENT("REQUIREMENT"),
    SPECIFICATION("SPECIFICATION");

    private String value;

    private Requirement(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
