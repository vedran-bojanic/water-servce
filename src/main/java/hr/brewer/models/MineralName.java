package hr.brewer.models;

public enum MineralName {

    CALCIUM(1),
    MAGNESIUM(2),
    ALKALINITY(3),
    SULFATE(4),
    CHLORIDE(5),
    SODIUM(6),
    RESIDUAL_ALKALINITY(7);

    private final int id;

    MineralName(int id) {
        this.id = id;
    }

}