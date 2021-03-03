package impl;

import com.google.inject.Inject;
import interfaces.IEngine;
import lombok.Data;

@Data
public class Engine implements IEngine {
    private Gas gas;

    @Inject
    public Engine(Gas gas) {
        this.gas = gas;
    }
    @Override
    public void checkGas(){
        System.out.printf("this engine use %s%n", this.gas);
    }

    @Override
    public String toString() {
        return "engine witch use "+ gas;
    }
}
