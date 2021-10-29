package ru.geekbrains.hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {
    public static Stream<Arguments> only1and4(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1}, false));
        list.add(Arguments.arguments(new int[]{4, 4, 4, 4, 4}, false));
        list.add(Arguments.arguments(new int[]{1, 2, 4, 7, 1}, false));
        list.add(Arguments.arguments(new int[]{1, 4, 1, 4, 1}, true));
        return list.stream();
    }
    @ParameterizedTest
    @MethodSource("only1and4")
    public void testArrOnly1and4(int[] in, boolean num){
        Assertions.assertEquals(MainApp.arrOnly1and4(in), num);
    }
}
