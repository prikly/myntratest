package com.google.android.exoplayer2;

public interface RendererCapabilities {

    /* renamed from: com.google.android.exoplayer2.RendererCapabilities$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int getAdaptiveSupport(int i) {
            return i & 24;
        }

        public static int getFormatSupport(int i) {
            return i & 7;
        }
    }
}
