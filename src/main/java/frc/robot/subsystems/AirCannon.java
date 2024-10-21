package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AirCannon extends SubsystemBase {

  private final Solenoid valve;

  /** Creates a new AirCannon. */
  public AirCannon(int module, int channel) {
    valve = new Solenoid(module, PneumaticsModuleType.CTREPCM, channel);
  }

  public boolean isOpen(){
    return valve.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
