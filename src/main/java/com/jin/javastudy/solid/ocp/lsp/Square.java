package com.jin.javastudy.solid.ocp.lsp;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Square implements Shape {

    private int side;

    @Override
    public int area() {
        return side * side;
    }
}
