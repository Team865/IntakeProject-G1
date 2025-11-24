package frc.robot.subsystems.intake;
import org.littletonrobotics.junction.AutoLog;

public interface IntakeIO {
    @AutoLog
    public class IntakeIOInputs {
        boolean connected = false;
        double currentAmps = 0.0;
        double currentVolts = 0.0;
        double positionRads = 0.0;
        double speedRads = 0.0;
    }

    private void updateInputs(IntakeIOInputsAutoLogged inputs) {};

    private void setVolts(int volts) {};

    private void setAmps(int amps) {};
}
