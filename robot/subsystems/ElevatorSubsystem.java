/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
/**
 * Add your docs here.
 */
public class ElevatorSubsystem extends Subsystem {
  public Spark rightElevatorPort = new Spark(RobotMap.rightElevatorPort);
  public Spark leftElevatorPort = new Spark(RobotMap.leftElevatorPort);
  public void upr() {rightElevatorPort.set(1);}
  public void upl() {leftElevatorPort.set(-1);}
  public void downr() {rightElevatorPort.set(-1);}
  public void downl() {leftElevatorPort.set(1);}
  public void stopr() {rightElevatorPort.set(0);}
  public void stopl() {leftElevatorPort.set(0);}
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
