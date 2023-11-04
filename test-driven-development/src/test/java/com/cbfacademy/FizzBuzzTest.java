package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.stream.Stream;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("The FizzBuzz class should")
public class FizzBuzzTest {
    
    @ParameterizedTest
    @MethodSource
    @DisplayName("Should return number,'Fizz','Buzz' or'FizzBuzz'")
     public void ShouldReturn1WhenInputIs1(Integer value,String expected){
         final String actual = FizzBuzz.of(value);
         assertThat(actual, is(expected));
     }



    static Stream<Arguments> inputAndOutputProvider(){
        return Stream.of(Arguments.of(1,"1"),
        Arguments.of(3,"Fizz"),Arguments.of(6,"Fizz"));
    }

    // @Test
    // @DisplayName("Should return 1 when input is 1")
    // public void ShouldReturn1WhenInputIs1(){
    //     final String actual = FizzBuzz.of(1);
    //     assertThat(actual, is("1"));
    // }
    // @Test
    // @DisplayName("Should return "Fizz" when input is 3")
    // public void ShouldReturnFizzWhenInputIs3(){
    //     final String actual = FizzBuzz.of(3);
    //     assertThat(actual, is("Fizz"));
    // }
}
