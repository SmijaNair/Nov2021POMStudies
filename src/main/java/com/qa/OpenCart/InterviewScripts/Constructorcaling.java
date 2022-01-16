package com.qa.OpenCart.InterviewScripts;



public class Constructorcaling {
    Constructorcaling(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Constructorcaling c1 = new Constructorcaling();
        Constructorcaling c2 = new Constructorcaling();
        Constructorcaling c3 = new Constructorcaling();

    }
}
