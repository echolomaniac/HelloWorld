// CHECKSTYLE:OFF
/**
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */

package com.example.helloworld.models;

public class CountryBuilder extends CountryBuilderBase<CountryBuilder> {
    public static CountryBuilder country() {
        return new CountryBuilder();
    }

    public CountryBuilder() {
        super(new Country());
    }

    public Country build() {
        return getInstance();
    }
}

class CountryBuilderBase<GeneratorT extends CountryBuilderBase<GeneratorT>> {
    private Country instance;

    protected CountryBuilderBase(Country aInstance) {
        instance = aInstance;
    }

    protected Country getInstance() {
        return instance;
    }
}
