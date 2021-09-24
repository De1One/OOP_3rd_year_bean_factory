import TemperatureConverter.ConverterFromCel;
import TemperatureConverter.ConverterToFahrenheit;
import TemperatureConverter.ConverterToKelvin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ConverterFactory {
    private static final Set<String> fahrenheitCountries = new HashSet<>(Arrays.asList("BS","US","KY","BZ","PW"));
    private static final Set<String> kelvinCountries = new HashSet<>(Arrays.asList("UK","FR"));

    public static ConverterFromCel getConverter(Locale locale){
        if(kelvinCountries.contains(locale.toString().toUpperCase())) {
            return new ConverterToKelvin();
        }
        else if(fahrenheitCountries.contains(locale.toString().toUpperCase())){
            return new ConverterToFahrenheit();
        }
        else{
            return temp -> temp;
        }
    }
}
