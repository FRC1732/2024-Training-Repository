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

public class TrainingNewSubsystem extends SubsystemBase {
  
  private CANSparkMax canSparkMax;
  private double setPoint;
  
  private ShuffleboardTab shuffleboardTab;
  
  /** Creates a new TrainingNewSubsystem. */
  public TrainingNewSubsystem() {
    canSparkMax = new CANSparkMax(10, MotorType.kBrushless);
    setPoint = 0;
    setUpShuffleboard();
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
  public void runforward() {
    // run motor forward
    canSparkMax.set(.20);
    setPoint = .2;
    
  }

  public void stop() {
    canSparkMax.stopMotor();
    setPoint = 0;
  }
  
  public void reverse() {
    canSparkMax.set(-.20);
    setPoint = -.2;
  }

  public double getSetPoint() {
    return setPoint;
  }

  public void setUpShuffleboard() {
    ShuffleboardTab trainingTab;
    trainingTab = Shuffleboard.getTab("Training Subsystem");
    trainingTab.addDouble("Setpoint", () -> getSetPoint());
    trainingTab.addDouble("Velocity", () -> canSparkMax.getEncoder().getVelocity(  ));
  }
}
