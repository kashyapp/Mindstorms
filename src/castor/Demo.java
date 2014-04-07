package castor;

import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;
import lejos.util.Delay;

/**
 * User: kashyapp
 * Date: 06/04/14
 */
public class Demo {
    public static void main(String[] args) {
        NXTRegulatedMotor mLeft = Motor.B;
        NXTRegulatedMotor mRght = Motor.C;

        //fwd
        mLeft.rotate(4 * 360, true);
        mRght.rotate(4 * 360);

        //rotate
        mLeft.rotate(4 * 360, true);
        mRght.rotate(-4 * 360);

        //arc
        mLeft.setSpeed(180);
        mRght.setSpeed(360);
        mLeft.forward();
        mRght.forward();

        Delay.msDelay(8000);
        mLeft.flt();
        mRght.flt();
    }
}
