package com.jin.javastudy.solid.lsp;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Rectangle implements Shape {
    private int width;
    private int height;

    @Override
    public int area() {
        return width * height;
    }
}
