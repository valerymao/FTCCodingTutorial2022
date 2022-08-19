package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.hardware.rev.Rev2mDistanceSensor;

public class Hardware  {

    public CRServo CRServo1;                  //  Hub port 0     CRServo1
    //    public Servo Servo1;                      //  Hub port 1     Servo1
    public Rev2mDistanceSensor DSensor1;           //  I2C port 0     imu

    HardwareMap hwMap;
    private ElapsedTime period  = new ElapsedTime();

    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;

        CRServo1         = hwMap.get(CRServo.class, "CRServo1");
//        Servo1         = hwMap.get(Servo.class, "Servo1");
        DSensor1        = hwMap.get(Rev2mDistanceSensor.class, "DSensor");
    }


}




