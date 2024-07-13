package io.bidmachine;

public class ProtoExtConstants {
    public static final String AD_UNIT_ID = "bm_ad_unit_id";
    static final String NETWORK = "network";
    static final String NETWORKS_INFO = "networks_info";
    static final String NETWORK_ADAPTER_VERSION = "network_adapter_version";
    static final String NETWORK_VERSION = "network_version";

    public static final class Source {
        public static final String OMID_PN = "omidpn";
        public static final String OMID_PV = "omidpv";
    }

    static final class Placement {
        static final String BID_CACHE = "bid_cache";
        static final String BID_ID = "bid_id";
        static final String EXP = "exp";
        static final String PRICE = "price";
        static final String REQUEST_ID = "request_id";
        static final String SEAT = "seat";

        Placement() {
        }
    }

    static final class Context {
        Context() {
        }

        static final class App {
            static final String API_LEVEL = "apilevel";
            static final String FRAMEWORK = "fmwname";
            static final String STORE_CATEGORY = "storecat";
            static final String STORE_SUB_CATEGORY = "storesubcat";

            App() {
            }
        }

        static final class User {
            static final String CLICK_RATE = "clickrate";
            static final String COMPLETION_RATE = "completionrate";
            static final String IMPRESSION_DEPTH = "impdepth";
            static final String LAST_AD_DOMAIN = "lastadomain";
            static final String LAST_BUNDLE = "lastbundle";
            static final String LAST_CLICK = "lastclick";
            static final String SESSION_DURATION = "sessionduration";

            User() {
            }
        }

        static final class Device {
            static final String AIR_PLANE = "airplane";
            static final String BATTERY_LEVEL = "batterylevel";
            static final String BATTERY_SAVER = "batterysaver";
            static final String BOOT = "lastbootup";
            static final String CHARGING = "charging";
            static final String DARK_MODE = "darkmode";
            static final String DEVICE_NAME = "devicename";
            static final String DISK_SPACE = "diskspace";
            static final String DO_NOT_DISTURB = "dnd";
            static final String HEADSET = "headset";
            static final String HEADSET_NAME = "headsetname";
            static final String INPUT_LANGUAGE = "inputlanguage";
            static final String JAIL_BREAK = "jailbreak";
            static final String RING_MUTE = "ringmute";
            static final String SCREEN_BRIGHT = "screenbright";
            static final String TIME = "time";
            static final String TOTAL_DISK = "totaldisk";
            static final String TOTAL_MEMORY = "totalmem";

            Device() {
            }
        }
    }
}
