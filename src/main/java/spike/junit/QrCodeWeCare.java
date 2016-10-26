package spike.junit;

public class QrCodeWeCare {

    private QrCode1122Handler qrCode1122Handler;

    private QrCode1123Handler qrCode1123Handler;

    public void handle(QrCodeScannedEvent event) {
        if (event.getScene().equals("1122")) {
            qrCode1122Handler.handle(event);
        } else if (event.getScene().equals("1123")) {
            qrCode1123Handler.handle(event);
        }
    }
}