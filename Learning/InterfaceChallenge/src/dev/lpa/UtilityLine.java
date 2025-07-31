package dev.lpa;

public class UtilityLine implements Mappable{
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> Color.RED + " " + LineMarkers.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMarkers.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarkers.SOLID;
            case WATER -> Color.BLUE + " " + LineMarkers.SOLID;
            default -> Color.BLACK + " " + LineMarkers.SOLID;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "utility": "%s" """.formatted(name, type);
    }
}
