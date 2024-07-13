package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;

public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {
    public static final ChunkExtractor.Factory FACTORY = $$Lambda$BundledChunkExtractor$vbH3Zzp0ZhSHB9zuq0XYa5vv9i8.INSTANCE;
    private static final PositionHolder POSITION_HOLDER = new PositionHolder();
    private final SparseArray<Object> bindingTrackOutputs = new SparseArray<>();
    private final Extractor extractor;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;

    /* JADX WARNING: type inference failed for: r8v3, types: [com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor] */
    /* JADX WARNING: type inference failed for: r8v6, types: [com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ com.google.android.exoplayer2.source.chunk.ChunkExtractor lambda$static$0(int r6, com.google.android.exoplayer2.Format r7, boolean r8, java.util.List r9, com.google.android.exoplayer2.extractor.TrackOutput r10, com.google.android.exoplayer2.analytics.PlayerId r11) {
        /*
            java.lang.String r11 = r7.containerMimeType
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isText(r11)
            if (r0 == 0) goto L_0x0018
            java.lang.String r8 = "application/x-rawcc"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0016
            com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor r8 = new com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor
            r8.<init>(r7)
            goto L_0x0036
        L_0x0016:
            r6 = 0
            return r6
        L_0x0018:
            boolean r11 = com.google.android.exoplayer2.util.MimeTypes.isMatroska(r11)
            if (r11 == 0) goto L_0x0025
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r8 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor
            r9 = 1
            r8.<init>(r9)
            goto L_0x0036
        L_0x0025:
            r11 = 0
            if (r8 == 0) goto L_0x002b
            r11 = 4
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r8 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
            r2 = 0
            r3 = 0
            r0 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0036:
            com.google.android.exoplayer2.source.chunk.BundledChunkExtractor r9 = new com.google.android.exoplayer2.source.chunk.BundledChunkExtractor
            r9.<init>(r8, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.chunk.BundledChunkExtractor.lambda$static$0(int, com.google.android.exoplayer2.Format, boolean, java.util.List, com.google.android.exoplayer2.extractor.TrackOutput, com.google.android.exoplayer2.analytics.PlayerId):com.google.android.exoplayer2.source.chunk.ChunkExtractor");
    }

    public BundledChunkExtractor(Extractor extractor2, int i, Format format) {
        this.extractor = extractor2;
        this.primaryTrackType = i;
        this.primaryTrackManifestFormat = format;
    }
}
