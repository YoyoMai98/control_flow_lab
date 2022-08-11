import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {
//        collect weather input
        System.out.println("What is the weather?");
        Scanner readWeather = new Scanner(System.in);
        String weather = readWeather.nextLine();
//        collect average temperature input
        System.out.println("What is the temperature?");
        Scanner readTemp = new Scanner(System.in);
        String temperatureInput = readTemp.nextLine();
        int temperature = Integer.parseInt(temperatureInput);

    }
}