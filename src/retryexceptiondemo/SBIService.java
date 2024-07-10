package retryexceptiondemo;

public class SBIService {

    int i = 0;

    public String transfer() {
        i = i + 1;
        if (i % 2 == 0) {
            //  throw  new EvenNumberEXception(ErrorCodes.EVEN_ERROR_CODE.getCode()),
        } else {
            //throw new OddNumberEXception(ErrorCodes.ODD_ERROR_CODE.getCode());
            //  }
        }
        return  null;
    }
}
