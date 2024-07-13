package com.appodeal.ads.api;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.GeneratedMessageV3;

public final class Api {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\tapi.proto\u0012\u0010com.appodeal.ads\"¬\u0002\n\u0003App\u0012\u000e\n\u0006bundle\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003ver\u0018\u0002 \u0001(\t\u0012\u0014\n\finstall_time\u0018\u0003 \u0001(\u0003\u0012\u0016\n\u000eplugin_version\u0018\u0004 \u0001(\t\u0012\u0011\n\tinstaller\u0018\u0005 \u0001(\t\u0012\u0014\n\bmultidex\u0018\u0006 \u0001(\bB\u0002\u0018\u0001\u0012\u000f\n\u0007app_key\u0018\u0007 \u0001(\t\u0012\u000b\n\u0003sdk\u0018\b \u0001(\t\u0012\u0014\n\fversion_code\u0018\t \u0001(\u0005\u0012\u0012\n\napp_uptime\u0018\n \u0001(\u0003\u0012\u0011\n\tframework\u0018\u000b \u0001(\t\u0012\u0019\n\u0011framework_version\u0018\f \u0001(\t\u0012\u001c\n\u0014monotonic_app_uptime\u0018\r \u0001(\u0003\u0012\u001d\n\u0011active_app_uptime\u0018\u000e \u0001(\u0003B\u0002\u0018\u0001\"\u0007\n\u0006Device\u0012\n\n\u0002ua\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003osv\u0018\u0002 \u0001(\t\u0012\n\n\u0002os\u0018\u0003 \u0001(\t\u0012\t\n\u0001w\u0018\u0004 \u0001(\u0005\u0012\t\n\u0001h\u0018\u0005 \u0001(\u0005\u0012\u000f\n\u0007pxratio\u0018\u0006 \u0001(\u0002\u00127\n\ndevicetype\u0018\u0007 \u0001(\u000e2#.com.appodeal.ads.Device.DeviceType\u0012\f\n\u0004make\u0018\b \u0001(\t\u0012\r\n\u0005model\u0018\t \u0001(\t\u0012\u0012\n\u0006rooted\u0018\n \u0001(\bB\u0002\u0018\u0001\u0012\u001b\n\u000fwebview_version\u0018\u000b \u0001(\tB\u0002\u0018\u0001\u0012\u000f\n\u0007battery\u0018\f \u0001(\u0005\u0012\u000e\n\u0006mccmnc\u0018\r \u0001(\t\u0012\u000e\n\u0006locale\u0018\u000e \u0001(\t\u0012?\n\u000econnectiontype\u0018\u000f \u0001(\u000e2'.com.appodeal.ads.Device.ConnectionType\u0012\u000b\n\u0003ifa\u0018\u0010 \u0001(\t\u0012\u000b\n\u0003lmt\u0018\u0011 \u0001(\u0005\u0012\r\n\u0005adidg\u0018\u0012 \u0001(\b\u0012M\n\u000ftracking_status\u0018\u0013 \u0001(\u000e24.com.appodeal.ads.Device.TrackingAuthorizationStatus\u0012\f\n\u0004idfv\u0018\u0014 \u0001(\t\u0012\u0014\n\fstorage_size\u0018\u0015 \u0001(\u0004\u0012\u0014\n\fstorage_free\u0018\u0016 \u0001(\u0004\u0012\u0014\n\fstorage_used\u0018\u0017 \u0001(\u0004\u0012\u0010\n\bram_size\u0018\u0018 \u0001(\u0004\u0012\u0010\n\bram_free\u0018\u0019 \u0001(\u0004\u0012\u0010\n\bram_used\u0018\u001a \u0001(\u0004\u0012\u0011\n\tcpu_usage\u0018\u001b \u0001(\u0002\u0012\u0019\n\u0011secure_android_id\u0018\u001c \u0001(\t\"\u0001\n\u000eConnectionType\u0012\u001a\n\u0016CONNECTIONTYPE_UNKNOWN\u0010\u0000\u0012\f\n\bETHERNET\u0010\u0001\u0012\b\n\u0004WIFI\u0010\u0002\u0012\u0012\n\u000eMOBILE_UNKNOWN\u0010\u0003\u0012\r\n\tMOBILE_2G\u0010\u0004\u0012\r\n\tMOBILE_3G\u0010\u0005\u0012\r\n\tMOBILE_4G\u0010\u0006\";\n\nDeviceType\u0012\u0016\n\u0012DEVICETYPE_UNKNOWN\u0010\u0000\u0012\t\n\u0005PHONE\u0010\u0004\u0012\n\n\u0006TABLET\u0010\u0005\"]\n\u001bTrackingAuthorizationStatus\u0012\u0012\n\u000eNOT_DETERMINED\u0010\u0000\u0012\u000e\n\nRESTRICTED\u0010\u0001\u0012\n\n\u0006DENIED\u0010\u0002\u0012\u000e\n\nAUTHORIZED\u0010\u0003\"Ã\u0001\n\u0003Geo\u0012\u0011\n\tutcoffset\u0018\u0001 \u0001(\u0005\u0012\u0012\n\nlocal_time\u0018\u0002 \u0001(\u0003\u0012.\n\u0002lt\u0018\u0003 \u0001(\u000e2\".com.appodeal.ads.Geo.LocationType\u0012\u000b\n\u0003lat\u0018\u0004 \u0001(\u0002\u0012\u000b\n\u0003lon\u0018\u0005 \u0001(\u0002\"K\n\fLocationType\u0012\u0018\n\u0014LOCATIONTYPE_UNKNOWN\u0010\u0000\u0012\u0007\n\u0003GPS\u0010\u0001\u0012\u0006\n\u0002IP\u0010\u0002\u0012\u0010\n\fUSERPROVIDED\u0010\u0003\"\u0015\n\u0004Regs\u0012\r\n\u0005coppa\u0018\u0001 \u0001(\b\"s\n\u0004User\u0012\u000f\n\u0007consent\u0018\u0001 \u0001(\b\u00124\n\fuserSettings\u0018\u0002 \u0001(\u000b2\u001e.com.appodeal.ads.UserSettings\u0012\n\n\u0002id\u0018\u0003 \u0001(\t\u0012\u0018\n\u0010iab_consent_data\u0018\u0004 \u0001(\t\"H\n\fUserSettings\u0012\u0013\n\u0007user_id\u0018\u0001 \u0001(\tB\u0002\u0018\u0001\u0012\u0012\n\u0006gender\u0018\u0002 \u0001(\tB\u0002\u0018\u0001\u0012\u000f\n\u0003age\u0018\u0003 \u0001(\u0005B\u0002\u0018\u0001\"ì\u0002\n\u0007Session\u0012\f\n\u0004test\u0018\u0001 \u0001(\b\u0012\u000b\n\u0003ext\u0018\u0002 \u0001(\t\u0012\r\n\u0005token\u0018\u0003 \u0001(\t\u0012\u0012\n\nsession_id\u0018\u0004 \u0001(\u0003\u0012\u0014\n\fsession_uuid\u0018\u0005 \u0001(\t\u0012\u0016\n\u000esession_uptime\u0018\u0006 \u0001(\u0003\u0012\u0012\n\nsegment_id\u0018\u0007 \u0001(\u0005\u0012+\n\bad_stats\u0018\b \u0001(\u000b2\u0019.com.appodeal.ads.AdStats\u0012 \n\u0018monotonic_session_uptime\u0018\t \u0001(\u0003\u0012!\n\u0015active_session_uptime\u0018\n \u0001(\u0003B\u0002\u0018\u0001\u0012\u001d\n\u0011active_session_id\u0018\u000b \u0001(\u0005B\u0002\u0018\u0001\u0012\"\n\u001aapp_session_average_length\u0018\f \u0001(\u0003\u0012,\n$monotonic_app_session_average_length\u0018\r \u0001(\u0003\"P\n\u0005Extra\u0012\u0013\n\u000bprice_floor\u0018\u0001 \u0001(\u0002\u0012\u0014\n\fad_unit_stat\u0018\u0002 \u0001(\t\u0012\u0010\n\u0004apps\u0018\u0003 \u0003(\tB\u0002\u0018\u0001\u0012\n\n\u0002sa\u0018\u0004 \u0003(\t\"\u0003\n\u0007AdStats\u0012\f\n\u0004show\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005click\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006finish\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bbanner_show\u0018\u0004 \u0001(\u0005\u0012\u0014\n\fbanner_click\u0018\u0005 \u0001(\u0005\u0012\u0012\n\nvideo_show\u0018\u0006 \u0001(\u0005\u0012\u0013\n\u000bvideo_click\u0018\u0007 \u0001(\u0005\u0012\u0014\n\fvideo_finish\u0018\b \u0001(\u0005\u0012\u001b\n\u0013rewarded_video_show\u0018\t \u0001(\u0005\u0012\u001c\n\u0014rewarded_video_click\u0018\n \u0001(\u0005\u0012\u001d\n\u0015rewarded_video_finish\u0018\u000b \u0001(\u0005\u0012\u0017\n\u000fbanner_320_show\u0018\f \u0001(\u0005\u0012\u0018\n\u0010banner_320_click\u0018\r \u0001(\u0005\u0012\u0018\n\u0010banner_mrec_show\u0018\u000e \u0001(\u0005\u0012\u0019\n\u0011banner_mrec_click\u0018\u000f \u0001(\u0005\u0012\u0013\n\u000bnative_show\u0018\u0010 \u0001(\u0005\u0012\u0014\n\fnative_click\u0018\u0011 \u0001(\u0005\"G\n\u0007Adapter\u0012\u000e\n\u0006status\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007version\u0018\u0002 \u0001(\t\u0012\u001b\n\u0013network_sdk_version\u0018\u0003 \u0001(\t\"\u0004\n\u0007Request\u0012\"\n\u0003app\u0018\u0001 \u0001(\u000b2\u0015.com.appodeal.ads.App\u0012*\n\u0007session\u0018\u0002 \u0001(\u000b2\u0019.com.appodeal.ads.Session\u0012(\n\u0006device\u0018\u0003 \u0001(\u000b2\u0018.com.appodeal.ads.Device\u0012$\n\u0004user\u0018\u0004 \u0001(\u000b2\u0016.com.appodeal.ads.User\u0012$\n\u0004regs\u0018\u0005 \u0001(\u000b2\u0016.com.appodeal.ads.Regs\u0012\"\n\u0003geo\u0018\u0006 \u0001(\u000b2\u0015.com.appodeal.ads.Geo\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.com.appodeal.ads.Extra\u0012\r\n\u0005impid\u0018\b \u0001(\t\u0012\u000f\n\u0007main_id\u0018\t \u0001(\t\u0012\"\n\u0003get\u0018\n \u0001(\u000b2\u0015.com.appodeal.ads.Get\u0012&\n\u0005stats\u0018\u000b \u0001(\u000b2\u0017.com.appodeal.ads.Stats\u0012&\n\u0005event\u0018\f \u0001(\u000b2\u0017.com.appodeal.ads.Event\u0012\u0011\n\ttimestamp\u0018\r \u0001(\u0003\u0012\u0014\n\fcustom_state\u0018\u000e \u0001(\t\u00121\n\rservices_data\u0018\u000f \u0001(\u000b2\u001a.com.appodeal.ads.Services\"ò\u0003\n\u0005Stats\u0012\u0010\n\bcapacity\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005start\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006finish\u0018\u0003 \u0001(\u0003\u0012\u0012\n\nsuccessful\u0018\u0004 \u0001(\b\u0012\u0011\n\tcompleted\u0018\u0005 \u0001(\b\u0012/\n\u0007ad_unit\u0018\u0006 \u0003(\u000b2\u001e.com.appodeal.ads.Stats.AdUnit\u0012*\n\u0007adapter\u0018\u0007 \u0003(\u000b2\u0019.com.appodeal.ads.Adapter\u001a\u0001\n\u0006AdUnit\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\r\n\u0005start\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006finish\u0018\u0003 \u0001(\u0003\u0012;\n\u0006result\u0018\u0004 \u0001(\u000e2+.com.appodeal.ads.Stats.AdUnitRequestResult\u0012\u0010\n\bprecache\u0018\u0005 \u0001(\b\u0012\f\n\u0004ecpm\u0018\u0006 \u0001(\u0001\" \u0001\n\u0013AdUnitRequestResult\u0012\u000e\n\nSUCCESSFUL\u0010\u0000\u0012\n\n\u0006NOFILL\u0010\u0001\u0012\u0012\n\u000eTIMEOUTREACHED\u0010\u0002\u0012\r\n\tEXCEPTION\u0010\u0003\u0012\u0014\n\u0010UNDEFINEDADAPTER\u0010\u0004\u0012\u0013\n\u000fINCORRECTADUNIT\u0010\u0005\u0012\u0011\n\rINVALIDASSETS\u0010\u0006\u0012\f\n\bCANCELED\u0010\u0007\"Å\u0001\n\u0005Event\u00124\n\teventType\u0018\u0001 \u0001(\u000e2!.com.appodeal.ads.Event.EventType\u0012\n\n\u0002id\u0018\u0002 \u0001(\t\u0012\u0014\n\fplacement_id\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bcurrency\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006amount\u0018\u0005 \u0001(\u0002\"B\n\tEventType\u0012\u000b\n\u0007INSTALL\u0010\u0000\u0012\u0007\n\u0003IAP\u0010\u0001\u0012\b\n\u0004SHOW\u0010\u0002\u0012\t\n\u0005CLICK\u0010\u0003\u0012\n\n\u0006FINISH\u0010\u0004\"\u0001\n\u0003Get\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\u0015\n\rlarge_banners\u0018\u0002 \u0001(\b\u0012\u0016\n\u000erewarded_video\u0018\u0003 \u0001(\b\u0012\r\n\u0005debug\u0018\u0004 \u0001(\b\u0012\u0012\n\nshow_array\u0018\u0005 \u0003(\t\u0012\u001d\n\u0011check_sdk_version\u0018\u0006 \u0001(\bB\u0002\u0018\u0001\"Á\u0003\n\bServices\u00127\n\tappsflyer\u0018\u0001 \u0001(\u000b2$.com.appodeal.ads.Services.Appsflyer\u00121\n\u0006adjust\u0018\u0002 \u0001(\u000b2!.com.appodeal.ads.Services.Adjust\u00125\n\bfacebook\u0018\u0003 \u0001(\u000b2#.com.appodeal.ads.Services.Facebook\u00125\n\bfirebase\u0018\u0004 \u0001(\u000b2#.com.appodeal.ads.Services.Firebase\u001a<\n\tAppsflyer\u0012\u0016\n\u000eattribution_id\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fconversion_data\u0018\u0002 \u0001(\t\u001a9\n\u0006Adjust\u0012\u0016\n\u000eattribution_id\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fconversion_data\u0018\u0002 \u0001(\t\u001a+\n\bFacebook\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006app_id\u0018\u0002 \u0001(\t\u001a5\n\bFirebase\u0012\u0017\n\u000fapp_instance_id\u0018\u0001 \u0001(\t\u0012\u0010\n\bkeywords\u0018\u0002 \u0003(\tB.\n\u0014com.appodeal.ads.apiP\u0001Z\u000esdk_api_schema¢\u0002\u0003APDb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_AdStats_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_AdStats_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Adapter_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Adapter_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_App_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_App_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Device_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Device_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Event_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Event_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Extra_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Extra_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Geo_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Geo_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Get_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Get_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Regs_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Regs_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Request_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Request_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Services_Adjust_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Services_Adjust_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Services_Appsflyer_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Services_Appsflyer_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Services_Facebook_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Services_Facebook_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Services_Firebase_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Services_Firebase_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Services_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Services_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Session_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Session_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Stats_AdUnit_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Stats_AdUnit_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_Stats_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_Stats_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_UserSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_UserSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_appodeal_ads_User_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_appodeal_ads_User_fieldAccessorTable;

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_appodeal_ads_App_descriptor = descriptor2;
        internal_static_com_appodeal_ads_App_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Bundle", "Ver", "InstallTime", "PluginVersion", "Installer", "Multidex", "AppKey", "Sdk", "VersionCode", "AppUptime", "Framework", "FrameworkVersion", "MonotonicAppUptime", "ActiveAppUptime"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_appodeal_ads_Device_descriptor = descriptor3;
        internal_static_com_appodeal_ads_Device_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Ua", "Osv", "Os", "W", "H", "Pxratio", "Devicetype", "Make", "Model", "Rooted", "WebviewVersion", "Battery", "Mccmnc", "Locale", "Connectiontype", "Ifa", "Lmt", "Adidg", "TrackingStatus", "Idfv", "StorageSize", "StorageFree", "StorageUsed", "RamSize", "RamFree", "RamUsed", "CpuUsage", "SecureAndroidId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_com_appodeal_ads_Geo_descriptor = descriptor4;
        internal_static_com_appodeal_ads_Geo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Utcoffset", "LocalTime", "Lt", "Lat", "Lon"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_com_appodeal_ads_Regs_descriptor = descriptor5;
        internal_static_com_appodeal_ads_Regs_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Coppa"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_com_appodeal_ads_User_descriptor = descriptor6;
        internal_static_com_appodeal_ads_User_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Consent", "UserSettings", "Id", "IabConsentData"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_com_appodeal_ads_UserSettings_descriptor = descriptor7;
        internal_static_com_appodeal_ads_UserSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"UserId", "Gender", "Age"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_com_appodeal_ads_Session_descriptor = descriptor8;
        internal_static_com_appodeal_ads_Session_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Test", "Ext", "Token", "SessionId", "SessionUuid", "SessionUptime", "SegmentId", "AdStats", "MonotonicSessionUptime", "ActiveSessionUptime", "ActiveSessionId", "AppSessionAverageLength", "MonotonicAppSessionAverageLength"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_com_appodeal_ads_Extra_descriptor = descriptor9;
        internal_static_com_appodeal_ads_Extra_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"PriceFloor", "AdUnitStat", "Apps", "Sa"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_com_appodeal_ads_AdStats_descriptor = descriptor10;
        internal_static_com_appodeal_ads_AdStats_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{LogConstants.EVENT_SHOW, "Click", "Finish", "BannerShow", "BannerClick", "VideoShow", "VideoClick", "VideoFinish", "RewardedVideoShow", "RewardedVideoClick", "RewardedVideoFinish", "Banner320Show", "Banner320Click", "BannerMrecShow", "BannerMrecClick", "NativeShow", "NativeClick"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_com_appodeal_ads_Adapter_descriptor = descriptor11;
        internal_static_com_appodeal_ads_Adapter_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Status", "Version", "NetworkSdkVersion"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_com_appodeal_ads_Request_descriptor = descriptor12;
        internal_static_com_appodeal_ads_Request_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"App", "Session", "Device", "User", "Regs", "Geo", "Ext", "Impid", "MainId", LogConstants.EVENT_GET, "Stats", "Event", "Timestamp", "CustomState", "ServicesData"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_com_appodeal_ads_Stats_descriptor = descriptor13;
        internal_static_com_appodeal_ads_Stats_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Capacity", "Start", "Finish", "Successful", "Completed", "AdUnit", "Adapter"});
        Descriptors.Descriptor descriptor14 = internal_static_com_appodeal_ads_Stats_descriptor.getNestedTypes().get(0);
        internal_static_com_appodeal_ads_Stats_AdUnit_descriptor = descriptor14;
        internal_static_com_appodeal_ads_Stats_AdUnit_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Id", "Start", "Finish", "Result", "Precache", "Ecpm"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(12);
        internal_static_com_appodeal_ads_Event_descriptor = descriptor15;
        internal_static_com_appodeal_ads_Event_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"EventType", "Id", "PlacementId", "Currency", "Amount"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(13);
        internal_static_com_appodeal_ads_Get_descriptor = descriptor16;
        internal_static_com_appodeal_ads_Get_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Type", "LargeBanners", LogConstants.KEY_REWARDED_VIDEO, "Debug", "ShowArray", "CheckSdkVersion"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(14);
        internal_static_com_appodeal_ads_Services_descriptor = descriptor17;
        internal_static_com_appodeal_ads_Services_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Appsflyer", "Adjust", "Facebook", "Firebase"});
        Descriptors.Descriptor descriptor18 = internal_static_com_appodeal_ads_Services_descriptor.getNestedTypes().get(0);
        internal_static_com_appodeal_ads_Services_Appsflyer_descriptor = descriptor18;
        internal_static_com_appodeal_ads_Services_Appsflyer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"AttributionId", "ConversionData"});
        Descriptors.Descriptor descriptor19 = internal_static_com_appodeal_ads_Services_descriptor.getNestedTypes().get(1);
        internal_static_com_appodeal_ads_Services_Adjust_descriptor = descriptor19;
        internal_static_com_appodeal_ads_Services_Adjust_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"AttributionId", "ConversionData"});
        Descriptors.Descriptor descriptor20 = internal_static_com_appodeal_ads_Services_descriptor.getNestedTypes().get(2);
        internal_static_com_appodeal_ads_Services_Facebook_descriptor = descriptor20;
        internal_static_com_appodeal_ads_Services_Facebook_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"UserId", "AppId"});
        Descriptors.Descriptor descriptor21 = internal_static_com_appodeal_ads_Services_descriptor.getNestedTypes().get(3);
        internal_static_com_appodeal_ads_Services_Firebase_descriptor = descriptor21;
        internal_static_com_appodeal_ads_Services_Firebase_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"AppInstanceId", "Keywords"});
    }
}
