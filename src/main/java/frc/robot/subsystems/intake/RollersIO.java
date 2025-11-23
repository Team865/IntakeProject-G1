package frc.robot.subsystems.intake;
public interface RollersIO {
	@AutoLog
	pubic class RollerIOInputs{
		boolean connected = false;
		float currentAmps = 0.0;
		float currentVolts = 0.0;
		float positionRads = 0.0;
		float speedRads = 0.0;
	}

	private void updateInputs(RollerIOInputsAutoLogged inputs)();

	private static void setVolts(int volts);

	private static void setAmps(int amps);
}

