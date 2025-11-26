package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.Mode;

public class IntakeSubsystem extends SubsystemBase {
    private boolean isIntakeEnabled = false;
    private boolean isOuttakeEnabled = false;
    private ObjectDetectionIOInputsAutoLogged objectIO = new ObjectDetectionIOInputsAutoLogged();
    private IntakeIO intakeIO;

    public IntakeSubsystem() {
        if (Constants.currentMode == Mode.SIM) {
            intakeIO = new IntakeIOSim();
        } else if (Constants.currentMode == Mode.REAL){
            intakeIO = new IntakeIOReal();
        }
    }

    public Command intake() {
        System.out.println("Intaking!");
        return runOnce(() -> {
            isIntakeEnabled = true;
            isOuttakeEnabled = false;
            intakeIO.setVolts(12);
        });
    }

    public Command outtake() {
        System.out.println("Outtaking!");
        return runOnce(() -> {
            isOuttakeEnabled = true;
            isIntakeEnabled = false;
            intakeIO.setVolts(-12);
        });
    }

    @Override
    public void periodic() {
        if (objectIO.distanceMM < 50 && isIntakeEnabled) {
            isIntakeEnabled = false;
            intakeIO.setVolts(0);
        } else if (objectIO.distanceMM < 50 && isOuttakeEnabled) {
            isOuttakeEnabled = false;
            intakeIO.setVolts(0);
        }
    }
}
