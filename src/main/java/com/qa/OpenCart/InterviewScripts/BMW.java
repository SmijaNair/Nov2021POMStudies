package com.qa.OpenCart.InterviewScripts;

public class BMW extends Car{
    @Override
    public void start(){
        System.out.println("BMW start");
    }
    public void autoParking(){
        System.out.println("BMW autoparking");
    }
    public void engine(){
        System.out.println("BMW engine");
    }
    @Override
    public void autoPilot(){
        System.out.println("BMW autopilot");
    }
}
