package pl.javastart;

public class AccessController {

    public boolean checkAccessForSignupStatus(SignupStatus signupStatus) {
        return signupStatus == SignupStatus.PAID;
    }

    public SignupStatus determineSignupStatus(String status) {
        return switch (status) {
            case "nowe" -> SignupStatus.NEW;
            case "zaakceptowane" -> SignupStatus.APPROVED;
            case "opłacone" -> SignupStatus.PAID;
            case "anulowane" -> SignupStatus.CANCELED;
            default -> throw new IllegalStateException("Unexpected value: " + status);
        };
    }
}
