package frc.robot.subsystems.intake;

import com.ctre.phoenix6.hardware.TalonFX;

class RollersIOReal implements RollersIO {

<<<<<<< HEAD
    private final TalonFX rollerMotor = new TalonFX(Constants.RollerCANID);
=======
	private final TalonFX rollerMotor = new TalonFX(Constants.RollerCANID);
>>>>>>> bba0f91 (fixed typo)

    @Override
    private void updateInputs() {}

    @Override
    private void setVolts(int volts) {}
}
