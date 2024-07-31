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

package org.opencps.usermgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.opencps.usermgt.model.WorkingUnit;
import org.opencps.usermgt.model.WorkingUnitModel;
import org.opencps.usermgt.model.WorkingUnitSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the WorkingUnit service. Represents a row in the &quot;opencps_workingunit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.usermgt.model.WorkingUnitModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkingUnitImpl}.
 * </p>
 *
 * @author khoavd
 * @see WorkingUnitImpl
 * @see org.opencps.usermgt.model.WorkingUnit
 * @see org.opencps.usermgt.model.WorkingUnitModel
 * @generated
 */
@JSON(strict = true)
public class WorkingUnitModelImpl extends BaseModelImpl<WorkingUnit>
	implements WorkingUnitModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a working unit model instance should use the {@link org.opencps.usermgt.model.WorkingUnit} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_workingunit";
	public static final Object[][] TABLE_COLUMNS = {
			{ "workingunitId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "enName", Types.VARCHAR },
			{ "govAgencyCode", Types.VARCHAR },
			{ "managerWorkingUnitId", Types.BIGINT },
			{ "parentWorkingUnitId", Types.BIGINT },
			{ "sibling", Types.INTEGER },
			{ "treeIndex", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "cityCode", Types.VARCHAR },
			{ "districtCode", Types.VARCHAR },
			{ "wardCode", Types.VARCHAR },
			{ "telNo", Types.VARCHAR },
			{ "faxNo", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "website", Types.VARCHAR },
			{ "isEmployer", Types.BOOLEAN },
			{ "mappingOrganisationId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_workingunit (workingunitId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,name VARCHAR(255) null,enName VARCHAR(255) null,govAgencyCode VARCHAR(75) null,managerWorkingUnitId LONG,parentWorkingUnitId LONG,sibling INTEGER,treeIndex VARCHAR(75) null,address VARCHAR(75) null,cityCode VARCHAR(75) null,districtCode VARCHAR(75) null,wardCode VARCHAR(75) null,telNo VARCHAR(75) null,faxNo VARCHAR(75) null,email VARCHAR(75) null,website STRING null,isEmployer BOOLEAN,mappingOrganisationId LONG)";
	public static final String TABLE_SQL_DROP = "drop table opencps_workingunit";
	public static final String ORDER_BY_JPQL = " ORDER BY workingUnit.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_workingunit.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.usermgt.model.WorkingUnit"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.usermgt.model.WorkingUnit"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.usermgt.model.WorkingUnit"),
			true);
	public static long EMAIL_COLUMN_BITMASK = 1L;
	public static long GOVAGENCYCODE_COLUMN_BITMASK = 2L;
	public static long GROUPID_COLUMN_BITMASK = 4L;
	public static long ISEMPLOYER_COLUMN_BITMASK = 8L;
	public static long PARENTWORKINGUNITID_COLUMN_BITMASK = 16L;
	public static long NAME_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static WorkingUnit toModel(WorkingUnitSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		WorkingUnit model = new WorkingUnitImpl();

		model.setWorkingunitId(soapModel.getWorkingunitId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setEnName(soapModel.getEnName());
		model.setGovAgencyCode(soapModel.getGovAgencyCode());
		model.setManagerWorkingUnitId(soapModel.getManagerWorkingUnitId());
		model.setParentWorkingUnitId(soapModel.getParentWorkingUnitId());
		model.setSibling(soapModel.getSibling());
		model.setTreeIndex(soapModel.getTreeIndex());
		model.setAddress(soapModel.getAddress());
		model.setCityCode(soapModel.getCityCode());
		model.setDistrictCode(soapModel.getDistrictCode());
		model.setWardCode(soapModel.getWardCode());
		model.setTelNo(soapModel.getTelNo());
		model.setFaxNo(soapModel.getFaxNo());
		model.setEmail(soapModel.getEmail());
		model.setWebsite(soapModel.getWebsite());
		model.setIsEmployer(soapModel.getIsEmployer());
		model.setMappingOrganisationId(soapModel.getMappingOrganisationId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<WorkingUnit> toModels(WorkingUnitSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<WorkingUnit> models = new ArrayList<WorkingUnit>(soapModels.length);

		for (WorkingUnitSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_OPENCPS_WORKINGUNIT_JOBPOS_NAME = "opencps_workingunit_jobpos";
	public static final Object[][] MAPPING_TABLE_OPENCPS_WORKINGUNIT_JOBPOS_COLUMNS =
		{
			{ "jobPosId", Types.BIGINT },
			{ "workingunitId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_OPENCPS_WORKINGUNIT_JOBPOS_SQL_CREATE =
		"create table opencps_workingunit_jobpos (jobPosId LONG not null,workingunitId LONG not null,primary key (jobPosId, workingunitId))";
	public static final boolean FINDER_CACHE_ENABLED_OPENCPS_WORKINGUNIT_JOBPOS = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.opencps_workingunit_jobpos"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.usermgt.model.WorkingUnit"));

	public WorkingUnitModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _workingunitId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWorkingunitId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _workingunitId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return WorkingUnit.class;
	}

	@Override
	public String getModelClassName() {
		return WorkingUnit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workingunitId", getWorkingunitId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("enName", getEnName());
		attributes.put("govAgencyCode", getGovAgencyCode());
		attributes.put("managerWorkingUnitId", getManagerWorkingUnitId());
		attributes.put("parentWorkingUnitId", getParentWorkingUnitId());
		attributes.put("sibling", getSibling());
		attributes.put("treeIndex", getTreeIndex());
		attributes.put("address", getAddress());
		attributes.put("cityCode", getCityCode());
		attributes.put("districtCode", getDistrictCode());
		attributes.put("wardCode", getWardCode());
		attributes.put("telNo", getTelNo());
		attributes.put("faxNo", getFaxNo());
		attributes.put("email", getEmail());
		attributes.put("website", getWebsite());
		attributes.put("isEmployer", getIsEmployer());
		attributes.put("mappingOrganisationId", getMappingOrganisationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workingunitId = (Long)attributes.get("workingunitId");

		if (workingunitId != null) {
			setWorkingunitId(workingunitId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String enName = (String)attributes.get("enName");

		if (enName != null) {
			setEnName(enName);
		}

		String govAgencyCode = (String)attributes.get("govAgencyCode");

		if (govAgencyCode != null) {
			setGovAgencyCode(govAgencyCode);
		}

		Long managerWorkingUnitId = (Long)attributes.get("managerWorkingUnitId");

		if (managerWorkingUnitId != null) {
			setManagerWorkingUnitId(managerWorkingUnitId);
		}

		Long parentWorkingUnitId = (Long)attributes.get("parentWorkingUnitId");

		if (parentWorkingUnitId != null) {
			setParentWorkingUnitId(parentWorkingUnitId);
		}

		Integer sibling = (Integer)attributes.get("sibling");

		if (sibling != null) {
			setSibling(sibling);
		}

		String treeIndex = (String)attributes.get("treeIndex");

		if (treeIndex != null) {
			setTreeIndex(treeIndex);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String cityCode = (String)attributes.get("cityCode");

		if (cityCode != null) {
			setCityCode(cityCode);
		}

		String districtCode = (String)attributes.get("districtCode");

		if (districtCode != null) {
			setDistrictCode(districtCode);
		}

		String wardCode = (String)attributes.get("wardCode");

		if (wardCode != null) {
			setWardCode(wardCode);
		}

		String telNo = (String)attributes.get("telNo");

		if (telNo != null) {
			setTelNo(telNo);
		}

		String faxNo = (String)attributes.get("faxNo");

		if (faxNo != null) {
			setFaxNo(faxNo);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		Boolean isEmployer = (Boolean)attributes.get("isEmployer");

		if (isEmployer != null) {
			setIsEmployer(isEmployer);
		}

		Long mappingOrganisationId = (Long)attributes.get(
				"mappingOrganisationId");

		if (mappingOrganisationId != null) {
			setMappingOrganisationId(mappingOrganisationId);
		}
	}

	@JSON
	@Override
	public long getWorkingunitId() {
		return _workingunitId;
	}

	@Override
	public void setWorkingunitId(long workingunitId) {
		_workingunitId = workingunitId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		_name = name;
	}

	@JSON
	@Override
	public String getEnName() {
		if (_enName == null) {
			return StringPool.BLANK;
		}
		else {
			return _enName;
		}
	}

	@Override
	public void setEnName(String enName) {
		_enName = enName;
	}

	@JSON
	@Override
	public String getGovAgencyCode() {
		if (_govAgencyCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _govAgencyCode;
		}
	}

	@Override
	public void setGovAgencyCode(String govAgencyCode) {
		_columnBitmask |= GOVAGENCYCODE_COLUMN_BITMASK;

		if (_originalGovAgencyCode == null) {
			_originalGovAgencyCode = _govAgencyCode;
		}

		_govAgencyCode = govAgencyCode;
	}

	public String getOriginalGovAgencyCode() {
		return GetterUtil.getString(_originalGovAgencyCode);
	}

	@JSON
	@Override
	public long getManagerWorkingUnitId() {
		return _managerWorkingUnitId;
	}

	@Override
	public void setManagerWorkingUnitId(long managerWorkingUnitId) {
		_managerWorkingUnitId = managerWorkingUnitId;
	}

	@JSON
	@Override
	public long getParentWorkingUnitId() {
		return _parentWorkingUnitId;
	}

	@Override
	public void setParentWorkingUnitId(long parentWorkingUnitId) {
		_columnBitmask |= PARENTWORKINGUNITID_COLUMN_BITMASK;

		if (!_setOriginalParentWorkingUnitId) {
			_setOriginalParentWorkingUnitId = true;

			_originalParentWorkingUnitId = _parentWorkingUnitId;
		}

		_parentWorkingUnitId = parentWorkingUnitId;
	}

	public long getOriginalParentWorkingUnitId() {
		return _originalParentWorkingUnitId;
	}

	@JSON
	@Override
	public int getSibling() {
		return _sibling;
	}

	@Override
	public void setSibling(int sibling) {
		_sibling = sibling;
	}

	@JSON
	@Override
	public String getTreeIndex() {
		if (_treeIndex == null) {
			return StringPool.BLANK;
		}
		else {
			return _treeIndex;
		}
	}

	@Override
	public void setTreeIndex(String treeIndex) {
		_treeIndex = treeIndex;
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@JSON
	@Override
	public String getCityCode() {
		if (_cityCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _cityCode;
		}
	}

	@Override
	public void setCityCode(String cityCode) {
		_cityCode = cityCode;
	}

	@JSON
	@Override
	public String getDistrictCode() {
		if (_districtCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _districtCode;
		}
	}

	@Override
	public void setDistrictCode(String districtCode) {
		_districtCode = districtCode;
	}

	@JSON
	@Override
	public String getWardCode() {
		if (_wardCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _wardCode;
		}
	}

	@Override
	public void setWardCode(String wardCode) {
		_wardCode = wardCode;
	}

	@JSON
	@Override
	public String getTelNo() {
		if (_telNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _telNo;
		}
	}

	@Override
	public void setTelNo(String telNo) {
		_telNo = telNo;
	}

	@JSON
	@Override
	public String getFaxNo() {
		if (_faxNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _faxNo;
		}
	}

	@Override
	public void setFaxNo(String faxNo) {
		_faxNo = faxNo;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_columnBitmask |= EMAIL_COLUMN_BITMASK;

		if (_originalEmail == null) {
			_originalEmail = _email;
		}

		_email = email;
	}

	public String getOriginalEmail() {
		return GetterUtil.getString(_originalEmail);
	}

	@JSON
	@Override
	public String getWebsite() {
		if (_website == null) {
			return StringPool.BLANK;
		}
		else {
			return _website;
		}
	}

	@Override
	public void setWebsite(String website) {
		_website = website;
	}

	@JSON
	@Override
	public boolean getIsEmployer() {
		return _isEmployer;
	}

	@Override
	public boolean isIsEmployer() {
		return _isEmployer;
	}

	@Override
	public void setIsEmployer(boolean isEmployer) {
		_columnBitmask |= ISEMPLOYER_COLUMN_BITMASK;

		if (!_setOriginalIsEmployer) {
			_setOriginalIsEmployer = true;

			_originalIsEmployer = _isEmployer;
		}

		_isEmployer = isEmployer;
	}

	public boolean getOriginalIsEmployer() {
		return _originalIsEmployer;
	}

	@JSON
	@Override
	public long getMappingOrganisationId() {
		return _mappingOrganisationId;
	}

	@Override
	public void setMappingOrganisationId(long mappingOrganisationId) {
		_mappingOrganisationId = mappingOrganisationId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			WorkingUnit.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public WorkingUnit toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (WorkingUnit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WorkingUnitImpl workingUnitImpl = new WorkingUnitImpl();

		workingUnitImpl.setWorkingunitId(getWorkingunitId());
		workingUnitImpl.setCompanyId(getCompanyId());
		workingUnitImpl.setGroupId(getGroupId());
		workingUnitImpl.setUserId(getUserId());
		workingUnitImpl.setCreateDate(getCreateDate());
		workingUnitImpl.setModifiedDate(getModifiedDate());
		workingUnitImpl.setName(getName());
		workingUnitImpl.setEnName(getEnName());
		workingUnitImpl.setGovAgencyCode(getGovAgencyCode());
		workingUnitImpl.setManagerWorkingUnitId(getManagerWorkingUnitId());
		workingUnitImpl.setParentWorkingUnitId(getParentWorkingUnitId());
		workingUnitImpl.setSibling(getSibling());
		workingUnitImpl.setTreeIndex(getTreeIndex());
		workingUnitImpl.setAddress(getAddress());
		workingUnitImpl.setCityCode(getCityCode());
		workingUnitImpl.setDistrictCode(getDistrictCode());
		workingUnitImpl.setWardCode(getWardCode());
		workingUnitImpl.setTelNo(getTelNo());
		workingUnitImpl.setFaxNo(getFaxNo());
		workingUnitImpl.setEmail(getEmail());
		workingUnitImpl.setWebsite(getWebsite());
		workingUnitImpl.setIsEmployer(getIsEmployer());
		workingUnitImpl.setMappingOrganisationId(getMappingOrganisationId());

		workingUnitImpl.resetOriginalValues();

		return workingUnitImpl;
	}

	@Override
	public int compareTo(WorkingUnit workingUnit) {
		int value = 0;

		value = getName().compareTo(workingUnit.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WorkingUnit)) {
			return false;
		}

		WorkingUnit workingUnit = (WorkingUnit)obj;

		long primaryKey = workingUnit.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		WorkingUnitModelImpl workingUnitModelImpl = this;

		workingUnitModelImpl._originalGroupId = workingUnitModelImpl._groupId;

		workingUnitModelImpl._setOriginalGroupId = false;

		workingUnitModelImpl._originalGovAgencyCode = workingUnitModelImpl._govAgencyCode;

		workingUnitModelImpl._originalParentWorkingUnitId = workingUnitModelImpl._parentWorkingUnitId;

		workingUnitModelImpl._setOriginalParentWorkingUnitId = false;

		workingUnitModelImpl._originalEmail = workingUnitModelImpl._email;

		workingUnitModelImpl._originalIsEmployer = workingUnitModelImpl._isEmployer;

		workingUnitModelImpl._setOriginalIsEmployer = false;

		workingUnitModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<WorkingUnit> toCacheModel() {
		WorkingUnitCacheModel workingUnitCacheModel = new WorkingUnitCacheModel();

		workingUnitCacheModel.workingunitId = getWorkingunitId();

		workingUnitCacheModel.companyId = getCompanyId();

		workingUnitCacheModel.groupId = getGroupId();

		workingUnitCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			workingUnitCacheModel.createDate = createDate.getTime();
		}
		else {
			workingUnitCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			workingUnitCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			workingUnitCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		workingUnitCacheModel.name = getName();

		String name = workingUnitCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			workingUnitCacheModel.name = null;
		}

		workingUnitCacheModel.enName = getEnName();

		String enName = workingUnitCacheModel.enName;

		if ((enName != null) && (enName.length() == 0)) {
			workingUnitCacheModel.enName = null;
		}

		workingUnitCacheModel.govAgencyCode = getGovAgencyCode();

		String govAgencyCode = workingUnitCacheModel.govAgencyCode;

		if ((govAgencyCode != null) && (govAgencyCode.length() == 0)) {
			workingUnitCacheModel.govAgencyCode = null;
		}

		workingUnitCacheModel.managerWorkingUnitId = getManagerWorkingUnitId();

		workingUnitCacheModel.parentWorkingUnitId = getParentWorkingUnitId();

		workingUnitCacheModel.sibling = getSibling();

		workingUnitCacheModel.treeIndex = getTreeIndex();

		String treeIndex = workingUnitCacheModel.treeIndex;

		if ((treeIndex != null) && (treeIndex.length() == 0)) {
			workingUnitCacheModel.treeIndex = null;
		}

		workingUnitCacheModel.address = getAddress();

		String address = workingUnitCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			workingUnitCacheModel.address = null;
		}

		workingUnitCacheModel.cityCode = getCityCode();

		String cityCode = workingUnitCacheModel.cityCode;

		if ((cityCode != null) && (cityCode.length() == 0)) {
			workingUnitCacheModel.cityCode = null;
		}

		workingUnitCacheModel.districtCode = getDistrictCode();

		String districtCode = workingUnitCacheModel.districtCode;

		if ((districtCode != null) && (districtCode.length() == 0)) {
			workingUnitCacheModel.districtCode = null;
		}

		workingUnitCacheModel.wardCode = getWardCode();

		String wardCode = workingUnitCacheModel.wardCode;

		if ((wardCode != null) && (wardCode.length() == 0)) {
			workingUnitCacheModel.wardCode = null;
		}

		workingUnitCacheModel.telNo = getTelNo();

		String telNo = workingUnitCacheModel.telNo;

		if ((telNo != null) && (telNo.length() == 0)) {
			workingUnitCacheModel.telNo = null;
		}

		workingUnitCacheModel.faxNo = getFaxNo();

		String faxNo = workingUnitCacheModel.faxNo;

		if ((faxNo != null) && (faxNo.length() == 0)) {
			workingUnitCacheModel.faxNo = null;
		}

		workingUnitCacheModel.email = getEmail();

		String email = workingUnitCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			workingUnitCacheModel.email = null;
		}

		workingUnitCacheModel.website = getWebsite();

		String website = workingUnitCacheModel.website;

		if ((website != null) && (website.length() == 0)) {
			workingUnitCacheModel.website = null;
		}

		workingUnitCacheModel.isEmployer = getIsEmployer();

		workingUnitCacheModel.mappingOrganisationId = getMappingOrganisationId();

		return workingUnitCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{workingunitId=");
		sb.append(getWorkingunitId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", enName=");
		sb.append(getEnName());
		sb.append(", govAgencyCode=");
		sb.append(getGovAgencyCode());
		sb.append(", managerWorkingUnitId=");
		sb.append(getManagerWorkingUnitId());
		sb.append(", parentWorkingUnitId=");
		sb.append(getParentWorkingUnitId());
		sb.append(", sibling=");
		sb.append(getSibling());
		sb.append(", treeIndex=");
		sb.append(getTreeIndex());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", cityCode=");
		sb.append(getCityCode());
		sb.append(", districtCode=");
		sb.append(getDistrictCode());
		sb.append(", wardCode=");
		sb.append(getWardCode());
		sb.append(", telNo=");
		sb.append(getTelNo());
		sb.append(", faxNo=");
		sb.append(getFaxNo());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", website=");
		sb.append(getWebsite());
		sb.append(", isEmployer=");
		sb.append(getIsEmployer());
		sb.append(", mappingOrganisationId=");
		sb.append(getMappingOrganisationId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("org.opencps.usermgt.model.WorkingUnit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>workingunitId</column-name><column-value><![CDATA[");
		sb.append(getWorkingunitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enName</column-name><column-value><![CDATA[");
		sb.append(getEnName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>managerWorkingUnitId</column-name><column-value><![CDATA[");
		sb.append(getManagerWorkingUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentWorkingUnitId</column-name><column-value><![CDATA[");
		sb.append(getParentWorkingUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sibling</column-name><column-value><![CDATA[");
		sb.append(getSibling());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>treeIndex</column-name><column-value><![CDATA[");
		sb.append(getTreeIndex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityCode</column-name><column-value><![CDATA[");
		sb.append(getCityCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtCode</column-name><column-value><![CDATA[");
		sb.append(getDistrictCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardCode</column-name><column-value><![CDATA[");
		sb.append(getWardCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telNo</column-name><column-value><![CDATA[");
		sb.append(getTelNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>faxNo</column-name><column-value><![CDATA[");
		sb.append(getFaxNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>website</column-name><column-value><![CDATA[");
		sb.append(getWebsite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isEmployer</column-name><column-value><![CDATA[");
		sb.append(getIsEmployer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mappingOrganisationId</column-name><column-value><![CDATA[");
		sb.append(getMappingOrganisationId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = WorkingUnit.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			WorkingUnit.class
		};
	private long _workingunitId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _enName;
	private String _govAgencyCode;
	private String _originalGovAgencyCode;
	private long _managerWorkingUnitId;
	private long _parentWorkingUnitId;
	private long _originalParentWorkingUnitId;
	private boolean _setOriginalParentWorkingUnitId;
	private int _sibling;
	private String _treeIndex;
	private String _address;
	private String _cityCode;
	private String _districtCode;
	private String _wardCode;
	private String _telNo;
	private String _faxNo;
	private String _email;
	private String _originalEmail;
	private String _website;
	private boolean _isEmployer;
	private boolean _originalIsEmployer;
	private boolean _setOriginalIsEmployer;
	private long _mappingOrganisationId;
	private long _columnBitmask;
	private WorkingUnit _escapedModel;
}