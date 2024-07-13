package com.applovin.exoplayer2.k;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class s extends e {

    /* renamed from: a  reason: collision with root package name */
    private RandomAccessFile f13437a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f13438b;

    /* renamed from: c  reason: collision with root package name */
    private long f13439c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13440d;

    private static final class a {
        /* access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static class b extends j {
        public b(String str, Throwable th, int i) {
            super(str, th, i);
        }

        public b(Throwable th, int i) {
            super(th, i);
        }
    }

    public s() {
        super(false);
    }

    private static RandomAccessFile a(Uri uri) throws b {
        int i = 2006;
        try {
            return new RandomAccessFile((String) com.applovin.exoplayer2.l.a.b(uri.getPath()), "r");
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            if (ai.f13525a < 21 || !a.b(e2.getCause())) {
                i = IronSourceConstants.IS_INSTANCE_OPENED;
            }
            throw new b(e2, i);
        } catch (SecurityException e3) {
            throw new b(e3, 2006);
        } catch (RuntimeException e4) {
            throw new b(e4, 2000);
        }
    }

    public int a(byte[] bArr, int i, int i2) throws b {
        if (i2 == 0) {
            return 0;
        }
        if (this.f13439c == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) ai.a(this.f13437a)).read(bArr, i, (int) Math.min(this.f13439c, (long) i2));
            if (read > 0) {
                this.f13439c -= (long) read;
                a(read);
            }
            return read;
        } catch (IOException e2) {
            throw new b(e2, 2000);
        }
    }

    public long a(l lVar) throws b {
        Uri uri = lVar.f13370a;
        this.f13438b = uri;
        b(lVar);
        RandomAccessFile a2 = a(uri);
        this.f13437a = a2;
        try {
            a2.seek(lVar.f13376g);
            long length = lVar.f13377h == -1 ? this.f13437a.length() - lVar.f13376g : lVar.f13377h;
            this.f13439c = length;
            if (length >= 0) {
                this.f13440d = true;
                c(lVar);
                return this.f13439c;
            }
            throw new b((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e2) {
            throw new b(e2, 2000);
        }
    }

    public Uri a() {
        return this.f13438b;
    }

    public void c() throws b {
        this.f13438b = null;
        try {
            if (this.f13437a != null) {
                this.f13437a.close();
            }
            this.f13437a = null;
            if (this.f13440d) {
                this.f13440d = false;
                d();
            }
        } catch (IOException e2) {
            throw new b(e2, 2000);
        } catch (Throwable th) {
            this.f13437a = null;
            if (this.f13440d) {
                this.f13440d = false;
                d();
            }
            throw th;
        }
    }
}
