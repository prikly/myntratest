package io.bidmachine.unified;

import java.util.Map;

public abstract class UnifiedMediationParams {
    public abstract boolean contains(String str);

    public abstract boolean getBool(String str, boolean z);

    public abstract double getDouble(String str, double d2);

    public abstract float getFloat(String str, float f2);

    public abstract int getInt(String str, int i);

    public abstract Integer getInteger(String str, Integer num);

    public <T> T getObject(String str, T t) {
        return null;
    }

    public abstract String getString(String str, String str2);

    public String getString(String str) {
        return getString(str, (String) null);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public Integer getInteger(String str) {
        return getInteger(str, (Integer) null);
    }

    public boolean getBool(String str) {
        return getBool(str, false);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public <T> T getObject(String str) {
        return getObject(str, (Object) null);
    }

    public static class MappedUnifiedMediationParams extends UnifiedMediationParams {
        private final DataProvider dataProvider;

        public interface DataProvider {
            Map<String, Object> getData();
        }

        public MappedUnifiedMediationParams(DataProvider dataProvider2) {
            this.dataProvider = dataProvider2;
        }

        public String getString(String str, String str2) {
            return (String) getObject(str, str2);
        }

        public int getInt(String str, int i) {
            return ((Integer) getObject(str, Integer.valueOf(i))).intValue();
        }

        public Integer getInteger(String str, Integer num) {
            return (Integer) getObject(str, num);
        }

        public boolean getBool(String str, boolean z) {
            return ((Boolean) getObject(str, Boolean.valueOf(z))).booleanValue();
        }

        public double getDouble(String str, double d2) {
            return ((Double) getObject(str, Double.valueOf(d2))).doubleValue();
        }

        public float getFloat(String str, float f2) {
            return ((Float) getObject(str, Float.valueOf(f2))).floatValue();
        }

        public boolean contains(String str) {
            return this.dataProvider.getData().containsKey(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = r1.dataProvider.getData().get(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> T getObject(java.lang.String r2, T r3) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x000f
                io.bidmachine.unified.UnifiedMediationParams$MappedUnifiedMediationParams$DataProvider r0 = r1.dataProvider
                java.util.Map r0 = r0.getData()
                java.lang.Object r2 = r0.get(r2)
                if (r2 == 0) goto L_0x000f
                return r2
            L_0x000f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.unified.UnifiedMediationParams.MappedUnifiedMediationParams.getObject(java.lang.String, java.lang.Object):java.lang.Object");
        }
    }
}
