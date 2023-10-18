package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.EpicNewSub;


public class TurnLeft extends CommandBase {
    
    private EpicNewSub epicNewSub;

    public TurnLeft(EpicNewSub epicNewSub) {
        addRequirements(epicNewSub);
        this.epicNewSub = epicNewSub;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        epicNewSub.turnLeft();
        System.out.println("Init Left");
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        epicNewSub.stop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
