package com.vaadin.tapio.googlemaps.client.overlays;

import com.vaadin.tapio.googlemaps.client.LatLon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a circle 
 * overlay of Google Maps.
 */
public class GoogleMapCircle implements Serializable {

    private static final long serialVersionUID = 656346543563L;

    private static long idCounter = 0;

    private long id;
    
    private LatLon center = new LatLon(0, 0);
    
    private Double radius = 0D;

    private String fillColor = "#FF0000";

    private double fillOpacity = 0.35;

    private String strokeColor = "#FF0000";

    private double strokeOpacity = 0.8;

    private int strokeWeight = 1;

    private int zIndex = 0;

    private boolean geodesic = false;

    public GoogleMapCircle() {
        id = idCounter;
        idCounter++;
    }

    public GoogleMapCircle(LatLon center, Double radius) {
        this();
        this.center = center;
        this.radius = radius;
    }

    public GoogleMapCircle(LatLon center, Double radius,
                           String strokeColor,
                           Double strokeOpacity,
                           String fillColor,
                           double fillOpacity,
                           int strokeWeight
    ) {
        this(center, radius);
        this.fillColor = fillColor;
        this.fillOpacity = fillOpacity;
        this.strokeColor = strokeColor;
        this.strokeOpacity = strokeOpacity;
        this.strokeWeight = strokeWeight;
    }

    /**
     * Returns the center of the circle.
     * @return center
     */
    public LatLon getCenter() {
        return center;
    }

    /**
     * Returns the radius of the circle
     * @return radius
     */
    public Double getRadius() {
        return this.radius;
    }

    /**
     * Sets the center of the circle.
     *
     * @param center
     */
    public void setCenter(LatLon center) {
        this.center = center;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius
     */
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getStrokeColor() {
        return this.strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public double getStrokeOpacity() {
        return this.strokeOpacity;
    }

    public void setStrokeOpacity(double strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
    }

    /**
     * Returns the fill color of the circle.
     *
     * @return the fill color
     */
    public String getFillColor() {
        return this.fillColor;
    }

    /**
     * Sets the fill color of the circle.
     *
     * @param fillColor The new fill color.
     */
    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    /**
     * Returns the fill opacity of the circle.
     *
     * @return the fill opacity
     */
    public double getFillOpacity() {
        return fillOpacity;
    }

    /**
     * Sets the fill opacity of the circle.
     *
     * @param fillOpacity The new fill opacity.
     */
    public void setFillOpacity(double fillOpacity) {
        this.fillOpacity = fillOpacity;
    }

    /**
     * Returns the fill weight of the circle.
     *
     * @return the fill weight
     */
    public int getStrokeWeight() {
        return this.strokeWeight;
    }

    /**
     * Sets the fill weight of the circle.
     *
     * @param strokeWeight The new fill weight.
     */

    public void setStrokeWeight(int strokeWeight) {
        this.strokeWeight = strokeWeight;
    }

    /**
     * Returns the z index compared to other circle.
     *
     * @return the z index
     */
    public int getzIndex() {
        return zIndex;
    }

    /**
     * Sets the z index compared to other circle.
     *
     * @param zIndex the new z index
     */
    public void setzIndex(int zIndex) {
        this.zIndex = zIndex;
    }

    /**
     * Checks if the circle is geodesic.
     *
     * @return true, if it is geodesic
     */
    public boolean isGeodesic() {
        return geodesic;
    }

    /**
     * Enables/disables geodesicity of the circle.
     *
     * @param geodesic Set true to enable geodesicity.
     */
    public void setGeodesic(boolean geodesic) {
        this.geodesic = geodesic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GoogleMapCircle other = (GoogleMapCircle) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }
}
