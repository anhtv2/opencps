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

import org.opencps.processmgt.model.ProcessStep;
import org.opencps.processmgt.model.ProcessStepModel;
import org.opencps.processmgt.model.ProcessStepSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ProcessStep service. Represents a row in the &quot;opencps_processstep&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.processmgt.model.ProcessStepModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProcessStepImpl}.
 * </p>
 *
 * @author khoavd
 * @see ProcessStepImpl
 * @see org.opencps.processmgt.model.ProcessStep
 * @see org.opencps.processmgt.model.ProcessStepModel
 * @generated
 */
@JSON(strict = true)
public class ProcessStepModelImpl extends BaseModelImpl<ProcessStep>
	implements ProcessStepModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a process step model instance should use the {@link org.opencps.processmgt.model.ProcessStep} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_processstep";
	public static final Object[][] TABLE_COLUMNS = {
			{ "processStepId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "serviceProcessId", Types.BIGINT },
			{ "stepName", Types.VARCHAR },
			{ "sequenceNo", Types.INTEGER },
			{ "dossierStatus", Types.VARCHAR },
			{ "daysDuration", Types.INTEGER },
			{ "referenceDossierPartId", Types.BIGINT },
			{ "externalAppUrl", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_processstep (processStepId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,serviceProcessId LONG,stepName VARCHAR(75) null,sequenceNo INTEGER,dossierStatus VARCHAR(75) null,daysDuration INTEGER,referenceDossierPartId LONG,externalAppUrl VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table opencps_processstep";
	public static final String ORDER_BY_JPQL = " ORDER BY processStep.sequenceNo DESC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_processstep.sequenceNo DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.processmgt.model.ProcessStep"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.processmgt.model.ProcessStep"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.processmgt.model.ProcessStep"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long SERVICEPROCESSID_COLUMN_BITMASK = 2L;
	public static long SEQUENCENO_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ProcessStep toModel(ProcessStepSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ProcessStep model = new ProcessStepImpl();

		model.setProcessStepId(soapModel.getProcessStepId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setServiceProcessId(soapModel.getServiceProcessId());
		model.setStepName(soapModel.getStepName());
		model.setSequenceNo(soapModel.getSequenceNo());
		model.setDossierStatus(soapModel.getDossierStatus());
		model.setDaysDuration(soapModel.getDaysDuration());
		model.setReferenceDossierPartId(soapModel.getReferenceDossierPartId());
		model.setExternalAppUrl(soapModel.getExternalAppUrl());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ProcessStep> toModels(ProcessStepSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ProcessStep> models = new ArrayList<ProcessStep>(soapModels.length);

		for (ProcessStepSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.processmgt.model.ProcessStep"));

	public ProcessStepModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _processStepId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProcessStepId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _processStepId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ProcessStep.class;
	}

	@Override
	public String getModelClassName() {
		return ProcessStep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("processStepId", getProcessStepId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("serviceProcessId", getServiceProcessId());
		attributes.put("stepName", getStepName());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("daysDuration", getDaysDuration());
		attributes.put("referenceDossierPartId", getReferenceDossierPartId());
		attributes.put("externalAppUrl", getExternalAppUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long processStepId = (Long)attributes.get("processStepId");

		if (processStepId != null) {
			setProcessStepId(processStepId);
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

		Long serviceProcessId = (Long)attributes.get("serviceProcessId");

		if (serviceProcessId != null) {
			setServiceProcessId(serviceProcessId);
		}

		String stepName = (String)attributes.get("stepName");

		if (stepName != null) {
			setStepName(stepName);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String dossierStatus = (String)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		Integer daysDuration = (Integer)attributes.get("daysDuration");

		if (daysDuration != null) {
			setDaysDuration(daysDuration);
		}

		Long referenceDossierPartId = (Long)attributes.get(
				"referenceDossierPartId");

		if (referenceDossierPartId != null) {
			setReferenceDossierPartId(referenceDossierPartId);
		}

		String externalAppUrl = (String)attributes.get("externalAppUrl");

		if (externalAppUrl != null) {
			setExternalAppUrl(externalAppUrl);
		}
	}

	@JSON
	@Override
	public long getProcessStepId() {
		return _processStepId;
	}

	@Override
	public void setProcessStepId(long processStepId) {
		_processStepId = processStepId;
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
	public long getServiceProcessId() {
		return _serviceProcessId;
	}

	@Override
	public void setServiceProcessId(long serviceProcessId) {
		_columnBitmask |= SERVICEPROCESSID_COLUMN_BITMASK;

		if (!_setOriginalServiceProcessId) {
			_setOriginalServiceProcessId = true;

			_originalServiceProcessId = _serviceProcessId;
		}

		_serviceProcessId = serviceProcessId;
	}

	public long getOriginalServiceProcessId() {
		return _originalServiceProcessId;
	}

	@JSON
	@Override
	public String getStepName() {
		if (_stepName == null) {
			return StringPool.BLANK;
		}
		else {
			return _stepName;
		}
	}

	@Override
	public void setStepName(String stepName) {
		_stepName = stepName;
	}

	@JSON
	@Override
	public int getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(int sequenceNo) {
		_columnBitmask = -1L;

		_sequenceNo = sequenceNo;
	}

	@JSON
	@Override
	public String getDossierStatus() {
		if (_dossierStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _dossierStatus;
		}
	}

	@Override
	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;
	}

	@JSON
	@Override
	public int getDaysDuration() {
		return _daysDuration;
	}

	@Override
	public void setDaysDuration(int daysDuration) {
		_daysDuration = daysDuration;
	}

	@JSON
	@Override
	public long getReferenceDossierPartId() {
		return _referenceDossierPartId;
	}

	@Override
	public void setReferenceDossierPartId(long referenceDossierPartId) {
		_referenceDossierPartId = referenceDossierPartId;
	}

	@JSON
	@Override
	public String getExternalAppUrl() {
		if (_externalAppUrl == null) {
			return StringPool.BLANK;
		}
		else {
			return _externalAppUrl;
		}
	}

	@Override
	public void setExternalAppUrl(String externalAppUrl) {
		_externalAppUrl = externalAppUrl;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ProcessStep.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ProcessStep toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ProcessStep)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProcessStepImpl processStepImpl = new ProcessStepImpl();

		processStepImpl.setProcessStepId(getProcessStepId());
		processStepImpl.setCompanyId(getCompanyId());
		processStepImpl.setGroupId(getGroupId());
		processStepImpl.setUserId(getUserId());
		processStepImpl.setCreateDate(getCreateDate());
		processStepImpl.setModifiedDate(getModifiedDate());
		processStepImpl.setServiceProcessId(getServiceProcessId());
		processStepImpl.setStepName(getStepName());
		processStepImpl.setSequenceNo(getSequenceNo());
		processStepImpl.setDossierStatus(getDossierStatus());
		processStepImpl.setDaysDuration(getDaysDuration());
		processStepImpl.setReferenceDossierPartId(getReferenceDossierPartId());
		processStepImpl.setExternalAppUrl(getExternalAppUrl());

		processStepImpl.resetOriginalValues();

		return processStepImpl;
	}

	@Override
	public int compareTo(ProcessStep processStep) {
		int value = 0;

		if (getSequenceNo() < processStep.getSequenceNo()) {
			value = -1;
		}
		else if (getSequenceNo() > processStep.getSequenceNo()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		if (!(obj instanceof ProcessStep)) {
			return false;
		}

		ProcessStep processStep = (ProcessStep)obj;

		long primaryKey = processStep.getPrimaryKey();

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
		ProcessStepModelImpl processStepModelImpl = this;

		processStepModelImpl._originalGroupId = processStepModelImpl._groupId;

		processStepModelImpl._setOriginalGroupId = false;

		processStepModelImpl._originalServiceProcessId = processStepModelImpl._serviceProcessId;

		processStepModelImpl._setOriginalServiceProcessId = false;

		processStepModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ProcessStep> toCacheModel() {
		ProcessStepCacheModel processStepCacheModel = new ProcessStepCacheModel();

		processStepCacheModel.processStepId = getProcessStepId();

		processStepCacheModel.companyId = getCompanyId();

		processStepCacheModel.groupId = getGroupId();

		processStepCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			processStepCacheModel.createDate = createDate.getTime();
		}
		else {
			processStepCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			processStepCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			processStepCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		processStepCacheModel.serviceProcessId = getServiceProcessId();

		processStepCacheModel.stepName = getStepName();

		String stepName = processStepCacheModel.stepName;

		if ((stepName != null) && (stepName.length() == 0)) {
			processStepCacheModel.stepName = null;
		}

		processStepCacheModel.sequenceNo = getSequenceNo();

		processStepCacheModel.dossierStatus = getDossierStatus();

		String dossierStatus = processStepCacheModel.dossierStatus;

		if ((dossierStatus != null) && (dossierStatus.length() == 0)) {
			processStepCacheModel.dossierStatus = null;
		}

		processStepCacheModel.daysDuration = getDaysDuration();

		processStepCacheModel.referenceDossierPartId = getReferenceDossierPartId();

		processStepCacheModel.externalAppUrl = getExternalAppUrl();

		String externalAppUrl = processStepCacheModel.externalAppUrl;

		if ((externalAppUrl != null) && (externalAppUrl.length() == 0)) {
			processStepCacheModel.externalAppUrl = null;
		}

		return processStepCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{processStepId=");
		sb.append(getProcessStepId());
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
		sb.append(", serviceProcessId=");
		sb.append(getServiceProcessId());
		sb.append(", stepName=");
		sb.append(getStepName());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", dossierStatus=");
		sb.append(getDossierStatus());
		sb.append(", daysDuration=");
		sb.append(getDaysDuration());
		sb.append(", referenceDossierPartId=");
		sb.append(getReferenceDossierPartId());
		sb.append(", externalAppUrl=");
		sb.append(getExternalAppUrl());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("org.opencps.processmgt.model.ProcessStep");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>processStepId</column-name><column-value><![CDATA[");
		sb.append(getProcessStepId());
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
			"<column><column-name>serviceProcessId</column-name><column-value><![CDATA[");
		sb.append(getServiceProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stepName</column-name><column-value><![CDATA[");
		sb.append(getStepName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStatus</column-name><column-value><![CDATA[");
		sb.append(getDossierStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDuration</column-name><column-value><![CDATA[");
		sb.append(getDaysDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>referenceDossierPartId</column-name><column-value><![CDATA[");
		sb.append(getReferenceDossierPartId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>externalAppUrl</column-name><column-value><![CDATA[");
		sb.append(getExternalAppUrl());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ProcessStep.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ProcessStep.class
		};
	private long _processStepId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _serviceProcessId;
	private long _originalServiceProcessId;
	private boolean _setOriginalServiceProcessId;
	private String _stepName;
	private int _sequenceNo;
	private String _dossierStatus;
	private int _daysDuration;
	private long _referenceDossierPartId;
	private String _externalAppUrl;
	private long _columnBitmask;
	private ProcessStep _escapedModel;
}