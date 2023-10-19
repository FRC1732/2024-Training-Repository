// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.fasterxml.jackson.core.util.DefaultIndenter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Commands.ForwardBackCommand;
import frc.robot.Subsystems.MoveForwardBack;

public class RobotContainer {
  private MoveForwardBack MoveForwardBack;

  private Joystick joystick0;

  private Trigger trigger0;

  public RobotContainer() {
    defineSubsystems();
    configureButtonBindings();

    trigger0.whileTrue(new ForwardBackCommand(MoveForwardBack));
  }

  private void configureButtonBindings() {
    joystick0 = new Joystick(0);

    trigger0 = new Trigger(() -> joystick0.getRawButton(1));
  }

  private void defineSubsystems() {
    MoveForwardBack = new MoveForwardBack();
  }

  public Command getAutonomousCommand() {
    return new InstantCommand(() -> MoveForwardBack.moveForward())
        .andThen(new WaitCommand(2))
        .andThen(new InstantCommand(() -> MoveForwardBack.stop()));
  }

}
