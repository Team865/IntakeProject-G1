package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.Trigger;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.Mode;

public class IntakeSubsystem extends SubsystemBase {
    private boolean isIntakeEnabled = false;
    private boolean isOuttakeEnabled = false;
    private ObjectDetectionIO objectIO = new ObjectDetectionIO();
    private ObjectDetectionIOInputsAutoLogged objectIOInputs = new ObjectDetectionIOInputsAutoLogged();
    private IntakeIO intakeIO;

    private final Trigger isDetectingOuttake = new Trigger(() -> (objectIOInputs.distanceMM < 50) && (isOuttakeEnabled));
    private final Trigger isDetectingIntake = new Trigger(() -> (objectIOInputs.distanceMM < 50) && (isIntakeEnabled));

    public IntakeSubsystem() {
        if (Constants.currentMode == Mode.SIM) {
            intakeIO = new IntakeIOSim();
        } else if (Constants.currentMode == Mode.REAL){
            intakeIO = new IntakeIOReal();
        }
        isDetectingIntake.onTrue(runOnce(() -> {
	    isIntakeEnabled = false;
	    intakeIO.setVolts(0);
	}));
	isDetectingOuttake.onTrue(runOnce(() -> {
            isOuttakeEnabled = false;
            intakeIO.setVolts(0);
	}));
    }

    public Command intake() {
        return runOnce(() -> {
            System.out.println("Intaking!");
            isIntakeEnabled = true;
            isOuttakeEnabled = false;
	    intakeIO.setVolts(12);
	});
    }

    public Command outtake() {
        return runOnce(() -> {
            System.out.println("Outtaking!");
            isOuttakeEnabled = true;
            isIntakeEnabled = false;
            intakeIO.setVolts(-12);
        });
    }
    @Override
    public void periodic() {
    	objectIO.updateInputs(objectIOInputs);
    }
}
