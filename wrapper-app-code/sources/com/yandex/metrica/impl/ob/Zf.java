package com.yandex.metrica.impl.ob;

import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

public class Zf implements IReporter {

    /* renamed from: b  reason: collision with root package name */
    static final Kn<String> f5414b = new Hn(new Fn("Event name"));

    /* renamed from: c  reason: collision with root package name */
    static final Kn<String> f5415c = new Hn(new Fn("Error message"));

    /* renamed from: d  reason: collision with root package name */
    static final Kn<String> f5416d = new Hn(new Fn("Error identifier"));

    /* renamed from: e  reason: collision with root package name */
    static final Kn<Throwable> f5417e = new Hn(new Gn("Unhandled exception"));

    /* renamed from: f  reason: collision with root package name */
    static final Kn<UserProfile> f5418f = new Hn(new Gn("User profile"));

    /* renamed from: g  reason: collision with root package name */
    static final Kn<Revenue> f5419g = new Hn(new Gn("Revenue"));

    /* renamed from: h  reason: collision with root package name */
    static final Kn<AdRevenue> f5420h = new Hn(new Gn("AdRevenue"));
    static final Kn<ECommerceEvent> i = new Hn(new Gn("ECommerceEvent"));

    /* renamed from: a  reason: collision with root package name */
    private final Yf f5421a;

    public Zf() {
        this(new Yf());
    }

    public Yf a() {
        return this.f5421a;
    }

    public IPluginReporter getPluginExtension() {
        return this.f5421a;
    }

    public void pauseSession() {
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
        ((Hn) f5420h).a(adRevenue);
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        ((Hn) i).a(eCommerceEvent);
    }

    public void reportError(String str, Throwable th) throws ValidationException {
        ((Hn) f5415c).a(str);
    }

    public void reportEvent(String str) throws ValidationException {
        ((Hn) f5414b).a(str);
    }

    public void reportRevenue(Revenue revenue) throws ValidationException {
        ((Hn) f5419g).a(revenue);
    }

    public void reportUnhandledException(Throwable th) throws ValidationException {
        ((Hn) f5417e).a(th);
    }

    public void reportUserProfile(UserProfile userProfile) throws ValidationException {
        ((Hn) f5418f).a(userProfile);
    }

    public void resumeSession() {
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }

    Zf(Yf yf) {
        this.f5421a = yf;
    }

    public void reportError(String str, String str2) {
        ((Hn) f5416d).a(str);
    }

    public void reportEvent(String str, String str2) throws ValidationException {
        ((Hn) f5414b).a(str);
    }

    public void reportError(String str, String str2, Throwable th) {
        ((Hn) f5416d).a(str);
    }

    public void reportEvent(String str, Map<String, Object> map) throws ValidationException {
        ((Hn) f5414b).a(str);
    }
}
