package com.ironsource.sdk.g;

public final class a extends f {

    /* renamed from: e  reason: collision with root package name */
    private static String f9500e = "type";

    /* renamed from: f  reason: collision with root package name */
    private static String f9501f = "numOfAdUnits";

    /* renamed from: g  reason: collision with root package name */
    private static String f9502g = "firstCampaignCredits";

    /* renamed from: h  reason: collision with root package name */
    private static String f9503h = "totalNumberCredits";
    private static String i = "productType";

    /* renamed from: a  reason: collision with root package name */
    public String f9504a;

    /* renamed from: b  reason: collision with root package name */
    public String f9505b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9506c;
    private String j;
    private String k;
    private String l;

    public a(String str) {
        super(str);
        boolean z;
        if (a(f9500e)) {
            this.j = d(f9500e);
        }
        if (a(f9501f)) {
            this.f9505b = d(f9501f);
            z = true;
        } else {
            z = false;
        }
        this.f9506c = z;
        if (a(f9502g)) {
            this.k = d(f9502g);
        }
        if (a(f9503h)) {
            this.l = d(f9503h);
        }
        if (a(i)) {
            this.f9504a = d(i);
        }
    }
}
