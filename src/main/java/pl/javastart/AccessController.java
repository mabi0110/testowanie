package pl.javastart;

public class AccessController {

    public boolean checkAccessForSignupStatus(SignupStatus signupStatus) {
        return signupStatus == SignupStatus.PAID;
    }
}
