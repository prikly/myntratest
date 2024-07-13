package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaha implements zzaio {
    private final List zza;

    public zzaha() {
        this(0);
    }

    private final zzaie zzb(zzain zzain) {
        return new zzaie(zzd(zzain));
    }

    private final zzais zzc(zzain zzain) {
        return new zzais(zzd(zzain));
    }

    private final List zzd(zzain zzain) {
        String str;
        int i;
        List list;
        zzef zzef = new zzef(zzain.zzd);
        List list2 = this.zza;
        while (zzef.zza() > 0) {
            int zzk = zzef.zzk();
            int zzc = zzef.zzc() + zzef.zzk();
            if (zzk == 134) {
                list2 = new ArrayList();
                int zzk2 = zzef.zzk() & 31;
                for (int i2 = 0; i2 < zzk2; i2++) {
                    String zzx = zzef.zzx(3, zzfxr.zzc);
                    int zzk3 = zzef.zzk();
                    boolean z = (zzk3 & 128) != 0;
                    if (z) {
                        i = zzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzk4 = (byte) zzef.zzk();
                    zzef.zzG(1);
                    if (z) {
                        int i3 = zzdf.zza;
                        list = Collections.singletonList((zzk4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzad zzad = new zzad();
                    zzad.zzS(str);
                    zzad.zzK(zzx);
                    zzad.zzu(i);
                    zzad.zzI(list);
                    list2.add(zzad.zzY());
                }
            }
            zzef.zzF(zzc);
        }
        return list2;
    }

    public final zzaiq zza(int i, zzain zzain) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzahu(new zzahr(zzain.zzb));
            }
            if (i == 21) {
                return new zzahu(new zzahp());
            }
            if (i == 27) {
                return new zzahu(new zzahm(zzb(zzain), false, false));
            }
            if (i == 36) {
                return new zzahu(new zzaho(zzb(zzain)));
            }
            if (i == 89) {
                return new zzahu(new zzahc(zzain.zzc));
            }
            if (i == 138) {
                return new zzahu(new zzahb(zzain.zzb));
            }
            if (i == 172) {
                return new zzahu(new zzagw(zzain.zzb));
            }
            if (i == 257) {
                return new zzaid(new zzaht("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzaid(new zzaht("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzahu(new zzagz(false, zzain.zzb));
                            case 16:
                                return new zzahu(new zzahi(zzc(zzain)));
                            case 17:
                                return new zzahu(new zzahq(zzain.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzahu(new zzagt(zzain.zzb));
            }
        }
        return new zzahu(new zzahf(zzc(zzain)));
    }

    public zzaha(int i) {
        this.zza = zzgau.zzo();
    }
}
