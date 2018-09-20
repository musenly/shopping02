package cn.rsvptech.shopping;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ShoppingApplication {

    @RequestMapping("/")
    public String query() {
        return "hell0";
    }

    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class, args);
    }
}
