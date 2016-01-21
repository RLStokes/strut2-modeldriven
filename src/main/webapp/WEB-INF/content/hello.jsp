<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>

<body>

<s:form>
	<%-- validated member of model, text key cannot be resolved --%>
	<s:textfield name="foo" label="foo" />

	<%-- validated member of action itself, text key is resolved via Action, not CustomTextProvider --%>
	<s:textfield name="bar" label="bar" />

	<s:submit />
</s:form>

test text: <s:text name="text.key" />

</body>
</html>
