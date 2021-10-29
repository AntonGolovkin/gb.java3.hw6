package ru.geekbrains.hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Test2 {
    public static Stream<Arguments> after4(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 2, 4, 4, 2, 3, 4}, new int[]{}));
        list.add(Arguments.arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}));
        return list.stream();
    }
    @ParameterizedTest
    @MethodSource("after4")
    public void testArrAfter4(int[] in, int[] out){
        Assertions.assertArrayEquals(out, MainApp.arrAfter4(in));
    }
}
