package com.cyberk.tests;
import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("jj");
        System.out.println("tHIRD COMMIT");
        System.out.println("Fourt Commit");
        System.out.println("Fifth commit");
        System.out.println("sixth commit");
        System.out.println("Seventh Commit");
        System.out.println("eigth commit");
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.harryPotter().character());
        System.out.println(faker.finance().creditCard(CreditCardType.AMERICAN_EXPRESS));





    }
}
