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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Citizen service. Represents a row in the &quot;opencps_acc_citizen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.accountmgt.model.impl.CitizenModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.accountmgt.model.impl.CitizenImpl}.
 * </p>
 *
 * @author khoavd
 * @see Citizen
 * @see org.opencps.accountmgt.model.impl.CitizenImpl
 * @see org.opencps.accountmgt.model.impl.CitizenModelImpl
 * @generated
 */
public interface CitizenModel extends BaseModel<Citizen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a citizen model instance should use the {@link Citizen} interface instead.
	 */

	/**
	 * Returns the primary key of this citizen.
	 *
	 * @return the primary key of this citizen
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this citizen.
	 *
	 * @param primaryKey the primary key of this citizen
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the citizen ID of this citizen.
	 *
	 * @return the citizen ID of this citizen
	 */
	public long getCitizenId();

	/**
	 * Sets the citizen ID of this citizen.
	 *
	 * @param citizenId the citizen ID of this citizen
	 */
	public void setCitizenId(long citizenId);

	/**
	 * Returns the company ID of this citizen.
	 *
	 * @return the company ID of this citizen
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this citizen.
	 *
	 * @param companyId the company ID of this citizen
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this citizen.
	 *
	 * @return the group ID of this citizen
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this citizen.
	 *
	 * @param groupId the group ID of this citizen
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this citizen.
	 *
	 * @return the user ID of this citizen
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this citizen.
	 *
	 * @param userId the user ID of this citizen
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this citizen.
	 *
	 * @return the user uuid of this citizen
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this citizen.
	 *
	 * @param userUuid the user uuid of this citizen
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this citizen.
	 *
	 * @return the create date of this citizen
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this citizen.
	 *
	 * @param createDate the create date of this citizen
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this citizen.
	 *
	 * @return the modified date of this citizen
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this citizen.
	 *
	 * @param modifiedDate the modified date of this citizen
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the uuid of this citizen.
	 *
	 * @return the uuid of this citizen
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this citizen.
	 *
	 * @param uuid the uuid of this citizen
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the full name of this citizen.
	 *
	 * @return the full name of this citizen
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this citizen.
	 *
	 * @param fullName the full name of this citizen
	 */
	public void setFullName(String fullName);

	/**
	 * Returns the personal ID of this citizen.
	 *
	 * @return the personal ID of this citizen
	 */
	@AutoEscape
	public String getPersonalId();

	/**
	 * Sets the personal ID of this citizen.
	 *
	 * @param personalId the personal ID of this citizen
	 */
	public void setPersonalId(String personalId);

	/**
	 * Returns the gender of this citizen.
	 *
	 * @return the gender of this citizen
	 */
	public int getGender();

	/**
	 * Sets the gender of this citizen.
	 *
	 * @param gender the gender of this citizen
	 */
	public void setGender(int gender);

	/**
	 * Returns the birthdate of this citizen.
	 *
	 * @return the birthdate of this citizen
	 */
	public Date getBirthdate();

	/**
	 * Sets the birthdate of this citizen.
	 *
	 * @param birthdate the birthdate of this citizen
	 */
	public void setBirthdate(Date birthdate);

	/**
	 * Returns the address of this citizen.
	 *
	 * @return the address of this citizen
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this citizen.
	 *
	 * @param address the address of this citizen
	 */
	public void setAddress(String address);

	/**
	 * Returns the city code of this citizen.
	 *
	 * @return the city code of this citizen
	 */
	@AutoEscape
	public String getCityCode();

	/**
	 * Sets the city code of this citizen.
	 *
	 * @param cityCode the city code of this citizen
	 */
	public void setCityCode(String cityCode);

	/**
	 * Returns the district code of this citizen.
	 *
	 * @return the district code of this citizen
	 */
	@AutoEscape
	public String getDistrictCode();

	/**
	 * Sets the district code of this citizen.
	 *
	 * @param districtCode the district code of this citizen
	 */
	public void setDistrictCode(String districtCode);

	/**
	 * Returns the ward code of this citizen.
	 *
	 * @return the ward code of this citizen
	 */
	@AutoEscape
	public String getWardCode();

	/**
	 * Sets the ward code of this citizen.
	 *
	 * @param wardCode the ward code of this citizen
	 */
	public void setWardCode(String wardCode);

	/**
	 * Returns the tel no of this citizen.
	 *
	 * @return the tel no of this citizen
	 */
	@AutoEscape
	public String getTelNo();

	/**
	 * Sets the tel no of this citizen.
	 *
	 * @param telNo the tel no of this citizen
	 */
	public void setTelNo(String telNo);

	/**
	 * Returns the email of this citizen.
	 *
	 * @return the email of this citizen
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this citizen.
	 *
	 * @param email the email of this citizen
	 */
	public void setEmail(String email);

	/**
	 * Returns the attach file of this citizen.
	 *
	 * @return the attach file of this citizen
	 */
	public long getAttachFile();

	/**
	 * Sets the attach file of this citizen.
	 *
	 * @param attachFile the attach file of this citizen
	 */
	public void setAttachFile(long attachFile);

	/**
	 * Returns the mapping user ID of this citizen.
	 *
	 * @return the mapping user ID of this citizen
	 */
	public long getMappingUserId();

	/**
	 * Sets the mapping user ID of this citizen.
	 *
	 * @param mappingUserId the mapping user ID of this citizen
	 */
	public void setMappingUserId(long mappingUserId);

	/**
	 * Returns the mapping user uuid of this citizen.
	 *
	 * @return the mapping user uuid of this citizen
	 * @throws SystemException if a system exception occurred
	 */
	public String getMappingUserUuid() throws SystemException;

	/**
	 * Sets the mapping user uuid of this citizen.
	 *
	 * @param mappingUserUuid the mapping user uuid of this citizen
	 */
	public void setMappingUserUuid(String mappingUserUuid);

	/**
	 * Returns the account status of this citizen.
	 *
	 * @return the account status of this citizen
	 */
	public int getAccountStatus();

	/**
	 * Sets the account status of this citizen.
	 *
	 * @param accountStatus the account status of this citizen
	 */
	public void setAccountStatus(int accountStatus);

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
	public int compareTo(org.opencps.accountmgt.model.Citizen citizen);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.accountmgt.model.Citizen> toCacheModel();

	@Override
	public org.opencps.accountmgt.model.Citizen toEscapedModel();

	@Override
	public org.opencps.accountmgt.model.Citizen toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}