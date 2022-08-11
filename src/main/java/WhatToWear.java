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

//        Print suggestions based on weather and temperature
//        if temperature >= 28, print short-sleeved
//        if 18-28, cloudy: long; rainy:waterproof summer coat; sunny: short-sleeved
//        if 8-18, cloudy/sunny: jacket; rainy: waterproof winter coat
//        if temperature <= 8 or snow, winter coat
        if(temperature >= 28 || (
                weather.equals("sunny") && temperature >= 18
        )){
            System.out.println("wear a short-sleeved shirt");
        }else if(weather.equals("cloudy") && temperature >= 18){
            System.out.println("wear a long-sleeved shirt");
        }else if(weather.equals("rainy") && temperature >= 18){
            System.out.println("wear a waterproof summer coat");
        }if(weather.equals("rainy") && temperature <= 18){
            System.out.println("wear a waterproof winter coat");
        }else if(weather.equals("snow") || temperature <= 8){
            System.out.println("wear a winter coat");
        }else{
            System.out.println("wear a jacket");
        }

    }
}