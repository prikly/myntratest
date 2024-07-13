package com.ironsource.a;

import android.util.Pair;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    String f7962a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7963b;

    /* renamed from: c  reason: collision with root package name */
    String f7964c;

    /* renamed from: d  reason: collision with root package name */
    d f7965d;

    /* renamed from: e  reason: collision with root package name */
    boolean f7966e = false;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<Pair<String, String>> f7967f;

    /* renamed from: com.ironsource.a.a$a  reason: collision with other inner class name */
    public static class C0079a {

        /* renamed from: a  reason: collision with root package name */
        String f7968a = "";

        /* renamed from: b  reason: collision with root package name */
        public boolean f7969b = false;

        /* renamed from: c  reason: collision with root package name */
        public String f7970c = "POST";

        /* renamed from: d  reason: collision with root package name */
        public d f7971d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f7972e = false;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<Pair<String, String>> f7973f = new ArrayList<>();

        public C0079a(String str) {
            if (str != null && !str.isEmpty()) {
                this.f7968a = str;
            }
        }
    }

    public a(C0079a aVar) {
        this.f7962a = aVar.f7968a;
        this.f7963b = aVar.f7969b;
        this.f7964c = aVar.f7970c;
        this.f7965d = aVar.f7971d;
        this.f7966e = aVar.f7972e;
        if (aVar.f7973f != null) {
            this.f7967f = new ArrayList<>(aVar.f7973f);
        }
    }
}
