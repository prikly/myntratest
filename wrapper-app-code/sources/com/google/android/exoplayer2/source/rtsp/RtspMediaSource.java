package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.source.BaseMediaSource;
import javax.net.SocketFactory;

public final class RtspMediaSource extends BaseMediaSource {

    public static final class Factory {
        private SocketFactory socketFactory = SocketFactory.getDefault();
        private long timeoutMs = 8000;
        private String userAgent = "ExoPlayerLib/2.17.1";
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.rtsp");
    }
}
