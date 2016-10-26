package spike.junit;

import org.junit.Test;

import java.time.LocalDateTime;

public class DynamicSpike {

    private QrCodeWeCare subject = new QrCodeWeCare();

    @Test
    public void handle1122() {

        subject.handle(new QrCodeScannedEvent("openId", "1122", LocalDateTime.now(), true));

    }

}
