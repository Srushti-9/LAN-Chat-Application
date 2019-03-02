package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Login page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<table width=700>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=200><!--%@ include file=\"menu.jsp\"%--></td>\n");
      out.write("\n");
      out.write("\t\t<td>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t<div><font color=000033 size=20>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t");

if("admin".equals(request.getParameter("type")))
{
	out.print("Admin Console</font>");
}
else
{
	out.print("User Console</font>");
}
DateFormat df=new SimpleDateFormat("EEEE, dd MMMM, yyyy ");
String date=df.format(new Date());
out.print("<br>");
for(int i=0;i<37;i++)
	out.print("&nbsp;");
out.print("<font size=3 color=3300FF>"+date+"</font>");

      out.write(" </font></div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td></td>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t<form action=loginhandler.jsp method=post>\n");
      out.write("\t\t<table align=center cellpadding=5>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>UserName</td>\n");
      out.write("\t\t\t\t<td><input type=text name=userName></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Password</td>\n");
      out.write("\t\t\t\t<td><input type=password name=password></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Type</td>\n");
      out.write("\t\t\t\t<td><label>");
      out.print( request.getParameter("type") );
      out.write("</label></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td><input type=hidden name=type\n");
      out.write("\t\t\t\t\tvalue=");
      out.print( request.getParameter("type") );
      out.write("></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t<td align=center><input type=submit value=Submit></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
