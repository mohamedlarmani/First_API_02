package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/factorial/{n}")
    public long factorial(@PathVariable long n) {
        long result = n;
        long fact = n - 1;
        for (long i = fact; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}