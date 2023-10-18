package frc.robot.Subsystems;

import java.util.function.DoubleSupplier;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;



public class ExampleSubsystem extends SubsystemBase{
    
    private CANSparkMax exampleMotor;
    private ShuffleboardTab exampleTab;
    private double setPoint;

    public ExampleSubsystem() {
        exampleMotor = new CANSparkMax(Constants.EXAMPLE_MOTOR_CAN_ID, CANSparkMax.MotorType.kBrushless);
        setPoint = 0;
        setUpShuffleboard();
    }

    public void runForward() {
        exampleMotor.set(Constants.EXAMPLE_FORWARD_SPEED);
        setPoint = Constants.EXAMPLE_FORWARD_SPEED;
    }

    public void runBackward() {
        exampleMotor.set(Constants.EXAMPLE_BACKWARD_SPEED);
        setPoint = Constants.EXAMPLE_BACKWARD_SPEED;
    }

    public void stop() {
        exampleMotor.set(0);
        setPoint = 0;
    }

    public double getSetPoint() {
        return setPoint;
    }

    public void setUpShuffleboard() {
        ShuffleboardTab exampleTab;
        exampleTab = Shuffleboard.getTab("Example Subsystem");
        exampleTab.addDouble("Setpoint", () -> getSetPoint());
        exampleTab.addDouble("Velocity", () -> exampleMotor.getEncoder().getVelocity());
    }
}