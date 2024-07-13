package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<J>> f8229a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    String f8230b = "";

    /* renamed from: c  reason: collision with root package name */
    J f8231c;

    /* renamed from: d  reason: collision with root package name */
    private String f8232d = "";

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f8233e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8234f;

    /* renamed from: g  reason: collision with root package name */
    private final Timer f8235g = new Timer();

    public L(List<String> list, int i) {
        this.f8233e = list;
        this.f8234f = i;
    }

    private synchronized boolean c() {
        return this.f8231c != null && this.f8231c.f8219b.equals(this.f8232d);
    }

    private void d() {
        Iterator<J> it = a().iterator();
        while (it.hasNext()) {
            Y next = it.next();
            if (!next.equals(this.f8231c)) {
                next.d();
            }
        }
    }

    public final CopyOnWriteArrayList<J> a() {
        CopyOnWriteArrayList<J> copyOnWriteArrayList = this.f8229a.get(this.f8230b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final synchronized void a(J j) {
        IronLog.INTERNAL.verbose("");
        if (this.f8231c != null && !this.f8231c.equals(j)) {
            this.f8231c.d();
        }
        this.f8231c = j;
    }

    public final void a(CopyOnWriteArrayList<J> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        d();
        this.f8229a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f8232d)) {
            if (c()) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("ad from previous waterfall " + this.f8232d + " is still showing - the current waterfall " + this.f8230b + " will be deleted instead");
                String str2 = this.f8230b;
                this.f8230b = this.f8232d;
                this.f8232d = str2;
            }
            final String str3 = this.f8232d;
            this.f8235g.schedule(new TimerTask() {
                public final void run() {
                    try {
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                        L.this.f8229a.remove(str3);
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.verbose("waterfall size is currently " + L.this.f8229a.size());
                    } finally {
                        cancel();
                    }
                }
            }, (long) this.f8234f);
        }
        this.f8232d = this.f8230b;
        this.f8230b = str;
    }

    public final boolean b() {
        return this.f8229a.size() > 5;
    }

    public final synchronized boolean b(J j) {
        boolean z;
        IronLog.INTERNAL.verbose("");
        if (j != null) {
            if (this.f8231c != null) {
                if (j.c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.f8231c.k().equals(j.k())) {
                    if ((j.c() == LoadWhileShowSupportState.NONE || this.f8233e.contains(j.l())) && this.f8231c.l().equals(j.l())) {
                    }
                }
            }
            z = false;
            if (z && j != null) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(j.k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z = true;
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.verbose(j.k() + " does not support load while show and will not be added to the auction request");
        return !z;
    }
}
