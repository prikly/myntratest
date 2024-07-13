package com.google.android.exoplayer2.analytics;

import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

public final class PlayerId {
    public static final PlayerId UNSET = (Util.SDK_INT < 31 ? new PlayerId() : new PlayerId(LogSessionIdApi31.UNSET));
    private final LogSessionIdApi31 logSessionIdApi31;

    public PlayerId() {
        this((LogSessionIdApi31) null);
        Assertions.checkState(Util.SDK_INT < 31);
    }

    private PlayerId(LogSessionIdApi31 logSessionIdApi312) {
        this.logSessionIdApi31 = logSessionIdApi312;
    }

    private static final class LogSessionIdApi31 {
        public static final LogSessionIdApi31 UNSET = new LogSessionIdApi31(LogSessionId.LOG_SESSION_ID_NONE);
        public final LogSessionId logSessionId;

        public LogSessionIdApi31(LogSessionId logSessionId2) {
            this.logSessionId = logSessionId2;
        }
    }
}
