package com.campusdual.classroom;

public class FuelTank {

  public int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void setActualFuel(int fuel) {
    if (fuel >= 0) {
      this.actualFuel = fuel;
      System.out.println("La capacidad de combustible ha sido actualizada a " + this.actualFuel + " litros.");
    } else {
      System.out.println("No se puede establecer un valor negativo para el combustible.");
    }
  }



}
