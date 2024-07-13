package com.adcolony.sdk;

import com.adcolony.sdk.e0;
import org.json.JSONException;

class h0 {

    /* renamed from: a  reason: collision with root package name */
    private String f10090a;

    /* renamed from: b  reason: collision with root package name */
    private f1 f10091b;

    h0(f1 f1Var) {
        if (f1Var == null) {
            try {
                f1Var = new f1();
            } catch (JSONException e2) {
                new e0.a().a("JSON Error in ADCMessage constructor: ").a(e2.toString()).a(e0.i);
                return;
            }
        }
        this.f10091b = f1Var;
        this.f10090a = f1Var.e("m_type");
    }

    /* access modifiers changed from: package-private */
    public h0 a(f1 f1Var) {
        try {
            h0 h0Var = new h0("reply", this.f10091b.b("m_origin"), f1Var);
            h0Var.f10091b.b("m_id", this.f10091b.b("m_id"));
            return h0Var;
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCMessage's createReply(): ").a(e2.toString()).a(e0.i);
            return new h0("JSONException", 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(f1 f1Var) {
        if (f1Var == null) {
            f1Var = new f1();
        }
        this.f10091b = f1Var;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a.a(this.f10090a, this.f10091b);
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f10090a;
    }

    /* access modifiers changed from: package-private */
    public f1 a() {
        return this.f10091b;
    }

    h0(String str, int i) {
        try {
            this.f10090a = str;
            f1 f1Var = new f1();
            this.f10091b = f1Var;
            f1Var.b("m_target", i);
        } catch (JSONException e2) {
            new e0.a().a("JSON Error in ADCMessage constructor: ").a(e2.toString()).a(e0.i);
        }
    }

    h0(String str, int i, f1 f1Var) {
        try {
            this.f10090a = str;
            f1Var = f1Var == null ? new f1() : f1Var;
            this.f10091b = f1Var;
            f1Var.b("m_target", i);
        } catch (JSONException e2) {
            new e0.a().a("JSON Error in ADCMessage constructor: ").a(e2.toString()).a(e0.i);
        }
    }
}
