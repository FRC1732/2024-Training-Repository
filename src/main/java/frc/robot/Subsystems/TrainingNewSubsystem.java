// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TrainingNewSubsystem extends SubsystemBase {
  private CANSparkMax canSparkMax;

  /** Creates a new TrainingNewSubsystem. */
  public TrainingNewSubsystem() {
    canSparkMax = new CANSparkMax(10, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void runforward() {
    //run motor forward
    canSparkMax.set( .20);
  
  }
  public void stop() {
    canSparkMax.stopMotor();
  }
  public void reverse() {
    canSparkMax.set(-.20);
  }
}
