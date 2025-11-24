package frc.robot.subsystems.intake;

import com.ctre.phoenix6.hardware.core.CoreTalonFX;
import com.ctre.phoenix6.sim.TalonFXSimState;
import frc.robot.Constants;

class IntakeIOSim implements IntakeIO {

    public final CoreTalonFX intakeMotorSim = new CoreTalonFX(Constants.IntakeCANID);
    public final TalonFXSimState intakeMotorSimState = new TalonFXSimState(intakeMotorSim);

    @Override
    public void updateInputs(IntakeIOInputsAutoLogged inputs) {
    
    }

    @Override
    public void setVolts(double volts) {
        intakeMotorSimState.setSupplyVoltage(volts);
    }

    @Override
    public void setAmps(int amps) {
    
    }
}
