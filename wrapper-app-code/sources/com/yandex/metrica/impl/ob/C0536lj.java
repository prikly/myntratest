package com.yandex.metrica.impl.ob;

import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.lj  reason: case insensitive filesystem */
class C0536lj implements M0 {

    /* renamed from: a  reason: collision with root package name */
    private final C0511kj f6159a = new C0511kj();

    C0536lj() {
    }

    public void a(H6 h6) {
    }

    public void a(C0790w6 w6Var) {
    }

    public void a(String str, JSONObject jSONObject) {
    }

    public void b() {
    }

    public void b(String str, String str2) {
    }

    public void d(String str, String str2) {
    }

    public IPluginReporter getPluginExtension() {
        return this.f6159a;
    }

    public void pauseSession() {
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    public void reportError(String str, String str2) {
    }

    public void reportError(String str, String str2, Throwable th) {
    }

    public void reportError(String str, Throwable th) {
    }

    public void reportEvent(String str) {
    }

    public void reportEvent(String str, String str2) {
    }

    public void reportEvent(String str, Map<String, Object> map) {
    }

    public void reportRevenue(Revenue revenue) {
    }

    public void reportUnhandledException(Throwable th) {
    }

    public void reportUserProfile(UserProfile userProfile) {
    }

    public void resumeSession() {
    }

    public void sendEventsBuffer() {
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }
}
