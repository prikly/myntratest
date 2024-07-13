package com.bytedance.sdk.component.f;

import java.util.concurrent.ThreadFactory;

/* compiled from: TTThreadFactory */
public class h implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadGroup f19237a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19238b;

    /* renamed from: c  reason: collision with root package name */
    private int f19239c;

    public h(int i, String str) {
        this.f19239c = i;
        this.f19237a = new ThreadGroup("tt_pangle_group_" + str);
        this.f19238b = "tt_pangle_thread_" + str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f19237a, runnable, this.f19238b);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int i = this.f19239c;
        if (i > 10 || i < 1) {
            this.f19239c = 5;
        }
        thread.setPriority(this.f19239c);
        return thread;
    }
}
