package frc.robot.subsystems.intake;
interface RollersIO {
	@AutoLog
	pubic class RollerIoInputs{
		boolean conected = false;
		float curentAmps = 0.0;
		float currentVolts = 0.0;
		float positioRads = 0.0;
		float rotSpeedRadsSeconds = 0.0;
	
	}

	private static void setVolts(int volts);
	
	private static void intake();
	
	private static void outtake();
}

