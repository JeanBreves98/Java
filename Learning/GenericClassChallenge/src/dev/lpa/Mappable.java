package dev.lpa;

public interface Mappable {
    void render();

    static double[] stringToLatLon(String coordinates){

        var splits = coordinates.split(",");
        double latitude = Double.valueOf(splits[0]);
        double longitude = Double.valueOf(splits[1]);

        return new double[]{latitude, longitude};
    }
}
