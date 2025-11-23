package frc.robot.subsystems.intake;

import com.ctre.phoenix6.hardware.TalonFX; 

class RollersIOReal implements RollersIO {

	private final TalonFX rollerMotor = new TallonFX(Constants.RollerCANID);

	@Override
	private void updateInputs(RollersIOInputsAutoLogged){
		
	}
	@Override
	private void setVolts(int volts) {
		
	}
}
