package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxz;
import com.google.android.gms.internal.ads.zzgyd;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzgxz<MessageType extends zzgyd<MessageType, BuilderType>, BuilderType extends zzgxz<MessageType, BuilderType>> extends zzgwd<MessageType, BuilderType> {
    protected zzgyd zza;
    private final zzgyd zzb;

    protected zzgxz(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaW()) {
            this.zza = this.zzb.zzaC();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzgzv.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    /* renamed from: zzah */
    public final zzgxz zzag() {
        zzgxz zzgxz = (zzgxz) this.zzb.zzb(5, (Object) null, (Object) null);
        zzgxz.zza = zzam();
        return zzgxz;
    }

    public final zzgxz zzai(zzgyd zzgyd) {
        if (!this.zzb.equals(zzgyd)) {
            if (!this.zza.zzaW()) {
                zzap();
            }
            zza(this.zza, zzgyd);
        }
        return this;
    }

    public final zzgxz zzaj(byte[] bArr, int i, int i2, zzgxp zzgxp) throws zzgyp {
        if (!this.zza.zzaW()) {
            zzap();
        }
        try {
            zzgzv.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzgwh(zzgxp));
            return this;
        } catch (zzgyp e2) {
            throw e2;
        } catch (IndexOutOfBoundsException unused) {
            throw zzgyp.zzj();
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        }
    }

    public final MessageType zzak() {
        MessageType zzal = zzam();
        if (zzal.zzaV()) {
            return zzal;
        }
        throw new zzhaw(zzal);
    }

    /* renamed from: zzal */
    public MessageType zzam() {
        if (!this.zza.zzaW()) {
            return this.zza;
        }
        this.zza.zzaQ();
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzao() {
        if (!this.zza.zzaW()) {
            zzap();
        }
    }

    /* access modifiers changed from: protected */
    public void zzap() {
        zzgyd zzaC = this.zzb.zzaC();
        zza(zzaC, this.zza);
        this.zza = zzaC;
    }

    public final /* synthetic */ zzgzn zzbh() {
        throw null;
    }
}
