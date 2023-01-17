package ConverterTemperature;

public class CelsToK_F implements ConverterTemperature{
    @Override
    public void converter(double t) {
        double T1 = t + 273.15;
        double T2 = t * 9 / 5 + 32;
            System.out.println(t + "°C is " + T1 + "K and " + T2 + "°F");
    }
}

