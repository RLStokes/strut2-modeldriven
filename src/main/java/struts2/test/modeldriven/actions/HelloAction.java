package struts2.test.modeldriven.actions;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

import struts2.test.modeldriven.model.Model;

@Results({
	@Result(name = Action.INPUT,   location = "hello.jsp"),
	@Result(name = Action.SUCCESS, location = "hello.jsp")
})	
public class HelloAction extends ActionSupport implements ModelDriven<Model> {

	private static final long serialVersionUID = 1L;

	private Model model = new Model();

    private String bar;

    @Validations(
        visitorFields = {
            @VisitorFieldValidator(fieldName = "model", appendPrefix = false)
        }
    )
    public String execute() throws Exception {
        if (model != null) {
            System.out.println("foo: " + model.getFoo());
        } else {
            System.out.println("model is null");
        }
        System.out.println("bar: " + bar);

        return SUCCESS;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @RequiredStringValidator(key="text.key")
    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
