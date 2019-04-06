package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;

public class UltrasonicSensor {
    private final AnalogInput _ultrasonicInput = new AnalogInput(0);
    private final double _inputVoltage = 4.82;
    private final double _voltsPer5mm = _inputVoltage / 1024;

    public UltrasonicSensor() {
        _ultrasonicInput.setOversampleBits(2);
        _ultrasonicInput.setAverageBits(2);
        AnalogInput.setGlobalSampleRate(62500);
    }

     public double getDistanceMm() {
         var voltage = _ultrasonicInput.getAverageVoltage();
         var mm = 5 * voltage/_voltsPer5mm;
         return mm;
     }
}

