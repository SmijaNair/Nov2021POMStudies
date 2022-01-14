package com.qa.OpenCart.InterviewScripts;
import com.qa.OpenCart.InterviewScripts.BMW;
public class TestCar {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.start();
        b.autoParking();
        b.engine();
        b.autoPilot();

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        c.autoPilot();

        Car c1 = new BMW();
        c1.start();
        c1.stop();
        c1.autoPilot();
        c1.refuel();

      Vehicle v1 = new BMW();
      v1.methodVehichle();

    }

}
