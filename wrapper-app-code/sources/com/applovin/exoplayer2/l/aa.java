package com.applovin.exoplayer2.l;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.PriorityQueue;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    private final Object f13505a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Integer> f13506b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c  reason: collision with root package name */
    private int f13507c = RecyclerView.UNDEFINED_DURATION;

    public void a(int i) {
        synchronized (this.f13505a) {
            this.f13506b.add(Integer.valueOf(i));
            this.f13507c = Math.max(this.f13507c, i);
        }
    }

    public void b(int i) {
        synchronized (this.f13505a) {
            this.f13506b.remove(Integer.valueOf(i));
            this.f13507c = this.f13506b.isEmpty() ? RecyclerView.UNDEFINED_DURATION : ((Integer) ai.a(this.f13506b.peek())).intValue();
            this.f13505a.notifyAll();
        }
    }
}
