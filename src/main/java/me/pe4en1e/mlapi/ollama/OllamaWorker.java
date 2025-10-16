package me.pe4en1e.mlapi.ollama;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
public class OllamaWorker {

    @Data
    private static class ResponseDto {
        private String model;
        private String response;

    }

    public String generate() {
        ResponseDto responseDto;

        WebClient client = WebClient.create("http://localhost:11434");

        try {
            responseDto = client.get()
                    .uri("/api/generate")
                    .retrieve()
                    .bodyToMono(ResponseDto.class)
                    .block();
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }

        return responseDto.getResponse();
    }

}
