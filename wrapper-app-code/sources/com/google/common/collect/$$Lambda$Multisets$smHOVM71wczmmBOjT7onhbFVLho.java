package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.Collections;
import java.util.function.Function;

/* renamed from: com.google.common.collect.-$$Lambda$Multisets$smHOVM71wczmmBOjT7onhbFVLho  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$Multisets$smHOVM71wczmmBOjT7onhbFVLho implements Function {
    public static final /* synthetic */ $$Lambda$Multisets$smHOVM71wczmmBOjT7onhbFVLho INSTANCE = new $$Lambda$Multisets$smHOVM71wczmmBOjT7onhbFVLho();

    private /* synthetic */ $$Lambda$Multisets$smHOVM71wczmmBOjT7onhbFVLho() {
    }

    public final Object apply(Object obj) {
        return Collections.nCopies(((Multiset.Entry) obj).getCount(), ((Multiset.Entry) obj).getElement()).spliterator();
    }
}
