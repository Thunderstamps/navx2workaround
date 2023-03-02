// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.NavX.AHRS;

public class Robot extends TimedRobot {

    private AHRS ahrs = new AHRS();

    public Robot() {
    }

    @Override
    public void robotInit() {

    }

    @Override
    public void robotPeriodic() {
        System.out.println(this.ahrs.getRotation2d().getDegrees());
    }

    @Override
    public void disabledInit() {
        
    }

    @Override
    public void disabledPeriodic() {}

    @Override
    public void autonomousInit() {
        
    }

    @Override
    public void autonomousPeriodic() {
      
    }

    @Override
    public void teleopInit() {
        
  
    }

    @Override
    public void teleopPeriodic() {
        
    }

    @Override
    public void testInit() {
        
    }
}
