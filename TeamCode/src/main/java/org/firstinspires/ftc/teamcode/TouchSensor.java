package org.firstinspires.ftc.teamcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.qualcomm.hardware.rev.Rev2mDistanceSensor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;


/**
 * {@link TouchSensor} illustrates how to use the REV Robotics
 * Time-of-Flight Range Sensor.
 *
 * The op mode assumes that the range sensor is configured with a name of "sensor_range".
 *
 * Use Android Studio to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 *
 * @see <a href="http://revrobotics.com">REV Robotics Web Page</a>
 */
@TeleOp(name="DistanceSensor", group="11697")

public class TouchSensor extends LinearOpMode {

    private Rev2mDistanceSensor sensorRange;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void runOpMode() {
        // you can use this as a regular DistanceSensor.
        sensorRange = hardwareMap.get(Rev2mDistanceSensor.class, "imu");

        // you can also cast this to a Rev2mDistanceSensor if you want to use added
        // methods associated with the Rev2mDistanceSensor class.
        Rev2mDistanceSensor sensorTimeOfFlight = (Rev2mDistanceSensor)sensorRange;

        telemetry.addData(">>", "Press start to continue");
        telemetry.update();

        waitForStart();

        float i = 0;

        while(opModeIsActive()) {
            // generic DistanceSensor methods.
            telemetry.addData("deviceName",sensorRange.getDeviceName() );
            telemetry.addData("range", String.format("%.01f mm", sensorRange.getDistance(DistanceUnit.MM)));
            telemetry.addData("range", String.format("%.01f cm", sensorRange.getDistance(DistanceUnit.CM)));
            telemetry.addData("range", String.format("%.01f m", sensorRange.getDistance(DistanceUnit.METER)));
            telemetry.addData("range", String.format("%.01f in", sensorRange.getDistance(DistanceUnit.INCH)));

            // Rev2mDistanceSensor specific methods.
//            telemetry.addData("ID", String.format("%x", sensorTimeOfFlight.getModelID()));
//            telemetry.addData("did time out", Boolean.toString(sensorTimeOfFlight.didTimeoutOccur()));
            telemetry.addData("time", String.format("%.01f ", i));
            i++;
            telemetry.update();
        }
    }

}