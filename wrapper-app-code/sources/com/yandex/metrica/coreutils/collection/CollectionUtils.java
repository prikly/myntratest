package com.yandex.metrica.coreutils.collection;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010&\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0007J&\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\t\"\u0004\b\u0000\u0010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0006H\u0007J\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0007J.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\n0\r\"\u0004\b\u0000\u0010\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\n0\rH\u0007J8\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\r\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u0016H\u0007J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0019\"\u00020\u000eH\u0007¢\u0006\u0002\u0010\u001aJ'\u0010\u001b\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\n\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u001fJ>\u0010 \u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150!\u0018\u00010\t\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\rH\u0007J<\u0010\"\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\r\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u001a\u0010#\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150!\u0018\u00010\tH\u0007J=\u0010$\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\r2\u0006\u0010\u001e\u001a\u0002H\u00142\u0006\u0010%\u001a\u0002H\u0015H\u0007¢\u0006\u0002\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u000b\u001a\u00020*H\u0007J8\u0010+\u001a\u0010\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\r\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\rH\u0007J\u001c\u0010,\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007JA\u0010-\u001a\u00020.\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u00162\b\u0010\u001e\u001a\u0004\u0018\u0001H\u00142\b\u0010/\u001a\u0004\u0018\u0001H\u0015H\u0007¢\u0006\u0002\u00100J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020)0\t2\u0006\u00102\u001a\u00020*H\u0007J\"\u00103\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\f\u00104\u001a\b\u0012\u0004\u0012\u0002H\n0\u0006H\u0007J4\u00105\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\r\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\rH\u0007J4\u00106\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\r\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\rH\u0007J-\u00107\u001a\b\u0012\u0004\u0012\u0002H\n0(\"\u0004\b\u0000\u0010\n2\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0019\"\u0002H\nH\u0007¢\u0006\u0002\u00109¨\u0006:"}, d2 = {"Lcom/yandex/metrica/coreutils/collection/CollectionUtils;", "", "()V", "areCollectionsEqual", "", "left", "", "right", "arrayListCopyOfNullableCollection", "", "T", "input", "bundleToMap", "", "", "", "Landroid/os/Bundle;", "convertMapKeysToLowerCase", "map", "copyOf", "K", "V", "", "createSortedListWithoutRepetitions", "elements", "", "([Ljava/lang/String;)Ljava/util/List;", "getFirstOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "getFromMapIgnoreCase", "key", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "getListFromMap", "", "getMapFromList", "list", "getOrDefault", "defValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "hashSetFromIntArray", "", "", "", "mapCopyOfNullableMap", "mapToBundle", "putOpt", "", "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "toIntList", "array", "unmodifiableListCopy", "original", "unmodifiableMapCopy", "unmodifiableSameOrderMapCopy", "unmodifiableSetOf", "values", "([Ljava/lang/Object;)Ljava/util/Set;", "core-utils_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CollectionUtils.kt */
public final class CollectionUtils {
    public static final CollectionUtils INSTANCE = new CollectionUtils();

    private CollectionUtils() {
    }

    public static final Bundle mapToBundle(Map<String, byte[]> map) {
        Intrinsics.checkNotNullParameter(map, "input");
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry next : map.entrySet()) {
            bundle.putByteArray((String) next.getKey(), (byte[]) next.getValue());
        }
        return bundle;
    }

    public static final Map<String, byte[]> bundleToMap(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            Set<String> keySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "it.keySet()");
            for (String str : keySet) {
                byte[] byteArray = bundle.getByteArray(str);
                if (byteArray != null) {
                    Intrinsics.checkNotNullExpressionValue(str, "key");
                    Intrinsics.checkNotNullExpressionValue(byteArray, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    hashMap.put(str, byteArray);
                }
            }
        }
        return hashMap;
    }
}
