package hr.brewer.services;

import hr.brewer.models.Water;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class WaterServiceImpl implements WaterService {

    static List<Water> waters;

    static {
        Water paleAle = new Water();
        paleAle.setId(1);
        paleAle.getCalcium().setRange("50-150");
        paleAle.getMagnesium().setRange("0-30");
        paleAle.getAlkalinity().setRange("40-120");
        paleAle.getSulfate().setRange("100-400");
        paleAle.getChloride().setRange("0-100");
        paleAle.getSodium().setRange("< 100");
        paleAle.getAlkalinity().setRange("(-)30-30");
        paleAle.setColor("10-28");
        waters = Arrays.asList(paleAle);
    }

    @Override
    public List<Water> fetchAllStyleWater() {
        return waters;
    }

    @Override
    public List<Water> loadSavedWaters() {
        return null;
    }

    @Override
    public void insertWater(int id, Water water) {

    }
}
