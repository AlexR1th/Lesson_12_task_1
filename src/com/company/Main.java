package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        EmployeeFullTime ivano = new EmployeeFullTime("Ivanov", 1277.3);
        EmployeeFullTime petrov = new EmployeeFullTime("Petrov", 1923.3);
        EmployeeFullTime denisov = new EmployeeFullTime("Denisov", 5277.3);

        List<EmployeeFullTime> list = Stream.of(petrov, ivano, denisov)
                .collect(Collectors.toList());

        double fullSalary = list.stream().mapToDouble(item -> item.getSalary()).sum();
        System.out.println(fullSalary+" Вся зарплата этих бичей");


    }
}
