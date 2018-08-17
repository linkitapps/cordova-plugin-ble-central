package com.megster.cordova.ble.central;

import android.app.Activity;
import no.nordicsemi.android.dfu.*;

public class DfuService extends DfuBaseService {

    @Override
    protected Class<? extends Activity> getNotificationTarget() {
        return NotificationActivity.class;
    }
}
