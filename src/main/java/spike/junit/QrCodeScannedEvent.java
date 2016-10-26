package spike.junit;

import java.time.LocalDateTime;

public class QrCodeScannedEvent {
    private String openId;
    private String scene;
    private LocalDateTime when;
    private boolean newSubscriber = false;

    public QrCodeScannedEvent(String openId, String scene, LocalDateTime when, boolean newSubscriber) {
        this.openId = openId;
        this.scene = scene;
        this.when = when;
        this.newSubscriber = newSubscriber;
    }

    public String getOpenId() {
        return openId;
    }

    public String getScene() {
        return scene;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public boolean isNewSubscriber() {
        return newSubscriber;
    }
}