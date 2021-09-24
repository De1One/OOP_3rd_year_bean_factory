import Temperature.Celsius;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import TemperatureConverter.ConverterFromCel;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Locale.setDefault(Locale.US);
        ConverterFromCel converter = context.getBean("reqConverter",ConverterFromCel.class);

        Scanner in = new Scanner(System.in);
        Celsius temperature = new Celsius(in.nextDouble());
        System.out.println(converter.convert(temperature));

        context.close();
    }
}
