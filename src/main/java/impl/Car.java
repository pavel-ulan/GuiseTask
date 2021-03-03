package impl;

import com.google.inject.Inject;
import interfaces.ICar;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
@Data
public class Car implements ICar {
    List<Wheel> wheels;
    Engine engine;

    @Inject
    public Car(Wheel wheel, Engine engine) {
        this.engine=engine;
        this.wheels= Arrays.asList(wheel,wheel,wheel,wheel);
    }

    @Override
    public void drive() {
        System.out.printf("I use %s and %s for driving", wheels, engine);
    }
}
