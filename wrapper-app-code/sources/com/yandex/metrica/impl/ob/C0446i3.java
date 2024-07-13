package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.i3  reason: case insensitive filesystem */
public class C0446i3 implements C0589nm<Thread, E6> {
    public E6 a(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new E6(name, priority, id, threadGroup != null ? threadGroup.getName() : "", (Integer) null, (List<StackTraceElement>) null);
    }
}
