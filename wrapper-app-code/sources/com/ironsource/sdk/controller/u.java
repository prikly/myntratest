package com.ironsource.sdk.controller;

import android.text.TextUtils;
import java.util.HashSet;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9274a = false;

    /* renamed from: b  reason: collision with root package name */
    private HashSet<String> f9275b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private String f9276c;

    /* renamed from: d  reason: collision with root package name */
    private String f9277d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9278e = false;

    /* renamed from: f  reason: collision with root package name */
    private int f9279f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9280g = true;

    public HashSet<String> a() {
        return this.f9275b;
    }

    public void a(int i) {
        this.f9279f = i;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f9275b.add(str);
        }
    }

    public void a(boolean z) {
        this.f9274a = z;
    }

    public void b(String str) {
        this.f9276c = str;
    }

    public void b(boolean z) {
        this.f9278e = z;
    }

    public boolean b() {
        return this.f9274a;
    }

    public String c() {
        return this.f9276c;
    }

    public void c(String str) {
        this.f9277d = str;
    }

    public void c(boolean z) {
        this.f9280g = z;
    }

    public String d() {
        return this.f9277d;
    }

    public boolean e() {
        return this.f9278e;
    }

    public int f() {
        return this.f9279f;
    }

    public boolean g() {
        return this.f9280g;
    }
}
