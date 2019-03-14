package frc.robot.subsystems;



import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
/**
 * Add your docs here.
 */
public class ClawSubsystem extends Subsystem {
  public Spark ClawPort = new Spark(RobotMap.ClawPort);
  public void initDefaultCommand() {}
  public void open() {ClawPort.set(0.60);}
  public void close() {ClawPort.set(-0.60);}
  public void stop() {ClawPort.set(0);}}
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());


