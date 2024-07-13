package com.appodeal.advertising;

import com.appodeal.advertising.AdvertisingInfo;
import kotlin.jvm.internal.Intrinsics;

public interface b {

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final AdvertisingInfo.AdvertisingProfile f17778a;

        public a(AdvertisingInfo.AdvertisingProfile advertisingProfile) {
            Intrinsics.checkNotNullParameter(advertisingProfile, "advertisingProfile");
            this.f17778a = advertisingProfile;
        }

        public final AdvertisingInfo.AdvertisingProfile a() {
            return this.f17778a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual((Object) this.f17778a, (Object) ((a) obj).f17778a);
        }

        public final int hashCode() {
            return this.f17778a.hashCode();
        }

        public final String toString() {
            return "Initialized(advertisingProfile=" + this.f17778a + ')';
        }
    }

    /* renamed from: com.appodeal.advertising.b$b  reason: collision with other inner class name */
    public static final class C0211b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0211b f17779a = new C0211b();
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f17780a = new c();
    }
}
