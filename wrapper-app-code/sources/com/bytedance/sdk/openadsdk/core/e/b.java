package com.bytedance.sdk.openadsdk.core.e;

import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.h.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdLogInfoModel */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f1038a;

    /* renamed from: b  reason: collision with root package name */
    public int f1039b;

    /* renamed from: c  reason: collision with root package name */
    public int f1040c = 1;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<Integer> f1041d;

    /* renamed from: e  reason: collision with root package name */
    public AdSlot f1042e;

    public static void a(b bVar) {
        if (bVar != null && bVar.d() != null) {
            com.bytedance.sdk.openadsdk.h.b.a().a((a) new a(bVar) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f1043a;

                {
                    this.f1043a = r1;
                }

                public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", this.f1043a.c());
                    jSONObject.put("err_code", this.f1043a.b());
                    jSONObject.put("server_res_str", this.f1043a.a());
                    if (this.f1043a.e() != null && this.f1043a.e().size() > 0) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray(this.f1043a.e()).toString());
                    }
                    l.a("AdLogInfoModel", "rd_client_custom_error = ", jSONObject);
                    return com.bytedance.sdk.openadsdk.h.a.b.b().a("rd_client_custom_error").a(this.f1043a.d().getDurationSlotType()).b(jSONObject.toString());
                }
            });
        }
    }

    public String a() {
        return this.f1038a;
    }

    public void a(int i) {
        this.f1039b = i;
    }

    public void a(AdSlot adSlot) {
        this.f1042e = adSlot;
    }

    public void a(String str) {
        this.f1038a = str;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.f1041d = arrayList;
    }

    public int b() {
        return this.f1039b;
    }

    public void b(int i) {
        this.f1040c = i;
    }

    public int c() {
        return this.f1040c;
    }

    public AdSlot d() {
        return this.f1042e;
    }

    public ArrayList<Integer> e() {
        return this.f1041d;
    }
}
