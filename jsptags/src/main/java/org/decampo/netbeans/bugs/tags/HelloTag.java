package org.decampo.netbeans.bugs.tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport
{
    private static final long serialVersionUID = 1L;

    @Override
    public int doStartTag() throws JspException
    {
        try
        {
            pageContext.getOut().write("hello");
            return SKIP_BODY;
        }
        catch (IOException ioe)
        {
            throw new JspTagException(ioe);
        }
    }
}
