package c;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

public class AutomotiveRepair {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }


    public static void main( String[] args ) {

        SpringApplication.run(AutomotiveRepair.class, args);

    }
}
