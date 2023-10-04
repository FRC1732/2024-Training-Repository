package frc.robot.Subsystems;

import java.time.Period;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class CoolNewSubsystem extends SubsystemBase{
    
    private CANSparkMax coolMotor;

    public CoolNewSubsystem(){
        coolMotor = new CANSparkMax(Constants.COOL_NEW_MOTOR__CAN_ID, CANSparkMax.MotorType.kBrushless);
    }

    public void periodic(){
        // Periodic code here
    }

    public void runForward(){
        coolMotor.set(Constants.COOL_NEW_FORWARD_SPEED);
    }

    public void runBackward(){
        coolMotor.set(Constants.COOL_NEW_BACKWARD_SPEED);
    }

    public void stop(){
        coolMotor.set(0.0);
    }
}
