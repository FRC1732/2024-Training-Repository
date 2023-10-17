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
    private double speed;

    public ExampleSubsystem() {
        exampleMotor = new CANSparkMax(Constants.EXAMPLE_MOTOR_CAN_ID, CANSparkMax.MotorType.kBrushless);
        speed = 0;
        setUpShuffleboard();
    }

    public void runForward() {
        exampleMotor.set(Constants.EXAMPLE_FORWARD_SPEED);
        speed = Constants.EXAMPLE_FORWARD_SPEED;
    }

    public void runBackward() {
        exampleMotor.set(Constants.EXAMPLE_BACKWARD_SPEED);
        speed = Constants.EXAMPLE_BACKWARD_SPEED;
    }

    public void stop() {
        exampleMotor.set(0);
        speed = 0;
    }

    public void setUpShuffleboard() {
        ShuffleboardTab exampleTab;
        exampleTab = Shuffleboard.getTab("Example Subsystem");
        exampleTab.addDouble("Speed", () -> exampleMotor.getEncoder().getVelocity());
    }
}