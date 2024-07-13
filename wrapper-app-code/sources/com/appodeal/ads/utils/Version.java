package com.appodeal.ads.utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Version implements Comparable<Version> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f17479a;

    public Version(String str) {
        this.f17479a = a(str);
    }

    public static LinkedList a(String str) {
        if (str == null) {
            return new LinkedList();
        }
        LinkedList linkedList = new LinkedList();
        for (String split : str.split("\\.")) {
            Collections.addAll(linkedList, split.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"));
        }
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious() && ((String) listIterator.previous()).matches("[0]+")) {
            listIterator.remove();
        }
        return linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.appodeal.ads.utils.Version r8) {
        /*
            r7 = this;
            java.util.LinkedList r0 = r7.f17479a
            java.util.Iterator r0 = r0.iterator()
            java.util.LinkedList r8 = r8.f17479a
            java.util.Iterator r8 = r8.iterator()
        L_0x000c:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x001a
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0027
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
        L_0x0027:
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            java.lang.String r5 = "\\d+"
            boolean r6 = r2.matches(r5)
            if (r6 == 0) goto L_0x004c
            boolean r3 = r1.matches(r5)
            if (r3 == 0) goto L_0x004b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.compareTo(r1)
            if (r1 != 0) goto L_0x004a
            goto L_0x000c
        L_0x004a:
            return r1
        L_0x004b:
            return r4
        L_0x004c:
            boolean r4 = r1.matches(r5)
            if (r4 == 0) goto L_0x0053
            return r3
        L_0x0053:
            int r1 = r2.compareTo(r1)
            if (r1 != 0) goto L_0x005a
            goto L_0x000c
        L_0x005a:
            return r1
        L_0x005b:
            if (r2 != 0) goto L_0x0060
            if (r1 == 0) goto L_0x0060
            return r3
        L_0x0060:
            if (r2 == 0) goto L_0x0063
            return r4
        L_0x0063:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.Version.compareTo(com.appodeal.ads.utils.Version):int");
    }
}
