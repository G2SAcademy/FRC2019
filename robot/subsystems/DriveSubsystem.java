/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

//instantiate new motor controller objects

public Spark leftFront = new Spark (RobotMap.leftFrontPort);
public Spark leftRear = new Spark (RobotMap.leftRearPort);
public Spark rightFront = new Spark (RobotMap.rightFrontPort);
public Spark rightRear = new Spark (RobotMap.rightRearPort);

 //assign motors to a Speed Controller Group

 SpeedControllerGroup LeftMotorGroup = new SpeedControllerGroup(leftFront,leftRear);
 SpeedControllerGroup RightMotorGroup = new SpeedControllerGroup(rightFront, rightRear);

//instantiate a new DifferentialDrive object and assign Speed Controller Groups to differential drive

public DifferentialDrive drive = new DifferentialDrive(LeftMotorGroup, RightMotorGroup);

//add manualDrive() method
public void manualDrive(double move, double turn) {

  if (Math.abs(move) < 0.05){
    move = 0;
  }

  if (Math.abs(turn) < 0.05){
    turn = 0;
  }

  drive.arcadeDrive(move, turn);
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  setDefaultCommand(new DriveManuallyCommand());
  }
}
