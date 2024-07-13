package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbzq zza;

    private final void zza() {
        zzbzq zzbzq = this.zza;
        if (zzbzq != null) {
            try {
                zzbzq.zzv();
            } catch (RemoteException e2) {
                zzcho.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzg(i, i2, intent);
            }
        } catch (Exception e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null && !zzbzq.zzE()) {
                return;
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
        super.onBackPressed();
        try {
            zzbzq zzbzq2 = this.zza;
            if (zzbzq2 != null) {
                zzbzq2.zzh();
            }
        } catch (RemoteException e3) {
            zzcho.zzl("#007 Could not call remote method.", e3);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzj(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbzq zzo = zzay.zza().zzo(this);
        this.zza = zzo;
        if (zzo != null) {
            try {
                zzo.zzk(bundle);
            } catch (RemoteException e2) {
                zzcho.zzl("#007 Could not call remote method.", e2);
                finish();
            }
        } else {
            zzcho.zzl("#007 Could not call remote method.", (Throwable) null);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzl();
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzn();
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzo();
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzp();
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzq(bundle);
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzr();
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzs();
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbzq zzbzq = this.zza;
            if (zzbzq != null) {
                zzbzq.zzt();
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
