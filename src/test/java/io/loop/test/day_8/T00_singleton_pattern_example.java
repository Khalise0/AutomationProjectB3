package io.loop.test.day_8;

public class T00_singleton_pattern_example {
    // We we need private constructor to prevent external instantiation
    private T00_singleton_pattern_example() {}

    private static String word;
    // public getter
    public static String getWord(){

        if (word==null){
            System.out.println("First time calling, obj is null");
            word = "driver";
        } else{
            System.out.println("Word is already assigned");
        }
        return word;
    }
}
