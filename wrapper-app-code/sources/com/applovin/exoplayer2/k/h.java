package com.applovin.exoplayer2.k;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

public final class h extends e {

    /* renamed from: a  reason: collision with root package name */
    private l f13359a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f13360b;

    /* renamed from: c  reason: collision with root package name */
    private int f13361c;

    /* renamed from: d  reason: collision with root package name */
    private int f13362d;

    public h() {
        super(false);
    }

    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f13362d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(ai.a(this.f13360b), this.f13361c, bArr, i, min);
        this.f13361c += min;
        this.f13362d -= min;
        a(min);
        return min;
    }

    public long a(l lVar) throws IOException {
        b(lVar);
        this.f13359a = lVar;
        Uri uri = lVar.f13370a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        a.a(equals, (Object) "Unsupported scheme: " + scheme);
        String[] a2 = ai.a(uri.getSchemeSpecificPart(), ",");
        if (a2.length == 2) {
            String str = a2[1];
            if (a2[0].contains(";base64")) {
                try {
                    this.f13360b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e2) {
                    throw com.applovin.exoplayer2.ai.a("Error while parsing Base64 encoded string: " + str, e2);
                }
            } else {
                this.f13360b = ai.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            if (lVar.f13376g <= ((long) this.f13360b.length)) {
                int i = (int) lVar.f13376g;
                this.f13361c = i;
                this.f13362d = this.f13360b.length - i;
                if (lVar.f13377h != -1) {
                    this.f13362d = (int) Math.min((long) this.f13362d, lVar.f13377h);
                }
                c(lVar);
                return lVar.f13377h != -1 ? lVar.f13377h : (long) this.f13362d;
            }
            this.f13360b = null;
            throw new j(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw com.applovin.exoplayer2.ai.a("Unexpected URI format: " + uri, (Throwable) null);
    }

    public Uri a() {
        l lVar = this.f13359a;
        if (lVar != null) {
            return lVar.f13370a;
        }
        return null;
    }

    public void c() {
        if (this.f13360b != null) {
            this.f13360b = null;
            d();
        }
        this.f13359a = null;
    }
}
