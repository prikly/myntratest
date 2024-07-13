package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.location.Location;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.C0640q;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.jj  reason: case insensitive filesystem */
public class C0486jj extends C0536lj implements K0 {
    public void a(int i, String str, String str2, Map<String, String> map, Map<String, byte[]> map2) {
    }

    public void a(Activity activity) {
    }

    public void a(Location location) {
    }

    public void a(D2 d2) {
    }

    public void a(H6 h6) {
    }

    public void a(C0538ll llVar, boolean z) {
        llVar.onError("Device user is in locked state");
    }

    public void a(C0640q.c cVar) {
    }

    public void a(C0790w6 w6Var) {
    }

    public void a(String str) {
    }

    public void a(String str, String str2) {
    }

    public void a(String str, JSONObject jSONObject) {
    }

    public void a(String str, boolean z) {
    }

    public void a(String str, byte[] bArr) {
    }

    public void a(JSONObject jSONObject) {
    }

    public void a(boolean z) {
    }

    public void b() {
    }

    public void b(Activity activity) {
    }

    public void b(String str) {
    }

    public void b(String str, String str2) {
    }

    public void b(JSONObject jSONObject) {
    }

    public void b(boolean z) {
    }

    public void c(String str) {
    }

    public void c(String str, String str2) {
    }

    public void d(String str, String str2) {
    }

    public void pauseSession() {
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
    }

    public void reportError(String str, String str2) {
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    public void reportError(String str, String str2, Throwable th) {
    }

    public void reportError(String str, Throwable th) {
    }

    public void reportEvent(String str) {
    }

    public void reportEvent(String str, String str2) {
    }

    public void reportEvent(String str, Map map) {
    }

    public void reportRevenue(Revenue revenue) {
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
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
