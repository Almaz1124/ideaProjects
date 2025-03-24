package unit_test_ex;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal;

    @BeforeEach// выполняется перед каждым тестом
    void prepareData() {

        animal = new Animal("Dog", 5);
    }

    @Test
    void getName() {
        //Animal animal = new Animal("Dog", 5);
        assertEquals("Dog", animal.getName());
    }

    @Test
    void setName() {
        //Animal dog = new Animal("Dog", 5);
        animal.setName("Cat");
        assertEquals("Dog", animal.getName());
    }

    @Test
    void setNameIfEmpty() {
        Animal animal = new Animal("", 5);
        animal.setName("Cat");
        assertEquals("Cat", animal.getName());
    }

    @Test
    void getAge() {
        //Animal animal = new Animal("Dog", 5);
        assertEquals(5, animal.getAge());
    }

    @Test
    void setAge() {
    }
}