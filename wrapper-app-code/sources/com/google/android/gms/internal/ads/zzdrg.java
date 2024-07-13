package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdrg {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final zzg zzb;
    private final zzfjg zzc;
    private final zzdql zzd;
    private final zzdqg zze;
    private final zzdrs zzf;
    private final zzdsa zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzblz zzj;
    private final zzdqd zzk;

    public zzdrg(zzg zzg2, zzfjg zzfjg, zzdql zzdql, zzdqg zzdqg, zzdrs zzdrs, zzdsa zzdsa, Executor executor, Executor executor2, zzdqd zzdqd) {
        this.zzb = zzg2;
        this.zzc = zzfjg;
        this.zzj = zzfjg.zzi;
        this.zzd = zzdql;
        this.zze = zzdqg;
        this.zzf = zzdrs;
        this.zzg = zzdsa;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdqd;
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        View zzf2 = z ? this.zze.zzf() : this.zze.zzg();
        if (zzf2 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf2.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf2.getParent()).removeView(zzf2);
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzdo)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzf2, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        zzdqg zzdqg = this.zze;
        if (zzdqg.zzf() == null) {
            return;
        }
        if (zzdqg.zzc() == 2 || zzdqg.zzc() == 1) {
            this.zzb.zzI(this.zzc.zzf, String.valueOf(zzdqg.zzc()), z);
        } else if (zzdqg.zzc() == 6) {
            this.zzb.zzI(this.zzc.zzf, "2", z);
            this.zzb.zzI(this.zzc.zzf, "1", z);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzdsc zzdsc) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        zzbmi zza2;
        Drawable drawable;
        IObjectWrapper iObjectWrapper = null;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                View zzg2 = zzdsc.zzg(strArr[i]);
                if (zzg2 != null && (zzg2 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg2;
                    break;
                }
                i++;
            }
        }
        viewGroup = null;
        Context context = zzdsc.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdqg zzdqg = this.zze;
        if (zzdqg.zze() != null) {
            view = zzdqg.zze();
            zzblz zzblz = this.zzj;
            if (zzblz != null && viewGroup == null) {
                zzg(layoutParams, zzblz.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(zzdqg.zzl() instanceof zzblu)) {
            view = null;
        } else {
            zzblu zzblu = (zzblu) zzdqg.zzl();
            if (viewGroup == null) {
                zzg(layoutParams, zzblu.zzc());
            }
            zzblv zzblv = new zzblv(context, zzblu, layoutParams);
            zzblv.setContentDescription((CharSequence) zzba.zzc().zzb(zzbjj.zzdm));
            view = zzblv;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                zza zza3 = new zza(zzdsc.zzf().getContext());
                zza3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zza3.addView(view);
                FrameLayout zzh2 = zzdsc.zzh();
                if (zzh2 != null) {
                    zzh2.addView(zza3);
                }
            }
            zzdsc.zzq(zzdsc.zzk(), view, true);
        }
        zzgau zzgau = zzdrc.zza;
        int size = zzgau.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg3 = zzdsc.zzg((String) zzgau.get(i2));
            i2++;
            if (zzg3 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg3;
                break;
            }
        }
        this.zzi.execute(new zzdrd(this, viewGroup2));
        if (viewGroup2 != null) {
            if (zzh(viewGroup2, true)) {
                zzdqg zzdqg2 = this.zze;
                if (zzdqg2.zzr() != null) {
                    zzdqg2.zzr().zzaq(new zzdrf(zzdsc, viewGroup2));
                    return;
                }
                return;
            }
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zziK)).booleanValue() || !zzh(viewGroup2, false)) {
                viewGroup2.removeAllViews();
                View zzf2 = zzdsc.zzf();
                Context context2 = zzf2 != null ? zzf2.getContext() : null;
                if (context2 != null && (zza2 = this.zzk.zza()) != null) {
                    try {
                        IObjectWrapper zzi2 = zza2.zzi();
                        if (zzi2 != null && (drawable = (Drawable) ObjectWrapper.unwrap(zzi2)) != null) {
                            ImageView imageView = new ImageView(context2);
                            imageView.setImageDrawable(drawable);
                            if (zzdsc != null) {
                                iObjectWrapper = zzdsc.zzj();
                            }
                            if (iObjectWrapper != null) {
                                if (((Boolean) zzba.zzc().zzb(zzbjj.zzfD)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapper));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(zza);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        zze.zzj("Could not get main image drawable");
                    }
                }
            } else {
                zzdqg zzdqg3 = this.zze;
                if (zzdqg3.zzp() != null) {
                    zzdqg3.zzp().zzaq(new zzdrf(zzdsc, viewGroup2));
                }
            }
        }
    }

    public final void zzc(zzdsc zzdsc) {
        if (zzdsc != null && this.zzf != null && zzdsc.zzh() != null && this.zzd.zzg()) {
            try {
                zzdsc.zzh().addView(this.zzf.zza());
            } catch (zzcnz e2) {
                zze.zzb("web view can not be obtained", e2);
            }
        }
    }

    public final void zzd(zzdsc zzdsc) {
        if (zzdsc != null) {
            Context context = zzdsc.zzf().getContext();
            if (zzbx.zzh(context, this.zzd.zza)) {
                if (!(context instanceof Activity)) {
                    zze.zze("Activity context is needed for policy validator.");
                } else if (this.zzg != null && zzdsc.zzh() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.zzg.zza(zzdsc.zzh(), windowManager), zzbx.zzb());
                    } catch (zzcnz e2) {
                        zze.zzb("web view can not be obtained", e2);
                    }
                }
            }
        }
    }

    public final void zze(zzdsc zzdsc) {
        this.zzh.execute(new zzdre(this, zzdsc));
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
