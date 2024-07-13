package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfn extends zzer {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzfn() {
        super(false);
    }

    public final int zza(byte[] bArr, int i, int i2) throws zzfm {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzen.zza;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.zzc, (long) i2));
            if (read > 0) {
                this.zzc -= (long) read;
                zzg(read);
            }
            return read;
        } catch (IOException e2) {
            throw new zzfm(e2, 2000);
        }
    }

    public final long zzb(zzfc zzfc) throws zzfm {
        Uri uri = zzfc.zza;
        this.zzb = uri;
        zzi(zzfc);
        int i = 2006;
        try {
            String path = uri.getPath();
            if (path != null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.zza = randomAccessFile;
                try {
                    randomAccessFile.seek(zzfc.zzf);
                    long j = zzfc.zzg;
                    if (j == -1) {
                        j = this.zza.length() - zzfc.zzf;
                    }
                    this.zzc = j;
                    if (j >= 0) {
                        this.zzd = true;
                        zzj(zzfc);
                        return this.zzc;
                    }
                    throw new zzfm((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                } catch (IOException e2) {
                    throw new zzfm(e2, 2000);
                }
            } else {
                throw null;
            }
        } catch (FileNotFoundException e3) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzfm(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e3, 1004);
            }
            if (zzen.zza < 21 || !zzfl.zzb(e3.getCause())) {
                i = IronSourceConstants.IS_INSTANCE_OPENED;
            }
            throw new zzfm(e3, i);
        } catch (SecurityException e4) {
            throw new zzfm(e4, 2006);
        } catch (RuntimeException e5) {
            throw new zzfm(e5, 2000);
        }
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() throws zzfm {
        this.zzb = null;
        try {
            RandomAccessFile randomAccessFile = this.zza;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
        } catch (IOException e2) {
            throw new zzfm(e2, 2000);
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
