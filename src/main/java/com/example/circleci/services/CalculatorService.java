package com.example.circleci.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public CalculatorService() { }

    public Integer sum(Integer firstNumber, Integer secondNumber){
        return  firstNumber + secondNumber;
    }

}
