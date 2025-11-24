package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private boolean isIntakeEnabled = false;
    private boolean isOuttakeEnabled = false;
    private ObjectDetectionIOInputsAutoLogged objectIO = new ObjectDetectionIOInputsAutoLogged();
    private IntakeIO io;

    public IntakeSubsystem() {
    }

    public Command intake() {
        return runOnce(() -> {
            isIntakeEnabled = true;
            isOuttakeEnabled = false;
            io.setVolts(12);
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
    public void periodic() {
        if (objectIO.distanceMM < 50 && isIntakeEnabled) {
            isIntakeEnabled = false;
            io.setVolts(0);
        } else if (objectIO.distanceMM < 50 && isOuttakeEnabled) {
            isOuttakeEnabled = false;
            io.setVolts(0);
        }
    }
}
