package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f14346a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f14347b = a();

    public MessagingServiceImpl(Context context) {
        this.f14346a = context;
    }

    private ScheduledThreadPoolExecutor a() {
        return new ScheduledThreadPoolExecutor(4, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    public void publish(final AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f14347b.execute(new Runnable() {
            public void run() {
                AppLovinBroadcastManager.getInstance(MessagingServiceImpl.this.f14346a).sendBroadcastSync(appLovinCommunicatorMessage, (Map<String, Object>) null);
            }
        });
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
