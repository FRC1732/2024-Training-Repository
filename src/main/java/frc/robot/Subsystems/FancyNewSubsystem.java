// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class FancyNewSubsystem extends SubsystemBase {
  private CANSparkMax canSparkMax;
  private double setPoint;
  private ShuffleboardTab shuffleboardTab;

  /** Creates a new FancyNewSubsystem. */
  public FancyNewSubsystem() {
    canSparkMax = new CANSparkMax(Constants.EXAMPLE_MOTOR_CAN_ID, MotorType.kBrushless);
    setUpShuffleboard();
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void runForward() {
    canSparkMax.set(Constants.EXAMPLE_FORWARD_SPEED);
    setPoint = Constants.EXAMPLE_FORWARD_SPEED;
  }

  public void runBackward() {
    canSparkMax.set(Constants.EXAMPLE_BACKWARD_SPEED);
    setPoint = Constants.EXAMPLE_BACKWARD_SPEED;
  }

  public double getSetPoint() {
    return setPoint;
  }

  public void stop() {
    setPoint = 0;
    canSparkMax.set(setPoint);
  }

  private void setUpShuffleboard() {
    shuffleboardTab = Shuffleboard.getTab("Katie");
    shuffleboardTab.addDouble("Set Point", () -> getSetPoint());
    shuffleboardTab.addDouble("Velocity", () -> canSparkMax.getEncoder().getVelocity());
  }

}
