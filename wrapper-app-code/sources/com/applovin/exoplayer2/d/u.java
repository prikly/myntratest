package com.applovin.exoplayer2.d;

import android.util.Pair;
import java.util.Map;

public final class u {
    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair<Long, Long> a(f fVar) {
        Map<String, String> h2 = fVar.h();
        if (h2 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(h2, "LicenseDurationRemaining")), Long.valueOf(a(h2, "PlaybackDurationRemaining")));
    }
}
