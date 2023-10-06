package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.FancyNewSub;


public class FancyNewComm extends CommandBase {
    
    private FancyNewSub fancyNewSub;

    public FancyNewComm(FancyNewSub fancyNewSub) {
        addRequirements(fancyNewSub);
        this.fancyNewSub = fancyNewSub;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        fancyNewSub.runForward();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        fancyNewSub.stop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
