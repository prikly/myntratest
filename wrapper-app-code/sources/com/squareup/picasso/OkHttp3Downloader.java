package com.squareup.picasso;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class OkHttp3Downloader implements Downloader {
    private final Cache cache;
    final Call.Factory client;
    private boolean sharedClient;

    public OkHttp3Downloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    public OkHttp3Downloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(File file, long j) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j)).build());
        this.sharedClient = false;
    }

    public OkHttp3Downloader(OkHttpClient okHttpClient) {
        this.sharedClient = true;
        this.client = okHttpClient;
        this.cache = okHttpClient.cache();
    }

    public Response load(Request request) throws IOException {
        return this.client.newCall(request).execute();
    }
}
