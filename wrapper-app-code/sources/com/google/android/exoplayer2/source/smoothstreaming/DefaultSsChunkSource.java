package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource;
import com.google.android.exoplayer2.upstream.DataSource;

public class DefaultSsChunkSource implements SsChunkSource {

    public static final class Factory implements SsChunkSource.Factory {
        private final DataSource.Factory dataSourceFactory;

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
        }
    }
}
