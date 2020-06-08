package pl.piomin.samples.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Value("${propertyFromMap}")
    String propertyFromMap;
    @Value("${propertyEnv}")
    String propertyEnv;

    @GetMapping("/properties")
    public String getProperties() {
        return "propertyFromMap=" + propertyFromMap + ", propertyEnv=" + propertyEnv;
    }

}
