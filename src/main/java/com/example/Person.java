package com.example;

import io.swagger.v3.oas.annotations.media.Schema;

public record Person(//should be marked as not required,but is marked as required
                     @Schema(description = "name of the person")
                     String name,

                     //should be marked as not required, and is marked as not required
                     @Schema(description = "age of the person", required = false)
                     int age,

                     @Schema(description = "address of the person", implementation = Address.class)
                     Address address) {

}
