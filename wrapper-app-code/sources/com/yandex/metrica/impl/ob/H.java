package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class H {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4061a;

    /* renamed from: b  reason: collision with root package name */
    private final C0302c9 f4062b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4063c;

    /* renamed from: d  reason: collision with root package name */
    private final C0565mn f4064d;

    public H(Context context, C0302c9 c9Var) {
        this(context, c9Var, context.getPackageName(), new C0565mn());
    }

    public List<String> a() {
        Signature[] signatureArr;
        String str;
        List<String> h2 = this.f4062b.h();
        boolean isEmpty = h2.isEmpty();
        ArrayList arrayList = h2;
        if (isEmpty) {
            ArrayList arrayList2 = new ArrayList();
            try {
                if (A2.a(28)) {
                    SigningInfo signingInfo = this.f4064d.b(this.f4061a, this.f4063c, 134217728).signingInfo;
                    if (signingInfo.hasMultipleSigners()) {
                        signatureArr = signingInfo.getApkContentsSigners();
                    } else {
                        signatureArr = signingInfo.getSigningCertificateHistory();
                    }
                } else {
                    signatureArr = this.f4064d.b(this.f4061a, this.f4063c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature byteArray : signatureArr) {
                        try {
                            str = C0267b.a(MessageDigest.getInstance("SHA1").digest(byteArray.toByteArray())).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList2);
            boolean isEmpty2 = arrayList2.isEmpty();
            arrayList = arrayList2;
            if (!isEmpty2) {
                this.f4062b.a((List<String>) arrayList2).d();
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }

    H(Context context, C0302c9 c9Var, String str, C0565mn mnVar) {
        this.f4061a = context;
        this.f4062b = c9Var;
        this.f4063c = str;
        this.f4064d = mnVar;
    }
}
