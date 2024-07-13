package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.Native;
import com.appodeal.ads.context.b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public final class n2 extends g<t2, s2, l2> {

    /* renamed from: e  reason: collision with root package name */
    public static NativeCallbacks f16832e;

    /* renamed from: a  reason: collision with root package name */
    public int f16833a = 2;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16834b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16835c = false;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f16836d = new ArrayList();

    /* renamed from: a */
    public final void e(t2 t2Var, s2 s2Var) {
        ArrayList o = s2Var.o();
        synchronized (this.f16836d) {
            this.f16836d.addAll(o);
            Collections.sort(this.f16836d, $$Lambda$rSYQdmrxYtotwmOi7K9wynd7B4.INSTANCE);
        }
        if (!this.f16834b) {
            this.f16834b = true;
            Log.log("NativeAdBox", LogConstants.EVENT_NOTIFY_LOADED, String.format(Locale.ENGLISH, "available count of Native Ads: %d", new Object[]{Integer.valueOf(this.f16836d.size())}));
            NativeCallbacks nativeCallbacks = f16832e;
            if (nativeCallbacks != null) {
                nativeCallbacks.onNativeLoaded();
            }
        }
        if (!t2Var.q()) {
            a(false);
        }
    }

    public final void a(boolean z) {
        int i;
        synchronized (this.f16836d) {
            Native.a a2 = Native.a();
            if (z || a2.k()) {
                int i2 = i0.f16476e;
                if (i2 > 0 && i2 != this.f16833a) {
                    this.f16833a = i2;
                }
                int i3 = this.f16833a;
                int size = this.f16836d.size();
                synchronized (this.f16836d) {
                    i = 0;
                    Iterator it = this.f16836d.iterator();
                    while (it.hasNext()) {
                        if (((NativeAd) it.next()).isPrecache()) {
                            i++;
                        }
                    }
                }
                int i4 = i3 - (size - i);
                if (i4 > 0) {
                    Native.f16125a = i4;
                    t2 t2Var = (t2) a2.f();
                    if (t2Var == null || !t2Var.u()) {
                        Native.a().c(b.f16327b.getApplicationContext());
                    }
                } else if (!this.f16834b) {
                    this.f16834b = true;
                    NativeCallbacks nativeCallbacks = f16832e;
                    if (nativeCallbacks != null) {
                        nativeCallbacks.onNativeLoaded();
                    }
                }
            }
        }
    }

    public final void b(int i) {
        if (i > 5) {
            i = 5;
        }
        if (i < 2) {
            i = 2;
        }
        this.f16833a = i;
    }

    public final void b(r rVar, l lVar) {
        t2 t2Var = (t2) rVar;
        s2 s2Var = (s2) lVar;
        if (this.f16836d.size() == 0) {
            Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
            NativeCallbacks nativeCallbacks = f16832e;
            if (nativeCallbacks != null) {
                nativeCallbacks.onNativeExpired();
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f16836d) {
            z = !this.f16836d.isEmpty();
        }
        return z;
    }

    public final void c() {
        a(false, false, false);
    }

    public final void c(r rVar, l lVar, Object obj) {
        t2 t2Var = (t2) rVar;
        s2 s2Var = (s2) lVar;
        l2 l2Var = (l2) obj;
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = f16832e;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeShown(l2Var);
        }
    }

    public final void d(r rVar, l lVar) {
        t2 t2Var = (t2) rVar;
        s2 s2Var = (s2) lVar;
        if (!this.f16834b && !this.f16835c) {
            this.f16835c = true;
            Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
            NativeCallbacks nativeCallbacks = f16832e;
            if (nativeCallbacks != null) {
                nativeCallbacks.onNativeFailedToLoad();
            }
        }
    }

    public final void b(r rVar, l lVar, Object obj) {
        t2 t2Var = (t2) rVar;
        s2 s2Var = (s2) lVar;
        l2 l2Var = (l2) obj;
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = f16832e;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeShowFailed(l2Var);
        }
    }

    public final HashSet a() {
        HashSet hashSet;
        synchronized (this.f16836d) {
            hashSet = new HashSet();
            Iterator it = this.f16836d.iterator();
            while (it.hasNext()) {
                hashSet.add(((l2) ((NativeAd) it.next())).f16577a);
            }
        }
        return hashSet;
    }

    public final ArrayList a(int i) {
        ArrayList<NativeAd> arrayList;
        synchronized (this.f16836d) {
            if (i >= this.f16836d.size()) {
                arrayList = new ArrayList<>(this.f16836d);
            } else {
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList2.add((NativeAd) this.f16836d.get(i2));
                }
                arrayList = arrayList2;
            }
            for (NativeAd nativeAd : arrayList) {
                o.b(((l2) nativeAd).f16577a);
            }
            this.f16836d.removeAll(arrayList);
            if (this.f16836d.size() == 0) {
                this.f16834b = false;
                this.f16835c = false;
            }
            Log.log("NativeAdBox", LogConstants.EVENT_GET_ADS, String.format(Locale.ENGLISH, "available count of Native Ads: %d", new Object[]{Integer.valueOf(this.f16836d.size())}));
            a(false);
        }
        return arrayList;
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        synchronized (this.f16836d) {
            if (this.f16836d.size() == 0) {
                this.f16834b = false;
                this.f16835c = false;
            }
            if (z) {
                this.f16836d.clear();
                Native.a a2 = Native.a();
                Context applicationContext = b.f16327b.f16328a.getApplicationContext();
                Native.c cVar = new Native.c();
                cVar.f17189a = true;
                cVar.f17190b = z2;
                cVar.f17191c = z3;
                a2.b(applicationContext, cVar);
            } else {
                a(true);
            }
        }
    }

    public final void a(r rVar, l lVar, Object obj) {
        t2 t2Var = (t2) rVar;
        s2 s2Var = (s2) lVar;
        l2 l2Var = (l2) obj;
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = f16832e;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeClicked(l2Var);
        }
    }
}
