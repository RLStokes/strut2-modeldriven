package struts2.samples.modeldrivenandtextprovider.actions;

import com.opensymphony.xwork2.ActionSupport;

import struts2.test.modeldriven.actions.Index;

import org.apache.struts2.StrutsTestCase;

public class IndexTest extends StrutsTestCase {

    public void testIndex() throws Exception {
        Index index = new Index();
        String result = index.execute();
        assertTrue("Expected a success result!", ActionSupport.SUCCESS.equals(result));
        assertTrue("Expected the 'hello' action name!!", "hello".equals(index.getRedirectName()));
    }
}
