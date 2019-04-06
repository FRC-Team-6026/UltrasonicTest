package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;

public class UltrasonicSensor {
    private final AnalogInput _ultrasonicInput = new AnalogInput(0);

    public UltrasonicSensor() {
        AnalogInput.setGlobalSampleRate(9600);
    }

     public double getDistanceCm() {
         var voltage = _ultrasonicInput.getAverageVoltage();
         var cm = voltage/2;
         return cm;
     }
}

