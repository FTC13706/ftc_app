package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Team Paradise on 12/14/2017.
 */

@TeleOp (name = "SensorStuff" , group = "Main" )
public class SensorStuff extends LinearOpMode
{
    private DcMotor motorLeftDrive1;
    private DcMotor motorLeftDrive2;
    private DcMotor motorRightDrive1;
    private DcMotor motorRightDrive2;
    private DcMotor motorStrafe;
    private DcMotor motorLeftLift;
    private DcMotor motorRightLift;
    private DcMotor motorRelicArm;
    private TouchSensor touchSensor;

    @Override
    public void runOpMode () throws InterruptedException
    {

        motorLeftDrive1 = hardwareMap.dcMotor.get("motorLeftDrive1");
        motorLeftDrive2 = hardwareMap.dcMotor.get("motorLeftDrive2");
        motorRightDrive1 = hardwareMap.dcMotor.get("motorRightDrive1");
        motorRightDrive2 = hardwareMap.dcMotor.get("motorRightDrive2");
        motorStrafe = hardwareMap.dcMotor.get("motorStrafe");
        motorLeftLift = hardwareMap.dcMotor.get("motorLeftLift");
        motorRightLift = hardwareMap.dcMotor.get("motorRightLift");
        motorRelicArm = hardwareMap.dcMotor.get("motorRelicArm");
        touchSensor = hardwareMap.touchSensor.get("touchSensor");

        while(1==1)
        {
            if (touchSensor.isPressed()) {
                motorLeftDrive1.setPower(1);
                motorLeftDrive2.setPower(1);
                motorRightDrive1.setPower(1);
                motorRightDrive2.setPower(1);
            } else {
                motorLeftDrive1.setPower(0);
                motorLeftDrive2.setPower(0);
                motorRightDrive1.setPower(0);
                motorRightDrive2.setPower(0);
            }
        }
    }
}

