package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;
import edu.wpi.first.wpilibj.Joystick;

public class MoveArmCommand extends CommandBase {
    
    private final Arm arm;
    private final Joystick joystick;
}
    
public MoveArmCommand(Arm arm, Joystick joystick) {
     this.arm = arm;
    this.joysitck = joysitck;
    addRequirements(arm); 
}
public void execute() {
    double speed = joystick.getY(); 
    arm.moveMainLifter(speed);
}
    @Override
public boolean isFinished() {
    return arm.armPID.atSetpoint();
 }
    @Override
public void end(boolean interrupted) {
    arm.stopAll();
    }
