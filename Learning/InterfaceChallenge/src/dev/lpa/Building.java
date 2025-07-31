package dev.lpa;

public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building(String name, UsageType type) {
        this.name = name;
        this.usage = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarkers.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMarkers.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarkers.CIRCLE;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
