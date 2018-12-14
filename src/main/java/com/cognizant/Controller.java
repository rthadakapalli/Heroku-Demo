package com.cognizant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
final class Controller {


    @GetMapping("/")
    Iterable<?> list(){

        return Collections.EMPTY_LIST;
    }

}
