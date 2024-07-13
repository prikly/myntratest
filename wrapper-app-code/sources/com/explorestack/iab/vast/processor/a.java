package com.explorestack.iab.vast.processor;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.VastLog;
import com.explorestack.iab.vast.tags.LinearCreativeTag;
import com.explorestack.iab.vast.tags.MediaFileTag;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class a extends b<MediaFileTag> {

    /* renamed from: a  reason: collision with root package name */
    public int f3249a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3250b;

    public class b implements Comparator<Pair<LinearCreativeTag, MediaFileTag>> {
        private b() {
        }

        /* renamed from: a */
        public int compare(Pair<LinearCreativeTag, MediaFileTag> pair, Pair<LinearCreativeTag, MediaFileTag> pair2) {
            int width = ((MediaFileTag) pair.second).getWidth() * ((MediaFileTag) pair.second).getHeight();
            int width2 = ((MediaFileTag) pair2.second).getWidth() * ((MediaFileTag) pair2.second).getHeight();
            int abs = Math.abs(width - a.this.f3249a);
            int abs2 = Math.abs(width2 - a.this.f3249a);
            VastLog.d("DefaultMediaPicker", "AreaComparator: obj1:" + abs + " obj2:" + abs2);
            if (abs < abs2) {
                return -1;
            }
            return abs > abs2 ? 1 : 0;
        }
    }

    public a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f3250b = Utils.isLandscapeOrientation(context);
    }

    public Pair<LinearCreativeTag, MediaFileTag> a(List<Pair<LinearCreativeTag, MediaFileTag>> list) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, new b());
        return b(list);
    }

    public final void a(int i, int i2) {
        this.f3249a = i * i2;
    }

    public boolean a(MediaFileTag mediaFileTag) {
        return mediaFileTag.getType().matches("video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)");
    }

    public final Pair<LinearCreativeTag, MediaFileTag> b(List<Pair<LinearCreativeTag, MediaFileTag>> list) {
        VastLog.d("DefaultMediaPicker", "getBestMatch");
        Pair<LinearCreativeTag, MediaFileTag> pair = null;
        for (Pair<LinearCreativeTag, MediaFileTag> next : list) {
            if (a((MediaFileTag) next.second)) {
                if (b((MediaFileTag) next.second)) {
                    return next;
                }
                if (pair == null) {
                    pair = next;
                }
            }
        }
        return pair;
    }

    public boolean b(MediaFileTag mediaFileTag) {
        return (mediaFileTag.getWidth() > mediaFileTag.getHeight()) == this.f3250b;
    }
}
