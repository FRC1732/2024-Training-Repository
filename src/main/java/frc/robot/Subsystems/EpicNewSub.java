package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;



public class EpicNewSub extends SubsystemBase{
    private CANSparkMax canSparkMax;
    private CANSparkMax canSparkMax2;
    public EpicNewSub() {
        canSparkMax = new CANSparkMax(Constants.EXAMPLE_MOTOR_CAN_ID, CANSparkMax.MotorType.kBrushless);
        canSparkMax2 = new CANSparkMax(Constants.EXAMPLE_SECOND_MOTOR_CAN_ID, CANSparkMax.MotorType.kBrushless);
    }

    
    @Override
    public void periodic(){
        //method called once per scheduler run
    }
    
    public void runForwardAll() {
        canSparkMax.set(Constants.EXAMPLE_FORWARD_SPEED);
        canSparkMax2.set(Constants.EXAMPLE_FORWARD_SPEED);
    }

    public void runBackwardAll() {
        canSparkMax.set(Constants.EXAMPLE_BACKWARD_SPEED);
        canSparkMax2.set(Constants.EXAMPLE_BACKWARD_SPEED);
    }

    public void turnLeft(){
        canSparkMax.set(Constants.EXAMPLE_BACKWARD_SPEED);
        canSparkMax2.set(Constants.EXAMPLE_FORWARD_SPEED);
    }
    public void turnRight(){
        canSparkMax.set(Constants.EXAMPLE_FORWARD_SPEED);
        canSparkMax2.set(Constants.EXAMPLE_BACKWARD_SPEED);
    }

    public void stop() {
        canSparkMax.set(0);
        canSparkMax2.set(0);
    }
}
