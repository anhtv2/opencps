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

package org.opencps.processmgt.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import org.opencps.processmgt.service.persistence.ServiceInfoProcessPK;

import java.io.Serializable;

/**
 * The base model interface for the ServiceInfoProcess service. Represents a row in the &quot;opencps_serviceinfoprocess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.processmgt.model.impl.ServiceInfoProcessModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.processmgt.model.impl.ServiceInfoProcessImpl}.
 * </p>
 *
 * @author khoavd
 * @see ServiceInfoProcess
 * @see org.opencps.processmgt.model.impl.ServiceInfoProcessImpl
 * @see org.opencps.processmgt.model.impl.ServiceInfoProcessModelImpl
 * @generated
 */
public interface ServiceInfoProcessModel extends BaseModel<ServiceInfoProcess> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service info process model instance should use the {@link ServiceInfoProcess} interface instead.
	 */

	/**
	 * Returns the primary key of this service info process.
	 *
	 * @return the primary key of this service info process
	 */
	public ServiceInfoProcessPK getPrimaryKey();

	/**
	 * Sets the primary key of this service info process.
	 *
	 * @param primaryKey the primary key of this service info process
	 */
	public void setPrimaryKey(ServiceInfoProcessPK primaryKey);

	/**
	 * Returns the service process ID of this service info process.
	 *
	 * @return the service process ID of this service info process
	 */
	public long getServiceProcessId();

	/**
	 * Sets the service process ID of this service info process.
	 *
	 * @param serviceProcessId the service process ID of this service info process
	 */
	public void setServiceProcessId(long serviceProcessId);

	/**
	 * Returns the serviceinfo ID of this service info process.
	 *
	 * @return the serviceinfo ID of this service info process
	 */
	public long getServiceinfoId();

	/**
	 * Sets the serviceinfo ID of this service info process.
	 *
	 * @param serviceinfoId the serviceinfo ID of this service info process
	 */
	public void setServiceinfoId(long serviceinfoId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		org.opencps.processmgt.model.ServiceInfoProcess serviceInfoProcess);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.processmgt.model.ServiceInfoProcess> toCacheModel();

	@Override
	public org.opencps.processmgt.model.ServiceInfoProcess toEscapedModel();

	@Override
	public org.opencps.processmgt.model.ServiceInfoProcess toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}