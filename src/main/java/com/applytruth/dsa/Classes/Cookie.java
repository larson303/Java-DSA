package com.applytruth.dsa.Classes;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Cookie {
    @Getter
    @Setter
    private String flavor;
    private int calories;

    // Create default constructor
    public Cookie() {
        this.flavor = "chocolate";
        this.calories = 100;
    }

    public Cookie(String flavor, int calories) {
        this.flavor = flavor;
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cookie cookie = (Cookie) o;
        return calories == cookie.calories && Objects.equals(flavor, cookie.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, calories);
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "flavor='" + flavor + '\'' +
                ", calories=" + calories +
                '}';
    }
}
