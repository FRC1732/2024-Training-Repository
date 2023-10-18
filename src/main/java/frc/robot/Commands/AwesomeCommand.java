package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.AwesomeSubsystem;
import frc.robot.Subsystems.ExampleSubsystem;

public class AwesomeCommand extends CommandBase {
    
    AwesomeSubsystem awesomeSubsystem;

    public AwesomeCommand(AwesomeSubsystem awesomeSubsystem) {
        addRequirements(awesomeSubsystem);
        this.awesomeSubsystem = awesomeSubsystem;
    }

    private void addRequirements(AwesomeSubsystem awesomeSubsystem2) {
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        awesomeSubsystem.runForward();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        awesomeSubsystem.stop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
