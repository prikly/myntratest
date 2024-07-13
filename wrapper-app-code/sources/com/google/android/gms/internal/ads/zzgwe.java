package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwd;
import com.google.android.gms.internal.ads.zzgwe;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgwe<MessageType extends zzgwe<MessageType, BuilderType>, BuilderType extends zzgwd<MessageType, BuilderType>> implements zzgzn {
    protected int zza = 0;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void zzau(java.lang.Iterable r3, java.util.List r4) {
        /*
            com.google.android.gms.internal.ads.zzgyn.zze(r3)
            boolean r0 = r4 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0016
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r4.size()
            int r2 = r3.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
        L_0x0016:
            int r0 = r4.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r3.next()
            if (r1 != 0) goto L_0x0057
            int r3 = r4.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            int r3 = r3 - r0
            r1.append(r3)
            java.lang.String r3 = " is null."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r1 = r4.size()
        L_0x0049:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x0051
            r4.remove(r1)
            goto L_0x0049
        L_0x0051:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r3)
            throw r4
        L_0x0057:
            r4.add(r1)
            goto L_0x001e
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgwe.zzau(java.lang.Iterable, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    public int zzas(zzhag zzhag) {
        throw null;
    }

    public final zzgwv zzat() {
        try {
            int zzay = zzay();
            zzgwv zzgwv = zzgwv.zzb;
            byte[] bArr = new byte[zzay];
            zzgxk zzG = zzgxk.zzG(bArr);
            zzaU(zzG);
            zzG.zzI();
            return new zzgwr(bArr);
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e2);
        }
    }

    public final void zzav(OutputStream outputStream) throws IOException {
        zzgxk zzH = zzgxk.zzH(outputStream, zzgxk.zzB(zzay()));
        zzaU(zzH);
        zzH.zzN();
    }

    public final byte[] zzaw() {
        try {
            byte[] bArr = new byte[zzay()];
            zzgxk zzG = zzgxk.zzG(bArr);
            zzaU(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e2);
        }
    }
}
