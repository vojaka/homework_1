package com.company;

public class Main {

    public static void main(String[] args) {
        Monitor firstMonitor = new Monitor();
        Monitor secondMonitor = new Monitor();

        firstMonitor.manufacturer = "Philips";
        firstMonitor.color = Monitor.Color.WHITE;
        firstMonitor.diagonal = 27;
        firstMonitor.screenType = ScreenType.AMOLED;

        secondMonitor.manufacturer = "LG";
        secondMonitor.color = Monitor.Color.BLACK;
        secondMonitor.diagonal = 24;
        secondMonitor.screenType = ScreenType.LCD;

        System.out.println(firstMonitor.manufacturer);
        System.out.println(secondMonitor.screenType);

        firstMonitor.color = Monitor.Color.BLACK;

        int[] numbers = new int[2];

        Monitor[] monitors = new Monitor[4];

        // Lisa massiivi 3 monitori
        // Prindi välja kõigi monitoride tootja, mille diagonaal on suurem kui 25 tolli
        Monitor thirdMonitor = new Monitor();
        thirdMonitor.manufacturer = "Samsung";
        thirdMonitor.color = Monitor.Color.WHITE;
        thirdMonitor.diagonal = 32;
        thirdMonitor.screenType = ScreenType.OLED;

        monitors[0] = firstMonitor;
        monitors[1] = secondMonitor;
        monitors[2] = thirdMonitor;

        monitors[3] = new Monitor();
        monitors[3].manufacturer = "Sony";
        monitors[3].color = Monitor.Color.GREY;
        monitors[3].diagonal = 21;
        monitors[3].screenType = ScreenType.LCD;

        for (int i = 0; i < monitors.length ; i++) {
            if(monitors[i].diagonal > 25) {
                System.out.println(monitors[i].manufacturer);
            }
        }

        // Leia monitori värv kõige suuremal monitoril

        Monitor maxSizeMonitor = monitors[0];


        for (int i = 0; i < monitors.length; i++) {
            if(monitors[i].diagonal > maxSizeMonitor.diagonal) {
                maxSizeMonitor = monitors[i];
            }
        }
        maxSizeMonitor.printInfo();
        firstMonitor.printInfo();

        System.out.printf("Monitori diagonaal cm-tes on %.2f%n", maxSizeMonitor.diagonalToCm());

        firstMonitor.setDiagonal(-1000);
        System.out.println(firstMonitor.getDiagonal());
        firstMonitor.setDiagonal(200);
        System.out.println(firstMonitor.getDiagonal());
        System.out.println(firstMonitor.getYear());
        firstMonitor.setManufacturer("Huawei");
        firstMonitor.printInfo();
        firstMonitor.setManufacturer(null);
    }

}
