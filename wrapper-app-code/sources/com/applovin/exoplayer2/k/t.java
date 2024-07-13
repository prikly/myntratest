package com.applovin.exoplayer2.k;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.k.i;
import com.onesignal.OSInAppMessageContentKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface t extends i {

    /* renamed from: a  reason: collision with root package name */
    public static final Predicate<String> f13441a = $$Lambda$t$H1UlgPnTKRt6qV1j43DU5tw7_I.INSTANCE;

    /* renamed from: com.applovin.exoplayer2.k.t$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ boolean a(String str) {
            if (str == null) {
                return false;
            }
            String lowerCase = Ascii.toLowerCase(str);
            if (!TextUtils.isEmpty(lowerCase)) {
                return (!lowerCase.contains("text") || lowerCase.contains("text/vtt")) && !lowerCase.contains(OSInAppMessageContentKt.HTML) && !lowerCase.contains("xml");
            }
            return false;
        }
    }

    public static final class a extends c {
        public a(IOException iOException, l lVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, lVar, 2007, 1);
        }
    }

    public interface b extends i.a {

        /* renamed from: com.applovin.exoplayer2.k.t$b$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        /* synthetic */ i a();

        t c();
    }

    public static class c extends j {

        /* renamed from: b  reason: collision with root package name */
        public final l f13442b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13443c;

        public c(l lVar, int i, int i2) {
            super(a(i, i2));
            this.f13442b = lVar;
            this.f13443c = i2;
        }

        public c(IOException iOException, l lVar, int i, int i2) {
            super((Throwable) iOException, a(i, i2));
            this.f13442b = lVar;
            this.f13443c = i2;
        }

        public c(String str, l lVar, int i, int i2) {
            super(str, a(i, i2));
            this.f13442b = lVar;
            this.f13443c = i2;
        }

        public c(String str, IOException iOException, l lVar, int i, int i2) {
            super(str, iOException, a(i, i2));
            this.f13442b = lVar;
            this.f13443c = i2;
        }

        private static int a(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static c a(IOException iOException, l lVar, int i) {
            String message = iOException.getMessage();
            int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i2 == 2007 ? new a(iOException, lVar) : new c(iOException, lVar, i2, i);
        }
    }

    public static final class d extends c {

        /* renamed from: d  reason: collision with root package name */
        public final String f13444d;

        public d(String str, l lVar) {
            super("Invalid content type: " + str, lVar, 2003, 1);
            this.f13444d = str;
        }
    }

    public static final class e extends c {

        /* renamed from: d  reason: collision with root package name */
        public final int f13445d;

        /* renamed from: e  reason: collision with root package name */
        public final String f13446e;

        /* renamed from: f  reason: collision with root package name */
        public final Map<String, List<String>> f13447f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f13448g;

        public e(int i, String str, IOException iOException, Map<String, List<String>> map, l lVar, byte[] bArr) {
            super("Response code: " + i, iOException, lVar, 2004, 1);
            this.f13445d = i;
            this.f13446e = str;
            this.f13447f = map;
            this.f13448g = bArr;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f13449a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f13450b;

        public synchronized Map<String, String> a() {
            if (this.f13450b == null) {
                this.f13450b = Collections.unmodifiableMap(new HashMap(this.f13449a));
            }
            return this.f13450b;
        }
    }
}
