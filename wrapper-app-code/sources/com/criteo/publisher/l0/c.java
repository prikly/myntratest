package com.criteo.publisher.l0;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.criteo.publisher.l0.d.d;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.n0.q;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: UserPrivacyUtil */
public class c {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f2599e = Pattern.compile("^1([YN\\-yn]){3}$");

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f2600f = Arrays.asList(new String[]{"1ynn", "1yny", "1---", "", "1yn-", "1-n-"});

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f2601g = Arrays.asList(new String[]{"explicit_no", "potential_whitelist", "dnt"});

    /* renamed from: a  reason: collision with root package name */
    private final g f2602a;

    /* renamed from: b  reason: collision with root package name */
    private final q f2603b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f2604c;

    /* renamed from: d  reason: collision with root package name */
    private final d f2605d;

    public c(Context context) {
        this(PreferenceManager.getDefaultSharedPreferences(context), new d(context));
    }

    c(SharedPreferences sharedPreferences, d dVar) {
        this.f2602a = h.b(getClass());
        this.f2604c = sharedPreferences;
        this.f2603b = new q(sharedPreferences);
        this.f2605d = dVar;
    }

    public com.criteo.publisher.l0.d.c b() {
        return this.f2605d.a();
    }

    public String a() {
        com.criteo.publisher.l0.d.c a2 = this.f2605d.a();
        if (a2 == null) {
            return null;
        }
        return a2.a();
    }

    public String c() {
        return this.f2603b.a("IABUSPrivacy_String", "");
    }

    public void a(boolean z) {
        SharedPreferences.Editor edit = this.f2604c.edit();
        edit.putString("USPrivacy_Optout", String.valueOf(z));
        edit.apply();
        this.f2602a.a(b.a(z));
    }

    public String e() {
        return this.f2603b.a("USPrivacy_Optout", "");
    }

    public boolean g() {
        if (c().isEmpty()) {
            return f();
        }
        return h();
    }

    private boolean f() {
        return !Boolean.parseBoolean(e());
    }

    private boolean h() {
        String c2 = c();
        return !f2599e.matcher(c2).matches() || f2600f.contains(c2.toLowerCase(Locale.ROOT));
    }

    public boolean i() {
        return !f2601g.contains(d().toLowerCase(Locale.ROOT));
    }

    public void a(String str) {
        SharedPreferences.Editor edit = this.f2604c.edit();
        edit.putString("MoPubConsent_String", str);
        edit.apply();
        this.f2602a.a(b.a(str));
    }

    public String d() {
        return this.f2603b.a("MoPubConsent_String", "");
    }
}
