package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamps {
    private String stampName;
    private double stampHeight;
    private double stampWidth;
    private boolean ifStamped;

    public Stamps(String stampName, double stampHeight, double stampWidth, boolean ifStamped) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWidth = stampWidth;
        this.ifStamped = ifStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampHeight() {
        return stampHeight;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public boolean isIfStamped() {
        return ifStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamps stamps = (Stamps) o;
        return Double.compare(stamps.stampHeight, stampHeight) == 0 && Double.compare(stamps.stampWidth, stampWidth) == 0 && ifStamped == stamps.ifStamped && stampName.equals(stamps.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampHeight, stampWidth, ifStamped);
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "stampName='" + stampName + '\'' +
                ", stampHeight=" + stampHeight +
                ", stampWidth=" + stampWidth +
                ", ifStamped=" + ifStamped +
                '}';
    }
}
