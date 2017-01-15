package org.usfirst.frc.team3158.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;


public class RobotMap {
	
	public static int motorID = 5;
	
	public static double defaultP = 0.0;
	public static double defaultI = 0.0;
	public static double defaultD = 0.0;
	
	public static int encoderID = 1;
	
	
	public static Talon getTalonMotor(){
		return new Talon(motorID);
	}
	
	public static Encoder getEncoder(){
		return new Encoder(0, 1, false, Encoder.EncodingType.k4X);
	}
	
}
