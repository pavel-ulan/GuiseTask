import com.google.inject.Guice;
import com.google.inject.Injector;
import interfaces.ICar;
import interfaces.IEngine;

public class Temp {
    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new CarModule());

        ICar car = injector.getInstance(ICar.class);
        car.drive();
    }
}
