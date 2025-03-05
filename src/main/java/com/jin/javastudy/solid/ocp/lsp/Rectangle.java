package com.jin.javastudy.solid.ocp.lsp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {
    private int width;
    private int height;
    public int area() {
        return width * height;
    }
}
