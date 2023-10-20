package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MoveForwardBack extends SubsystemBase {

    private CANSparkMax motor11;
    private double setPoint;
    private ShuffleboardTab shuffleBoardTab;

    public void periodic() {

    }

    public MoveForwardBack() {
        motor11 = new CANSparkMax(Constants.EXAMPLE_MOTOR_CAN_ID, CANSparkMax.MotorType.kBrushless);
        setUpShuffleBoard();
    }

    public double getSetPoint() {
        return setPoint;
    }

    public void moveForward() {
        motor11.set(Constants.EXAMPLE_FORWARD_SPEED);
        setPoint = Constants.EXAMPLE_FORWARD_SPEED;

    }

    public void moveBack() {
        motor11.set(Constants.EXAMPLE_BACKWARD_SPEED);
        setPoint = Constants.EXAMPLE_BACKWARD_SPEED;
    }

    public void stop() {
        motor11.set(0);
        setPoint = 0;
    }

    private void setUpShuffleBoard() {
        shuffleBoardTab = Shuffleboard.getTab("Leo's Fancy Subsytem");
        shuffleBoardTab.addDouble("Set Point", () -> getSetPoint());
        shuffleBoardTab.addDouble("Velocity", () -> motor11.getEncoder().getVelocity());

    }
}
