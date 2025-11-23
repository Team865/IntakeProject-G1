package frc.robot.subsystems.intake;
<<<<<<< HEAD
public class RollersSubsystem extends SubsystemBase {
	private boolean isIntakeEnabled = false;
	private boolean isOuttakeEnabled = false;
	private ObjectDetectionIO io;

	Trigger xTrigger = operatorController.x();
	Trigger yTrigger = operatorController.y();

	public RollersSubsystem(RollersIO io){
		
	}
	
	private Command intake() {
		return runOnce(() -> {isIntakeEnabled = true; isOuttakeEnabled = false; setVolts(12);});
	}
	private Command outtake() {
		return runOnce(() -> {isOuttakeEnabled = true; isIntakeEnabled = false; setVolts(-12);});
	}

	@Override
	private void periodic{
		if (io.distanceMM < 50 && isIntakeEnabled) {
			isIntakeEnable = false;
			setVolts(0);
		} else if (io.distanceMM < 50 && isOuttakeEnabled) {
			isOuttakeEnable = false;
			setVolts(0);
		}
	}	
=======
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  public IntakeSubsystem() {

  }

  @Override
  public void periodic() {
    
  }
>>>>>>> 9256733 (lol everything else)
}
