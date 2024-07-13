package com.yandex.metrica.impl.ob;

import android.os.Build;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import com.yandex.metrica.impl.ob.C0685rl;
import java.util.HashSet;
import java.util.Set;

public class Mk implements C0314cl {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class> f4576a;

    public Mk() {
        HashSet hashSet = new HashSet();
        this.f4576a = hashSet;
        hashSet.add(EditText.class);
        hashSet.add(Chronometer.class);
        hashSet.add(DigitalClock.class);
        if (Build.VERSION.SDK_INT >= 17) {
            hashSet.add(TextClock.class);
        }
        hashSet.add(RadioButton.class);
        hashSet.add(CheckBox.class);
    }

    public boolean a(Object obj) {
        TextView textView = (TextView) obj;
        for (Class isInstance : this.f4576a) {
            if (isInstance.isInstance(textView)) {
                return true;
            }
        }
        return false;
    }

    public C0685rl.b a() {
        return C0685rl.b.IRRELEVANT_CLASS;
    }
}
