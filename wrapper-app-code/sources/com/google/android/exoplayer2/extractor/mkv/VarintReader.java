package com.google.android.exoplayer2.extractor.mkv;

final class VarintReader {
    private static final long[] VARINT_LENGTH_MASKS = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] scratch = new byte[8];
}
