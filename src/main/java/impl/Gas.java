package impl;

import interfaces.IGas;
import lombok.Data;

@Data
public class Gas implements IGas {
    private static final String gasTypeSet = "clearGas";
    private String gasType;
    
    public Gas() {
        this.gasType = gasTypeSet;
    }

    @Override
    public void gasType(){
        System.out.printf("gas type is %s%n", this.gasType);
    }

    @Override
    public String toString() {
        return gasType;
    }
}
