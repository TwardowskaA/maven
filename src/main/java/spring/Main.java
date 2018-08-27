package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        TemperatureProvider temperatureProvider = new RandomTemperatureProvider();

        TemperaturePrinter printer = context.getBean(TemperaturePrinter.class);
        printer.printTemperature(temperatureProvider);

    }
}
