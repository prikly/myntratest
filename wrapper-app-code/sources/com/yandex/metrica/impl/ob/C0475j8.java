package com.yandex.metrica.impl.ob;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.ob.C0656qf;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.X7;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.j8  reason: case insensitive filesystem */
public final class C0475j8 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6038a = YandexMetrica.getLibraryApiLevel();

    /* renamed from: b  reason: collision with root package name */
    private static final N7 f6039b;

    /* renamed from: c  reason: collision with root package name */
    private static final P7 f6040c;

    /* renamed from: d  reason: collision with root package name */
    private static final M7 f6041d;

    /* renamed from: com.yandex.metrica.impl.ob.j8$a */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final List<String> f6042a = A2.a("incremental_id", "timestamp", "data");

        /* renamed from: com.yandex.metrica.impl.ob.j8$a$a  reason: collision with other inner class name */
        public interface C0053a {

            /* renamed from: a  reason: collision with root package name */
            public static final String f6043a;

            /* renamed from: b  reason: collision with root package name */
            public static final String f6044b;

            static {
                Locale locale = Locale.US;
                f6043a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", new Object[]{"lbs_dat"});
                f6044b = String.format(locale, "DROP TABLE IF EXISTS %s", new Object[]{"lbs_dat"});
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.j8$a$b */
        public interface b {

            /* renamed from: a  reason: collision with root package name */
            public static final String f6045a;

            /* renamed from: b  reason: collision with root package name */
            public static final String f6046b;

            static {
                Locale locale = Locale.US;
                f6045a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", new Object[]{"l_dat"});
                f6046b = String.format(locale, "DROP TABLE IF EXISTS %s", new Object[]{"l_dat"});
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final List<String> f6047a = A2.a("data_key", AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$c */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final List<String> f6048a = A2.a("key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "type");
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final List<String> f6049a = A2.a(OSOutcomeConstants.OUTCOME_ID, "number", "global_number", "number_of_type", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE, "type", "time", "session_id", "wifi_network_info", "cell_info", "location_info", "error_environment", "user_info", "session_type", "app_environment", "app_environment_revision", "truncated", "connection_type", "cellular_connection_type", "custom_type", "wifi_access_point", "encrypting_mode", "profile_id", "first_occurrence_status", "battery_charge_type", "collection_mode", "has_omitted_data", "call_state", "source", "attribution_id_changed", "open_id", "extras");

        /* renamed from: b  reason: collision with root package name */
        public static final String f6050b = ("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,global_number INTEGER,number_of_type INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT " + C0374f6.FOREGROUND.a() + "," + "app_environment" + " TEXT DEFAULT '" + JsonUtils.EMPTY_JSON + "'," + "app_environment_revision" + " INTEGER DEFAULT " + 0 + "," + "truncated" + " INTEGER DEFAULT 0," + "connection_type" + " INTEGER DEFAULT " + 2 + "," + "cellular_connection_type" + " TEXT," + "custom_type" + " INTEGER DEFAULT 0, " + "wifi_access_point" + " TEXT, " + "encrypting_mode" + " INTEGER DEFAULT " + Em.NONE.a() + ", " + "profile_id" + " TEXT, " + "first_occurrence_status" + " INTEGER DEFAULT " + 0 + ", " + "battery_charge_type" + " INTEGER DEFAULT " + E.b.a.UNKNOWN.a() + ", " + "collection_mode" + " TEXT, " + "has_omitted_data" + " INTEGER DEFAULT " + -1 + ", " + "call_state" + " INTEGER DEFAULT " + 0 + ", " + "source" + " INTEGER DEFAULT " + 0 + ", " + "attribution_id_changed" + " INTEGER DEFAULT 0, " + "open_id" + " INTEGER DEFAULT " + new C0656qf.d.a().w + ", " + "extras" + " BLOB )");
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final List<String> f6051a = A2.a(OSOutcomeConstants.OUTCOME_ID, "start_time", "network_info", "report_request_parameters", "server_time_offset", "type", "obtained_before_first_sync");

        /* renamed from: b  reason: collision with root package name */
        public static final String f6052b = ("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT " + C0374f6.FOREGROUND.a() + "," + "obtained_before_first_sync" + " INTEGER DEFAULT 0 )");

        /* renamed from: c  reason: collision with root package name */
        public static final String f6053c;

        /* renamed from: d  reason: collision with root package name */
        public static final String f6054d;

        static {
            Locale locale = Locale.US;
            f6053c = String.format(locale, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", new Object[]{"report_request_parameters", Constants.SESSIONS, OSOutcomeConstants.OUTCOME_ID, "type", "reports", "session_id", "session_type"});
            f6054d = String.format(locale, "(select count(%s.%s) from %s where %s.%s = %s.%s) = 0 and cast(%s as integer) < ?", new Object[]{"reports", OSOutcomeConstants.OUTCOME_ID, "reports", "reports", "session_id", Constants.SESSIONS, OSOutcomeConstants.OUTCOME_ID, OSOutcomeConstants.OUTCOME_ID});
        }
    }

    static {
        N7 n7 = new N7();
        f6039b = n7;
        P7 p7 = new P7();
        f6040c = p7;
        f6041d = new M7(n7, p7, new X7.b());
    }

    public static M7 a() {
        return f6041d;
    }
}
