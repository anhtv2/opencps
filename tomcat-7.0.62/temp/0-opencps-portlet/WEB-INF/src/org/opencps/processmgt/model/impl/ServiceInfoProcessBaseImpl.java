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
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 */

package org.opencps.processmgt.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.opencps.processmgt.model.ServiceInfoProcess;
import org.opencps.processmgt.service.ServiceInfoProcessLocalServiceUtil;

/**
 * The extended model base implementation for the ServiceInfoProcess service. Represents a row in the &quot;opencps_serviceinfoprocess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServiceInfoProcessImpl}.
 * </p>
 *
 * @author khoavd
 * @see ServiceInfoProcessImpl
 * @see org.opencps.processmgt.model.ServiceInfoProcess
 * @generated
 */
public abstract class ServiceInfoProcessBaseImpl
	extends ServiceInfoProcessModelImpl implements ServiceInfoProcess {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a service info process model instance should use the {@link ServiceInfoProcess} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServiceInfoProcessLocalServiceUtil.addServiceInfoProcess(this);
		}
		else {
			ServiceInfoProcessLocalServiceUtil.updateServiceInfoProcess(this);
		}
	}
}