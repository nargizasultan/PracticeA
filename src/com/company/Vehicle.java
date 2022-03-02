package com.company;

import java.time.LocalDate;

public abstract class Vehicle {
    private final String model;
    private final int yearOfIssue;
    private TypeOfEngine typeOfEngine;

    public Vehicle(String model,
                   int yearOfIssue,
                   TypeOfEngine typeOfEngine) {
        this.model = model;
        this.yearOfIssue = checkYearOfIssue(yearOfIssue);
        this.typeOfEngine = typeOfEngine;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    private int checkYearOfIssue(int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        try {
            if (yearOfIssue > currentYear ||
                    yearOfIssue < currentYear - 100) {
                throw new InvalidIssueExcaption(
                        this.model + " have invalid year of issue [" + yearOfIssue + "]");
            }
            return yearOfIssue;
        } catch (InvalidIssueExcaption exception) {
            System.err.println(exception.getMessage());
            return currentYear;
        }
    }

    @Override
    public String toString() {
        return "\nVehicle{" +
                "model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }
}
