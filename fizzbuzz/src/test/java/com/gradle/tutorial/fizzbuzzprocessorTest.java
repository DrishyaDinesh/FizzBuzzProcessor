package com.gradle.tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class fizzbuzzprocessorTest {
    @Test
    public void FizzBuzzNormalNumbers() {

        fizzbuzzprocessor fb = new fizzbuzzprocessor();
        Assertions.assertEquals("1", fb.convert(1));
        Assertions.assertEquals("2", fb.convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        fizzbuzzprocessor fb = new fizzbuzzprocessor();
        Assertions.assertEquals("Fizz", fb.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        fizzbuzzprocessor fb = new fizzbuzzprocessor();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        fizzbuzzprocessor fb = new fizzbuzzprocessor();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }
}
