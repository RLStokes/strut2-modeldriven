package struts2.test.modeldriven.model;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Model {
    private String foo;

    public String getFoo() {
        return foo;
    }

    @RequiredStringValidator(key="text.key")
    public void setFoo(String foo) {
        this.foo = foo;
    }
}
