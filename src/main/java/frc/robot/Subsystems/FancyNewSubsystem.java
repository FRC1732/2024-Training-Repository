// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class FancyNewSubsystem extends SubsystemBase {
  private CANSparkMax myMotor;
  /** Creates a new FancyNewSubsystem. */
  public FancyNewSubsystem() {
    myMotor=new CANSparkMax(Constants.EXAMPLE_MOTOR_CAN_ID, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
public void runForward(){

}

public void runBackward(){

}

public void stop(){

}
}
