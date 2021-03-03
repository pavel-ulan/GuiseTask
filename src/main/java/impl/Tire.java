package impl;

import com.google.inject.Inject;
import interfaces.ITire;
import lombok.Data;

@Data
public class Tire implements ITire {
    String tireName;
    @Inject
    public Tire() {
        this.tireName="Continental";
    }

    @Override
    public String toString() {
        return tireName;
    }
}
