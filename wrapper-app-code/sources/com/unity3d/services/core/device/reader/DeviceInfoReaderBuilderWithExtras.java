package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import java.util.Map;

public class DeviceInfoReaderBuilderWithExtras extends DeviceInfoReaderBuilder {
    private Map<String, String> _extras;

    public DeviceInfoReaderBuilderWithExtras(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage, IGameSessionIdReader iGameSessionIdReader) {
        super(configurationReader, privacyConfigStorage, iGameSessionIdReader);
    }

    public void setExtras(Map<String, String> map) {
        this._extras = map;
    }

    public IDeviceInfoReader build() {
        if (this._extras == null) {
            return super.build();
        }
        return new DeviceInfoReaderWithExtras(super.build(), this._extras);
    }
}
