package ru.geekbrains.hw6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1 {
    @Test
    public void test1arrAfter4() {
        int[] in = new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] out = new int[]{1, 7};
        assertArrayEquals(out, MainApp.arrAfter4(in));
    }

    @Test
    public void test2arrAfter4() {
        int[] in = new int[]{1, 2, 2, 3, 1, 7};
        assertThrows(RuntimeException.class, () -> {
            MainApp.arrAfter4(in);
        });
    }

    @Test
    public void test3arrOnly1and4() {
        int[] in = new int[]{1, 4, 1, 4, 1, 1};
        assertTrue(MainApp.arrOnly1and4(in));
    }

    @Test
    public void test4arrOnly1and4() {
        int[] in = new int[]{1, 4, 1, 4, 1, 7};
        assertFalse(MainApp.arrOnly1and4(in));
}
    }