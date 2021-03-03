package impl;

import com.google.inject.Inject;
import interfaces.IWheel;
import lombok.Data;

@Data
public class Wheel implements IWheel {
    Tire tire;
    Disk disk;

    @Inject
    public Wheel(Tire tire, Disk disk) {
        this.disk=disk;
        this.tire=tire;
    }

    @Override
    public String toString() {
        return "Wheel with " + tire + " tire " + disk;
    }
}
