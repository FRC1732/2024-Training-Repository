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
import frc.robot.Commands.ExampleCommand;
import frc.robot.Commands.TrainingNewCommand;
import frc.robot.Subsystems.ExampleSubsystem;
import frc.robot.Subsystems.TrainingNewSubsystem;

public class RobotContainer {
  public ExampleSubsystem exampleSubsystem;
  public TrainingNewSubsystem trainingNewSubsystem;
  private Joystick joystick0;

  private Trigger trigger0;
  private Trigger trigger1;

  public RobotContainer() {
    defineSubsystems();
    configureButtonBindings();

    trigger0.whileTrue(new ExampleCommand(exampleSubsystem));
    trigger1.whileTrue(new TrainingNewCommand(trainingNewSubsystem));
   
  }

  private void configureButtonBindings() {
    joystick0 = new Joystick(0);

    trigger0 = new Trigger(() -> joystick0.getRawButton(1));
    trigger1 = new Trigger(() -> joystick0.getRawButton(2));
   
  }

  private void defineSubsystems() {
    exampleSubsystem = new ExampleSubsystem();
    trainingNewSubsystem = new TrainingNewSubsystem();
  }

  public Command getAutonomousCommand() {
    return new InstantCommand(() -> exampleSubsystem.runForward())
        .andThen(new WaitCommand(2))
        .andThen(new InstantCommand(() -> exampleSubsystem.stop()));
  }

}
