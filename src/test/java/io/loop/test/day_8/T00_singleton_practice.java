package io.loop.test.day_8;

import org.testng.annotations.Test;

public class T00_singleton_practice {
    @Test
    public void practice(){
        String str1 = T00_singleton_pattern_example.getWord();
        System.out.println("str1= " + str1);
        System.out.println("_________________");

        String str2 = T00_singleton_pattern_example.getWord();
        System.out.println("str1= " + str2);


    }
}
