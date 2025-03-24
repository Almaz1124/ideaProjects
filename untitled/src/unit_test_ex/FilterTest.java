package unit_test_ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FilterTest {

    @Test
    void getResult() {

        Filter<String> filter = new Filter<>();
        filter.t = "Hello";
        assertEquals(true, filter.getResult("Hello"));
    }
}