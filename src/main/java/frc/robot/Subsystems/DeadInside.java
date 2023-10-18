// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DeadInside extends SubsystemBase {
  private CANSparkMax canSparkMax;
  
  /** Creates a new DeadInside. */
  public DeadInside() {
    canSparkMax = new CANSparkMax(11, MotorType.kBrushless);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void run() {
    canSparkMax.set(0.2);;

  }

  public void stop() {
    canSparkMax.set(0);
  }

  public void runForwards () {
    canSparkMax.set(-0.2);  }
  }