package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;



public class EpicNewSub extends SubsystemBase{
    private CANSparkMax canSparkMax;
    private CANSparkMax canSparkMax2;
    private ShuffleboardTab epicTab;
    private double setPoint;
    private double setPoint2;
    public EpicNewSub() {
        canSparkMax = new CANSparkMax(Constants.EXAMPLE_MOTOR_CAN_ID, CANSparkMax.MotorType.kBrushless);
        canSparkMax2 = new CANSparkMax(Constants.EXAMPLE_SECOND_MOTOR_CAN_ID, CANSparkMax.MotorType.kBrushless);
        setPoint = 0;
        setPoint2 = 0;
        setUpShuffleboard();
    }

    
    @Override
    public void periodic(){
        //method called once per scheduler run
    }
    
    public void runForwardAll() {
        canSparkMax.set(Constants.EXAMPLE_FORWARD_SPEED);
        setPoint = Constants.EXAMPLE_FORWARD_SPEED;
        canSparkMax2.set(Constants.EXAMPLE_FORWARD_SPEED);
        setPoint2 = Constants.EXAMPLE_FORWARD_SPEED;
    }

    public void runBackwardAll() {
        canSparkMax.set(Constants.EXAMPLE_BACKWARD_SPEED);
        setPoint = Constants.EXAMPLE_BACKWARD_SPEED;
        canSparkMax2.set(Constants.EXAMPLE_BACKWARD_SPEED);
        setPoint2 = Constants.EXAMPLE_BACKWARD_SPEED;
    }

    public void turnLeft(){
        canSparkMax.set(Constants.EXAMPLE_BACKWARD_SPEED);
        setPoint = Constants.EXAMPLE_BACKWARD_SPEED;
        canSparkMax2.set(Constants.EXAMPLE_FORWARD_SPEED);
        setPoint2 = Constants.EXAMPLE_FORWARD_SPEED;
    }
    public void turnRight(){
        canSparkMax.set(Constants.EXAMPLE_FORWARD_SPEED);
        setPoint = Constants.EXAMPLE_FORWARD_SPEED;
        canSparkMax2.set(Constants.EXAMPLE_BACKWARD_SPEED);
        setPoint2 = Constants.EXAMPLE_BACKWARD_SPEED;
    }

    public void stop() {
        canSparkMax.set(0);
        canSparkMax2.set(0);
        setPoint = 0;
        setPoint2 = 0;

    }
    public double getSetPoint() {
        return setPoint;
    }
    public double getSetPoint2() {
        return setPoint2;
    }

    public void setUpShuffleboard() {
        ShuffleboardTab epicTab;
        epicTab = Shuffleboard.getTab("Epic New Subsystem");
        epicTab.addDouble("Setpoint", () -> getSetPoint());
        epicTab.addDouble("Setpoint2", () -> getSetPoint2());
        epicTab.addDouble("VelocityL", () -> canSparkMax.getEncoder().getVelocity());
        epicTab.addDouble("VelocityR", () -> canSparkMax2.getEncoder().getVelocity());
    }
}
