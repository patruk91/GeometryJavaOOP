package com.codecool.java.geometry.shapes;

public interface ClassName {
    default String getClassName() {
        return getClass().getSimpleName();
    }
}
