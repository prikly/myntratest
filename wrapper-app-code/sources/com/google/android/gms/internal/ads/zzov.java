package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzov extends zzob {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    zzov() {
    }

    private static void zzo(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.zzb.zzd;
        if (i2 == 536870912) {
            byteBuffer2 = zzj((i / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 2) & 255) << Ascii.CAN), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = zzj(i);
            while (position < limit) {
                zzo((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 3) & 255) << Ascii.CAN), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public final zznc zzi(zznc zznc) throws zznd {
        int i = zznc.zzd;
        if (zzen.zzU(i)) {
            return i != 4 ? new zznc(zznc.zzb, zznc.zzc, 4) : zznc.zza;
        }
        throw new zznd(zznc);
    }
}
