package com.apm.insight.k;

import org.json.JSONObject;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final int f10728a;

    /* renamed from: b  reason: collision with root package name */
    private String f10729b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f10730c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f10731d;

    public l(int i) {
        this.f10728a = i;
    }

    public l(int i, String str) {
        this.f10728a = i;
        this.f10729b = str;
    }

    public l(int i, Throwable th) {
        this.f10728a = i;
        if (th != null) {
            this.f10729b = th.getMessage();
        }
    }

    public l(int i, JSONObject jSONObject) {
        this.f10728a = i;
        this.f10730c = jSONObject;
    }

    public l(int i, byte[] bArr) {
        this.f10728a = i;
        this.f10731d = bArr;
    }

    public boolean a() {
        return this.f10728a != 207;
    }

    public byte[] b() {
        return this.f10731d;
    }
}
