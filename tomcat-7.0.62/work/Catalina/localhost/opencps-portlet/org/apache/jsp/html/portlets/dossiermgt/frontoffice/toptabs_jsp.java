/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.62
 * Generated at: 2024-07-30 15:30:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html.portlets.dossiermgt.frontoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.portlet.PortletURL;
import org.opencps.util.ActionKeys;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import java.util.ArrayList;
import java.util.List;
import org.opencps.dossiermgt.util.DossierMgtUtil;
import org.opencps.dossiermgt.permissions.DossierFilePermission;
import org.opencps.dossiermgt.permissions.DossierPermission;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;

public final class toptabs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(12);
    _jspx_dependants.put("/WEB-INF/tld/liferay-portlet.tld", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/init.jsp", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/html/portlets/dossiermgt/frontoffice/../init.jsp", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/WEB-INF/tld/opencps-dl-upload.tld", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/WEB-INF/tld/liferay-portlet-ext.tld", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/WEB-INF/tld/opencps-datamgt.tld", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/WEB-INF/tld/c.tld", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/WEB-INF/tld/liferay-theme.tld", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/WEB-INF/tld/liferay-util.tld", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/WEB-INF/tld/aui.tld", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/WEB-INF/tld/liferay-ui.tld", Long.valueOf(1722352539000L));
    _jspx_dependants.put("/WEB-INF/tld/liferay-security.tld", Long.valueOf(1722352539000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005furl2_005furl1_005furl0_005fparam_005fnames_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005furl2_005furl1_005furl0_005fparam_005fnames_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005furl2_005furl1_005furl0_005fparam_005fnames_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

/**
 * OpenCPS is the open source Core Public Services software
 * Copyright (C) 2016-present OpenCPS community
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

/**
 * OpenCPS is the open source Core Public Services software
 * Copyright (C) 2016-present OpenCPS community
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

      out.write('\r');
      out.write('\n');

/**
 * OpenCPS is the open source Core Public Services software
 * Copyright (C) 2016-present OpenCPS community
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_005fdefineObjects_005f0 = (com.liferay.taglib.portlet.DefineObjectsTag) _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.get(com.liferay.taglib.portlet.DefineObjectsTag.class);
      _jspx_th_portlet_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_portlet_005fdefineObjects_005f0 = _jspx_th_portlet_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_portlet_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.reuse(_jspx_th_portlet_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.reuse(_jspx_th_portlet_005fdefineObjects_005f0);
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      com.liferay.portal.kernel.util.SearchContainerReference searchContainerReference = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      searchContainerReference = (com.liferay.portal.kernel.util.SearchContainerReference) _jspx_page_context.findAttribute("searchContainerReference");
      out.write('\n');
      out.write('\n');
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay_002dtheme_005fdefineObjects_005f0 = (com.liferay.taglib.theme.DefineObjectsTag) _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.get(com.liferay.taglib.theme.DefineObjectsTag.class);
      _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_liferay_002dtheme_005fdefineObjects_005f0 = _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_liferay_002dtheme_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.reuse(_jspx_th_liferay_002dtheme_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.reuse(_jspx_th_liferay_002dtheme_005fdefineObjects_005f0);
      com.liferay.portal.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.model.Company company = null;
      com.liferay.portal.model.Account account = null;
      com.liferay.portal.model.User user = null;
      com.liferay.portal.model.User realUser = null;
      com.liferay.portal.model.Contact contact = null;
      com.liferay.portal.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.model.Theme theme = null;
      com.liferay.portal.model.ColorScheme colorScheme = null;
      com.liferay.portal.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.model.Company) _jspx_page_context.findAttribute("company");
      account = (com.liferay.portal.model.Account) _jspx_page_context.findAttribute("account");
      user = (com.liferay.portal.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');

	String currentURL = PortalUtil.getCurrentURL(liferayPortletRequest);
	String keyword = ParamUtil.getString(request, "keywords", StringPool.BLANK);
	String templatePath = portletConfig.getInitParameter("template-path");
	
	String portletResource = ParamUtil.getString(request,"portletResource");
	
	if (Validator.isNotNull(portletResource)) {
		portletPreferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
	}

      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write('\n');
      out.write('\n');


	String[] names = new String[]{DossierMgtUtil.TOP_TABS_DOSSIER, DossierMgtUtil.TOP_TABS_DOSSIER_FILE, DossierMgtUtil.TOP_TABS_EXTERNAL_DOSSIER};

	String value = ParamUtil.getString(request, "tabs1", DossierMgtUtil.TOP_TABS_DOSSIER);

	List<String> urls = new ArrayList<String>();
	
	if (PortletPermissionUtil.contains(permissionChecker, plid, portletDisplay.getId(), ActionKeys.VIEW) && 
			DossierPermission.contains(permissionChecker, scopeGroupId, ActionKeys.VIEW)) {
		PortletURL viewDossierURL = renderResponse.createRenderURL();
		viewDossierURL.setParameter("mvcPath", templatePath + "frontofficedossierlist.jsp");
		viewDossierURL.setParameter("tabs1", DossierMgtUtil.TOP_TABS_DOSSIER);
		urls.add(viewDossierURL.toString());
	}
	
	if (PortletPermissionUtil.contains(permissionChecker, plid, portletDisplay.getId(), ActionKeys.VIEW) && 
			DossierFilePermission.contains(permissionChecker, scopeGroupId, ActionKeys.VIEW)) {
		PortletURL viewDossierFileURL = renderResponse.createRenderURL();
		viewDossierFileURL.setParameter("mvcPath", templatePath + "frontofficedossierfilelist.jsp");
		viewDossierFileURL.setParameter("tabs1", DossierMgtUtil.TOP_TABS_DOSSIER_FILE);
		urls.add(viewDossierFileURL.toString());
	}
	
	if (PortletPermissionUtil.contains(permissionChecker, plid, portletDisplay.getId(), ActionKeys.VIEW) && 
			DossierPermission.contains(permissionChecker, scopeGroupId, ActionKeys.VIEW)) {
		PortletURL viewExternalDossierURL = renderResponse.createRenderURL();
		viewExternalDossierURL.setParameter("mvcPath", templatePath + "frontofficeexternaldossierlist.jsp");
		viewExternalDossierURL.setParameter("tabs1", DossierMgtUtil.TOP_TABS_DOSSIER_FILE);
		urls.add(viewExternalDossierURL.toString());
	}

      out.write('\n');
      //  liferay-ui:tabs
      com.liferay.taglib.ui.TabsTag _jspx_th_liferay_002dui_005ftabs_005f0 = (com.liferay.taglib.ui.TabsTag) _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005furl2_005furl1_005furl0_005fparam_005fnames_005fnobody.get(com.liferay.taglib.ui.TabsTag.class);
      _jspx_th_liferay_002dui_005ftabs_005f0.setPageContext(_jspx_page_context);
      _jspx_th_liferay_002dui_005ftabs_005f0.setParent(null);
      // /html/portlets/dossiermgt/frontoffice/toptabs.jsp(63,0) name = names type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005ftabs_005f0.setNames( StringUtil.merge(names) );
      // /html/portlets/dossiermgt/frontoffice/toptabs.jsp(63,0) name = param type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005ftabs_005f0.setParam("tabs1");
      // /html/portlets/dossiermgt/frontoffice/toptabs.jsp(63,0) name = url0 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005ftabs_005f0.setUrl0(urls != null && urls.size() > 0 ? urls.get(0): StringPool.BLANK );
      // /html/portlets/dossiermgt/frontoffice/toptabs.jsp(63,0) name = url1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005ftabs_005f0.setUrl1(urls != null && urls.size() > 1 ? urls.get(1): StringPool.BLANK );
      // /html/portlets/dossiermgt/frontoffice/toptabs.jsp(63,0) name = url2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005ftabs_005f0.setUrl2(urls != null && urls.size() > 2 ? urls.get(2): StringPool.BLANK );
      int _jspx_eval_liferay_002dui_005ftabs_005f0 = _jspx_th_liferay_002dui_005ftabs_005f0.doStartTag();
      if (_jspx_th_liferay_002dui_005ftabs_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005furl2_005furl1_005furl0_005fparam_005fnames_005fnobody.reuse(_jspx_th_liferay_002dui_005ftabs_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005furl2_005furl1_005furl0_005fparam_005fnames_005fnobody.reuse(_jspx_th_liferay_002dui_005ftabs_005f0);
      out.write('\n');
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
}
