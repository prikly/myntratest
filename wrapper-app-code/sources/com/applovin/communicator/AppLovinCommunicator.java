package com.applovin.communicator;

import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.communicator.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import java.util.Collections;
import java.util.List;

public final class AppLovinCommunicator {

    /* renamed from: a  reason: collision with root package name */
    private static AppLovinCommunicator f10940a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f10941b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private n f10942c;

    /* renamed from: d  reason: collision with root package name */
    private v f10943d;

    /* renamed from: e  reason: collision with root package name */
    private final a f10944e;

    /* renamed from: f  reason: collision with root package name */
    private final MessagingServiceImpl f10945f;

    private AppLovinCommunicator(Context context) {
        this.f10944e = new a(context);
        this.f10945f = new MessagingServiceImpl(context);
    }

    private void a(String str) {
        if (this.f10943d != null && v.a()) {
            this.f10943d.b("AppLovinCommunicator", str);
        }
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f10941b) {
            if (f10940a == null) {
                f10940a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return f10940a;
    }

    public void a(n nVar) {
        this.f10942c = nVar;
        this.f10943d = nVar.D();
        a("Attached SDK instance: " + nVar + APSSharedUtil.TRUNCATE_SEPARATOR);
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f10945f;
    }

    public boolean hasSubscriber(String str) {
        return this.f10944e.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f10942c.aj().c(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            if (!this.f10944e.a(appLovinCommunicatorSubscriber, next)) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + next);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f10942c + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + next);
            this.f10944e.b(appLovinCommunicatorSubscriber, next);
        }
    }
}
