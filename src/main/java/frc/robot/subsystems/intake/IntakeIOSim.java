package frc.robot.subsystems.intake;

import com.ctre.phoenix6.hardware.core.CoreTalonFX;
import com.ctre.phoenix6.sim;

class RollersIOSim implements RollersIO {

    private final CoreTalonFX rollerMotorSim = new CoreTalonFX(Constants.RollerCANID);
    private final TalonFXSimState rollerMotorSimState = new TalonFXSimState(rollerMotorSim);

    @Override
    private void updateInputs() {}

    @Override
    private void setVolts(double volts) {
        rollerMotorSimState.setSupplyVoltage(volts);
    }
}
