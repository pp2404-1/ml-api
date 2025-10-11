package me.pe4en1e.mlapi.web.endpoint;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class GenerateQuizByTopicEndpoint {

    @Data
    private static class RequestDto {
        private String topic;
    }

    @Data
    @Builder
    private static class ResponseDto {
        private String quizName;
    }

    @PostMapping("/api/generateQuizByTopic")
    private ResponseDto generateQuizByTopic(@RequestBody RequestDto requestDto) {
        return ResponseDto.builder()
                .quizName("name for quiz by " + requestDto.getTopic())
                .build();
    }

}
