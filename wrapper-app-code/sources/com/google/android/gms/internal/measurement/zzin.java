package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class zzin<MessageType extends zzio<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>> implements zzll {
    /* renamed from: zzau */
    public abstract zzin clone();

    public zzin zzav(byte[] bArr, int i, int i2) throws zzkp {
        throw null;
    }

    public zzin zzaw(byte[] bArr, int i, int i2, zzjr zzjr) throws zzkp {
        throw null;
    }

    public final /* synthetic */ zzll zzax(byte[] bArr) throws zzkp {
        return zzav(bArr, 0, bArr.length);
    }

    public final /* synthetic */ zzll zzay(byte[] bArr, zzjr zzjr) throws zzkp {
        return zzaw(bArr, 0, bArr.length, zzjr);
    }
}
