package com.google.android.exoplayer2.extractor.mkv;

import java.util.ArrayDeque;

final class DefaultEbmlReader implements EbmlReader {
    private final ArrayDeque<Object> masterElementsStack = new ArrayDeque<>();
    private EbmlProcessor processor;
    private final byte[] scratch = new byte[8];
    private final VarintReader varintReader = new VarintReader();

    public void init(EbmlProcessor ebmlProcessor) {
        this.processor = ebmlProcessor;
    }
}
