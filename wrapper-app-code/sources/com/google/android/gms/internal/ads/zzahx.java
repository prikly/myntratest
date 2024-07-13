package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzahx extends zzyv {
    public zzahx(zzel zzel, long j, long j2) {
        super(new zzyq(), new zzahw(zzel, (zzahv) null), j, 0, j + 1, 0, j2, 188, 1000);
    }

    static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }
}
