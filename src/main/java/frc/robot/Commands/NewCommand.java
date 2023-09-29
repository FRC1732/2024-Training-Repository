package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.ExampleSubsystem;
import frc.robot.Subsystems.ForwardBackSub;

public class NewCommand extends CommandBase {
    
    ForwardBackSub exampleSubsystem;

    public NewCommand(ForwardBackSub exampleSubsystem) {
        addRequirements(exampleSubsystem);
        this.exampleSubsystem = exampleSubsystem;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        exampleSubsystem.runForward();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        exampleSubsystem.stop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
