package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

public class SharedValues {
    private SparseIntArray mValues = new SparseIntArray();
    private HashMap<Integer, HashSet<WeakReference<Object>>> mValuesListeners = new HashMap<>();
}
