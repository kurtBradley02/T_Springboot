package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Value("${my.message}")
    private String message;

    public String getMessage() {
        return message;
    }
}
