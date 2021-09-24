package TemperatureConverter;

import Temperature.AnyTemp;
import Temperature.Celsius;
import Temperature.Kelvin;

public class ConverterToKelvin implements ConverterFromCel{
    @Override
    public AnyTemp convert(AnyTemp temp) throws ClassCastException {
        if (temp instanceof Celsius){
            return new Kelvin(temp.getTemp() + 273.13);
        }
        throw new ClassCastException("ONLY FROM CELSIUS!");
    }
}
