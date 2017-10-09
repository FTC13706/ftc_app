package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Jonah Rolfness on 10/8/2017.
 */

@TeleOp (name = "TeleOP Tutorial" , group = "Tutorials")
public class Test_DriveTrain extends LinearOpMode
{
    private DcMotor motorLeft1;
    private DcMotor motorLeft2;
    private DcMotor motorRight1;
    private DcMotor motorRight2;

    @Override
    public void runOpMode () throws InterruptedException
    {

        motorLeft1 = hardwareMap.dcMotor.get("motorLeft1");
        motorLeft2 = hardwareMap.dcMotor.get("motorLeft2");
        motorRight1 = hardwareMap.dcMotor.get("motorRight");
        motorRight2 = hardwareMap.dcMotor.get("motorRight1");

        motorLeft1.setDirection(DcMotor.Direction.REVERSE);
        motorLeft2.setDirection(DcMotor.Direction.REVERSE);
     waitForStart();

        while(opModeIsActive())
        {
            motorLeft1.setPower(-gamepad1.left_stick_y);
            motorLeft2.setPower(-gamepad1.left_stick_y);
            motorRight1.setPower(-gamepad1.right_stick_y);
            motorRight2.setPower(-gamepad1.right_stick_y);

            idle();
        }
    }
}
