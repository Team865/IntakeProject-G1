package frc.robot.subsystems.intake;

import com.ctre.phoenix6.hardware.core.CoreTalonFX;
import com.ctre.phoenix6.sim.TalonFXSimState;

class IntakeIOSim implements IntakeIO {

    public final CoreTalonFX intakeMotorSim = new CoreTalonFX(Constants.IntakeCANID);
    public final TalonFXSimState intakeMotorSimState = new TalonFXSimState(intakeMotorSim);

    @Override
    public void updateInputs() {}

    @Override
    public void setVolts(double volts) {
        intakeMotorSimState.setSupplyVoltage(volts);
    }
}
