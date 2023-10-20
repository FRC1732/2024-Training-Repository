// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.ExampleSubsystem;
import frc.robot.Subsystems.FancyNewSubsystem;

public class FancyNewCommand extends CommandBase {
    
    FancyNewSubsystem fancyNewSubsystem;
    

    public FancyNewCommand(FancyNewSubsystem mySubsystem) {
        addRequirements(mySubsystem);
        this.fancyNewSubsystem = mySubsystem;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        fancyNewSubsystem.runForward();
        
    }

   

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        fancyNewSubsystem.stop();
    }

   
    

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
