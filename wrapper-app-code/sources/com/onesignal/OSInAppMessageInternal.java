package com.onesignal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageInternal extends OSInAppMessage {
    private static final String DISPLAY_DURATION = "displayDuration";
    private static final String END_TIME = "end_time";
    private static final String HAS_LIQUID = "has_liquid";
    private static final String IAM_ID = "messageId";
    private static final String IAM_REDISPLAY_STATS = "redisplay";
    private static final String IAM_TRIGGERS = "triggers";
    private static final String IAM_VARIANTS = "variants";
    private static final String ID = "id";
    private boolean actionTaken;
    private Set<String> clickedClickIds;
    private double displayDuration;
    private boolean displayedInSession = false;
    private Date endTime;
    private boolean hasLiquid;
    boolean isPreview;
    private OSInAppMessageRedisplayStats redisplayStats = new OSInAppMessageRedisplayStats();
    private boolean triggerChanged = false;
    public ArrayList<ArrayList<OSTrigger>> triggers;
    public HashMap<String, HashMap<String, String>> variants;

    OSInAppMessageInternal(boolean z) {
        super("");
        this.isPreview = z;
    }

    OSInAppMessageInternal(String str, Set<String> set, boolean z, OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats) {
        super(str);
        this.clickedClickIds = set;
        this.displayedInSession = z;
        this.redisplayStats = oSInAppMessageRedisplayStats;
    }

    OSInAppMessageInternal(JSONObject jSONObject) throws JSONException {
        super(jSONObject.getString("id"));
        this.variants = parseVariants(jSONObject.getJSONObject(IAM_VARIANTS));
        this.triggers = parseTriggerJson(jSONObject.getJSONArray(IAM_TRIGGERS));
        this.clickedClickIds = new HashSet();
        this.endTime = parseEndTimeJson(jSONObject);
        if (jSONObject.has(HAS_LIQUID)) {
            this.hasLiquid = jSONObject.getBoolean(HAS_LIQUID);
        }
        if (jSONObject.has(IAM_REDISPLAY_STATS)) {
            this.redisplayStats = new OSInAppMessageRedisplayStats(jSONObject.getJSONObject(IAM_REDISPLAY_STATS));
        }
    }

    private Date parseEndTimeJson(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(END_TIME);
            if (string.equals("null")) {
                return null;
            }
            try {
                return OneSignalSimpleDateFormat.iso8601Format().parse(string);
            } catch (ParseException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
            return null;
        }
    }

    private HashMap<String, HashMap<String, String>> parseVariants(JSONObject jSONObject) throws JSONException {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap2.put(next2, jSONObject2.getString(next2));
            }
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public ArrayList<ArrayList<OSTrigger>> parseTriggerJson(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<OSTrigger>> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new OSTrigger(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageId", this.messageId);
            JSONObject jSONObject2 = new JSONObject();
            for (String next : this.variants.keySet()) {
                HashMap hashMap = this.variants.get(next);
                JSONObject jSONObject3 = new JSONObject();
                for (String str : hashMap.keySet()) {
                    jSONObject3.put(str, hashMap.get(str));
                }
                jSONObject2.put(next, jSONObject3);
            }
            jSONObject.put(IAM_VARIANTS, jSONObject2);
            jSONObject.put(DISPLAY_DURATION, this.displayDuration);
            jSONObject.put(IAM_REDISPLAY_STATS, this.redisplayStats.toJSONObject());
            JSONArray jSONArray = new JSONArray();
            Iterator<ArrayList<OSTrigger>> it = this.triggers.iterator();
            while (it.hasNext()) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = it.next().iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((OSTrigger) it2.next()).toJSONObject());
                }
                jSONArray.put(jSONArray2);
            }
            jSONObject.put(IAM_TRIGGERS, jSONArray);
            if (this.endTime != null) {
                jSONObject.put(END_TIME, OneSignalSimpleDateFormat.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public boolean takeActionAsUnique() {
        if (this.actionTaken) {
            return false;
        }
        this.actionTaken = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    public double getDisplayDuration() {
        return this.displayDuration;
    }

    /* access modifiers changed from: package-private */
    public void setDisplayDuration(double d2) {
        this.displayDuration = d2;
    }

    /* access modifiers changed from: package-private */
    public boolean isTriggerChanged() {
        return this.triggerChanged;
    }

    /* access modifiers changed from: package-private */
    public void setTriggerChanged(boolean z) {
        this.triggerChanged = z;
    }

    public boolean isDisplayedInSession() {
        return this.displayedInSession;
    }

    public void setDisplayedInSession(boolean z) {
        this.displayedInSession = z;
    }

    /* access modifiers changed from: package-private */
    public boolean getHasLiquid() {
        return this.hasLiquid;
    }

    /* access modifiers changed from: package-private */
    public void setHasLiquid(boolean z) {
        this.hasLiquid = z;
    }

    /* access modifiers changed from: package-private */
    public Set<String> getClickedClickIds() {
        return this.clickedClickIds;
    }

    /* access modifiers changed from: package-private */
    public boolean isClickAvailable(String str) {
        return !this.clickedClickIds.contains(str);
    }

    /* access modifiers changed from: package-private */
    public void clearClickIds() {
        this.clickedClickIds.clear();
    }

    /* access modifiers changed from: package-private */
    public void addClickId(String str) {
        this.clickedClickIds.add(str);
    }

    /* access modifiers changed from: package-private */
    public void removeClickId(String str) {
        this.clickedClickIds.remove(str);
    }

    /* access modifiers changed from: package-private */
    public OSInAppMessageRedisplayStats getRedisplayStats() {
        return this.redisplayStats;
    }

    /* access modifiers changed from: package-private */
    public void setRedisplayStats(int i, long j) {
        this.redisplayStats = new OSInAppMessageRedisplayStats(i, j);
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + this.messageId + '\'' + ", variants=" + this.variants + ", triggers=" + this.triggers + ", clickedClickIds=" + this.clickedClickIds + ", redisplayStats=" + this.redisplayStats + ", displayDuration=" + this.displayDuration + ", displayedInSession=" + this.displayedInSession + ", triggerChanged=" + this.triggerChanged + ", actionTaken=" + this.actionTaken + ", isPreview=" + this.isPreview + ", endTime=" + this.endTime + ", hasLiquid=" + this.hasLiquid + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.messageId.equals(((OSInAppMessageInternal) obj).messageId);
    }

    public int hashCode() {
        return this.messageId.hashCode();
    }

    public boolean isFinished() {
        if (this.endTime == null) {
            return false;
        }
        return this.endTime.before(new Date());
    }
}
