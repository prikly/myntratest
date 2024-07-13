package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.impl.ob.C0604oc;
import com.yandex.metrica.impl.ob.E;

/* renamed from: com.yandex.metrica.impl.ob.qe  reason: case insensitive filesystem */
public class C0655qe {
    public final byte[] A;

    /* renamed from: a  reason: collision with root package name */
    public final String f6569a;

    /* renamed from: b  reason: collision with root package name */
    public String f6570b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f6571c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f6572d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f6573e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f6574f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6575g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6576h;
    public final String i;
    public final C0244a1 j;
    public final Integer k;
    public final String l;
    public final String m;
    public final Integer n;
    public final Integer o;
    public final String p;
    public final String q;
    public final Em r;
    public final D0 s;
    public final E.b.a t;
    public final C0604oc.a u;
    public final Integer v;
    public final Integer w;
    public final C0832y0 x;
    public final Boolean y;
    public final Integer z;

    public C0655qe(ContentValues contentValues) {
        C0244a1 a1Var;
        Integer asInteger = contentValues.getAsInteger("type");
        C0832y0 y0Var = null;
        if (asInteger == null) {
            a1Var = null;
        } else {
            a1Var = C0244a1.a(asInteger.intValue());
        }
        this.j = a1Var;
        this.k = contentValues.getAsInteger("custom_type");
        this.f6569a = contentValues.getAsString("name");
        this.f6570b = contentValues.getAsString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f6574f = contentValues.getAsLong("time");
        this.f6571c = contentValues.getAsInteger("number");
        this.f6572d = contentValues.getAsInteger("global_number");
        this.f6573e = contentValues.getAsInteger("number_of_type");
        this.f6576h = contentValues.getAsString("cell_info");
        this.f6575g = contentValues.getAsString("location_info");
        this.i = contentValues.getAsString("wifi_network_info");
        this.l = contentValues.getAsString("error_environment");
        this.m = contentValues.getAsString("user_info");
        this.n = contentValues.getAsInteger("truncated");
        this.o = contentValues.getAsInteger("connection_type");
        this.p = contentValues.getAsString("cellular_connection_type");
        this.q = contentValues.getAsString("profile_id");
        this.r = Em.a(contentValues.getAsInteger("encrypting_mode"));
        this.s = D0.a(contentValues.getAsInteger("first_occurrence_status"));
        this.t = E.b.a.a(contentValues.getAsInteger("battery_charge_type"));
        this.u = C0604oc.a.a(contentValues.getAsString("collection_mode"));
        this.v = contentValues.getAsInteger("has_omitted_data");
        this.w = contentValues.getAsInteger("call_state");
        Integer asInteger2 = contentValues.getAsInteger("source");
        this.x = asInteger2 != null ? C0832y0.a(asInteger2.intValue()) : y0Var;
        this.y = contentValues.getAsBoolean("attribution_id_changed");
        this.z = contentValues.getAsInteger("open_id");
        this.A = contentValues.getAsByteArray("extras");
    }
}
