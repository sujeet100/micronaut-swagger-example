package com.example;

import io.swagger.v3.oas.annotations.media.Schema;

public class Address {
    //should be marked as not required,but is marked as required
    @Schema(description = "city")
    private String city;

    //should be marked as not required, and is marked as not required
    @Schema(description = "country", required = false)
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
