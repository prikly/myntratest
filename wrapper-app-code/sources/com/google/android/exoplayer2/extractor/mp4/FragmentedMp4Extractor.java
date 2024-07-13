package com.google.android.exoplayer2.extractor.mp4;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;

public class FragmentedMp4Extractor implements Extractor {
    private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType("application/x-emsg").build();
    public static final ExtractorsFactory FACTORY = $$Lambda$FragmentedMp4Extractor$i0zfpH_PcF0vytkdatCL0xeWFhQ.INSTANCE;
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private final TrackOutput additionalEmsgTrackOutput;
    private final ParsableByteArray atomHeader;
    private TrackOutput[] ceaTrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Object> containerAtoms;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private final EventMessageEncoder eventMessageEncoder;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private final ArrayDeque<Object> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private final ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;
    private final Track sideloadedTrack;
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<Object> trackBundles;

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new FragmentedMp4Extractor()};
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    public FragmentedMp4Extractor(int i) {
        this(i, (TimestampAdjuster) null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster2) {
        this(i, timestampAdjuster2, (Track) null, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster2, Track track, List<Format> list) {
        this(i, timestampAdjuster2, track, list, (TrackOutput) null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster2, Track track, List<Format> list, TrackOutput trackOutput) {
        this.flags = i;
        this.timestampAdjuster = timestampAdjuster2;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new EventMessageEncoder();
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.nalBuffer = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new ParsableByteArray(bArr);
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.durationUs = -9223372036854775807L;
        this.pendingSeekTimeUs = -9223372036854775807L;
        this.segmentIndexEarliestPresentationTimeUs = -9223372036854775807L;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new TrackOutput[0];
        this.ceaTrackOutputs = new TrackOutput[0];
    }
}
