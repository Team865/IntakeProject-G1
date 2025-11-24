package frc.robot.subsystems.intake;

import com.ctre.phoenix6.hardware.TalonFX;

class IntakeIOReal implements IntakeIO {

    public final TalonFX intakeMotor = new TalonFX(Constants.IntakeCANID);

    @Override
    public void updateInputs() {}

    @Override
    public void setVolts(int volts) {}
}
