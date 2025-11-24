package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private boolean isIntakeEnabled = false;
    private boolean isOuttakeEnabled = false;
    private ObjectDetectionIO io;

    IntakeSubsystem(IntakeIO io) {}

    public Command intake() {
        return runOnce(() -> {
            isIntakeEnabled = true;
            isOuttakeEnabled = false;
            setVolts(12);
        });
    }

    public Command outtake() {
        return runOnce(() -> {
            isOuttakeEnabled = true;
            isIntakeEnabled = false;
            setVolts(-12);
        });
    }

    @Override
    private void periodic() {
        if (io.distanceMM < 50 && isIntakeEnabled) {
            isIntakeEnabled = false;
            setVolts(0);
        } else if (io.distanceMM < 50 && isOuttakeEnabled) {
            isOuttakeEnabled = false;
            setVolts(0);
        }
    }
}
