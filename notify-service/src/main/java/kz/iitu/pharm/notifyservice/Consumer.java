package kz.iitu.pharm.notifyservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    @KafkaListener(topics = "book_requests", groupId = "group_id")
    public void consume(DrugRequest drugRequest) throws IOException {
        System.out.println(String.format("#### -> Notify user: -> %s",
                "User " + drugRequest.getUserId() + " have received "
                        + drugRequest.getDrug()
                        + "recommended drugs "
        ));
    }
}
