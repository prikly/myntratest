package com.bytedance.sdk.openadsdk.core.j;

import com.bytedance.sdk.openadsdk.core.j.b.c;
import com.bytedance.sdk.openadsdk.core.j.c.a;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastResource */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f1314a;

    /* renamed from: b  reason: collision with root package name */
    protected int f1315b;

    /* renamed from: c  reason: collision with root package name */
    protected a.C0007a f1316c;

    /* renamed from: d  reason: collision with root package name */
    protected a.b f1317d;

    /* renamed from: e  reason: collision with root package name */
    protected String f1318e;

    /* renamed from: f  reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.j.b.c> f1319f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.j.b.c> f1320g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    protected String f1321h;
    private String i;

    public c(int i2, int i3, a.C0007a aVar, a.b bVar, String str, List<com.bytedance.sdk.openadsdk.core.j.b.c> list, List<com.bytedance.sdk.openadsdk.core.j.b.c> list2, String str2) {
        this.f1314a = i2;
        this.f1315b = i3;
        this.f1316c = aVar;
        this.f1317d = bVar;
        this.f1318e = str;
        this.f1319f = list;
        this.f1320g = list2;
        this.f1321h = str2;
    }

    public int b() {
        return this.f1314a;
    }

    public int c() {
        return this.f1315b;
    }

    public void a(long j) {
        com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f1319f, (com.bytedance.sdk.openadsdk.core.j.a.a) null, j, this.i);
    }

    public void b(long j) {
        com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f1320g, (com.bytedance.sdk.openadsdk.core.j.a.a) null, j, this.i);
    }

    public static float a(int i2, int i3, int i4, int i5, a.b bVar, a.C0007a aVar) {
        if (i3 == 0 || i5 == 0) {
            return 0.0f;
        }
        float f2 = (float) i2;
        float f3 = (float) i4;
        return a(bVar, aVar) / ((Math.abs((f2 / ((float) i3)) - (f3 / ((float) i5))) + Math.abs((f2 - f3) / f2)) + 1.0f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c$1  reason: invalid class name */
    /* compiled from: VastResource */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1322a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.j.c.a$b[] r0 = com.bytedance.sdk.openadsdk.core.j.c.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1322a = r0
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.j.c.a.b.STATIC_RESOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1322a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.j.c.a.b.HTML_RESOURCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1322a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.j.c.a.b.IFRAME_RESOURCE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.j.c.AnonymousClass1.<clinit>():void");
        }
    }

    private static float a(a.b bVar, a.C0007a aVar) {
        int i2 = AnonymousClass1.f1322a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return i2 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        } else if (a.C0007a.JAVASCRIPT.equals(aVar)) {
            return 1.0f;
        } else {
            if (a.C0007a.IMAGE.equals(aVar)) {
                return 0.8f;
            }
            return 0.0f;
        }
    }

    public String d() {
        int i2 = AnonymousClass1.f1322a[this.f1317d.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return this.f1318e;
            }
            if (i2 != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.f1314a + "\" height=\"" + this.f1315b + "\" src=\"" + this.f1318e + "\"></iframe>";
        } else if (this.f1316c == a.C0007a.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f1318e + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        } else if (this.f1316c != a.C0007a.JAVASCRIPT) {
            return null;
        } else {
            return "<script src=\"" + this.f1318e + "\"></script>";
        }
    }

    public String e() {
        if (this.f1317d == a.b.STATIC_RESOURCE && this.f1316c == a.C0007a.IMAGE) {
            return this.f1318e;
        }
        return null;
    }

    public void a(String str) {
        this.i = str;
    }

    public static c b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt(IabUtils.KEY_WIDTH);
        int optInt2 = jSONObject.optInt(IabUtils.KEY_HEIGHT);
        String optString = jSONObject.optString("creativeType", a.C0007a.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", a.b.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            arrayList.add(new c.a(optJSONArray.optString(i2)).a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
            arrayList2.add(new c.a(optJSONArray2.optString(i3)).a());
        }
        return new c(optInt, optInt2, a.C0007a.valueOf(optString), a.b.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IabUtils.KEY_WIDTH, this.f1314a);
        jSONObject.put(IabUtils.KEY_HEIGHT, this.f1315b);
        jSONObject.put("creativeType", this.f1316c.toString());
        jSONObject.put("resourceType", this.f1317d.toString());
        jSONObject.put("contentUrl", this.f1318e);
        jSONObject.put("clickThroughUri", this.f1321h);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f1319f));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f1320g));
        return jSONObject;
    }
}
