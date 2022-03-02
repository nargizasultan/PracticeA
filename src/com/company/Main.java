package com.company;



public class Main {

    public static void main(String[] args) {

        Vehicle car1 = new Car("Tesla", 1020,TypeOfEngine.ELECTRONIC);
        Vehicle car2 = new Car("Mercedes", 2017, TypeOfEngine.FUEL);
        Vehicle car3 = new Car("Honda", 2015, TypeOfEngine.HYBRID);
        Vehicle car4 = new Car("Volvo", 1999, TypeOfEngine.FUEL);
        Vehicle car5 = new Car("Toyota", 2005, TypeOfEngine.HYBRID);
        Vehicle car6 = new Car("Moskvich", 1990, TypeOfEngine.ELECTRONIC);
        Vehicle car7 = new Car("Hyundai", 2022, TypeOfEngine.ELECTRONIC);
        Vehicle car8 = new Car("BMW", 2010, TypeOfEngine.FUEL);

        Vehicle truck1 = new Truck("MACK", 2023, TypeOfEngine.FUEL);
        Vehicle truck2 = new Truck("VOLVO", 2016, TypeOfEngine.ELECTRONIC);
        Vehicle truck3 = new Truck("BRABUS", 2018, TypeOfEngine.HYBRID);
        Vehicle truck4 = new Truck("MAN", 1999, TypeOfEngine.FUEL);
        Vehicle truck5 = new Truck("KAMAZ", 2001, TypeOfEngine.ELECTRONIC);
        Vehicle truck6 = new Truck("BELAZ", 2019, TypeOfEngine.FUEL);
        Vehicle truck7 = new Truck("MAZ", 1996, TypeOfEngine.FUEL);


        Vehicle[]vehicles={car1, car2, car3, car4, car5, car6, car7, car8, truck1, truck2, truck3, truck4, truck5, truck6, truck7};
        Vehicle[]onlyElectricVehicles=new Vehicle[getQuantityOfElectronicTypeOfEngine(vehicles)];
        Vehicle[]onlyFuelVehicles=new Vehicle[getQuantityOfFuelTypeOfEngine(vehicles)];
        Vehicle[]onlyHybridVehicles=new Vehicle[getQuantityOfHybidTypeOfEngine(vehicles)];


        onlyFuelVehicles=getOnlyFuelVehicles(onlyFuelVehicles, vehicles);
        onlyHybridVehicles=getOnlyHybridVehicles(onlyHybridVehicles, vehicles);
        onlyElectricVehicles=getOnlyElectricVehicles(onlyElectricVehicles, vehicles);
        printElementsOfArray(onlyElectricVehicles);
        printElementsOfArray(onlyHybridVehicles);
        printElementsOfArray(onlyFuelVehicles);




    }
    public  static int getQuantityOfElectronicTypeOfEngine(Vehicle[]vehicles){
        int counter=0;
        for (Vehicle v:vehicles) {
            if(v.getTypeOfEngine().equals(TypeOfEngine.ELECTRONIC)){
                counter++;
            }

        }return counter;
    }
    public  static int getQuantityOfFuelTypeOfEngine(Vehicle[]vehicles){
        int counter=0;
        for (Vehicle v:vehicles) {
            if(v.getTypeOfEngine().equals(TypeOfEngine.FUEL)){
                counter++;
            }

        }return counter;
    }
    public  static int getQuantityOfHybidTypeOfEngine(Vehicle[]vehicles){
        int counter=0;
        for (Vehicle v:vehicles) {
            if(v.getTypeOfEngine().equals(TypeOfEngine.HYBRID)){
                counter++;
            }

        }return counter;
    }
    private static void printElementsOfArray(Vehicle[]vehicles){
        for (Vehicle ve:vehicles) {
            System.out.println(ve);

        }
    }
    public static Vehicle[] getOnlyElectricVehicles(Vehicle[]newEmptyArray, Vehicle[]vehicles){
        int counterForNewEmptyArray=0;
        for (Vehicle vec:vehicles) {
            if(vec.getTypeOfEngine().equals(TypeOfEngine.ELECTRONIC)){
                newEmptyArray[counterForNewEmptyArray]=vec;
                counterForNewEmptyArray++;
            }

        }return newEmptyArray;

    }
    public static Vehicle[]getOnlyFuelVehicles(Vehicle[]emptyArray, Vehicle[]vehicles){
        int counter=0;
        for (Vehicle v:vehicles) {
            if(v.getTypeOfEngine().equals(TypeOfEngine.FUEL)){
                emptyArray[counter]=v;
                counter++;
            }

        }return emptyArray;

    }
    public static Vehicle[]getOnlyHybridVehicles(Vehicle[]emptyArray, Vehicle[]vehicles){
        int counter=0;
        for (Vehicle ve:vehicles) {
            if(ve.getTypeOfEngine().equals(TypeOfEngine.HYBRID)){
                emptyArray[counter]=ve;
                counter++;

            }

        }return emptyArray;
    }


}
