package com.google.common.collect;

import com.google.common.collect.CollectSpliterators;
import java.util.Spliterator;
import java.util.function.Function;

/* renamed from: com.google.common.collect.-$$Lambda$u770MGGi4iyXdk4TaX9TQ3v79y4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$u770MGGi4iyXdk4TaX9TQ3v79y4 implements CollectSpliterators.FlatMapSpliterator.Factory {
    public static final /* synthetic */ $$Lambda$u770MGGi4iyXdk4TaX9TQ3v79y4 INSTANCE = new $$Lambda$u770MGGi4iyXdk4TaX9TQ3v79y4();

    private /* synthetic */ $$Lambda$u770MGGi4iyXdk4TaX9TQ3v79y4() {
    }

    public final Spliterator newFlatMapSpliterator(Spliterator spliterator, Spliterator spliterator2, Function function, int i, long j) {
        return new CollectSpliterators.FlatMapSpliteratorOfObject(spliterator, spliterator2, function, i, j);
    }
}
