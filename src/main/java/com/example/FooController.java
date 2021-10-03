package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Controller
public class FooController {

    @Get("/person")
    @Operation(summary = "Get a person",
            description = "Get person info"
    )
    @ApiResponse(
            content = @Content(schema = @Schema(implementation = Person.class))
    )
    public Person getPerson() {
        return new Person("John", 11, new Address("SomeCity", "SomeCountry"));
    }
}
