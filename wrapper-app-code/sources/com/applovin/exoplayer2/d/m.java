package com.applovin.exoplayer2.d;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.applovin.exoplayer2.d.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface m {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f11773a;

        /* renamed from: b  reason: collision with root package name */
        private final String f11774b;

        /* renamed from: c  reason: collision with root package name */
        private final int f11775c;

        public a(byte[] bArr, String str, int i) {
            this.f11773a = bArr;
            this.f11774b = str;
            this.f11775c = i;
        }

        public byte[] a() {
            return this.f11773a;
        }

        public String b() {
            return this.f11774b;
        }
    }

    public interface b {
        void a(m mVar, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface c {
        m acquireExoMediaDrm(UUID uuid);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f11776a;

        /* renamed from: b  reason: collision with root package name */
        private final String f11777b;

        public d(byte[] bArr, String str) {
            this.f11776a = bArr;
            this.f11777b = str;
        }

        public byte[] a() {
            return this.f11776a;
        }

        public String b() {
            return this.f11777b;
        }
    }

    a a(byte[] bArr, List<e.a> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    void a(b bVar);

    void a(byte[] bArr);

    boolean a(byte[] bArr, String str);

    byte[] a() throws MediaDrmException;

    byte[] a(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    d b();

    void b(byte[] bArr) throws DeniedByServerException;

    void b(byte[] bArr, byte[] bArr2);

    Map<String, String> c(byte[] bArr);

    void c();

    int d();

    com.applovin.exoplayer2.c.b d(byte[] bArr) throws MediaCryptoException;
}
