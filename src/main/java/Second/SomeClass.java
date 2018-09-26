package Second;

public class SomeClass {
    private Helper helper;

    public SomeClass(Helper helper) {
        this.helper = helper;
    }

    public Integer methodWithHelper(Integer a, Integer b) {
        int res = helper.someHelperMethod(a + 10, b + 5);
        return res;
    }
}
