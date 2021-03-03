package impl;

import com.google.inject.Inject;
import interfaces.IDisk;
import lombok.Data;

@Data
public class Disk implements IDisk {
    @Inject
    public Disk() {
    }

    @Override
    public String toString() {
        return "on noName Disk";
    }
}
