package Day25.test7;

/**
 * Created by Administrator on 2017/6/25.
 */
public class GFFactory {

    public static BaseGF createGF(GFtype gFType) {
        switch (gFType) {
            case SICHUANG:
                return new SICHUANG();
            case SANDONG:
                return new SANDONG();
            default:
            case GUANGDONG:
                return new GUANGDONG();
        }
    }
}
