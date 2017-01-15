package org.usfirst.frc.team3158.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3158.robot.commands.ExampleCommand;


public class OI {
	
	private static Joystick joy;
	private static JoystickButton a;
	
	public OI(){
		joy = new Joystick(0);
		a = new JoystickButton(joy,1);
		a.whileHeld(new ExampleCommand());
	}
	
	public static Joystick getJoystick(){
		return joy;
	}
    
}

