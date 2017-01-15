package org.usfirst.frc.team3158.robot.commands;

import org.usfirst.frc.team3158.robot.Robot;
import org.usfirst.frc.team3158.robot.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ExampleCommand extends Command {

    public ExampleCommand() {
        requires(Robot.motor);
    }

    // Called just before this Command runs the first time
    //@SuppressWarnings("deprecation")
	protected void initialize() {
		Robot.motor.getPIDController().setPID(SmartDashboard.getDouble("MotorP"), SmartDashboard.getDouble("MotorI"), SmartDashboard.getDouble("MotorD"));
		Robot.motor.setOutputRange(0, 1);
		Robot.motor.setSetpoint(SmartDashboard.getDouble("MotorSpeed"));
    	Robot.motor.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    @SuppressWarnings("deprecation")
	protected void execute() {
    	
    
    	 
	    	/*
	        SmartDashboard.putDouble("Encoder Period: ", ExampleSubsystem.encoder.getPeriod());
	        SmartDashboard.putDouble("Encoder Get: ", ExampleSubsystem.encoder.get());
	        SmartDashboard.putDouble("Encoder RAW: ", ExampleSubsystem.encoder.getRaw());
	        SmartDashboard.putDouble("Encoder Distance", ExampleSubsystem.encoder.getDistance());
	        SmartDashboard.putDouble("Encoder PID: ", ExampleSubsystem.encoder.pidGet());
   */
    	
    	/* System out println with Riolog
    	 
	    	System.out.println("Encoder Rate: " + ExampleSubsystem.encoder.pidGet());
	    	System.out.println("Encoder Period: " + ExampleSubsystem.encoder.getPeriod());
	    	System.out.println("Encoder Get: " + ExampleSubsystem.encoder.get());
	    	System.out.println("Encoder RAW: " + ExampleSubsystem.encoder.getRaw());
	    	System.out.println("Encoder Distance" + ExampleSubsystem.encoder.getDistance());
	    	System.out.println("Encoder PID: " + ExampleSubsystem.encoder.pidGet());
    	*/
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Robot.motor.disable();
    	Robot.motor.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
