
package org.usfirst.frc.team3158.robot.subsystems;

import org.usfirst.frc.team3158.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class ExampleSubsystem extends PIDSubsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	Talon motorForTest = RobotMap.getTalonMotor();
	public static Encoder encoder = RobotMap.getEncoder();
	
	
	
	public void setMaxSpeed(){
		motorForTest.set(1);
	}
	public void stopMotor(){
		motorForTest.set(0);
	}
	
    public ExampleSubsystem(){
    	super("MotorForTest",RobotMap.defaultP,RobotMap.defaultI,RobotMap.defaultD);
    	getPIDController().setContinuous(true);

	}
    public void setMotorSetpoint(double speed){
    	getPIDController().setSetpoint(speed);
    }
    protected double returnPIDInput() {
    	return encoder.getDistance(); // returns the sensor value that is providing the feedback for the system
    }

    protected void usePIDOutput(double output) {
    	motorForTest.pidWrite(output); // this is where the computed output value fromthe PIDController is applied to the motor
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

