package io.bidmachine;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.models.ICustomParams;
import java.util.HashMap;
import java.util.Map;

public final class CustomParams implements ICustomParams<CustomParams> {
    private final Map<String, String> customMap = new HashMap();

    public CustomParams addParam(String str, String str2) {
        this.customMap.put(str, str2);
        return this;
    }

    public CustomParams addParams(Map<String, String> map) {
        this.customMap.putAll(map);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void fillStructBuilder(Struct.Builder builder) {
        for (Map.Entry next : this.customMap.entrySet()) {
            builder.putFields((String) next.getKey(), Value.newBuilder().setStringValue((String) next.getValue()).build());
        }
    }
}
