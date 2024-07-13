package com.applovin.exoplayer2.k;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public final class x extends e {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f13475a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13476b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f13477c;

    /* renamed from: d  reason: collision with root package name */
    private AssetFileDescriptor f13478d;

    /* renamed from: e  reason: collision with root package name */
    private InputStream f13479e;

    /* renamed from: f  reason: collision with root package name */
    private long f13480f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13481g;

    public static class a extends j {
        public a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public x(Context context) {
        super(false);
        this.f13475a = context.getResources();
        this.f13476b = context.getPackageName();
    }

    public int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13480f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e2) {
                throw new a((String) null, e2, 2000);
            }
        }
        int read = ((InputStream) ai.a(this.f13479e)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f13480f;
            if (j2 != -1) {
                this.f13480f = j2 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.f13480f == -1) {
            return -1;
        } else {
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    public long a(l lVar) throws a {
        int i;
        String str;
        l lVar2 = lVar;
        Uri uri = lVar2.f13370a;
        this.f13477c = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) com.applovin.exoplayer2.l.a.b(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                i = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", (Throwable) null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str2 = (String) com.applovin.exoplayer2.l.a.b(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(str2);
            i = this.f13475a.getIdentifier(sb.toString(), "raw", this.f13476b);
            if (i == 0) {
                throw new a("Resource not found.", (Throwable) null, IronSourceConstants.IS_INSTANCE_OPENED);
            }
        } else {
            throw new a("URI must either use scheme rawresource or android.resource", (Throwable) null, 1004);
        }
        b(lVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f13475a.openRawResourceFd(i);
            this.f13478d = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f13479e = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    try {
                        if (lVar2.f13376g > length) {
                            throw new a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    } catch (a e2) {
                        throw e2;
                    } catch (IOException e3) {
                        throw new a((String) null, e3, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(lVar2.f13376g + startOffset) - startOffset;
                if (skip == lVar2.f13376g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f13480f = -1;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f13480f = size;
                            if (size < 0) {
                                throw new a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f13480f = j;
                        if (j < 0) {
                            throw new j(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    if (lVar2.f13377h != -1) {
                        long j2 = this.f13480f;
                        this.f13480f = j2 == -1 ? lVar2.f13377h : Math.min(j2, lVar2.f13377h);
                    }
                    this.f13481g = true;
                    c(lVar);
                    return lVar2.f13377h != -1 ? lVar2.f13377h : this.f13480f;
                }
                throw new a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new a("Resource is compressed: " + uri, (Throwable) null, 2000);
        } catch (Resources.NotFoundException e4) {
            throw new a((String) null, e4, IronSourceConstants.IS_INSTANCE_OPENED);
        }
    }

    public Uri a() {
        return this.f13477c;
    }

    public void c() throws a {
        this.f13477c = null;
        try {
            if (this.f13479e != null) {
                this.f13479e.close();
            }
            this.f13479e = null;
            try {
                if (this.f13478d != null) {
                    this.f13478d.close();
                }
                this.f13478d = null;
                if (this.f13481g) {
                    this.f13481g = false;
                    d();
                }
            } catch (IOException e2) {
                throw new a((String) null, e2, 2000);
            } catch (Throwable th) {
                this.f13478d = null;
                if (this.f13481g) {
                    this.f13481g = false;
                    d();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new a((String) null, e3, 2000);
        } catch (Throwable th2) {
            this.f13479e = null;
            try {
                if (this.f13478d != null) {
                    this.f13478d.close();
                }
                this.f13478d = null;
                if (this.f13481g) {
                    this.f13481g = false;
                    d();
                }
                throw th2;
            } catch (IOException e4) {
                throw new a((String) null, e4, 2000);
            } catch (Throwable th3) {
                this.f13478d = null;
                if (this.f13481g) {
                    this.f13481g = false;
                    d();
                }
                throw th3;
            }
        }
    }
}
