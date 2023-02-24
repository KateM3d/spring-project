package com.project.projectusers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/index")
    public String getUsers(@RequestParam(value = "day", defaultValue = "hello") String day) {
        return String.format(day);
    }
}
