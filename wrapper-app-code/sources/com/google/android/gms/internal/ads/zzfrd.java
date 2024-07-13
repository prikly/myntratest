package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfrd {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final Map zzh = new WeakHashMap();
    private boolean zzi;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfrc zzb(View view) {
        zzfrc zzfrc = (zzfrc) this.zzb.get(view);
        if (zzfrc != null) {
            this.zzb.remove(view);
        }
        return zzfrc;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzi = false;
    }

    public final void zzh() {
        this.zzi = true;
    }

    public final void zzi() {
        Boolean bool;
        zzfqi zza2 = zzfqi.zza();
        if (zza2 != null) {
            for (zzfpx zzfpx : zza2.zzb()) {
                View zzf2 = zzfpx.zzf();
                if (zzfpx.zzj()) {
                    String zzh2 = zzfpx.zzh();
                    if (zzf2 != null) {
                        String str = null;
                        if (!zzf2.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (zzf2.hasWindowFocus()) {
                                this.zzh.remove(zzf2);
                                bool = false;
                            } else if (this.zzh.containsKey(zzf2)) {
                                bool = (Boolean) this.zzh.get(zzf2);
                            } else {
                                this.zzh.put(zzf2, false);
                                bool = false;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = zzf2;
                                while (true) {
                                    if (view == null) {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                    String zzb2 = zzfrb.zzb(view);
                                    if (zzb2 != null) {
                                        str = zzb2;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        }
                        if (str == null) {
                            this.zze.add(zzh2);
                            this.zza.put(zzf2, zzh2);
                            for (zzfqk zzfqk : zzfpx.zzi()) {
                                View view2 = (View) zzfqk.zzb().get();
                                if (view2 != null) {
                                    zzfrc zzfrc = (zzfrc) this.zzb.get(view2);
                                    if (zzfrc != null) {
                                        zzfrc.zzc(zzfpx.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfrc(zzfqk, zzfpx.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh2);
                            this.zzc.put(zzh2, zzf2);
                            this.zzg.put(zzh2, str);
                        }
                    } else {
                        this.zzf.add(zzh2);
                        this.zzg.put(zzh2, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(View view) {
        if (!this.zzh.containsKey(view)) {
            return true;
        }
        this.zzh.put(view, true);
        return false;
    }

    public final int zzk(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzi ? 2 : 3;
    }
}
