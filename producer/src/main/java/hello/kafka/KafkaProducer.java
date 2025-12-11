package hello.kafka;

import hello.kafka.dto.MyMessage;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, MyMessage> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, new MyMessage(message, LocalDateTime.now()));
    }
}
