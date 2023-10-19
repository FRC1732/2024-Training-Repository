package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MoveForwardBack extends SubsystemBase {
    
    private CANSparkMax motor11;

    public void periodic() {
        
    }

    public MoveForwardBack() {
        motor11 = new CANSparkMax(Constants.EXAMPLE_MOTOR_CAN_ID, CANSparkMax.MotorType.kBrushless);
    }

    public void moveForward() {
        motor11.set(Constants.EXAMPLE_FORWARD_SPEED);

    }

    public void moveBack() {
        motor11.set(Constants.EXAMPLE_BACKWARD_SPEED);

    }

    public void stop() {
        motor11.set(0);
    }
}
