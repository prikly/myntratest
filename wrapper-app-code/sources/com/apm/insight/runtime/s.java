package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.entity.Header;
import com.apm.insight.h;
import com.apm.insight.l.i;
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.runtime.a.b;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private static s f10897a;

    /* renamed from: b  reason: collision with root package name */
    private File f10898b;

    /* renamed from: c  reason: collision with root package name */
    private File f10899c;

    /* renamed from: d  reason: collision with root package name */
    private File f10900d;

    /* renamed from: e  reason: collision with root package name */
    private Context f10901e;

    /* renamed from: f  reason: collision with root package name */
    private a f10902f = null;

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f10905a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f10906b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public File f10907c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f10908d;

        private a(File file) {
            this.f10908d = null;
            this.f10907c = file;
            String[] split = file.getName().split("-|\\.");
            this.f10905a = Long.parseLong(split[0]);
            this.f10906b = Long.parseLong(split[1]);
        }

        private String a() {
            return this.f10905a + "-" + this.f10906b + ".ctx";
        }

        /* access modifiers changed from: private */
        public void a(long j) {
            this.f10906b = j;
            this.f10907c.renameTo(new File(this.f10907c.getParent(), a()));
        }

        /* access modifiers changed from: private */
        public JSONObject b() {
            if (this.f10908d == null) {
                try {
                    this.f10908d = new JSONObject(i.c(this.f10907c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f10908d == null) {
                    this.f10908d = new JSONObject();
                }
            }
            return this.f10908d;
        }

        /* access modifiers changed from: private */
        public boolean b(long j) {
            long j2 = this.f10905a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = this.f10906b;
            if (j3 >= j || j - j3 <= 604800000) {
                return this.f10907c.lastModified() < j && j - this.f10907c.lastModified() > 604800000;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public void c() {
            this.f10907c.delete();
        }
    }

    private s(Context context) {
        File c2 = o.c(context);
        if (!c2.exists() || (!c2.isDirectory() && c2.delete())) {
            c2.mkdirs();
            b.a();
        }
        this.f10898b = c2;
        this.f10899c = new File(c2, "did");
        this.f10900d = new File(c2, "device_uuid");
        this.f10901e = context;
    }

    public static int a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (Header.c(jSONObject)) {
            return 2;
        }
        if (Header.c(jSONObject2)) {
            return 0;
        }
        return (!String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) || !Header.d(jSONObject)) ? 2 : 1;
    }

    public static s a() {
        if (f10897a == null) {
            f10897a = new s(h.g());
        }
        return f10897a;
    }

    private void a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = this.f10898b;
        File file2 = new File(file, "" + j + "-" + j2 + ".ctx");
        File file3 = this.f10898b;
        File file4 = new File(file3, "" + j + "-" + j2 + ".allData");
        try {
            i.a(file2, jSONObject, false);
            i.a(file4, jSONArray, false);
            this.f10902f = new a(file2);
        } catch (IOException e2) {
            com.apm.insight.b.a().a("NPTH_CATCH", (Throwable) e2);
        }
    }

    private a c() {
        if (this.f10902f == null) {
            d(".ctx");
        }
        return this.f10902f;
    }

    private void c(long j) {
        try {
            ArrayList<a> d2 = d("");
            if (d2.size() > 6) {
                Iterator<a> it = d2.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (next.b(j)) {
                        next.c();
                    }
                }
            }
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
        }
    }

    private File d(long j) {
        Iterator<a> it = d(".ctx").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j >= next.f10905a && j <= next.f10906b) {
                return next.f10907c;
            }
        }
        return null;
    }

    private ArrayList<a> d(final String str) {
        File[] listFiles = this.f10898b.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches();
            }
        });
        q.a((Object) "foundRuntimeContextFiles " + listFiles.length);
        ArrayList<a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        a aVar = null;
        for (File aVar2 : listFiles) {
            try {
                a aVar3 = new a(aVar2);
                arrayList.add(aVar3);
                if (this.f10902f == null && ".ctx".equals(str)) {
                    if (aVar != null) {
                        if (aVar3.f10906b < aVar.f10906b) {
                        }
                    }
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
        if (this.f10902f == null && aVar != null) {
            this.f10902f = aVar;
        }
        return arrayList;
    }

    private File e(long j) {
        Iterator<a> it = d(".allData").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j >= next.f10905a && j <= next.f10906b) {
                return next.f10907c;
            }
        }
        return null;
    }

    private File f(long j) {
        Iterator<a> it = d(".ctx").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.f10906b - j) > Math.abs(next.f10906b - j)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f10907c;
    }

    private File g(long j) {
        Iterator<a> it = d(".allData").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.f10906b - j) > Math.abs(next.f10906b - j)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f10907c;
    }

    public String a(String str) {
        try {
            return i.c(this.f10900d.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    public JSONObject a(long j) {
        boolean z;
        String str;
        File d2 = d(j);
        if (d2 == null) {
            d2 = f(j);
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (d2 != null) {
            try {
                str = i.c(d2.getAbsolutePath());
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.b.a().a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e2) {
                        com.apm.insight.b.a().a("NPTH_CATCH", (Throwable) e2);
                    }
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                com.apm.insight.b.a().a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                jSONObject.put("unauthentic_version", 1);
                return jSONObject;
            }
        }
        if (jSONObject != null && z) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    public void a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject a2 = Header.a(this.f10901e).a(map);
        if (!Header.c(a2)) {
            long currentTimeMillis = System.currentTimeMillis();
            a c2 = c();
            if (c2 == null) {
                a(currentTimeMillis, currentTimeMillis, a2, jSONArray);
                return;
            }
            int a3 = a(c2.b(), a2);
            if (a3 == 1) {
                a(c2.f10905a, currentTimeMillis, a2, jSONArray);
                i.a(c2.f10907c);
            } else if (a3 == 2) {
                a(currentTimeMillis, currentTimeMillis, a2, jSONArray);
            } else if (a3 == 3) {
                c2.a(currentTimeMillis);
            }
            c(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    public String b() {
        try {
            return i.c(this.f10899c.getAbsolutePath());
        } catch (Throwable unused) {
            return BuildConfig.ADAPTER_VERSION;
        }
    }

    public JSONArray b(long j) {
        String str;
        File e2 = e(j);
        if (e2 == null) {
            e2 = g(j);
        }
        if (e2 == null) {
            return null;
        }
        try {
            str = i.c(e2.getAbsolutePath());
            try {
                return new JSONArray(str);
            } catch (Throwable th) {
                th = th;
                com.apm.insight.b.a().a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
            com.apm.insight.b.a().a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(String str) {
        try {
            i.a(this.f10899c, str, false);
        } catch (Throwable unused) {
        }
    }

    public void c(String str) {
        try {
            i.a(this.f10900d, str, false);
        } catch (Throwable unused) {
        }
    }
}
