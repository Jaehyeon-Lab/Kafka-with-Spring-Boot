package hello.kafka;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MyMessage {
    private String message;
    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return "MyMessage{" +
            "message='" + message + '\'' +
            ", createdAt=" + createdAt +
            '}';
    }
}
