package com.ironsource.mediationsdk.utils;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0880b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Integer> f8902a;

    /* renamed from: b  reason: collision with root package name */
    d f8903b;

    /* renamed from: c  reason: collision with root package name */
    public IronSourceLoggerManager f8904c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Integer> f8905d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f8906e;

    /* renamed from: f  reason: collision with root package name */
    private String f8907f;

    /* renamed from: g  reason: collision with root package name */
    private Timer f8908g = null;

    public e(String str, d dVar) {
        this.f8907f = str;
        this.f8903b = dVar;
        this.f8902a = new HashMap();
        this.f8905d = new HashMap();
        this.f8906e = new HashMap();
        this.f8904c = IronSourceLoggerManager.getLogger();
        a();
    }

    private void a(String str, int i) {
        this.f8905d.put(str, Integer.valueOf(i));
        this.f8906e.put(str, c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), e(str), i);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), f(str), c());
    }

    private int b(String str) {
        if (!c().equalsIgnoreCase(c(str))) {
            a(str);
        }
        return d(str);
    }

    private static Date b() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    private static String c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    private String c(String str) {
        if (this.f8906e.containsKey(str)) {
            return this.f8906e.get(str);
        }
        String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), f(str), c());
        this.f8906e.put(str, stringFromSharedPrefs);
        return stringFromSharedPrefs;
    }

    private int d(String str) {
        if (this.f8905d.containsKey(str)) {
            return this.f8905d.get(str).intValue();
        }
        int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), e(str), 0);
        this.f8905d.put(str, Integer.valueOf(intFromSharedPrefs));
        return intFromSharedPrefs;
    }

    private static String e(String str) {
        return str + "_counter";
    }

    private static String f(String str) {
        return str + "_day";
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Timer timer = this.f8908g;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f8908g = timer2;
        timer2.schedule(new TimerTask() {
            public final void run() {
                e eVar = e.this;
                synchronized (eVar) {
                    try {
                        for (String a2 : eVar.f8902a.keySet()) {
                            eVar.a(a2);
                        }
                        eVar.f8903b.g();
                        eVar.a();
                    } catch (Exception e2) {
                        eVar.f8904c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e2);
                    }
                }
            }
        }, b());
    }

    public final void a(C0880b bVar) {
        synchronized (this) {
            try {
                String d2 = d(bVar);
                if (this.f8902a.containsKey(d2)) {
                    a(d2, b(d2) + 1);
                }
            } catch (Exception e2) {
                this.f8904c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f8905d.put(str, 0);
        this.f8906e.put(str, c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), e(str), 0);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), f(str), c());
    }

    public final boolean b(C0880b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d2 = d(bVar);
                if (!this.f8902a.containsKey(d2)) {
                    return false;
                }
                if (c().equalsIgnoreCase(c(d2))) {
                    return false;
                }
                if (this.f8902a.get(d2).intValue() <= d(d2)) {
                    z = true;
                }
                return z;
            } catch (Exception e2) {
                this.f8904c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e2);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(C0880b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d2 = d(bVar);
                if (!this.f8902a.containsKey(d2)) {
                    return false;
                }
                if (this.f8902a.get(d2).intValue() <= b(d2)) {
                    z = true;
                }
                return z;
            } catch (Exception e2) {
                this.f8904c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e2);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d(C0880b bVar) {
        return this.f8907f + "_" + bVar.f8569f + "_" + bVar.j();
    }
}
