package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C0656qf;

/* renamed from: com.yandex.metrica.impl.ob.cm  reason: case insensitive filesystem */
public class C0315cm extends Vl {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f5643c = {3, 6, 4};

    /* renamed from: d  reason: collision with root package name */
    private static final C0315cm f5644d = new C0315cm("");

    public C0315cm(String str) {
        super(str);
    }

    public static C0315cm a() {
        return f5644d;
    }

    public String getTag() {
        return "AppMetrica";
    }

    public C0315cm() {
        this("");
    }

    public void a(C0656qf.d dVar, String str) {
        boolean z;
        String str2;
        for (C0656qf.d.a aVar : dVar.f6607c) {
            if (aVar != null) {
                int[] iArr = f5643c;
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (aVar.f6610c == iArr[i]) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(": ");
                    if (aVar.f6610c == 3 && TextUtils.isEmpty(aVar.f6611d)) {
                        str2 = "Native crash of app";
                    } else if (aVar.f6610c == 4) {
                        StringBuilder sb2 = new StringBuilder(aVar.f6611d);
                        if (aVar.f6612e != null) {
                            String str3 = new String(aVar.f6612e);
                            if (!TextUtils.isEmpty(str3)) {
                                sb2.append(" with value ");
                                sb2.append(str3);
                            }
                        }
                        str2 = sb2.toString();
                    } else {
                        str2 = aVar.f6611d;
                    }
                    sb.append(str2);
                    i(sb.toString());
                }
            }
        }
    }
}
