package com.google.android.exoplayer2.extractor.rawcc;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.util.ParsableByteArray;

public final class RawCcExtractor implements Extractor {
    private final ParsableByteArray dataScratch = new ParsableByteArray(9);
    private final Format format;
    private int parserState = 0;

    public RawCcExtractor(Format format2) {
        this.format = format2;
    }
}
