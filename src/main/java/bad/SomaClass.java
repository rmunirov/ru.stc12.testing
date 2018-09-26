package bad;

public class SomaClass {
    public Integer methodWithHelper(Integer a, Integer b) {
        Helper helper = new Helper();
        int res = helper.someHelperMethod(a + 10, b + 15);
        return res;
    }
}
