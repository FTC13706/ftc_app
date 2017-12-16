package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Jonah Rolfness on 10/8/2017.
 */

@TeleOp (name = "TeleOP Tutorial" , group = "Tutorials")
public class Test_DriveTrain extends LinearOpMode
{
    DcMotor motorLeft1 = null;
    DcMotor motorLeft2 = null;
    DcMotor motorRight1 = null;
    DcMotor motorRight2 = null;
    DcMotor motorStrafe = null;
    DcMotor motorLeftLift = null;
    DcMotor motorRightLift = null;
    DcMotor motorRelicArm = null;
    Servo jewelServo = null;
    Servo leftServoArm = null;
    Servo rightServoArm = null;


    @Override
    public void runOpMode () throws InterruptedException
    {

        motorLeft1 = hardwareMap.dcMotor.get("motorLeft1");
        motorLeft2 = hardwareMap.dcMotor.get("motorLeft2");
        motorRight1 = hardwareMap.dcMotor.get("motorRight1");
        motorRight2 = hardwareMap.dcMotor.get("motorRight2");
        motorStrafe = hardwareMap.dcMotor.get("motorStrafe");
        motorLeftLift = hardwareMap.dcMotor.get("motorLeftLift");
        motorRightLift = hardwareMap.dcMotor.get("motorRightLift");
        motorRelicArm = hardwareMap.dcMotor.get("motorRelicArm");
        leftServoArm = hardwareMap.servo.get ("leftServoArm");
        rightServoArm = hardwareMap.servo.get ("rightServoArm");


        motorLeft1.setDirection(DcMotor.Direction.REVERSE);
        motorLeft2.setDirection(DcMotor.Direction.REVERSE);

        leftServoArm.setPosition(0);
        rightServoArm.setPosition(0);

     waitForStart();

        DriveForward(1);
        Thread.sleep(5000);

        StopDriving();

        //DriveBackward(1);
        //Thread.sleep(5000);

        //StopDriving();

        //TurnLeft(1);
        //Thread.sleep(5000);

        //StopDriving();

        //TurnRight(1);
        //Thread.sleep(5000);

        //StopDriving();

        //BackwardLeft(1);
        //Thread.sleep(5000);

        //StopDriving();

        //BackwardRight(1);
        //Thread.sleep(5000);

        //StopDriving();

        //ForwardLeft(1);
        //Thread.sleep(5000);

        //StopDriving();

        //ForwardRight(1);
        //Thread.sleep(5000);

        //OpenArms();

        //CloseArms();



    }

    public void DriveForward(double power)
    {
        motorLeft1.setPower(power);
        motorLeft2.setPower(power);
        motorRight1.setPower(power);
        motorRight2.setPower(power);

    }

    public void DriveBackward(double power)
    {
        motorLeft1.setPower(-power);
        motorLeft2.setPower(-power);
        motorRight1.setPower(-power);
        motorRight2.setPower(-power);
    }

    public void TurnLeft (double power)
    {
        motorLeft1.setPower(-power);
        motorLeft2.setPower(-power);
        motorRight1.setPower(power);
        motorRight2.setPower(power);
    }

    public void TurnRight (double power)
    {
        motorLeft1.setPower(power);
        motorLeft2.setPower(power);
        motorRight1.setPower(+power);
        motorRight2.setPower(+power);
    }

    public void ForwardRight (double power)
    {
        motorLeft1.setPower(power);
        motorLeft2.setPower(power);

    }

    public void ForwardLeft (double power)
    {
        motorRight1.setPower(power);
        motorRight2.setPower(power);

    }

    public void BackwardLeft (double power)
    {
        motorLeft2.setPower(-power);
        motorLeft1.setPower(-power);

    }

    public void BackwardRight (double power)
    {
        motorRight1.setPower(-power);
        motorRight2.setPower(-power);

    }

    public void StopDriving()
    {
        DriveForward(0);

    }

    public void OpenArms ()
    {
        leftServoArm.setPosition(0);
        rightServoArm.setPosition(0);

    }

    public void CloseArms ()
    {
        leftServoArm.setPosition(1);
        rightServoArm.setPosition(1);

    }


}
