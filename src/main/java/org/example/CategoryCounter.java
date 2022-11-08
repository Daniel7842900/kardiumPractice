package org.example;

import java.util.Set;

public abstract class CategoryCounter {

    protected int count = 0;

    public abstract int count(Set<String> inputStrings);

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    protected void incrementCount() {
        this.setCount(this.getCount() + 1);
    }
}
