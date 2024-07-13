package com.applovin.exoplayer2.k;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.l.ai;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class f extends e {

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f13353a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f13354b;

    /* renamed from: c  reason: collision with root package name */
    private AssetFileDescriptor f13355c;

    /* renamed from: d  reason: collision with root package name */
    private FileInputStream f13356d;

    /* renamed from: e  reason: collision with root package name */
    private long f13357e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13358f;

    private static final class a {
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType(MimeTypes.VIDEO_H265).addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    public static class b extends j {
        public b(IOException iOException, int i) {
            super((Throwable) iOException, i);
        }
    }

    public f(Context context) {
        super(false);
        this.f13353a = context.getContentResolver();
    }

    public int a(byte[] bArr, int i, int i2) throws b {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13357e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e2) {
                throw new b(e2, 2000);
            }
        }
        int read = ((FileInputStream) ai.a(this.f13356d)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f13357e;
        if (j2 != -1) {
            this.f13357e = j2 - ((long) read);
        }
        a(read);
        return read;
    }

    public long a(l lVar) throws b {
        AssetFileDescriptor assetFileDescriptor;
        int i = 2000;
        try {
            Uri uri = lVar.f13370a;
            this.f13354b = uri;
            b(lVar);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(lVar.f13370a.getScheme())) {
                Bundle bundle = new Bundle();
                if (ai.f13525a >= 31) {
                    a.a(bundle);
                }
                assetFileDescriptor = this.f13353a.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f13353a.openAssetFileDescriptor(uri, "r");
            }
            this.f13355c = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f13356d = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    if (lVar.f13376g > length) {
                        throw new b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(lVar.f13376g + startOffset) - startOffset;
                if (skip == lVar.f13376g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f13357e = -1;
                        } else {
                            long position = size - channel.position();
                            this.f13357e = position;
                            if (position < 0) {
                                throw new b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f13357e = j;
                        if (j < 0) {
                            throw new b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    if (lVar.f13377h != -1) {
                        long j2 = this.f13357e;
                        this.f13357e = j2 == -1 ? lVar.f13377h : Math.min(j2, lVar.f13377h);
                    }
                    this.f13358f = true;
                    c(lVar);
                    return lVar.f13377h != -1 ? lVar.f13377h : this.f13357e;
                }
                throw new b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new b(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (b e2) {
            throw e2;
        } catch (IOException e3) {
            if (e3 instanceof FileNotFoundException) {
                i = IronSourceConstants.IS_INSTANCE_OPENED;
            }
            throw new b(e3, i);
        }
    }

    public Uri a() {
        return this.f13354b;
    }

    public void c() throws b {
        this.f13354b = null;
        try {
            if (this.f13356d != null) {
                this.f13356d.close();
            }
            this.f13356d = null;
            try {
                if (this.f13355c != null) {
                    this.f13355c.close();
                }
                this.f13355c = null;
                if (this.f13358f) {
                    this.f13358f = false;
                    d();
                }
            } catch (IOException e2) {
                throw new b(e2, 2000);
            } catch (Throwable th) {
                this.f13355c = null;
                if (this.f13358f) {
                    this.f13358f = false;
                    d();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new b(e3, 2000);
        } catch (Throwable th2) {
            this.f13356d = null;
            try {
                if (this.f13355c != null) {
                    this.f13355c.close();
                }
                this.f13355c = null;
                if (this.f13358f) {
                    this.f13358f = false;
                    d();
                }
                throw th2;
            } catch (IOException e4) {
                throw new b(e4, 2000);
            } catch (Throwable th3) {
                this.f13355c = null;
                if (this.f13358f) {
                    this.f13358f = false;
                    d();
                }
                throw th3;
            }
        }
    }
}
