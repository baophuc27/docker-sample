package com.example.demo;
import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class DemoController {

    @RequestMapping("/")
    String index() {
        File file = new File("docker.txt");
        try{
        file.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
        return "Test for Docker";
    }
}
