package frc.robot.subsystems;



import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
/**
 * Add your docs here.
 */
public class clawtwo extends Subsystem {
  public Spark clawport2 = new Spark(RobotMap.clawport2);
  public void initDefaultCommand() {}
  public void open2() {clawport2.set(1);}
  public void close2() {clawport2.set(-1);}
  public void stop2() {clawport2.set(0);}}
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());


