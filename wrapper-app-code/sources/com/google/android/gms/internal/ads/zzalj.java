package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzalj extends zzake {
    private final Object zza = new Object();
    private final zzakj zzb;

    public zzalj(int i, String str, zzakj zzakj, zzaki zzaki) {
        super(i, str, zzaki);
        this.zzb = zzakj;
    }

    /* access modifiers changed from: protected */
    public final zzakk zzh(zzaka zzaka) {
        String str;
        try {
            byte[] bArr = zzaka.zzb;
            Map map = zzaka.zzc;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = (String) map.get("Content-Type");
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaka.zzb);
        }
        return zzakk.zzb(str, zzalb.zzb(zzaka));
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzz */
    public void zzo(String str) {
        zzakj zzakj;
        synchronized (this.zza) {
            zzakj = this.zzb;
        }
        zzakj.zza(str);
    }
}
