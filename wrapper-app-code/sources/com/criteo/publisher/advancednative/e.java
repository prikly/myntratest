package com.criteo.publisher.advancednative;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;

/* compiled from: ClickDetection */
public class e {

    /* compiled from: ClickDetection */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f2316a;

        a(e eVar, n nVar) {
            this.f2316a = nVar;
        }

        public void onClick(View view) {
            this.f2316a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, n nVar) {
        a aVar = new a(this, nVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.remove();
            view2.setOnClickListener(aVar);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    arrayDeque.add(viewGroup.getChildAt(i));
                }
            }
        }
    }
}
