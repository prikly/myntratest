package com.applovin.exoplayer2.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.b.c;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import java.util.Collection;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f11222a = new e(new int[]{2}, 8);

    /* renamed from: b  reason: collision with root package name */
    private static final e f11223b = new e(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f11224c = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: d  reason: collision with root package name */
    private final int[] f11225d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11226e;

    private static final class a {
        public static int[] a() {
            s.a i = s.i();
            for (int i2 : e.f11224c) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    i.a(Integer.valueOf(i2));
                }
            }
            i.a(2);
            return c.a((Collection<? extends Number>) i.a());
        }
    }

    public e(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f11225d = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f11225d = new int[0];
        }
        this.f11226e = i;
    }

    public static e a(Context context) {
        return a(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static e a(Context context, Intent intent) {
        return (!c() || Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) != 1) ? (ai.f13525a < 29 || !ai.c(context)) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f11222a : new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new e(a.a(), 8) : f11223b;
    }

    private static boolean c() {
        return ai.f13525a >= 17 && ("Amazon".equals(ai.f13527c) || "Xiaomi".equals(ai.f13527c));
    }

    public int a() {
        return this.f11226e;
    }

    public boolean a(int i) {
        return Arrays.binarySearch(this.f11225d, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Arrays.equals(this.f11225d, eVar.f11225d) && this.f11226e == eVar.f11226e;
    }

    public int hashCode() {
        return this.f11226e + (Arrays.hashCode(this.f11225d) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f11226e + ", supportedEncodings=" + Arrays.toString(this.f11225d) + "]";
    }
}
