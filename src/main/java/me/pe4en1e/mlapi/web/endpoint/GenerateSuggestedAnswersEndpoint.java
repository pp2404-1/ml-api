package me.pe4en1e.mlapi.web.endpoint;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class GenerateSuggestedAnswersEndpoint {

    @Data
    private static class RequestDto {
        private String quizName;
    }

    @Data
    @Builder
    private static class ResponseDto {
        List<String> answersVariants;
    }

    @PostMapping("/api/generateSuggestedAnswers")
    private ResponseDto generateSuggestedAnswers(@RequestBody RequestDto request) {
        return ResponseDto.builder()
                .answersVariants(
                        List.of(
                                "generated answer variant for " + request.getQuizName()
                        )
                )
                .build();
    }

}
