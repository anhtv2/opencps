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

package org.opencps.accountmgt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the BusinessDomain service. Represents a row in the &quot;opencps_acc_businessdomain&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.accountmgt.model.impl.BusinessDomainModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.accountmgt.model.impl.BusinessDomainImpl}.
 * </p>
 *
 * @author khoavd
 * @see BusinessDomain
 * @see org.opencps.accountmgt.model.impl.BusinessDomainImpl
 * @see org.opencps.accountmgt.model.impl.BusinessDomainModelImpl
 * @generated
 */
public interface BusinessDomainModel extends BaseModel<BusinessDomain> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a business domain model instance should use the {@link BusinessDomain} interface instead.
	 */

	/**
	 * Returns the primary key of this business domain.
	 *
	 * @return the primary key of this business domain
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this business domain.
	 *
	 * @param primaryKey the primary key of this business domain
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the business ID of this business domain.
	 *
	 * @return the business ID of this business domain
	 */
	public long getBusinessId();

	/**
	 * Sets the business ID of this business domain.
	 *
	 * @param businessId the business ID of this business domain
	 */
	public void setBusinessId(long businessId);

	/**
	 * Returns the business domain ID of this business domain.
	 *
	 * @return the business domain ID of this business domain
	 */
	@AutoEscape
	public String getBusinessDomainId();

	/**
	 * Sets the business domain ID of this business domain.
	 *
	 * @param businessDomainId the business domain ID of this business domain
	 */
	public void setBusinessDomainId(String businessDomainId);

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
		org.opencps.accountmgt.model.BusinessDomain businessDomain);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.accountmgt.model.BusinessDomain> toCacheModel();

	@Override
	public org.opencps.accountmgt.model.BusinessDomain toEscapedModel();

	@Override
	public org.opencps.accountmgt.model.BusinessDomain toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}