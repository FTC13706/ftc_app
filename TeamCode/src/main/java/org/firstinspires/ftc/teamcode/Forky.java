package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Jonah Rolfness on 10/8/2017.
 */

@TeleOp (name = "Forky TeleOp" , group = "Main")
public class Forky extends LinearOpMode
{
    private DcMotor motorLeftDrive1;
    private DcMotor motorLeftDrive2;
    private DcMotor motorRightDrive1;
    private DcMotor motorRightDrive2;
    private DcMotor motorStrafe;
    private DcMotor motorLeftLift;
    private DcMotor motorRightLift;
    private DcMotor motorRelicArm;
    private Servo jewelServo;
    private Servo leftServoArm;
    private Servo rightServoArm;


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
        jewelServo = hardwareMap.servo.get ("jewelServo");
        leftServoArm = hardwareMap.servo.get ("leftServoArm");
        rightServoArm = hardwareMap.servo.get ("rightServoArm");

        motorLeftDrive1.setDirection(DcMotor.Direction.REVERSE);
        motorLeftDrive2.setDirection(DcMotor.Direction.REVERSE);
     waitForStart();

        while(opModeIsActive())
        {
            motorLeftDrive1.setPower(gamepad1.right_stick_y);
            motorLeftDrive2.setPower(gamepad1.right_stick_y);
            motorRightDrive1.setPower(gamepad1.left_stick_y);
            motorRightDrive2.setPower(gamepad1.left_stick_y);
            motorStrafe.setPower(-gamepad1.left_stick_x);
            motorStrafe.setPower(-gamepad1.right_stick_x);
            motorLeftLift.setPower(-gamepad2.left_stick_y);
            motorRightLift.setPower(-gamepad2.left_stick_y);



            idle();
        }
    }
}
