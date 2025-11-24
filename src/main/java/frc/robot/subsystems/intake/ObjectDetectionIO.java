package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.Timer;
import org.littletonrobotics.junction.AutoLog;

public class ObjectDetectionIO {
    @AutoLog
    public static class ObjectDetectionIOInputs {
        public double distanceMM = 0;
    }

    public ObjectDetectionIO() {}

    public void updateInputs(ObjectDetectionIOInputs inputs) {
        double timestampSeconds = Timer.getFPGATimestamp();

        inputs.distanceMM = 100 * Math.pow(Math.sin(timestampSeconds / 4 * Math.PI), 2);
    }
}
