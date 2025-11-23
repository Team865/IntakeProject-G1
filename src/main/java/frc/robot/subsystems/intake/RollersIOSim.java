package frc.robot.subsystems.intake;

<<<<<<< HEAD
public class RollersIOSim implements RollersIO {
    @Override
    private void updateInputs() {}

    @Override
    private void setSupplyVolts(int volts) {}
=======
import com.ctre.pheonix6.sim.TallonFX;

class RollersIOSim implements RollersIO {

	private final TallonFX rollerMotor = new TallonFX(Constants.RollerCANID);

	@Override
	private static void updateInputs() {
		
	}
	@Override
	private static void setVolts(int volts) {
		
	}
>>>>>>> d26359c (initalized moters and added constant RollerCANID)
}
