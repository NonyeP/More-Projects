package com.cbfacademy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.Year;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("The LeapYear class should")
public class LeapYearTest {

    @BeforeEach
    public void SetUp(){ 
        leapYear = new LeapYear();//when using 
    }

    // @Test
    // @DisplayName("Should return true when input is divisible by 400")
    // public void ShouldReturn1WhenInputIs400(){
    //     final Boolean actual = LeapYear.of(400);
    //     assertThat(actual, is(true));
    
    // }

    @ParameterizedTest
    @MethodSource
    @DisplayName("isLeap() method returns true for years divisible by 400")
     public void ShouldReturn1WhenInputIs1(int year,boolean expected){
         Boolean result = LeapYear.isYear(year);
         assertThat(result, is(expected));
     }

     static Stream<Arguments> isLeapReturnsTrueForYearsDiisibleBy400(int year,boolean expected){
        return Stream.of
        (Arguments.of(400,false),
        Arguments.of(3,"Fizz"),
        Arguments.of(6,"Fizz"));
    }
}
