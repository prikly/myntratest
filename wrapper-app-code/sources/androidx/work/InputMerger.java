package androidx.work;

import java.util.List;

public abstract class InputMerger {
    private static final String TAG = Logger.tagWithPrefix("InputMerger");

    public abstract Data merge(List<Data> list);

    public static InputMerger fromClassName(String str) {
        try {
            return (InputMerger) Class.forName(str).newInstance();
        } catch (Exception e2) {
            Logger logger = Logger.get();
            String str2 = TAG;
            logger.error(str2, "Trouble instantiating + " + str, e2);
            return null;
        }
    }
}
