package org.example.Model;

public enum VehicleType {
    CAR(1),
    TRUCK(2),
    MOTORCYCLE(3),
    VAN(4),
    ELECTRIC(5),
    OTHERS(6);
    private final int code;

    VehicleType(int code) {
        this.code = code;
    }
    public int getCode()
    {
        return code;
    }



}
