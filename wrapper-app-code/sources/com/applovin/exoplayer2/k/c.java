package com.applovin.exoplayer2.k;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class c extends e {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f13340a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f13341b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f13342c;

    /* renamed from: d  reason: collision with root package name */
    private long f13343d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13344e;

    public static final class a extends j {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public c(Context context) {
        super(false);
        this.f13340a = context.getAssets();
    }

    public int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13343d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e2) {
                throw new a(e2, 2000);
            }
        }
        int read = ((InputStream) ai.a(this.f13342c)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f13343d;
        if (j2 != -1) {
            this.f13343d = j2 - ((long) read);
        }
        a(read);
        return read;
    }

    public long a(l lVar) throws a {
        try {
            Uri uri = lVar.f13370a;
            this.f13341b = uri;
            String str = (String) com.applovin.exoplayer2.l.a.b(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            b(lVar);
            InputStream open = this.f13340a.open(str, 1);
            this.f13342c = open;
            if (open.skip(lVar.f13376g) >= lVar.f13376g) {
                if (lVar.f13377h != -1) {
                    this.f13343d = lVar.f13377h;
                } else {
                    long available = (long) this.f13342c.available();
                    this.f13343d = available;
                    if (available == 2147483647L) {
                        this.f13343d = -1;
                    }
                }
                this.f13344e = true;
                c(lVar);
                return this.f13343d;
            }
            throw new a((Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (a e2) {
            throw e2;
        } catch (IOException e3) {
            throw new a(e3, e3 instanceof FileNotFoundException ? IronSourceConstants.IS_INSTANCE_OPENED : 2000);
        }
    }

    public Uri a() {
        return this.f13341b;
    }

    public void c() throws a {
        this.f13341b = null;
        try {
            if (this.f13342c != null) {
                this.f13342c.close();
            }
            this.f13342c = null;
            if (this.f13344e) {
                this.f13344e = false;
                d();
            }
        } catch (IOException e2) {
            throw new a(e2, 2000);
        } catch (Throwable th) {
            this.f13342c = null;
            if (this.f13344e) {
                this.f13344e = false;
                d();
            }
            throw th;
        }
    }
}
