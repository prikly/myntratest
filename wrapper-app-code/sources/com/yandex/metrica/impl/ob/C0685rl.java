package com.yandex.metrica.impl.ob;

import com.appnext.base.a.c.d;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.rl  reason: case insensitive filesystem */
public class C0685rl {

    /* renamed from: a  reason: collision with root package name */
    public final String f6733a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6734b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6735c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6736d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6737e;

    /* renamed from: f  reason: collision with root package name */
    public final c f6738f;

    /* renamed from: g  reason: collision with root package name */
    public final a f6739g;

    /* renamed from: com.yandex.metrica.impl.ob.rl$a */
    enum a {
        LIST("LIST"),
        LABEL("LABEL"),
        BUTTON("BUTTON"),
        CONTAINER("CONTAINER"),
        TOOLBAR("TOOLBAR"),
        INPUT("INPUT"),
        IMAGE("IMAGE"),
        WEBVIEW("WEBVIEW"),
        OTHER("OTHER");
        
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f6747a;

        private a(String str) {
            this.f6747a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rl$b */
    enum b {
        TEXT_TOO_LONG("TEXT_TOO_LONG"),
        REGEXP_NOT_MATCHED("REGEXP_NOT_MATCHED"),
        IRRELEVANT_CLASS("IRRELEVANT_CLASS"),
        BAD_REGEXP_MATCHED("BAD_REGEXP_MATCHED"),
        EQUALS("EQUALS"),
        CONTAINS("CONTAINS");
        
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f6755a;

        private b(String str) {
            this.f6755a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rl$c */
    enum c {
        VIEW_CONTAINER("VIEW_CONTAINER"),
        VIEW("VIEW");
        
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f6759a;

        private c(String str) {
            this.f6759a = str;
        }
    }

    C0685rl(String str, String str2, b bVar, int i, boolean z, c cVar, a aVar) {
        this.f6733a = str;
        this.f6734b = str2;
        this.f6735c = bVar;
        this.f6736d = i;
        this.f6737e = z;
        this.f6738f = cVar;
        this.f6739g = aVar;
    }

    /* access modifiers changed from: package-private */
    public b a(Ak ak) {
        return this.f6735c;
    }

    /* access modifiers changed from: package-private */
    public JSONArray a(C0439hl hlVar) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return false;
    }

    public String toString() {
        return "UiElement{mClassName='" + this.f6733a + '\'' + ", mId='" + this.f6734b + '\'' + ", mParseFilterReason=" + this.f6735c + ", mDepth=" + this.f6736d + ", mListItem=" + this.f6737e + ", mViewType=" + this.f6738f + ", mClassType=" + this.f6739g + '}';
    }

    public JSONObject a(C0439hl hlVar, b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(d.COLUMN_TYPE, this.f6738f.f6759a);
            if (bVar == null) {
                jSONObject.put("cnt", a(hlVar));
            }
            if (hlVar.f5947e) {
                JSONObject put = new JSONObject().put(com.appnext.base.a.c.a.dS, this.f6739g.f6747a).put("cn", this.f6733a).put("rid", this.f6734b).put("d", this.f6736d).put("lc", this.f6737e).put("if", bVar != null);
                if (bVar != null) {
                    put.put("fr", bVar.f6755a);
                }
                jSONObject.put("i", put);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
