package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker {
    public static final HlsPlaylistTracker.Factory FACTORY = $$Lambda$lKTLOVxne0MoBOOliKH0gO2KDMM.INSTANCE;
    private final HlsDataSourceFactory dataSourceFactory;
    private long initialStartTimeUs;
    private final CopyOnWriteArrayList<Object> listeners;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final HashMap<Uri, Object> playlistBundles;
    private final HlsPlaylistParserFactory playlistParserFactory;
    private final double playlistStuckTargetDurationCoefficient;

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy2, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
        this(hlsDataSourceFactory, loadErrorHandlingPolicy2, hlsPlaylistParserFactory, 3.5d);
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy2, HlsPlaylistParserFactory hlsPlaylistParserFactory, double d2) {
        this.dataSourceFactory = hlsDataSourceFactory;
        this.playlistParserFactory = hlsPlaylistParserFactory;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy2;
        this.playlistStuckTargetDurationCoefficient = d2;
        this.listeners = new CopyOnWriteArrayList<>();
        this.playlistBundles = new HashMap<>();
        this.initialStartTimeUs = -9223372036854775807L;
    }
}
