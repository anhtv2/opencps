/**
 * OpenCPS is the open source Core Public Services software Copyright (C)
 * 2016-present OpenCPS community This program is free software: you can
 * redistribute it and/or modify it under the terms of the GNU Affero General
 * Public License as published by the Free Software Foundation, either version 3
 * of the License, or any later version. This program is distributed in the hope
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Affero General Public License for more details. You should have received a
 * copy of the GNU Affero General Public License along with this program. If
 * not, see <http://www.gnu.org/licenses/>
 */

package org.opencps.servicemgt.search;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import org.opencps.servicemgt.model.TemplateFile;

import com.liferay.portal.kernel.dao.search.SearchContainer;

/**
 * @author khoavd
 */
public class TemplateFileSearch extends SearchContainer<TemplateFile> {

	public static final String EMPTY_RESULTS_MESSAGE =
	    "no-template-were-found";
	/**
     * 
     */

	static List<String> headerNames = new ArrayList<String>();
	static {
		headerNames.add("no");
		headerNames.add("template-no");
		headerNames.add("template-name");
		headerNames.add("action");

	}

	/**
	 * @param portletRequest
	 * @param delta
	 * @param iteratorURL
	 */
	public TemplateFileSearch(
	    PortletRequest portletRequest, int delta, PortletURL iteratorURL) {

		super(portletRequest, new TemplateDisplayTerms(portletRequest), new TemplateSearchTerms(
		    portletRequest), DEFAULT_CUR_PARAM, delta, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);

	}
}
