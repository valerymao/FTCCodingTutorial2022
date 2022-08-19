package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Iterator;
//import org.json.JSONArray;
//import org.json.JSONObject;

@TeleOp(name="CRServoDemo", group="11697")

public class CRServo extends LinearOpMode {

    Hardware robot = new Hardware();

    @Override
    public void runOpMode() throws InterruptedException {

//
//        try {
//
//        }

        robot.init(hardwareMap);
        telemetry.addData(">", "ready to start");
        telemetry.update();
        waitForStart();

        telemetry.addData(">", "start servo in half second");
        telemetry.update();
        sleep(500);

        robot.CRServo1.setPower(1);
        telemetry.addData("Power:", "1" );
        telemetry.update();

        telemetry.addData(">", "run for 2 seconds");
        telemetry.update();
        sleep(2000);

        robot.CRServo1.setPower(0);
        telemetry.addData(">", "stop servo");
        telemetry.update();



    }
}
