package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaozhh on 2017/4/14.
 */
@SpringBootApplication
@RestController
public class Hello {
    @RequestMapping("/")
    String home() {
        return "hello";
    }
}
