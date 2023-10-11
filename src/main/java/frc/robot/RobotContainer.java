// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.fasterxml.jackson.core.util.DefaultIndenter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Commands.EpicNewComm;
import frc.robot.Commands.FancyNewComm;
import frc.robot.Commands.FullBackComm;
import frc.robot.Commands.NewCommand;
import frc.robot.Subsystems.EpicNewSub;
import frc.robot.Subsystems.ExampleSubsystem;
import frc.robot.Subsystems.FancyNewSub;
import frc.robot.Subsystems.ForwardBackSub;

public class RobotContainer {
  private ExampleSubsystem exampleSubsystem;
  private FancyNewSub fancyNewSub;
  private ForwardBackSub forwardBackSub;
  private EpicNewSub epicNewSub;
  private Joystick joystick0;
  private Trigger trigger3;
  private Trigger trigger2;
  private Trigger trigger1; 
  private Trigger trigger0;



  public RobotContainer() {
    defineSubsystems();
    configureButtonBindings();

    trigger0.whileTrue(new NewCommand(forwardBackSub));
    trigger1.whileTrue(new FancyNewComm(fancyNewSub));
    trigger2.whileTrue(new EpicNewComm(epicNewSub));
    trigger3.whileTrue(new FullBackComm(epicNewSub));
  }

  private void configureButtonBindings() {
    joystick0 = new Joystick(0);

    trigger1 = new Trigger(() -> joystick0.getRawButton(3));
    trigger0 = new Trigger(() -> joystick0.getRawButton(2));
    trigger2 = new Trigger(() -> joystick0.getRawButton(4));
    trigger3 = new Trigger(() -> joystick0.getRawButton(1));
   

  }

  private void defineSubsystems() {
    exampleSubsystem = new ExampleSubsystem();
    forwardBackSub = new ForwardBackSub();
    fancyNewSub = new FancyNewSub();
    epicNewSub = new EpicNewSub();

  }

  

    public Command getAutonomousCommand() {
    return new InstantCommand(() -> exampleSubsystem.runForward())
        .andThen(new WaitCommand(2))
        .andThen(new InstantCommand(() -> exampleSubsystem.stop()));
  }

}
