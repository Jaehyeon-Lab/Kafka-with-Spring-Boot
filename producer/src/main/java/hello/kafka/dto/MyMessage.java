package hello.kafka.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MyMessage {
    private String message;
    private LocalDateTime createdAt;
}
