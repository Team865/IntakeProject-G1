package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private boolean isIntakeEnabled = false;
    private boolean isOuttakeEnabled = false;
    private ObjectDetectionIO objectIO;
    private IntakeIO io;

    IntakeSubsystem(IntakeIO io) {
    	this.io = io;
    }

    public Command intake() {
        return runOnce(() -> {
            isIntakeEnabled = true;
            isOuttakeEnabled = false;
            i9o.setVolts(12);
        });
    }

    public Command outtake() {
        return runOnce(() -> {
            isOuttakeEnabled = true;
            isIntakeEnabled = false;
            io.setVolts(-12);
        });
    }

    @Override
    private void periodic() {
        if (io.distanceMM < 50 && isIntakeEnabled) {
            isIntakeEnabled = false;
            io.setVolts(0);
        } else if (io.distanceMM < 50 && isOuttakeEnabled) {
            isOuttakeEnabled = false;
            io.setVolts(0);
        }
    }
}
