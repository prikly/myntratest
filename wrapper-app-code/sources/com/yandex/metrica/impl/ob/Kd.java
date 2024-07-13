package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public abstract class Kd {

    /* renamed from: e  reason: collision with root package name */
    private static final Rd f4432e = new Rd("UNDEFINED_", (String) null);

    /* renamed from: a  reason: collision with root package name */
    protected final String f4433a;

    /* renamed from: b  reason: collision with root package name */
    protected final SharedPreferences f4434b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f4435c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f4436d = false;

    public Kd(Context context, String str) {
        this.f4433a = str;
        this.f4434b = a(context);
        new Rd(f4432e.b(), str);
    }

    private SharedPreferences a(Context context) {
        return C0267b.a(context, d());
    }

    public void b() {
        synchronized (this) {
            a();
            this.f4435c.clear();
            this.f4436d = false;
        }
    }

    /* access modifiers changed from: protected */
    public String c() {
        return this.f4433a;
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    /* access modifiers changed from: protected */
    public <T extends Kd> T e() {
        synchronized (this) {
            this.f4436d = true;
            this.f4435c.clear();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public <T extends Kd> T a(String str, Object obj) {
        synchronized (this) {
            if (obj != null) {
                this.f4435c.put(str, obj);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public <T extends Kd> T a(String str) {
        synchronized (this) {
            this.f4435c.put(str, this);
        }
        return this;
    }

    private void a() {
        SharedPreferences.Editor edit = this.f4434b.edit();
        if (this.f4436d) {
            edit.clear();
            edit.apply();
            return;
        }
        for (Map.Entry next : this.f4435c.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value == this) {
                edit.remove(str);
            } else if (value instanceof String) {
                edit.putString(str, (String) value);
            } else if (value instanceof Long) {
                edit.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                edit.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value != null) {
                throw new UnsupportedOperationException();
            }
        }
        edit.apply();
    }
}
