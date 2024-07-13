package com.ironsource.sdk.a;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static a f8999a = new a(2001, a("initsdk"));

    /* renamed from: b  reason: collision with root package name */
    public static a f9000b = new a(2002, a("createcontrollerweb"));

    /* renamed from: c  reason: collision with root package name */
    public static a f9001c = new a(2003, a("createcontrollernative"));

    /* renamed from: d  reason: collision with root package name */
    public static a f9002d = new a(2004, a("controllerstageready"));

    /* renamed from: e  reason: collision with root package name */
    public static a f9003e = new a(IronSourceConstants.IS_INSTANCE_OPENED, a("loadad"));

    /* renamed from: f  reason: collision with root package name */
    public static a f9004f = new a(2006, a("loadadfailed"));

    /* renamed from: g  reason: collision with root package name */
    public static a f9005g = new a(2007, a("initproduct"));

    /* renamed from: h  reason: collision with root package name */
    public static a f9006h = new a(AdError.REMOTE_ADS_SERVICE_ERROR, a("initproductfailed"));
    public static a i = new a(AdError.INTERSTITIAL_AD_TIMEOUT, a("loadproduct"));
    public static a j = new a(2010, a("parseadmfailed"));
    public static a k = new a(2011, a("loadadsuccess"));
    public static a l = new a(2013, a("controllerfailed"));
    public static a m = new a(2015, a("appendnativefeaturesdatafailed"));
    public static a n = new a(2016, a("adunitcouldnotloadtowebview"));
    public static a o = new a(2017, a("webviewcleanupfailed"));
    public static a p = new a(2018, a("removewebviewfailed"));
    public static a q = new a(2021, a("fialedregactlifecycle"));
    public static a r = new a(2022, a("loadcontrollerhtml"));
    public static a s = new a(2023, a("controllerhtmlsuccess"));
    public static a t = new a(2024, a("controllerhtmlfailed"));
    public static a u = new a(2025, a("webviewcrashrpg"));

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f9007a;

        /* renamed from: b  reason: collision with root package name */
        int f9008b;

        a(int i, String str) {
            this.f9008b = i;
            this.f9007a = str;
        }
    }

    static {
        new a(2014, a("extractinstalledpackagesfailed"));
        new a(2019, a("adunitcouldnotloadtowebviewbanners"));
        new a(2020, a("banneralreadydestroyed"));
    }

    private static String a(String str) {
        return "n_" + str;
    }
}
