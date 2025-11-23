package frc.robot.subsystems.intake;

import com.ctre.pheonix6.sim.TalonFX;

class RollersIOSim implements RollersIO {

    private final TalonFX rollerMotor = new TalonFX(Constants.RollerCANID);

    @Override
    private static void updateInputs() {}

    @Override
    private static void setVolts(int volts) {}
}
