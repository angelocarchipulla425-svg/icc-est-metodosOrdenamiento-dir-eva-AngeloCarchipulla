package controllers;

import models.Car;

public class CarController {
    public void sortByBrand(Car[] cars) {

        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getBrand().toLowerCase()
                        .compareTo(cars[j + 1].getBrand().toLowerCase()) < 0) {

                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;

                }
            }
        }

    }

}
