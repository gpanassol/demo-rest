package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Marca;

@RestController
public class MarcaController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/marca")
    public Marca greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Marca(counter.incrementAndGet(),
                            String.format(template, name));
    }
	
}
