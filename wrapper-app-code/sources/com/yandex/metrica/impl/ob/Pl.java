package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.appodeal.advertising.AdvertisingInfo;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

public final class Pl {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4793a;

    /* renamed from: b  reason: collision with root package name */
    private final C0819xb f4794b;

    /* renamed from: c  reason: collision with root package name */
    private final Bb f4795c;

    public Pl(Context context, C0819xb xbVar, Bb bb) {
        this.f4793a = context;
        this.f4794b = xbVar;
        this.f4795c = bb;
    }

    private final String b() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
        String replace$default = StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null);
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
        if (replace$default != null) {
            String lowerCase = replace$default.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String a() {
        boolean z;
        byte[] bArr;
        C0867zb a2 = this.f4794b.a(this.f4793a, (Gb) new Hb(5, 500));
        Intrinsics.checkNotNullExpressionValue(a2, "advertisingIdGetter.getI…sedRetryStrategy(5, 500))");
        C0747ub c2 = a2.c();
        Intrinsics.checkNotNullExpressionValue(c2, "advertisingIdGetter.getI…yStrategy(5, 500)).yandex");
        boolean z2 = false;
        if (c2.a()) {
            C0723tb tbVar = c2.f6881a;
            Intrinsics.checkNotNull(tbVar);
            String str = tbVar.f6825b;
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNullExpressionValue(str, "yandexAdvId.mAdTrackingInfo!!.advId!!");
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                try {
                    bArr = MessageDigest.getInstance("MD5").digest(bytes);
                } catch (NoSuchAlgorithmException unused) {
                    bArr = new byte[0];
                }
                String a3 = C0267b.a(bArr);
                Intrinsics.checkNotNullExpressionValue(a3, "StringUtils.toHexString(…!.advId!!.toByteArray()))");
                return a3;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String a4 = this.f4795c.a().a();
        if (a4 != null) {
            if (!(a4.length() == 0)) {
                try {
                    UUID.fromString(a4);
                    z = true;
                } catch (Throwable unused2) {
                    z = false;
                }
                if (z && (!Intrinsics.areEqual((Object) a4, (Object) AdvertisingInfo.defaultAdvertisingId))) {
                    z2 = true;
                }
            }
            if (z2) {
                return StringsKt.replace$default(a4, "-", "", false, 4, (Object) null);
            }
        }
        return b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Pl(android.content.Context r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
            java.lang.String r1 = "GlobalServiceLocator.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.yandex.metrica.impl.ob.xb r0 = r0.r()
            java.lang.String r2 = "GlobalServiceLocator.get…ternalAdvertisingIdGetter"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            com.yandex.metrica.impl.ob.F0 r2 = com.yandex.metrica.impl.ob.F0.g()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            com.yandex.metrica.impl.ob.Bb r1 = r2.a()
            java.lang.String r2 = "GlobalServiceLocator.getInstance().appSetIdGetter"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Pl.<init>(android.content.Context):void");
    }
}
