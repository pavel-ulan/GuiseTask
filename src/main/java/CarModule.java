import com.google.inject.AbstractModule;
import impl.*;
import interfaces.*;

public class CarModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IEngine.class).to(Engine.class);
        bind(IGas.class).to(Gas.class);
        bind(IDisk.class).to(Disk.class);
        bind(ITire.class).to(Tire.class);
        bind(IWheel.class).to(Wheel.class);
        bind(ICar.class).to(Car.class);
    }
}
