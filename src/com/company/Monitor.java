package com.company;

enum ScreenType{
    OLED,
    AMOLED,
    LCD
}

public class Monitor {
     String manufacturer;
     int diagonal;
     int year;
     ScreenType screenType;
     enum Color{
        WHITE,
        BLACK,
        GREY
    }
    Color color;

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if ( manufacturer == ""  || manufacturer == "Huawei") {
            System.out.printf("Check Manufacturer\n");
        } else{
             this.manufacturer = manufacturer;
        }

    }

    void printInfo() {
         System.out.printf("Manufacturer: %s\nColor: %s\nYear: %s\nDiagonal: %s\nScreen type: %s\n",manufacturer, color,year,diagonal,screenType);
     }

     public double diagonalToCm() {
         return 2.54* this.diagonal;
     }
}
