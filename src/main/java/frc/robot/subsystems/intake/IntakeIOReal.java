package frc.robot.subsystems.intake;

import com.ctre.phoenix6.hardware.TalonFX;

class IntakeIOReal implements IntakeIO {

    private final TalonFX intakeMotor = new TalonFX(Constants.IntakeCANID);

    @Override
    private void updateInputs() {}

    @Override
    private void setVolts(int volts) {}
}
