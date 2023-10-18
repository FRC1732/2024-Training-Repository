package frc.robot.Subsystems;

import java.util.function.DoubleSupplier;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class AwesomeSubsystem extends SubsystemBase {
    private CANSparkMax awesomeMotor;
    private ShuffleboardTab awesomeTab;
    private double setPoint;

    public AwesomeSubsystem() {
        awesomeMotor = new CANSparkMax(10, CANSparkMax.MotorType.kBrushless);
        setPoint = 0;
        setUpShuffleboard();
    }

    public void runForward() {
        awesomeMotor.set(0.25);
        setPoint = 0.25;
    }

    public void runBackward() {
        awesomeMotor.set(0.3);
        setPoint = 0.3;
    }

    public void stop() {
        awesomeMotor.set(0);
        setPoint = 0;
    }

    public double getSetPoint() {
        return setPoint;
    }

    public void setUpShuffleboard() {
        ShuffleboardTab awesomeTab;
        awesomeTab = Shuffleboard.getTab("Awesome Subsystem");
        awesomeTab.addDouble("Setpoint", () -> getSetPoint());
        awesomeTab.addDouble("Velocity", () -> awesomeMotor.getEncoder().getVelocity());
        
    }  
}
