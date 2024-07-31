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

package org.opencps.dossiermgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
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

import org.opencps.dossiermgt.model.DossierLog;
import org.opencps.dossiermgt.model.DossierLogModel;
import org.opencps.dossiermgt.model.DossierLogSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierLog service. Represents a row in the &quot;opencps_dossier_log&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.dossiermgt.model.DossierLogModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierLogImpl}.
 * </p>
 *
 * @author trungnt
 * @see DossierLogImpl
 * @see org.opencps.dossiermgt.model.DossierLog
 * @see org.opencps.dossiermgt.model.DossierLogModel
 * @generated
 */
@JSON(strict = true)
public class DossierLogModelImpl extends BaseModelImpl<DossierLog>
	implements DossierLogModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier log model instance should use the {@link org.opencps.dossiermgt.model.DossierLog} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_dossier_log";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dossierLogId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dossierId", Types.BIGINT },
			{ "fileGroupId", Types.BIGINT },
			{ "dossierStatus", Types.INTEGER },
			{ "actionInfo", Types.VARCHAR },
			{ "messageInfo", Types.VARCHAR },
			{ "updateDatetime", Types.TIMESTAMP },
			{ "level", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_dossier_log (dossierLogId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,dossierId LONG,fileGroupId LONG,dossierStatus INTEGER,actionInfo VARCHAR(255) null,messageInfo VARCHAR(1000) null,updateDatetime DATE null,level INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table opencps_dossier_log";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierLog.modifiedDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_dossier_log.modifiedDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.dossiermgt.model.DossierLog"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.dossiermgt.model.DossierLog"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.dossiermgt.model.DossierLog"),
			true);
	public static long DOSSIERID_COLUMN_BITMASK = 1L;
	public static long MODIFIEDDATE_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierLog toModel(DossierLogSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierLog model = new DossierLogImpl();

		model.setDossierLogId(soapModel.getDossierLogId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDossierId(soapModel.getDossierId());
		model.setFileGroupId(soapModel.getFileGroupId());
		model.setDossierStatus(soapModel.getDossierStatus());
		model.setActionInfo(soapModel.getActionInfo());
		model.setMessageInfo(soapModel.getMessageInfo());
		model.setUpdateDatetime(soapModel.getUpdateDatetime());
		model.setLevel(soapModel.getLevel());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierLog> toModels(DossierLogSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierLog> models = new ArrayList<DossierLog>(soapModels.length);

		for (DossierLogSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.dossiermgt.model.DossierLog"));

	public DossierLogModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dossierLogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierLogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DossierLog.class;
	}

	@Override
	public String getModelClassName() {
		return DossierLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierLogId", getDossierLogId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("fileGroupId", getFileGroupId());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("actionInfo", getActionInfo());
		attributes.put("messageInfo", getMessageInfo());
		attributes.put("updateDatetime", getUpdateDatetime());
		attributes.put("level", getLevel());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierLogId = (Long)attributes.get("dossierLogId");

		if (dossierLogId != null) {
			setDossierLogId(dossierLogId);
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

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long fileGroupId = (Long)attributes.get("fileGroupId");

		if (fileGroupId != null) {
			setFileGroupId(fileGroupId);
		}

		Integer dossierStatus = (Integer)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		String actionInfo = (String)attributes.get("actionInfo");

		if (actionInfo != null) {
			setActionInfo(actionInfo);
		}

		String messageInfo = (String)attributes.get("messageInfo");

		if (messageInfo != null) {
			setMessageInfo(messageInfo);
		}

		Date updateDatetime = (Date)attributes.get("updateDatetime");

		if (updateDatetime != null) {
			setUpdateDatetime(updateDatetime);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}
	}

	@JSON
	@Override
	public long getDossierLogId() {
		return _dossierLogId;
	}

	@Override
	public void setDossierLogId(long dossierLogId) {
		_dossierLogId = dossierLogId;
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
		_groupId = groupId;
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
		_columnBitmask = -1L;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_columnBitmask |= DOSSIERID_COLUMN_BITMASK;

		if (!_setOriginalDossierId) {
			_setOriginalDossierId = true;

			_originalDossierId = _dossierId;
		}

		_dossierId = dossierId;
	}

	public long getOriginalDossierId() {
		return _originalDossierId;
	}

	@JSON
	@Override
	public long getFileGroupId() {
		return _fileGroupId;
	}

	@Override
	public void setFileGroupId(long fileGroupId) {
		_fileGroupId = fileGroupId;
	}

	@JSON
	@Override
	public int getDossierStatus() {
		return _dossierStatus;
	}

	@Override
	public void setDossierStatus(int dossierStatus) {
		_dossierStatus = dossierStatus;
	}

	@JSON
	@Override
	public String getActionInfo() {
		if (_actionInfo == null) {
			return StringPool.BLANK;
		}
		else {
			return _actionInfo;
		}
	}

	@Override
	public void setActionInfo(String actionInfo) {
		_actionInfo = actionInfo;
	}

	@JSON
	@Override
	public String getMessageInfo() {
		if (_messageInfo == null) {
			return StringPool.BLANK;
		}
		else {
			return _messageInfo;
		}
	}

	@Override
	public void setMessageInfo(String messageInfo) {
		_messageInfo = messageInfo;
	}

	@JSON
	@Override
	public Date getUpdateDatetime() {
		return _updateDatetime;
	}

	@Override
	public void setUpdateDatetime(Date updateDatetime) {
		_updateDatetime = updateDatetime;
	}

	@JSON
	@Override
	public int getLevel() {
		return _level;
	}

	@Override
	public void setLevel(int level) {
		_level = level;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DossierLog.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierLog toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierLog)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierLogImpl dossierLogImpl = new DossierLogImpl();

		dossierLogImpl.setDossierLogId(getDossierLogId());
		dossierLogImpl.setCompanyId(getCompanyId());
		dossierLogImpl.setGroupId(getGroupId());
		dossierLogImpl.setUserId(getUserId());
		dossierLogImpl.setCreateDate(getCreateDate());
		dossierLogImpl.setModifiedDate(getModifiedDate());
		dossierLogImpl.setDossierId(getDossierId());
		dossierLogImpl.setFileGroupId(getFileGroupId());
		dossierLogImpl.setDossierStatus(getDossierStatus());
		dossierLogImpl.setActionInfo(getActionInfo());
		dossierLogImpl.setMessageInfo(getMessageInfo());
		dossierLogImpl.setUpdateDatetime(getUpdateDatetime());
		dossierLogImpl.setLevel(getLevel());

		dossierLogImpl.resetOriginalValues();

		return dossierLogImpl;
	}

	@Override
	public int compareTo(DossierLog dossierLog) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				dossierLog.getModifiedDate());

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

		if (!(obj instanceof DossierLog)) {
			return false;
		}

		DossierLog dossierLog = (DossierLog)obj;

		long primaryKey = dossierLog.getPrimaryKey();

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
		DossierLogModelImpl dossierLogModelImpl = this;

		dossierLogModelImpl._originalDossierId = dossierLogModelImpl._dossierId;

		dossierLogModelImpl._setOriginalDossierId = false;

		dossierLogModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DossierLog> toCacheModel() {
		DossierLogCacheModel dossierLogCacheModel = new DossierLogCacheModel();

		dossierLogCacheModel.dossierLogId = getDossierLogId();

		dossierLogCacheModel.companyId = getCompanyId();

		dossierLogCacheModel.groupId = getGroupId();

		dossierLogCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dossierLogCacheModel.createDate = createDate.getTime();
		}
		else {
			dossierLogCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dossierLogCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dossierLogCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dossierLogCacheModel.dossierId = getDossierId();

		dossierLogCacheModel.fileGroupId = getFileGroupId();

		dossierLogCacheModel.dossierStatus = getDossierStatus();

		dossierLogCacheModel.actionInfo = getActionInfo();

		String actionInfo = dossierLogCacheModel.actionInfo;

		if ((actionInfo != null) && (actionInfo.length() == 0)) {
			dossierLogCacheModel.actionInfo = null;
		}

		dossierLogCacheModel.messageInfo = getMessageInfo();

		String messageInfo = dossierLogCacheModel.messageInfo;

		if ((messageInfo != null) && (messageInfo.length() == 0)) {
			dossierLogCacheModel.messageInfo = null;
		}

		Date updateDatetime = getUpdateDatetime();

		if (updateDatetime != null) {
			dossierLogCacheModel.updateDatetime = updateDatetime.getTime();
		}
		else {
			dossierLogCacheModel.updateDatetime = Long.MIN_VALUE;
		}

		dossierLogCacheModel.level = getLevel();

		return dossierLogCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{dossierLogId=");
		sb.append(getDossierLogId());
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
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", fileGroupId=");
		sb.append(getFileGroupId());
		sb.append(", dossierStatus=");
		sb.append(getDossierStatus());
		sb.append(", actionInfo=");
		sb.append(getActionInfo());
		sb.append(", messageInfo=");
		sb.append(getMessageInfo());
		sb.append(", updateDatetime=");
		sb.append(getUpdateDatetime());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("org.opencps.dossiermgt.model.DossierLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierLogId</column-name><column-value><![CDATA[");
		sb.append(getDossierLogId());
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
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileGroupId</column-name><column-value><![CDATA[");
		sb.append(getFileGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStatus</column-name><column-value><![CDATA[");
		sb.append(getDossierStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionInfo</column-name><column-value><![CDATA[");
		sb.append(getActionInfo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageInfo</column-name><column-value><![CDATA[");
		sb.append(getMessageInfo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateDatetime</column-name><column-value><![CDATA[");
		sb.append(getUpdateDatetime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierLog.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierLog.class
		};
	private long _dossierLogId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierId;
	private long _originalDossierId;
	private boolean _setOriginalDossierId;
	private long _fileGroupId;
	private int _dossierStatus;
	private String _actionInfo;
	private String _messageInfo;
	private Date _updateDatetime;
	private int _level;
	private long _columnBitmask;
	private DossierLog _escapedModel;
}