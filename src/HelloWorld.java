import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;
import lejos.util.Delay;

public class HelloWorld {
    public static void main(String[] args) {
        NXTRegulatedMotor motor = Motor.A;

        int t0 = motor.getTachoCount();
        System.out.println(t0);

        Button.waitForAnyPress();

        motor.setSpeed(360);
        motor.forward();
        Delay.msDelay(2000);
        int t1 = motor.getTachoCount();
        System.out.println(t1 + " " + (t1 - t0));

        motor.stop();
        int t2 = motor.getTachoCount();
        System.out.println(t2 + " " + (t2 - t0));

        Button.waitForAnyPress();
    }
}
