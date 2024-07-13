package com.yandex.metrica.impl.ob;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;

public class Fl {

    /* renamed from: a  reason: collision with root package name */
    private final C0853yl f4016a;

    public Fl(C0853yl ylVar) {
        this.f4016a = ylVar;
    }

    public int a(TextView textView) {
        int i = 0;
        try {
            if (TextUtils.isEmpty(textView.getText()) || textView.getVisibility() != 0) {
                return 0;
            }
            String charSequence = textView.getText().toString();
            Layout layout = textView.getLayout();
            int length = charSequence.length();
            if (layout != null) {
                try {
                    int lineCount = textView.getLineCount() - 1;
                    TextUtils.TruncateAt ellipsize = textView.getEllipsize();
                    if (ellipsize != null && lineCount >= 0 && (lineCount == 0 || ellipsize == TextUtils.TruncateAt.END)) {
                        i = 1;
                    }
                    if (i != 0) {
                        return length - layout.getEllipsisCount(lineCount);
                    }
                } catch (Throwable th) {
                    th = th;
                    i = length;
                    this.f4016a.a("ui_parsing_visibility", th);
                    return i;
                }
            }
            return length;
        } catch (Throwable th2) {
            th = th2;
            this.f4016a.a("ui_parsing_visibility", th);
            return i;
        }
    }
}
