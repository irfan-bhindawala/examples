package com.techzone.effective.item32;

import java.util.stream.Stream;

import static com.techzone.effective.item32.Planet.EARTH;
import static com.techzone.effective.item32.Planet.values;
import static java.lang.System.out;

public class WeightTableImpl {

    public static void main(String[] args) {
        double weightOnEarth = 100.0;
        double mass = weightOnEarth / EARTH.surfaceGravity();

        Stream.of(values()).forEach(planet -> out.printf("Mass of the object on the %s is %f kg.%n", planet, planet.surfaceWeight(mass)));
    }
}
