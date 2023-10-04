package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.CoolNewSubsystem;

public class CoolNewCommand extends CommandBase{
    
    CoolNewSubsystem coolNewSubsystem;

    public CoolNewCommand(CoolNewSubsystem coolNewSubsystem) {
        addRequirements(coolNewSubsystem);
        this.coolNewSubsystem = coolNewSubsystem;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        coolNewSubsystem.runForward();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        coolNewSubsystem.stop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
