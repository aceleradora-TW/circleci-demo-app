package com.example.circleci.controller;

import com.example.circleci.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public Map<String, Integer> calculator(@RequestParam  Integer firstNumber,
                                          @RequestParam Integer secondNumber) {
        HashMap<String, Integer> response = new HashMap<>();
        response.put("result", calculatorService.sum(firstNumber, secondNumber));
        return response;
    }

}
