package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Jonah Rolfness on 10/8/2017.
 * Documented by Ben Rheinfelder on 12/12/17.
 */

@TeleOp (name = "Forky TeleOp4" , group = "Main")
public class Forky_Documented extends LinearOpMode
{
    private DcMotor motorLeftDrive1;                                        //inserting new private classes into LinearOp to define connected motors
    private DcMotor motorLeftDrive2;
    private DcMotor motorRightDrive1;
    private DcMotor motorRightDrive2;
    private DcMotor motorStrafe;
    private DcMotor motorLeftLift;
    private DcMotor motorRightLift;
    private DcMotor motorRelicArm;
    private Servo jewelServo;
    private Servo leftArmServo;
    private Servo rightArmServo;

    @Override
    public void runOpMode () throws InterruptedException
    {

        motorLeftDrive1 = hardwareMap.dcMotor.get("motorLeftDrive1");       //assigning Names to Motors and servo
        motorLeftDrive2 = hardwareMap.dcMotor.get("motorLeftDrive2");
        motorRightDrive1 = hardwareMap.dcMotor.get("motorRightDrive1");
        motorRightDrive2 = hardwareMap.dcMotor.get("motorRightDrive2");
        motorStrafe = hardwareMap.dcMotor.get("motorStrafe");
        motorLeftLift = hardwareMap.dcMotor.get("motorLeftLift");
        motorRightLift = hardwareMap.dcMotor.get("motorRightLift");
        motorRelicArm = hardwareMap.dcMotor.get("motorRelicArm");
        jewelServo = hardwareMap.servo.get ("jewelServo");
        leftArmServo = hardwareMap.servo.get ("leftArmServo");
        rightArmServo = hardwareMap.servo.get ("rightArmServo");

        motorLeftDrive1.setDirection(DcMotor.Direction.REVERSE);            //Reversing Motors' default direction because they are flipped on the robot.
        motorLeftDrive2.setDirection(DcMotor.Direction.REVERSE);
     waitForStart();                                                        //Wait until Robot starts

        while(opModeIsActive())
        {
            motorLeftDrive1.setPower(gamepad1.left_stick_y);                //mapping the left Motors to the left joystick y-axis on gamepad 1
            motorLeftDrive2.setPower(gamepad1.left_stick_y);
            motorRightDrive1.setPower(gamepad1.right_stick_y);              //mapping the Right Motors to the right joystick y-axis on gamepad 1
            motorRightDrive2.setPower(gamepad1.right_stick_y);
            motorStrafe.setPower(-gamepad1.left_stick_x);                   //mapping strafe motors to x-axis on both joysticks on gamepad 1
            motorStrafe.setPower(-gamepad1.right_stick_x);
            motorLeftLift.setPower(-gamepad2.left_stick_y);                 //mapping lift motors to left stick y-axis on gamepad 2
            motorRightLift.setPower(-gamepad2.left_stick_y);
            if (gamepad2.right_stick_y > 0) {
                leftArmServo.setPosition(gamepad2.right_stick_y); }
            else {
                leftArmServo.setPosition(0); }

            if (gamepad2.right_stick_y > 0) {
                rightArmServo.setPosition(gamepad2.right_stick_y); }
            else {
                rightArmServo.setPosition(0); }




            idle();                                                         //Idle until a command is given
        }
    }
}
