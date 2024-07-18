package io.loop.test.day_8;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T2_java_faker {

    @Test
    public void java_faker(){
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());

    }
}
