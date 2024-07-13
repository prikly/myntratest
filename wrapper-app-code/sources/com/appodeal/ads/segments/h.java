package com.appodeal.ads.segments;

import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.storage.o;
import com.appodeal.ads.u;
import com.appodeal.ads.utils.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final TreeMap<String, g> f17256a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final TreeMap f17257b = new TreeMap();

    /* renamed from: c  reason: collision with root package name */
    public static final o f17258c = o.f17407b;

    /* renamed from: d  reason: collision with root package name */
    public static final CopyOnWriteArrayList f17259d = new CopyOnWriteArrayList();

    public interface a {
        String a();

        void a(g gVar);

        g b();
    }

    public static final g a(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        TreeMap<String, g> treeMap = f17256a;
        if (treeMap.containsKey(str)) {
            g gVar = treeMap.get(str);
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        TreeMap treeMap2 = f17257b;
        if (treeMap2.containsKey(str)) {
            Object obj = treeMap2.get(str);
            if (obj != null) {
                return (g) obj;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (!Intrinsics.areEqual((Object) str, (Object) RewardedVideo.VIDEO_MODE_DEFAULT)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("'%s' not found, using default placement", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            Log.log("Placement", LogConstants.EVENT_GET, format);
        }
        if (treeMap.containsKey(RewardedVideo.VIDEO_MODE_DEFAULT)) {
            g gVar2 = treeMap.get(RewardedVideo.VIDEO_MODE_DEFAULT);
            if (gVar2 != null) {
                return gVar2;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (treeMap2.containsKey(RewardedVideo.VIDEO_MODE_DEFAULT)) {
            Object obj2 = treeMap2.get(RewardedVideo.VIDEO_MODE_DEFAULT);
            if (obj2 != null) {
                return (g) obj2;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else {
            g gVar3 = g.f17247h;
            Intrinsics.checkNotNullExpressionValue(gVar3, "DEFAULT");
            return gVar3;
        }
    }

    public static void a() {
        Map<String, String> e2 = f17258c.e();
        long currentTimeMillis = ((System.currentTimeMillis() / ((long) 1000)) / ((long) 60)) - ((long) 43200);
        for (Map.Entry next : e2.entrySet()) {
            String str = (String) next.getKey();
            try {
                JSONArray jSONArray = new JSONArray((String) next.getValue());
                JSONArray jSONArray2 = new JSONArray();
                int i = 0;
                int length = jSONArray.length();
                while (i < length) {
                    int i2 = i + 1;
                    long j = jSONArray.getLong(i);
                    if (j > currentTimeMillis) {
                        jSONArray2.put(j);
                    }
                    i = i2;
                }
                o oVar = f17258c;
                String jSONArray3 = jSONArray2.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray3, "output.toString()");
                oVar.c(str, jSONArray3);
            } catch (Exception e3) {
                Log.log(e3);
            }
        }
    }

    public static final void a(u.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "callback");
        f17259d.add(cVar);
    }

    public static void a(JSONArray jSONArray) {
        if (jSONArray != null) {
            int i = 0;
            int length = jSONArray.length();
            while (i < length) {
                int i2 = i + 1;
                g a2 = g.a(jSONArray.getJSONObject(i));
                if (a2 != null) {
                    TreeMap treeMap = f17257b;
                    g gVar = (g) treeMap.get(a2.b());
                    a2.a(gVar == null ? 0 : gVar.a());
                    String b2 = a2.b();
                    Intrinsics.checkNotNullExpressionValue(b2, "placement.name");
                    treeMap.put(b2, a2);
                }
                i = i2;
            }
        }
    }

    public static boolean a(g gVar) {
        return gVar == null || Intrinsics.areEqual((Object) gVar, (Object) g.f17247h);
    }

    public static final g b() {
        return a(RewardedVideo.VIDEO_MODE_DEFAULT);
    }

    public static boolean c() {
        if (!f17257b.isEmpty()) {
            if (!(n.c().f17272a == -1)) {
                return true;
            }
        }
        return false;
    }

    public static final void d() {
        Iterator it = f17259d.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            String a2 = aVar.a();
            if (a2 != null && a(aVar.b())) {
                aVar.a(a(a2));
            }
        }
    }
}
