package me.pe4en1e.mlapi.web.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatusSchema {

    private String status;
    private String message;

}
