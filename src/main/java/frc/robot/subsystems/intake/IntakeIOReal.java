package frc.robot.subsystems.intake;

import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants;

class IntakeIOReal implements IntakeIO {

    public final TalonFX intakeMotor = new TalonFX(Constants.IntakeCANID);

    @Override
    public void updateInputs(IntakeIOInputsAutoLogged inputs) {}

    @Override
    public void setVolts(double volts) {}

    @Override
    public void setAmps(int amps) {
    
    }
}
