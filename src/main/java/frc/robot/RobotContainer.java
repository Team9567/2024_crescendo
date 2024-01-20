// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import frc.robot.commands.DriveDistanceCommand;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.RobotChassis;

public class RobotContainer {
  // SUBSYSTEMS

  public RobotChassis chassis = new RobotChassis();
  // ROBOT COMMAND DEFINITIONS

  // JOYSTICK AND BUTTON ASSIGNMENTS
  public Joystick driver = new Joystick(0);

  // The container for the robot. Contains subsystems, OI devices, and commands
  public RobotContainer() {

    chassis.setDefaultCommand(
        new RunCommand(
            () -> {
              chassis.arcadeDrive(-driver.getRawAxis(1), driver.getRawAxis(0));
            }, chassis));
    // attach drive distance to button A
    // m_Chooser.addOption("drive 5 feet", new
    // DriveDistanceCommand(RobotChassis.class));

  }

  //public Command getAutonomousCommand() {
    //return new DriveDistanceCommand(chassis);
  //}
}
