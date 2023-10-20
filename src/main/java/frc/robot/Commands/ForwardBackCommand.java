// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.MoveForwardBack;

public class ForwardBackCommand extends CommandBase {

  MoveForwardBack moveForwardBack;

  public ForwardBackCommand(MoveForwardBack moveForwardBack) {
    addRequirements(moveForwardBack);
    this.moveForwardBack = moveForwardBack;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    moveForwardBack.moveForward();
    System.out.println("Initialize Foraward");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    moveForwardBack.stop();
    System.out.println("End Foraward");

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
