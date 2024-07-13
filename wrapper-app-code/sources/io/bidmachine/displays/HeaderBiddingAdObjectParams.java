package io.bidmachine.displays;

import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.core.Logger;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.unified.UnifiedMediationParams;

class HeaderBiddingAdObjectParams extends AdObjectParams {
    /* access modifiers changed from: private */
    public final HeaderBiddingAd headerBiddingAd;
    private final HeaderBiddingUnifiedMediationParams mediationParams = new HeaderBiddingUnifiedMediationParams();

    public boolean isValid() {
        return true;
    }

    HeaderBiddingAdObjectParams(Ad ad, HeaderBiddingAd headerBiddingAd2) {
        super(ad);
        this.headerBiddingAd = headerBiddingAd2;
    }

    /* access modifiers changed from: private */
    public String getParam(String str) {
        if (str == null) {
            return null;
        }
        String serverParamsOrDefault = this.headerBiddingAd.getServerParamsOrDefault(str, (String) null);
        return serverParamsOrDefault == null ? this.headerBiddingAd.getClientParamsOrDefault(str, (String) null) : serverParamsOrDefault;
    }

    public UnifiedMediationParams toMediationParams() {
        return this.mediationParams;
    }

    private class HeaderBiddingUnifiedMediationParams extends UnifiedMediationParams {
        private HeaderBiddingUnifiedMediationParams() {
        }

        public String getString(String str, String str2) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            return access$100 != null ? access$100 : str2;
        }

        public int getInt(String str, int i) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Integer.parseInt(access$100);
                } catch (Exception e2) {
                    Logger.log((Throwable) e2);
                }
            }
            return i;
        }

        public Integer getInteger(String str, Integer num) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Integer.valueOf(Integer.parseInt(access$100));
                } catch (Exception e2) {
                    Logger.log((Throwable) e2);
                }
            }
            return num;
        }

        public boolean getBool(String str, boolean z) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Boolean.parseBoolean(access$100);
                } catch (Exception e2) {
                    Logger.log((Throwable) e2);
                }
            }
            return z;
        }

        public double getDouble(String str, double d2) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Double.parseDouble(access$100);
                } catch (Exception e2) {
                    Logger.log((Throwable) e2);
                }
            }
            return d2;
        }

        public float getFloat(String str, float f2) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Float.parseFloat(access$100);
                } catch (Exception e2) {
                    Logger.log((Throwable) e2);
                }
            }
            return f2;
        }

        public boolean contains(String str) {
            return str != null && (HeaderBiddingAdObjectParams.this.headerBiddingAd.containsServerParams(str) || HeaderBiddingAdObjectParams.this.headerBiddingAd.containsClientParams(str));
        }
    }
}
