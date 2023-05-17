package ca.ylo.ws.controllers;

import ca.ylo.ws.model.WebServiceError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is just a test controller
 */
@RestController
public class HelloController {

    @Operation(
        description = "Just a simple hello world controller",
        summary = "This is a summary for this method",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful"),
            @ApiResponse(responseCode = "400", description = "Something went wrong", content = {
                @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = WebServiceError.class))
            })
        }
    )
    @GetMapping(
            value = "/test",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public ResponseEntity hello() {
        return ResponseEntity.ok("Hello");
    }

}
