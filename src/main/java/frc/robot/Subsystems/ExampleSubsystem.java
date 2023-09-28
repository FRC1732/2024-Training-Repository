package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;



public class ExampleSubsystem extends SubsystemBase{
    
    private CANSparkMax exampleMotor;

    public ExampleSubsystem() {
        exampleMotor = new CANSparkMax(Constants.EXAMPLE_MOTOR_CAN_ID, CANSparkMax.MotorType.kBrushless);
    }

    public void runForward() {
        exampleMotor.set(Constants.EXAMPLE_FORWARD_SPEED);
    }

    public void runBackward() {
        exampleMotor.set(Constants.EXAMPLE_BACKWARD_SPEED);
    }

    public void stop() {
        exampleMotor.set(0);
    }
}
