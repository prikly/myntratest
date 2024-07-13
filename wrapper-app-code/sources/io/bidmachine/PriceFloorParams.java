package io.bidmachine;

import io.bidmachine.models.IPriceFloorParams;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class PriceFloorParams implements IPriceFloorParams<PriceFloorParams> {
    private final Map<String, Double> priceFloorsMap = new HashMap();

    public PriceFloorParams addPriceFloor(double d2) {
        addPriceFloor(UUID.randomUUID().toString(), d2);
        return this;
    }

    public PriceFloorParams addPriceFloor(String str, double d2) {
        this.priceFloorsMap.put(str, Double.valueOf(d2));
        return this;
    }

    /* access modifiers changed from: package-private */
    public Map<String, Double> getPriceFloors() {
        return this.priceFloorsMap;
    }
}
