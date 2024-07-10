package interfaceDemo1;

public class HDFCLogin implements LoginWithOtp {
    @Override
    public boolean loginProcess() {
        return false;
    }

    @Override
    public int validationOtp() {
        return 0;
    }
}
