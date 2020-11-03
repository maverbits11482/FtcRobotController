package org.firstinspires.ftc.teamcode;
//hi aditya you shouldn't use sparknotes
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
public class GeorgeSimpleOpMode extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData(">>","press start");
        telemetry.update();

        this.waitForStart();

        if(this.opModeIsActive()){

            while (this.opModeIsActive()){

                    telemetry.addData("runtime:", this.getRuntime());
                    telemetry.update();
            }
        }
    }
}
