/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2020-09-10 08:42:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1590401465357L));
    _jspx_dependants.put("jar:file:/C:/SilencerStoreProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SilencerStoreProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t<title>Create User</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<script \r\n");
      out.write("\t\t\tsrc=\"https://code.jquery.com/jquery-3.3.1.min.js\" \r\n");
      out.write("\t\t\tintegrity=\"sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=\" \r\n");
      out.write("\t\t\tcrossorigin=\"anonymous\">\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script \r\n");
      out.write("\t\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js\" \r\n");
      out.write("\t\t\tintegrity=\"sha512-UdIMMlVx0HEynClOIFSyOrPggomfhBKJE28LKl8yR3ghkgugPnG6iLfRfHwushZl1MOPSY6TsuBDGPK2X4zYKg==\" \r\n");
      out.write("\t\t\tcrossorigin=\"anonymous\">\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    \r\n");
      out.write("\t    ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div align=\"center\">\r\n");
      out.write("    \r\n");
      out.write("    \t<h3><p style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messageFailed}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p></h3>\r\n");
      out.write("    \t\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div align=\"center\">\r\n");
      out.write("    \r\n");
      out.write("\t    ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t<table >\r\n");
      out.write("    \t\r\n");
      out.write("    \t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">Full Name:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"text\" name=\"fullName\" id=\"fullName\" size=\"45\" value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.fullName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">Email:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"text\" name=\"email\" id=\"email\" size=\"45\"  value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">Phone:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"tel\" name=\"phone\" id=\"phone\" size=\"45\"  value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">Discount:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"text\" name=\"discount\" id=\"discount\" size=\"5\"  value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.discount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">%</td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">Country:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"text\" name=\"country\" id=\"country\" size=\"45\"  value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.country }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">City:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"text\" name=\"city\" id=\"city\" size=\"45\"  value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.city }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">ZipCode:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"text\" name=\"zipCode\" id=\"zipCode\" size=\"45\"  value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.zipcode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">Address:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"text\" name=\"address\" id=\"address\" size=\"45\" value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t    \t\t\t\r\n");
      out.write("    \t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">Password:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"password\" name=\"password\" id=\"password\" size=\"45\"  value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.password }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">Confirm Password:</td>\r\n");
      out.write("    \t\t\t\t<td><input type=\"password\" name=\"confirmpassword\" id=\"confirmpassword\" size=\"45\"  value= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.password }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\t<tr >\r\n");
      out.write("    \t\t\t\t<td align=\"right\">\r\n");
      out.write("    \t\t\t\t\t<button type=\"submit\" >Save</button>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    \t\t\t\t\t\r\n");
      out.write("    \t\t\t\t</td>\r\n");
      out.write("    \t\t\t</tr>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t </table>\r\n");
      out.write("    \t\r\n");
      out.write("    \t</form>\r\n");
      out.write("    \t<button onclick=\"javascript:history.go(-1);\" >Cancel</button>\r\n");
      out.write("    \t\t\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("\t\t$(\"#customerForm\").validate({\r\n");
      out.write("\t\t\trules: {\r\n");
      out.write("\t\t\t\temail: {\r\n");
      out.write("\t\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\t\temail: true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfullName: \"required\",\r\n");
      out.write("\t\t\t\tdiscount: \"number\",\r\n");
      out.write("\t\t\t\tphone: \"required\",\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t    password: {\r\n");
      out.write("\t\t\t    \trequired: true,\r\n");
      out.write("\t\t\t    \tminlength: 6\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    confirmpassword:{\r\n");
      out.write("\t\t\t    \trequired: true,\r\n");
      out.write("\t\t\t    \tequalTo: \"#password\"\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tmessages: {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\temail: {\r\n");
      out.write("\t\t\t\t\trequired: \"Please enter email\",\r\n");
      out.write("\t\t\t\t\temail: \"Please enter valid email\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfullName: \"Please enter Full Name\",\r\n");
      out.write("\t\t\t\tdiscount: \"Enter discount between 0-100\",\r\n");
      out.write("\t\t\t\tphone: \"Please enter phone\",\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tpassword: {\r\n");
      out.write("\t\t\t\t\trequired:\"Please enter password\",\r\n");
      out.write("\t\t\t\t\tminlength: \"At least 6 characters\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tconfirmpassword: {\r\n");
      out.write("\t\t\t\t\trequired: \"Please write password here again\",\r\n");
      out.write("\t\t\t\t\tequalTo: \"Password does not match\"\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /admin/customer_form.jsp(28,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t     \t<h1>Edit Customer</h1>\r\n");
          out.write("\t    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /admin/customer_form.jsp(32,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t     \t<h1>Create Customer</h1>\r\n");
          out.write("\t    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /admin/customer_form.jsp(45,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t    \r\n");
          out.write("\t\t     \t<form action=\"update_customer\" method=\"post\" id=\"customerForm\">\r\n");
          out.write("\t\t     \t<input type=\"hidden\" name = \"customerId\" value= ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.customerId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" >\r\n");
          out.write("\t\t     \t\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /admin/customer_form.jsp(52,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t    \r\n");
          out.write("\t\t     \t<form action=\"create_customer\" method=\"post\" id=\"customerForm\">\r\n");
          out.write("\t\t     \t\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }
}
