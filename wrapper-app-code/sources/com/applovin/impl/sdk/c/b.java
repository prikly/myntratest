package com.applovin.impl.sdk.c;

import android.net.Uri;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.b.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class b<T> implements Comparable {
    public static final b<Boolean> Z = a("is_disabled", false);

    /* renamed from: a  reason: collision with root package name */
    private static final List<?> f15343a = Arrays.asList(new Class[]{Boolean.class, Float.class, Integer.class, Long.class, String.class});
    public static final b<String> aA = a("omsdk_partner_name", AppodealNetworks.APPLOVIN);
    public static final b<Boolean> aB = a("publisher_can_show_consent_dialog", true);
    public static final b<String> aC = a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");
    public static final b<Boolean> aD = a("consent_dialog_immersive_mode_on", false);
    public static final b<Long> aE = a("consent_dialog_show_from_alert_delay_ms", 450L);
    public static final b<Boolean> aF = a("alert_consent_for_dialog_rejected", false);
    public static final b<Boolean> aG = a("alert_consent_for_dialog_closed", false);
    public static final b<Boolean> aH = a("alert_consent_for_dialog_closed_with_back_button", false);
    public static final b<Boolean> aI = a("alert_consent_after_init", false);
    public static final b<Long> aJ = a("alert_consent_after_init_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<Long> aK = a("alert_consent_after_dialog_rejection_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(30)));
    public static final b<Long> aL = a("alert_consent_after_dialog_close_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<Long> aM = a("alert_consent_after_dialog_close_with_back_button_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<Long> aN = a("alert_consent_after_cancel_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));
    public static final b<Long> aO = a("alert_consent_reschedule_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<String> aP = a("text_alert_consent_title", "Make this App Better and Stay Free!");
    public static final b<String> aQ = a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");
    public static final b<String> aR = a("text_alert_consent_yes_option", "I Agree");
    public static final b<String> aS = a("text_alert_consent_no_option", LogConstants.EVENT_CANCEL);
    public static final b<Long> aT = a("ttc_max_click_duration_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Integer> aU = a("ttc_max_click_distance_dp", 10);
    public static final b<Integer> aV = a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));
    public static final b<Integer> aW = a("ttc_edge_buffer_dp", 0);
    public static final b<String> aX = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
    public static final b<String> aY = a("fetch_settings_endpoint", "https://ms.applovin.com/");
    public static final b<String> aZ = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
    public static final b<String> aa = a("device_id", "");
    public static final b<Boolean> ab = a("rss", true);
    public static final b<String> ac = a("device_token", "");
    public static final b<Long> ad = a("publisher_id", 0L);
    public static final b<Boolean> ae = a("is_verbose_logging", false);
    public static final b<String> af = a("sc", "");
    public static final b<String> ag = a("sc2", "");
    public static final b<String> ah = a("sc3", "");
    public static final b<String> ai = a("server_installed_at", "");
    public static final b<Boolean> aj = a("track_network_response_codes", false);
    public static final b<Boolean> ak = a("submit_network_response_codes", false);
    public static final b<Boolean> al = a("clear_network_response_codes_on_request", true);
    public static final b<Boolean> am = a("clear_completion_callback_on_failure", false);
    public static final b<Long> an = a("sicd_ms", 0L);
    public static final b<Integer> ao = a("logcat_max_line_size", 1000);
    public static final b<Integer> ap = a("stps", 16);
    public static final b<Boolean> aq = a("ustp", false);
    public static final b<Boolean> ar = a("exception_handler_enabled", true);
    public static final b<Integer> as = a("network_thread_count", 4);
    public static final b<Boolean> at = a("uam", false);
    public static final b<Integer> au = a("aei", -1);
    public static final b<Integer> av = a("mei", -1);
    public static final b<Boolean> aw = a("ah_cvc", true);
    public static final b<Boolean> ax = a("ah_cdde", true);
    public static final b<Boolean> ay = a("ah_crut", true);
    public static final b<Boolean> az = a("init_omsdk", true);

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, b<?>> f15344b = CollectionUtils.map(512);
    public static final b<Boolean> bA = a("use_old_file_manager", false);
    public static final b<Integer> bB = a("vr_retry_count_v1", 1);
    public static final b<Integer> bC = a("cr_retry_count_v1", 1);
    public static final b<Boolean> bD = a("incent_warning_enabled", false);
    public static final b<String> bE = a("text_incent_warning_title", "Attention!");
    public static final b<String> bF = a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");
    public static final b<String> bG = a("text_incent_warning_close_option", "Close");
    public static final b<String> bH = a("text_incent_warning_continue_option", "Keep Watching");
    public static final b<Boolean> bI = a("incent_nonvideo_warning_enabled", false);
    public static final b<String> bJ = a("text_incent_nonvideo_warning_title", "Attention!");
    public static final b<String> bK = a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");
    public static final b<String> bL = a("text_incent_nonvideo_warning_close_option", "Close");
    public static final b<String> bM = a("text_incent_nonvideo_warning_continue_option", "Keep Playing");
    public static final b<Integer> bN = a("close_button_touch_area", 0);
    public static final b<Integer> bO = a("close_button_outside_touch_area", 0);
    public static final b<Boolean> bP = a("creative_debugger_enabled", true);
    public static final b<Long> bQ = a("viewability_adview_imp_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Integer> bR = a("viewability_adview_banner_min_width", 320);
    public static final b<Integer> bS = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
    public static final b<Integer> bT = a("viewability_adview_mrec_min_width", Integer.valueOf(MaxAdFormat.MREC.getSize().getWidth()));
    public static final b<Integer> bU = a("viewability_adview_mrec_min_height", Integer.valueOf(MaxAdFormat.MREC.getSize().getHeight()));
    public static final b<Integer> bV = a("viewability_adview_leader_min_width", 728);
    public static final b<Integer> bW = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
    public static final b<Integer> bX = a("viewability_adview_native_min_width", 0);
    public static final b<Integer> bY = a("viewability_adview_native_min_height", 0);
    public static final b<Float> bZ = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
    public static final b<String> ba = a("adserver_endpoint", "https://a.applovin.com/");
    public static final b<String> bb = a("adserver_backup_endpoint", "https://a.applvn.com/");
    public static final b<String> bc = a("api_endpoint", "https://d.applovin.com/");
    public static final b<String> bd = a("api_backup_endpoint", "https://d.applvn.com/");
    public static final b<String> be = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
    public static final b<String> bf = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
    public static final b<String> bg = a("fetch_variables_endpoint", "https://ms.applovin.com/");
    public static final b<String> bh = a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");
    public static final b<String> bi = a("anr_postback_endpoint", "https://ms.applovin.com/1.0/sdk/error");
    public static final b<String> bj = a("token_type_prefixes_r", "4!");
    public static final b<String> bk = a("token_type_prefixes_arj", "json_v3!");
    public static final b<String> bl = a("top_level_events", "landing,paused,resumed,ref,rdf,checkout,iap");
    public static final b<String> bm = a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());
    public static final b<Boolean> bn = a("persist_super_properties", true);
    public static final b<Integer> bo = a("super_property_string_max_length", 1024);
    public static final b<Integer> bp = a("super_property_url_max_length", 1024);
    public static final b<Long> bq = a("cached_advertising_info_ttl_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));
    public static final b<Boolean> br = a("use_per_format_cache_queues", true);
    public static final b<Boolean> bs = a("cache_cleanup_enabled", false);
    public static final b<Long> bt = a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1)));
    public static final b<Integer> bu = a("cache_max_size_mb", -1);
    public static final b<String> bv = a("precache_delimiters", ")]',");
    public static final b<Boolean> bw = a("ad_resource_caching_enabled", true);
    public static final b<Boolean> bx = a("fail_ad_load_on_failed_video_cache", true);
    public static final b<String> by = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
    public static final b<String> bz = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
    public static final b<Boolean> cA = a("mute_videos", false);
    public static final b<Boolean> cB = a("show_mute_by_default", false);
    public static final b<Boolean> cC = a("mute_with_user_settings", true);
    public static final b<Integer> cD = a("mute_button_size", 32);
    public static final b<Integer> cE = a("mute_button_margin", 10);
    public static final b<Integer> cF = a("mute_button_gravity", 85);
    public static final b<Long> cG = a("progress_bar_step", 25L);
    public static final b<Integer> cH = a("progress_bar_scale", 10000);
    public static final b<Integer> cI = a("progress_bar_vertical_padding", -8);
    public static final b<Integer> cJ = a("vs_buffer_indicator_size", 50);
    public static final b<Long> cK = a("set_poststitial_muted_initial_delay_ms", 500L);
    public static final b<Boolean> cL = a("fasuic", true);
    public static final b<Boolean> cM = a("ssfwif", false);
    public static final b<Boolean> cN = a("fsahrpg", true);
    public static final b<Integer> cO = a("submit_postback_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> cP = a("submit_postback_retries", 4);
    public static final b<Integer> cQ = a("max_postback_attempts", 3);
    public static final b<Boolean> cR = a("fppopq", false);
    public static final b<Integer> cS = a("max_persisted_postbacks", 100);
    public static final b<Boolean> cT = a("retry_on_all_errors", false);
    public static final b<Integer> cU = a("get_retry_delay_v1", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> cV = a("http_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> cW = a("http_socket_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(20)));
    public static final b<Boolean> cX = a("force_ssl", false);
    public static final b<Integer> cY = a("fetch_ad_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> cZ = a("fetch_ad_retry_count_v1", 1);
    public static final b<Long> ca = a("viewability_timer_min_visible_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Long> cb = a("viewability_timer_interval_ms", 100L);
    public static final b<Integer> cc = a("expandable_close_button_size", 27);
    public static final b<Integer> cd = a("expandable_h_close_button_margin", 10);
    public static final b<Integer> ce = a("expandable_t_close_button_margin", 10);
    public static final b<Boolean> cf = a("expandable_lhs_close_button", false);
    public static final b<Integer> cg = a("expandable_close_button_touch_area", 0);
    public static final b<Boolean> ch = a("iaad", false);
    public static final b<String> ci = a("js_tag_schemes", "applovin,mopub");
    public static final b<String> cj = a("js_tag_load_success_hosts", "load,load_succeeded");
    public static final b<String> ck = a("js_tag_load_failure_hosts", "failLoad,load_failed");
    public static final b<Integer> cl = a("auxiliary_operations_threads", 3);
    public static final b<Integer> cm = a("caching_operations_threads", 8);
    public static final b<Long> cn = a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));
    public static final b<Long> co = a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(2)));
    public static final b<Boolean> cp = a("lhs_close_button_video", false);
    public static final b<Integer> cq = a("close_button_right_margin_video", 4);
    public static final b<Integer> cr = a("close_button_size_video", 30);
    public static final b<Integer> cs = a("close_button_top_margin_video", 8);
    public static final b<Long> ct = a("inter_display_delay", 200L);
    public static final b<Long> cu = a("maximum_close_button_delay_seconds", 999L);
    public static final b<Boolean> cv = a("respect_close_button", true);
    public static final b<Boolean> cw = a("lhs_skip_button", true);
    public static final b<Boolean> cx = a("track_app_killed", false);
    public static final b<Boolean> cy = a("mute_controls_enabled", false);
    public static final b<Boolean> cz = a("allow_user_muting", true);
    public static final b<Boolean> dA = a("qq5", true);
    public static final b<Boolean> dB = a("qq6", true);
    public static final b<Boolean> dC = a("qq7", true);
    public static final b<Boolean> dD = a("qq8", true);
    public static final b<Boolean> dE = a("qq9", false);
    public static final b<Boolean> dF = a("qq10", true);
    public static final b<Boolean> dG = a("qq11", true);
    public static final b<Boolean> dH = a("pui", true);
    public static final b<String> dI = a("plugin_version", "");
    public static final b<Boolean> dJ = a("hgn", false);
    public static final b<Boolean> dK = a("cso", false);
    public static final b<Boolean> dL = a("cfs", false);
    public static final b<Boolean> dM = a("cmi", false);
    public static final b<Boolean> dN = a("crat", false);
    public static final b<Boolean> dO = a("cvs", false);
    public static final b<Boolean> dP = a("caf", false);
    public static final b<Boolean> dQ = a("cf", false);
    public static final b<Boolean> dR = a("cmtl", true);
    public static final b<Boolean> dS = a("cnr", false);
    public static final b<Boolean> dT = a("adr", false);
    public static final b<Float> dU = a("volume_normalization_factor", Float.valueOf(6.6666665f));
    public static final b<Boolean> dV = a("system_user_agent_collection_enabled", false);
    public static final b<Boolean> dW = a(AppLovinSdkExtraParameterKey.USER_AGENT_COLLECTION_ENABLED, false);
    public static final b<Boolean> dX = a("collect_device_angle", false);
    public static final b<Boolean> dY = a("collect_device_movement", false);
    public static final b<Float> dZ = a("movement_degradation", Float.valueOf(0.75f));
    public static final b<Boolean> da = a("faer", false);
    public static final b<Boolean> db = a("faroae", false);
    public static final b<Integer> dc = a("submit_data_retry_count_v1", 1);
    public static final b<Integer> dd = a("response_buffer_size", 16000);
    public static final b<Integer> de = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> df = a("fetch_basic_settings_retry_count", 3);
    public static final b<Boolean> dg = a("fetch_basic_settings_on_reconnect", false);
    public static final b<Boolean> dh = a("skip_fetch_basic_settings_if_not_connected", false);
    public static final b<Integer> di = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(2)));
    public static final b<Integer> dj = a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(5)));
    public static final b<Boolean> dk = a("idflrwbe", false);
    public static final b<Boolean> dl = a("falawpr", false);
    public static final b<Boolean> dm = a("sort_query_parameters", false);
    public static final b<Boolean> dn = a("encode_amp_query_value", false);

    /* renamed from: do  reason: not valid java name */
    public static final b<Long> f3do = a("communicator_request_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> dp = a("communicator_request_retry_count", 3);
    public static final b<Long> dq = a("communicator_request_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));
    public static final b<Integer> dr = a("ad_session_minutes", 60);
    public static final b<Boolean> ds = a("session_tracking_cooldown_on_event_fire", true);
    public static final b<Long> dt = a("session_tracking_resumed_cooldown_minutes", 90L);
    public static final b<Long> du = a("session_tracking_paused_cooldown_minutes", 90L);
    public static final b<Boolean> dv = a("qq", false);
    public static final b<Boolean> dw = a("qq1", true);
    public static final b<Boolean> dx = a("qq2", true);
    public static final b<Boolean> dy = a("qq3", true);
    public static final b<Boolean> dz = a("qq4", true);
    public static final b<Boolean> eA = a("ree", true);
    public static final b<Boolean> eB = a("btee", true);
    public static final b<Long> eC = a("server_timestamp_ms", 0L);
    public static final b<Long> eD = a("device_timestamp_ms", 0L);
    public static final b<Integer> eE = a("gzip_min_length", 0);
    public static final b<Boolean> eF = a("gzip_encoding_default", false);
    public static final b<Boolean> eG = a("fetch_settings_gzip", false);
    public static final b<Boolean> eH = a("device_init_gzip", false);
    public static final b<Boolean> eI = a("fetch_ad_gzip", false);
    public static final b<Boolean> eJ = a("event_tracking_gzip", false);
    public static final b<Boolean> eK = a("submit_ad_stats_gzip", false);
    public static final b<Boolean> eL = a("reward_postback_gzip", false);
    public static final b<Boolean> eM = a("force_rerender", false);
    public static final b<Boolean> eN = a("daostr", false);
    public static final b<Boolean> eO = a("tctlaa", false);
    public static final b<Boolean> eP = a("rwvdv", false);
    public static final b<Boolean> eQ = a("handle_render_process_gone", true);
    public static final b<Boolean> eR = a("fdadaomr", true);
    public static final b<Boolean> eS = a("teorpc", false);
    public static final b<Boolean> eT = a("rmpibt", false);
    public static final b<Boolean> eU = a("spbcioa", false);
    public static final b<Boolean> eV = a("set_webview_render_process_client", false);
    public static final b<Boolean> eW = a("disable_webview_hardware_acceleration", false);
    public static final b<Boolean> eX = a("dsaovcf", false);
    public static final b<Boolean> eY = a("daoar", false);
    public static final b<Boolean> eZ = a("use_uri_encode", false);
    public static final b<Integer> ea = a("device_sensor_period_ms", Integer.valueOf(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));
    public static final b<Boolean> eb = a("dte", true);
    public static final b<Boolean> ec = a("idcw", false);
    public static final b<Long> ed = a("anr_debug_thread_refresh_time_ms", -1L);
    public static final b<Integer> ee = a("fetch_basic_settings_delay_ms", 1500);
    public static final b<Boolean> ef = a("cclia", true);
    public static final b<Long> eg = a("lccdm", 10L);
    public static final b<Integer> eh = a("lmfd", 2);
    public static final b<Boolean> ei = a("is_track_ad_info", true);
    public static final b<Boolean> ej = a("submit_ad_stats_enabled", false);
    public static final b<Integer> ek = a("submit_ad_stats_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> el = a("submit_ad_stats_retry_count", 1);
    public static final b<Integer> em = a("submit_ad_stats_max_count", 500);
    public static final b<Boolean> en = a("asdm", false);
    public static final b<String> eo = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
    public static final b<String> ep = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
    public static final b<Integer> eq = a("vast_max_response_length", 640000);
    public static final b<Integer> er = a("vast_max_wrapper_depth", 5);
    public static final b<String> es = a("vast_unsupported_video_extensions", "ogv,flv");
    public static final b<String> et = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
    public static final b<Boolean> eu = a("vast_validate_with_extension_if_no_video_type", true);
    public static final b<Integer> ev = a("vast_video_selection_policy", Integer.valueOf(n.a.MEDIUM.ordinal()));
    public static final b<Integer> ew = a("vast_wrapper_resolution_retry_count_v1", 1);
    public static final b<Integer> ex = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> ey = a("vast_industry_icon_max_size", 24);
    public static final b<Integer> ez = a("vast_industry_icon_margin", 12);
    public static final b<Boolean> fa = a("anr_detection_enabled", false);
    public static final b<Long> fb = a("anr_trigger_millis", 4000L);
    public static final b<Long> fc = a("anr_touch_millis", 3000L);
    public static final b<Long> fd = a("anr_check_millis", 3000L);
    public static final b<Boolean> fe = a("frpcfn", false);
    public static final b<Boolean> ff = a("use_in_memory_signal_providers", false);
    public static final b<Boolean> fg = a("uobid", true);
    public static final b<Boolean> fh = a("unrm", true);
    public static final b<Boolean> fi = a("bvde", false);
    public static final b<Long> fj = a("bvdidm", 1000L);
    public static final b<Long> fk = a("bvdim", 4000L);
    public static final b<Integer> fl = a("bvdrs", 10);
    public static final b<Boolean> fm = a("bvad", false);
    public static final b<Boolean> fn = a("bvebb", true);
    public static final b<Boolean> fo = a("bvscb", true);
    public static final b<Boolean> fp = a("apsobt", true);
    public static final b<Boolean> fq = a("aetobt", false);
    public static final b<Integer> fr = a("tmtp", 10);
    public static final b<String> fs = a("config_consent_dialog_state", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
    public static final b<String> ft = a("country_code", "");
    public static final b<Boolean> fu = a("communicator_enabled", true);

    /* renamed from: c  reason: collision with root package name */
    private final String f15345c;

    /* renamed from: d  reason: collision with root package name */
    private final T f15346d;

    public b(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        } else if (t != null) {
            this.f15345c = str;
            this.f15346d = t;
        } else {
            throw new IllegalArgumentException("No default value specified");
        }
    }

    protected static <T> b<T> a(String str, T t) {
        if (t == null) {
            throw new IllegalArgumentException("No default value specified");
        } else if (f15343a.contains(t.getClass())) {
            b<T> bVar = new b<>(str, t);
            if (!f15344b.containsKey(str)) {
                f15344b.put(str, bVar);
                return bVar;
            }
            throw new IllegalArgumentException("Setting has already been used: " + str);
        } else {
            throw new IllegalArgumentException("Unsupported value type: " + t.getClass());
        }
    }

    public static Collection<b<?>> c() {
        return Collections.synchronizedCollection(f15344b.values());
    }

    public T a(Object obj) {
        return this.f15346d.getClass().cast(obj);
    }

    public String a() {
        return this.f15345c;
    }

    public T b() {
        return this.f15346d;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof b)) {
            return 0;
        }
        return this.f15345c.compareTo(((b) obj).a());
    }
}
