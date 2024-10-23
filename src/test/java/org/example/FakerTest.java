package org.example;

import net.datafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class FakerTest {
    @Test
    void faker() {
        Faker faker = new Faker(new Locale("ja"));
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String address = faker.address().fullAddress();
        String job = faker.job().field();

        System.out.println(lastName + " " + firstName);
    }
}
