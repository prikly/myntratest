package com.google.android.exoplayer2.util;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class BundleableUtil {
    public static <T extends Bundleable> T fromNullableBundle(Bundleable.Creator<T> creator, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return creator.fromBundle(bundle);
    }

    public static <T extends Bundleable> ImmutableList<T> fromBundleList(Bundleable.Creator<T> creator, List<Bundle> list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            builder.add(creator.fromBundle((Bundle) Assertions.checkNotNull(list.get(i))));
        }
        return builder.build();
    }

    public static <T extends Bundleable> List<T> fromBundleNullableList(Bundleable.Creator<T> creator, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : fromBundleList(creator, list);
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleableUtil.class.getClassLoader()));
        }
    }

    private BundleableUtil() {
    }
}
