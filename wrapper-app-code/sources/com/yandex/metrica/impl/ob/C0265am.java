package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.am  reason: case insensitive filesystem */
public class C0265am extends HashMap<String, String> {

    /* renamed from: a  reason: collision with root package name */
    private int f5490a = 0;

    public C0265am() {
    }

    /* renamed from: a */
    public String put(String str, String str2) {
        if (containsKey(str)) {
            if (str2 == null) {
                return remove(str);
            }
            String str3 = (String) get(str);
            this.f5490a += str2.length() - (str3 == null ? 0 : str3.length());
            return (String) super.put(str, str2);
        } else if (str2 == null) {
            return null;
        } else {
            this.f5490a += str.length() + str2.length();
            return (String) super.put(str, str2);
        }
    }

    public C0265am(String str) throws JSONException {
        super(Tl.e(str));
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f5490a += str2.length() + (str3 == null ? 0 : str3.length());
        }
    }

    /* renamed from: a */
    public String remove(Object obj) {
        int i;
        if (containsKey(obj)) {
            String str = (String) get(obj);
            int i2 = this.f5490a;
            int length = ((String) obj).length();
            if (str == null) {
                i = 0;
            } else {
                i = str.length();
            }
            this.f5490a = i2 - (length + i);
        }
        return (String) super.remove(obj);
    }

    public int a() {
        return this.f5490a;
    }
}
