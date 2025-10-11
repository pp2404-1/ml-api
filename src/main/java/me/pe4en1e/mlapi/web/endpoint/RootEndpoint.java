package me.pe4en1e.mlapi.web.endpoint;

import me.pe4en1e.mlapi.web.schema.StatusSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class RootEndpoint {

    @GetMapping("/")
    private StatusSchema root() {
        return StatusSchema.builder().status("OK").build();
    }

}
