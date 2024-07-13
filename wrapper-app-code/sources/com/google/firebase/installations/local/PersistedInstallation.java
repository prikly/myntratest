package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {
    private File dataFile;
    private final FirebaseApp firebaseApp;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(FirebaseApp firebaseApp2) {
        this.firebaseApp = firebaseApp2;
    }

    private File getDataFile() {
        if (this.dataFile == null) {
            synchronized (this) {
                if (this.dataFile == null) {
                    File filesDir = this.firebaseApp.getApplicationContext().getFilesDir();
                    this.dataFile = new File(filesDir, "PersistedInstallation." + this.firebaseApp.getPersistenceKey() + ".json");
                }
            }
        }
        return this.dataFile;
    }

    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject readJSONFromFile = readJSONFromFile();
        String optString = readJSONFromFile.optString("Fid", (String) null);
        int optInt = readJSONFromFile.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = readJSONFromFile.optString("AuthToken", (String) null);
        String optString3 = readJSONFromFile.optString("RefreshToken", (String) null);
        long optLong = readJSONFromFile.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = readJSONFromFile.optLong("ExpiresInSecs", 0);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(optString).setRegistrationStatus(RegistrationStatus.values()[optInt]).setAuthToken(optString2).setRefreshToken(optString3).setTokenCreationEpochInSecs(optLong).setExpiresInSecs(optLong2).setFisError(readJSONFromFile.optString("FisError", (String) null)).build();
    }

    private JSONObject readJSONFromFile() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(getDataFile());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry persistedInstallationEntry) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put("Status", persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.getAuthToken());
            jSONObject.put("RefreshToken", persistedInstallationEntry.getRefreshToken());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put("FisError", persistedInstallationEntry.getFisError());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.firebaseApp.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(getDataFile())) {
                return persistedInstallationEntry;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }
}
