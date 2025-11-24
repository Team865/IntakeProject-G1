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

    public void updateInputs(IntakeIOInputsAutoLogged inputs) {}

    public void setVolts(int volts) {}

    public void setAmps(int amps) {}
}
