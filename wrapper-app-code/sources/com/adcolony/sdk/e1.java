package com.adcolony.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class e1 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONArray f10049a;

    e1() {
        this(new JSONArray());
    }

    /* access modifiers changed from: package-private */
    public Object a(int i) throws JSONException {
        return this.f10049a.get(i);
    }

    /* access modifiers changed from: package-private */
    public int b(int i) throws JSONException {
        return this.f10049a.getInt(i);
    }

    /* access modifiers changed from: package-private */
    public f1 c(int i) {
        f1 f1Var;
        synchronized (this.f10049a) {
            JSONObject optJSONObject = this.f10049a.optJSONObject(i);
            f1Var = optJSONObject != null ? new f1(optJSONObject) : new f1();
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    public String d(int i) {
        String optString;
        synchronized (this.f10049a) {
            optString = this.f10049a.optString(i);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    public String e(int i) {
        synchronized (this.f10049a) {
            if (!this.f10049a.isNull(i)) {
                Object opt = this.f10049a.opt(i);
                if (opt instanceof String) {
                    String str = (String) opt;
                    return str;
                } else if (opt != null) {
                    String valueOf = String.valueOf(opt);
                    return valueOf;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public e1 f(int i) {
        synchronized (this.f10049a) {
            this.f10049a.put(i);
        }
        return this;
    }

    public String toString() {
        String jSONArray;
        synchronized (this.f10049a) {
            jSONArray = this.f10049a.toString();
        }
        return jSONArray;
    }

    e1(String str) throws JSONException {
        this(new JSONArray(str));
    }

    /* access modifiers changed from: package-private */
    public e1 a(f1 f1Var) {
        synchronized (this.f10049a) {
            this.f10049a.put(f1Var.a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public e1 b(String str) {
        synchronized (this.f10049a) {
            this.f10049a.put(str);
        }
        return this;
    }

    e1(JSONArray jSONArray) throws NullPointerException {
        jSONArray.getClass();
        this.f10049a = jSONArray;
    }

    /* access modifiers changed from: package-private */
    public String[] d() {
        String[] strArr;
        synchronized (this.f10049a) {
            strArr = new String[this.f10049a.length()];
            for (int i = 0; i < this.f10049a.length(); i++) {
                strArr[i] = d(i);
            }
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        boolean z;
        synchronized (this.f10049a) {
            z = false;
            int i = 0;
            while (true) {
                if (i >= this.f10049a.length()) {
                    break;
                } else if (d(i).equals(str)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f10049a.length();
    }

    /* access modifiers changed from: package-private */
    public f1[] c() {
        f1[] f1VarArr;
        synchronized (this.f10049a) {
            f1VarArr = new f1[this.f10049a.length()];
            for (int i = 0; i < this.f10049a.length(); i++) {
                f1VarArr[i] = c(i);
            }
        }
        return f1VarArr;
    }

    /* access modifiers changed from: package-private */
    public JSONArray a() {
        return this.f10049a;
    }
}
