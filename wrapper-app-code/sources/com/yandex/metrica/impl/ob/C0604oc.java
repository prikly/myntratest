package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0783w;

/* renamed from: com.yandex.metrica.impl.ob.oc  reason: case insensitive filesystem */
public class C0604oc {

    /* renamed from: a  reason: collision with root package name */
    public final C0554mc f6395a;

    /* renamed from: b  reason: collision with root package name */
    public final Ac f6396b;

    /* renamed from: com.yandex.metrica.impl.ob.oc$a */
    public enum a {
        UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN),
        FOREGROUND("fg"),
        BACKGROUND("bg"),
        VISIBLE("visible");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f6402a;

        private a(String str) {
            this.f6402a = str;
        }

        public String a() {
            return this.f6402a;
        }

        public String toString() {
            return this.f6402a;
        }

        public static a a(String str) {
            a aVar = UNKNOWN;
            a[] values = values();
            for (int i = 0; i < 4; i++) {
                a aVar2 = values[i];
                if (aVar2.f6402a.equals(str)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        public static a a(C0783w.a aVar) {
            a aVar2 = UNKNOWN;
            if (aVar == null) {
                return aVar2;
            }
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                return BACKGROUND;
            }
            if (ordinal != 2) {
                return aVar2;
            }
            return VISIBLE;
        }
    }

    public C0604oc(C0554mc mcVar, Ac ac) {
        this.f6395a = mcVar;
        this.f6396b = ac;
    }

    public String toString() {
        return "LocationCollectionConfig{arguments=" + this.f6395a + ", preconditions=" + this.f6396b + '}';
    }
}
