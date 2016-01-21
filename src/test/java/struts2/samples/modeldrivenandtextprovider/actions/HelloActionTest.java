package struts2.samples.modeldrivenandtextprovider.actions;

import org.apache.struts2.StrutsTestCase;

import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ActionSupport;

import struts2.test.modeldriven.actions.HelloAction;

public class HelloActionTest extends StrutsTestCase {
    
    public void testModelvsActionMessages() throws Exception {
    	
        ActionProxy proxy = getActionProxy("/hello.action");
        assertNotNull(proxy);
 
        HelloAction action = (HelloAction) proxy.getAction();
        assertNotNull(action);
 
        String result = proxy.execute();
        
        assertTrue("Expected a input result!", ActionSupport.INPUT.equals(result));
        assertEquals("Expected the action error message!!", "Action Required String!", action.getFieldErrors().get("bar").get(0));
        assertEquals("Expected the model error message!!", "Model Required String!", action.getFieldErrors().get("foo").get(0));
    }
}
