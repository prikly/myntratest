package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.v;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f15811a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f15812b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f15813c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15814d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f15815e;

    private e(Context context) {
        boolean z;
        Bundle bundle = null;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e2) {
            v.c("AndroidManifest", "Failed to get meta data.", e2);
        } catch (Throwable th) {
            this.f15813c = null;
            throw th;
        }
        this.f15813c = bundle;
        int i = 0;
        try {
            XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = openXmlResourceParser.getEventType();
            int i2 = 0;
            z = false;
            do {
                if (2 == eventType) {
                    try {
                        if (openXmlResourceParser.getName().equals("application")) {
                            for (int i3 = 0; i3 < openXmlResourceParser.getAttributeCount(); i3++) {
                                String attributeName = openXmlResourceParser.getAttributeName(i3);
                                String attributeValue = openXmlResourceParser.getAttributeValue(i3);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    i2 = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    z = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                        try {
                            v.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            this.f15814d = i;
                            this.f15815e = z;
                        } catch (Throwable th3) {
                            this.f15814d = i;
                            this.f15815e = z;
                            throw th3;
                        }
                    }
                }
                eventType = openXmlResourceParser.next();
            } while (eventType != 1);
            this.f15814d = i2;
        } catch (Throwable th4) {
            th = th4;
            z = false;
            v.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
            this.f15814d = i;
            this.f15815e = z;
        }
        this.f15815e = z;
    }

    public static e a(Context context) {
        e eVar;
        synchronized (f15812b) {
            if (f15811a == null) {
                f15811a = new e(context);
            }
            eVar = f15811a;
        }
        return eVar;
    }

    public String a(String str, String str2) {
        Bundle bundle = this.f15813c;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean a() {
        return this.f15814d != 0;
    }

    public boolean a(String str) {
        Bundle bundle = this.f15813c;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z) {
        Bundle bundle = this.f15813c;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }
}
