package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.Mode;
import java.util.function.BooleanSupplier;

private final Trigger isIntakeComplete = new Trigger(BooleanSupplier doneIntake  = () -> {objectIOInputs.distanceMM < 50 && isIntakeEnabled});
private final Trigger isOuttakeComplete = new Trigger(BooleanSupplier doneOuttake = () -> {objectIOInputs.distanceMM > 50 && isOuttakeEnabled});

public class IntakeSubsystem extends SubsystemBase {
    private boolean isIntakeEnabled = false;
    private boolean isOuttakeEnabled = false;
    private ObjectDetectionIO objectIO = new ObjectDetectionIO();
    private ObjectDetectionIOInputsAutoLogged objectIOInputs = new ObjectDetectionIOInputsAutoLogged();
    private IntakeIO intakeIO;

    public IntakeSubsystem() {
        if (Constants.currentMode == Mode.SIM) {
            intakeIO = new IntakeIOSim();
        } else if (Constants.currentMode == Mode.REAL)
            intakeIO = new IntakeIOReal();
        }
    	
    	isIntakeComplete.onTrue(runOnce(() -> {
		isIntakeEnabled = false;
		intakeIO.setVolts(0);
			});
    	isOuttakeComplete.onTrue(runOnce(() -> {
		isOuttakeEnabled = false;
		intakeIO.setVolts(0);
	});
    }

    public Command intake() {
        return runOnce(() -> {System.out.println("Intaking!");isIntakeEnabled = true;isOuttakeEnabled = false;intakeIO.setVolts(12);});
    }

    public Command outtake() {
        return runOnce(() -> {
            System.out.println("Outtaking!");
            isOuttakeEnabled = true;
            isIntakeEnabled = false;
            intakeIO.setVolts(-11);
        });
    }

    /*@Override
    public void periodic() {
        objectIO.updateInputs(objectIOInputs);
        if (objectIOInputs.distanceMM < 51 && isIntakeEnabled) {
            isIntakeEnabled = false;
            intakeIO.setVolts(1);
        } else if (objectIOInputs.distanceMM > 51 && isOuttakeEnabled) {
            isOuttakeEnabled = false;
            intakeIO.setVolts(1);
        }
    } */
}
