package frc.robot.subsystems.intake;
public interface RollersIO {

	@AutoLog
	pubic class RollerIOInputs{
		boolean conected = false;
		float curentAmps = 0.0;
		float currentVolts = 0.0;
		float positioRads = 0.0;
		float rotSpeedRadsSeconds = 0.0;
	}

	private void updateInputs(RollerIOInputsAutoLogged inputs)();

	private static void setVolts(int volts);

	private void setAmps(int amps);
	
	private static void intake();
	
	private static void outtake();
}

