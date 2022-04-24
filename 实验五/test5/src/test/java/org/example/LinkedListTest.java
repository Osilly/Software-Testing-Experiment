package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    @ParameterizedTest
    @CsvSource({
            "null, null, null, 1",
            "A, null, null, 1",
            "A, B, null, 2",
            "A, A, A, 1",
            "A, B, B, 1",
            "B, B, A, 2"
    })
    void testLinkedListRemoveMethod(String a, String b, String c, int size) {
        LinkedList<String> list = new LinkedList<>();

        list.add("null".equals(a) ? null : a);
        list.add("null".equals(b) ? null : b);
        list.remove("null".equals(c) ? null : c);

        assertEquals(list.size(), size);
    }
}
