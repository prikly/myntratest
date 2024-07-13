package com.yandex.metrica.impl.ob;

import java.util.List;
import org.json.JSONObject;

public class Ud implements C0688s0<a, C0357ee> {

    /* renamed from: a  reason: collision with root package name */
    public final C0357ee f5097a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f5098b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f5099a;

        /* renamed from: b  reason: collision with root package name */
        public final JSONObject f5100b;

        /* renamed from: c  reason: collision with root package name */
        public final C0736u0 f5101c;

        public a(String str, JSONObject jSONObject, C0736u0 u0Var) {
            this.f5099a = str;
            this.f5100b = jSONObject;
            this.f5101c = u0Var;
        }

        public String toString() {
            return "Candidate{trackingId='" + this.f5099a + '\'' + ", additionalParams=" + this.f5100b + ", source=" + this.f5101c + '}';
        }
    }

    public Ud(C0357ee eeVar, List<a> list) {
        this.f5097a = eeVar;
        this.f5098b = list;
    }

    public List<a> a() {
        return this.f5098b;
    }

    public Object b() {
        return this.f5097a;
    }

    public String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f5097a + ", candidates=" + this.f5098b + '}';
    }
}
