package io.bidmachine.models;

public interface IPriceFloorParams<SelfType> {
    SelfType addPriceFloor(double d2);

    SelfType addPriceFloor(String str, double d2);
}
