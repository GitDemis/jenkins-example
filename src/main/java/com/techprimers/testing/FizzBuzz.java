package com.techprimers.testing;

import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";


        return String.valueOf(number);
    }
}
