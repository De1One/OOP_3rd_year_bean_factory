package TemperatureConverter;

import Temperature.AnyTemp;
import Temperature.Celsius;
import Temperature.Fahrenheit;

public class ConverterToFahrenheit implements ConverterFromCel{
    @Override
    public AnyTemp convert(AnyTemp temp) throws ClassCastException{
        if(temp instanceof Celsius){
            return new Fahrenheit(temp.getTemp() * 1.8 + 32);
        }
        throw new ClassCastException("ONLY FROM CELSIUS!");
    }
}
