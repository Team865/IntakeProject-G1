package frc.robot.subsystems.intake;

import com.ctre.phoenix6.hardware.core.CoreTalonFX;
import com.ctre.phoenix6.sim.TalonFXSimState;

class IntakeIOSim implements IntakeIO {

    private final CoreTalonFX intakeMotorSim = new CoreTalonFX(Constants.IntakeCANID);
    private final TalonFXSimState intakeMotorSimState = new TalonFXSimState(intakeMotorSim);

    @Override
    private void updateInputs() {}

    @Override
    private void setVolts(double volts) {
        rollerMotorSimState.setSupplyVoltage(volts);
    }
}
