package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.Arrays;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private final e f12111a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final y f12112b = new y(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f12113c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f12114d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12115e;

    d() {
    }

    private int a(int i) {
        int i2 = 0;
        this.f12114d = 0;
        while (this.f12114d + i < this.f12111a.f12122g) {
            int[] iArr = this.f12111a.j;
            int i3 = this.f12114d;
            this.f12114d = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }

    public void a() {
        this.f12111a.a();
        this.f12112b.a(0);
        this.f12113c = -1;
        this.f12115e = false;
    }

    public boolean a(i iVar) throws IOException {
        int i;
        a.b(iVar != null);
        if (this.f12115e) {
            this.f12115e = false;
            this.f12112b.a(0);
        }
        while (!this.f12115e) {
            if (this.f12113c < 0) {
                if (!this.f12111a.a(iVar) || !this.f12111a.a(iVar, true)) {
                    return false;
                }
                int i2 = this.f12111a.f12123h;
                if ((this.f12111a.f12117b & 1) == 1 && this.f12112b.b() == 0) {
                    i2 += a(0);
                    i = this.f12114d + 0;
                } else {
                    i = 0;
                }
                if (!k.a(iVar, i2)) {
                    return false;
                }
                this.f12113c = i;
            }
            int a2 = a(this.f12113c);
            int i3 = this.f12113c + this.f12114d;
            if (a2 > 0) {
                y yVar = this.f12112b;
                yVar.b(yVar.b() + a2);
                if (!k.b(iVar, this.f12112b.d(), this.f12112b.b(), a2)) {
                    return false;
                }
                y yVar2 = this.f12112b;
                yVar2.c(yVar2.b() + a2);
                this.f12115e = this.f12111a.j[i3 + -1] != 255;
            }
            if (i3 == this.f12111a.f12122g) {
                i3 = -1;
            }
            this.f12113c = i3;
        }
        return true;
    }

    public e b() {
        return this.f12111a;
    }

    public y c() {
        return this.f12112b;
    }

    public void d() {
        if (this.f12112b.d().length != 65025) {
            y yVar = this.f12112b;
            yVar.a(Arrays.copyOf(yVar.d(), Math.max(65025, this.f12112b.b())), this.f12112b.b());
        }
    }
}
