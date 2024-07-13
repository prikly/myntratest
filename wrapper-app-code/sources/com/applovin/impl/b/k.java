package com.applovin.impl.b;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private String f14314a;

    /* renamed from: b  reason: collision with root package name */
    private String f14315b;

    /* renamed from: c  reason: collision with root package name */
    private String f14316c;

    /* renamed from: d  reason: collision with root package name */
    private long f14317d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f14318e = -1;

    private k() {
    }

    private static int a(String str, e eVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (eVar != null) {
            return eVar.h();
        }
        return 95;
    }

    public static k a(s sVar, e eVar, n nVar) {
        List<String> explode;
        int size;
        TimeUnit timeUnit;
        long seconds;
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            try {
                String c2 = sVar.c();
                if (StringUtils.isValidString(c2)) {
                    k kVar = new k();
                    kVar.f14316c = c2;
                    kVar.f14314a = sVar.b().get(OSOutcomeConstants.OUTCOME_ID);
                    kVar.f14315b = sVar.b().get("event");
                    kVar.f14318e = a(kVar.a(), eVar);
                    String str = sVar.b().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            kVar.f14318e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(":") && (size = explode.size()) > 0) {
                            long j = 0;
                            int i = size - 1;
                            for (int i2 = i; i2 >= 0; i2--) {
                                String str2 = (explode = CollectionUtils.explode(trim, ":")).get(i2);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i2 == i) {
                                        seconds = (long) parseInt;
                                    } else {
                                        if (i2 == size - 2) {
                                            timeUnit = TimeUnit.MINUTES;
                                        } else if (i2 == size - 3) {
                                            timeUnit = TimeUnit.HOURS;
                                        }
                                        seconds = timeUnit.toSeconds((long) parseInt);
                                    }
                                    j += seconds;
                                }
                            }
                            kVar.f14317d = j;
                            kVar.f14318e = -1;
                        }
                    }
                    return kVar;
                }
                nVar.D();
                if (!v.a()) {
                    return null;
                }
                nVar.D().e("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            } catch (Throwable th) {
                nVar.D();
                if (!v.a()) {
                    return null;
                }
                nVar.D().b("VastTracker", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public String a() {
        return this.f14315b;
    }

    public boolean a(long j, int i) {
        boolean z = this.f14317d >= 0;
        boolean z2 = j >= this.f14317d;
        boolean z3 = this.f14318e >= 0;
        boolean z4 = i >= this.f14318e;
        if (!z || !z2) {
            return z3 && z4;
        }
        return true;
    }

    public String b() {
        return this.f14316c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f14317d != kVar.f14317d || this.f14318e != kVar.f14318e) {
            return false;
        }
        String str = this.f14314a;
        if (str == null ? kVar.f14314a != null : !str.equals(kVar.f14314a)) {
            return false;
        }
        String str2 = this.f14315b;
        if (str2 == null ? kVar.f14315b == null : str2.equals(kVar.f14315b)) {
            return this.f14316c.equals(kVar.f14316c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f14314a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14315b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f14317d;
        return ((((((hashCode + i) * 31) + this.f14316c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f14318e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f14314a + '\'' + ", event='" + this.f14315b + '\'' + ", uriString='" + this.f14316c + '\'' + ", offsetSeconds=" + this.f14317d + ", offsetPercent=" + this.f14318e + '}';
    }
}
