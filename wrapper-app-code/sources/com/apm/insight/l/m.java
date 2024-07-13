package com.apm.insight.l;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class m {

    /* renamed from: a  reason: collision with root package name */
    final Writer f10747a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f10748b = new ArrayList();

    enum a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public m(Writer writer) {
        this.f10747a = writer;
    }

    private void a(a aVar) {
        List<a> list = this.f10748b;
        list.set(list.size() - 1, aVar);
    }

    private void a(JSONArray jSONArray) {
        a();
        for (int i = 0; i < jSONArray.length(); i++) {
            a(jSONArray.get(i));
        }
        b();
    }

    public static void a(JSONArray jSONArray, Writer writer) {
        new m(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) {
        c();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next).a(jSONObject.get(next));
        }
        d();
    }

    public static void a(JSONObject jSONObject, Writer writer) {
        new m(writer).a(jSONObject);
        writer.flush();
    }

    private void b(String str) {
        Writer writer;
        String str2;
        this.f10747a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                writer = this.f10747a;
                str2 = "\\f";
            } else if (charAt != 13) {
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            writer = this.f10747a;
                            str2 = "\\b";
                            break;
                        case 9:
                            writer = this.f10747a;
                            str2 = "\\t";
                            break;
                        case 10:
                            writer = this.f10747a;
                            str2 = "\\n";
                            break;
                        default:
                            if (charAt <= 31) {
                                this.f10747a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f10747a.write(92);
                }
                this.f10747a.write(charAt);
            } else {
                writer = this.f10747a;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.f10747a.write("\"");
    }

    private a e() {
        List<a> list = this.f10748b;
        return list.get(list.size() - 1);
    }

    private void f() {
        a e2 = e();
        if (e2 == a.NONEMPTY_OBJECT) {
            this.f10747a.write(44);
        } else if (e2 != a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        a(a.DANGLING_KEY);
    }

    private void g() {
        a aVar;
        if (!this.f10748b.isEmpty()) {
            a e2 = e();
            if (e2 == a.EMPTY_ARRAY) {
                aVar = a.NONEMPTY_ARRAY;
            } else if (e2 == a.NONEMPTY_ARRAY) {
                this.f10747a.write(44);
                return;
            } else if (e2 == a.DANGLING_KEY) {
                this.f10747a.write(":");
                aVar = a.NONEMPTY_OBJECT;
            } else if (e2 != a.NULL) {
                throw new JSONException("Nesting problem");
            } else {
                return;
            }
            a(aVar);
        }
    }

    public m a() {
        return a(a.EMPTY_ARRAY, "[");
    }

    /* access modifiers changed from: package-private */
    public m a(a aVar, a aVar2, String str) {
        e();
        List<a> list = this.f10748b;
        list.remove(list.size() - 1);
        this.f10747a.write(str);
        return this;
    }

    /* access modifiers changed from: package-private */
    public m a(a aVar, String str) {
        g();
        this.f10748b.add(aVar);
        this.f10747a.write(str);
        return this;
    }

    public m a(Object obj) {
        Writer writer;
        String numberToString;
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        } else if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        } else {
            g();
            if (obj == null || obj == JSONObject.NULL) {
                this.f10747a.write("null");
            } else {
                if (obj instanceof Boolean) {
                    writer = this.f10747a;
                    numberToString = String.valueOf(obj);
                } else if (obj instanceof Number) {
                    writer = this.f10747a;
                    numberToString = JSONObject.numberToString((Number) obj);
                } else {
                    b(obj.toString());
                }
                writer.write(numberToString);
            }
            return this;
        }
    }

    public m a(String str) {
        f();
        b(str);
        return this;
    }

    public m b() {
        return a(a.EMPTY_ARRAY, a.NONEMPTY_ARRAY, "]");
    }

    public m c() {
        return a(a.EMPTY_OBJECT, "{");
    }

    public m d() {
        return a(a.EMPTY_OBJECT, a.NONEMPTY_OBJECT, "}");
    }

    public String toString() {
        return "";
    }
}
