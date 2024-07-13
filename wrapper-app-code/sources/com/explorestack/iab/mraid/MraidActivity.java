package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Window;
import com.explorestack.iab.utils.Utils;

public class MraidActivity extends Activity {

    /* renamed from: d  reason: collision with root package name */
    public static final SparseArray<MraidInterstitial> f2942d = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    public Integer f2943a;

    /* renamed from: b  reason: collision with root package name */
    public MraidInterstitial f2944b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2945c = false;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2946a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.explorestack.iab.mraid.MraidType[] r0 = com.explorestack.iab.mraid.MraidType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2946a = r0
                com.explorestack.iab.mraid.MraidType r1 = com.explorestack.iab.mraid.MraidType.Static     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2946a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.iab.mraid.MraidType r1 = com.explorestack.iab.mraid.MraidType.Video     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2946a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.iab.mraid.MraidType r1 = com.explorestack.iab.mraid.MraidType.Rewarded     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.MraidActivity.a.<clinit>():void");
        }
    }

    public static Intent a(Context context, MraidType mraidType, int i) {
        Intent a2 = a(context, MraidActivity.class, mraidType, i);
        a2.addFlags(268435456);
        a2.addFlags(8388608);
        return a2;
    }

    public static Intent a(Context context, Class<?> cls, MraidType mraidType, int i) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("InterstitialId", i);
        intent.putExtra("InterstitialType", mraidType);
        return intent;
    }

    public static void a(MraidInterstitial mraidInterstitial) {
        f2942d.put(mraidInterstitial.id, mraidInterstitial);
    }

    public static void a(Integer num) {
        if (num != null) {
            f2942d.remove(num.intValue());
        }
    }

    public static void show(Context context, MraidInterstitial mraidInterstitial, MraidType mraidType) {
        if (mraidInterstitial == null) {
            MraidLog.a("Mraid interstitial object not provided for display");
        } else if (context == null) {
            MraidLog.a("Context not provided for display mraid interstitial");
            mraidInterstitial.d();
        } else if (mraidType == null) {
            MraidLog.a("Mraid type not provided for display");
            mraidInterstitial.d();
        } else {
            try {
                a(mraidInterstitial);
                context.startActivity(a(context, mraidType, mraidInterstitial.id));
            } catch (Throwable th) {
                th.printStackTrace();
                mraidInterstitial.d();
                a(Integer.valueOf(mraidInterstitial.id));
            }
        }
    }

    public final void a() {
        MraidInterstitial mraidInterstitial = this.f2944b;
        if (mraidInterstitial != null) {
            mraidInterstitial.destroy();
            this.f2944b = null;
        }
        a(this.f2943a);
    }

    public void onBackPressed() {
        if (this.f2945c) {
            MraidInterstitial mraidInterstitial = this.f2944b;
            if (mraidInterstitial != null) {
                mraidInterstitial.dispatchClose();
            } else {
                Utils.finishActivityWithoutAnimation(this);
            }
        }
    }

    public void onBeforeCreate(Window window) {
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
    }

    public void onBeforeShowContent() {
        Utils.applyFullscreenActivityFlags(this);
    }

    public void onCreate(Bundle bundle) {
        onBeforeCreate(getWindow());
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        if (!getIntent().hasExtra("InterstitialId")) {
            MraidLog.a("Mraid display cache id not provided");
            Utils.finishActivityWithoutAnimation(this);
            return;
        }
        Integer valueOf = Integer.valueOf(getIntent().getIntExtra("InterstitialId", 0));
        this.f2943a = valueOf;
        MraidInterstitial mraidInterstitial = f2942d.get(valueOf.intValue());
        this.f2944b = mraidInterstitial;
        if (mraidInterstitial == null) {
            MraidLog.a("Mraid interstitial not found in display cache, id=" + this.f2943a);
            Utils.finishActivityWithoutAnimation(this);
            return;
        }
        MraidType mraidType = (MraidType) getIntent().getSerializableExtra("InterstitialType");
        if (mraidType == null) {
            MraidLog.a("Mraid type not provided");
            Utils.finishActivityWithoutAnimation(this);
            this.f2944b.d();
            return;
        }
        onBeforeShowContent();
        int i = a.f2946a[mraidType.ordinal()];
        if (i == 1 || i == 2) {
            this.f2945c = true;
        } else if (i == 3) {
            this.f2945c = false;
        }
        try {
            this.f2944b.a((Activity) this, false);
        } catch (Exception e2) {
            MraidLog.a("Error showing Mraid interstitial", (Throwable) e2);
            Utils.finishActivityWithoutAnimation(this);
            this.f2944b.d();
            a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f2944b != null && !isChangingConfigurations()) {
            this.f2944b.c();
            a();
        }
    }
}
