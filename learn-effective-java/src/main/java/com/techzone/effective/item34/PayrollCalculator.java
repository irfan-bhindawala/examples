package com.techzone.effective.item34;

import java.util.stream.Stream;

import static com.techzone.effective.item34.PayrollDay.values;
import static java.lang.System.out;

public class PayrollCalculator {
    public static void main(String[] args) {

        Stream.of(values()).filter(payroll -> !payroll.name().equalsIgnoreCase("SUNDAY")
                && !payroll.name().equalsIgnoreCase("SATURDAY")).forEach(p -> out.println("Salary of " + p.name() + " is " + p.pay(8 * 60, 1) + " dollars."));
    }
}
