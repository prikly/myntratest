package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.chunk.-$$Lambda$BundledChunkExtractor$vbH3Zzp0ZhSHB9zuq0XYa5vv9i8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BundledChunkExtractor$vbH3Zzp0ZhSHB9zuq0XYa5vv9i8 implements ChunkExtractor.Factory {
    public static final /* synthetic */ $$Lambda$BundledChunkExtractor$vbH3Zzp0ZhSHB9zuq0XYa5vv9i8 INSTANCE = new $$Lambda$BundledChunkExtractor$vbH3Zzp0ZhSHB9zuq0XYa5vv9i8();

    private /* synthetic */ $$Lambda$BundledChunkExtractor$vbH3Zzp0ZhSHB9zuq0XYa5vv9i8() {
    }

    public final ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput, PlayerId playerId) {
        return BundledChunkExtractor.lambda$static$0(i, format, z, list, trackOutput, playerId);
    }
}
