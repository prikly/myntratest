package com.yandex.metrica.impl.ob;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.j3  reason: case insensitive filesystem */
public class C0470j3 implements C0539lm<Thread, StackTraceElement[], E6> {
    public Object a(Object obj, Object obj2) {
        List list;
        Thread thread = (Thread) obj;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj2;
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        String name2 = threadGroup != null ? threadGroup.getName() : "";
        Integer valueOf = Integer.valueOf(thread.getState().ordinal());
        if (stackTraceElementArr == null) {
            list = null;
        } else {
            list = Arrays.asList(stackTraceElementArr);
        }
        return new E6(name, priority, id, name2, valueOf, list);
    }
}
