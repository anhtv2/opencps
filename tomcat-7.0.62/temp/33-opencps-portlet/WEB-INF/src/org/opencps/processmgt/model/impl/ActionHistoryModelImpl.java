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

import org.opencps.processmgt.model.ActionHistory;
import org.opencps.processmgt.model.ActionHistoryModel;
import org.opencps.processmgt.model.ActionHistorySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ActionHistory service. Represents a row in the &quot;opencps_actionhistory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.processmgt.model.ActionHistoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ActionHistoryImpl}.
 * </p>
 *
 * @author khoavd
 * @see ActionHistoryImpl
 * @see org.opencps.processmgt.model.ActionHistory
 * @see org.opencps.processmgt.model.ActionHistoryModel
 * @generated
 */
@JSON(strict = true)
public class ActionHistoryModelImpl extends BaseModelImpl<ActionHistory>
	implements ActionHistoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a action history model instance should use the {@link org.opencps.processmgt.model.ActionHistory} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_actionhistory";
	public static final Object[][] TABLE_COLUMNS = {
			{ "actionHistoryId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "processOrderId", Types.BIGINT },
			{ "processWorkflowId", Types.BIGINT },
			{ "actionDatetime", Types.TIMESTAMP },
			{ "stepName", Types.VARCHAR },
			{ "actionName", Types.VARCHAR },
			{ "actionNote", Types.VARCHAR },
			{ "actionUserId", Types.BIGINT },
			{ "daysDoing", Types.INTEGER },
			{ "daysDelay", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_actionhistory (actionHistoryId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,processOrderId LONG,processWorkflowId LONG,actionDatetime DATE null,stepName VARCHAR(75) null,actionName VARCHAR(75) null,actionNote VARCHAR(75) null,actionUserId LONG,daysDoing INTEGER,daysDelay INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table opencps_actionhistory";
	public static final String ORDER_BY_JPQL = " ORDER BY actionHistory.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_actionhistory.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.processmgt.model.ActionHistory"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.processmgt.model.ActionHistory"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.processmgt.model.ActionHistory"),
			true);
	public static long PROCESSORDERID_COLUMN_BITMASK = 1L;
	public static long PROCESSWORKFLOWID_COLUMN_BITMASK = 2L;
	public static long CREATEDATE_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ActionHistory toModel(ActionHistorySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ActionHistory model = new ActionHistoryImpl();

		model.setActionHistoryId(soapModel.getActionHistoryId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setProcessOrderId(soapModel.getProcessOrderId());
		model.setProcessWorkflowId(soapModel.getProcessWorkflowId());
		model.setActionDatetime(soapModel.getActionDatetime());
		model.setStepName(soapModel.getStepName());
		model.setActionName(soapModel.getActionName());
		model.setActionNote(soapModel.getActionNote());
		model.setActionUserId(soapModel.getActionUserId());
		model.setDaysDoing(soapModel.getDaysDoing());
		model.setDaysDelay(soapModel.getDaysDelay());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ActionHistory> toModels(ActionHistorySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ActionHistory> models = new ArrayList<ActionHistory>(soapModels.length);

		for (ActionHistorySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.processmgt.model.ActionHistory"));

	public ActionHistoryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _actionHistoryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setActionHistoryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _actionHistoryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ActionHistory.class;
	}

	@Override
	public String getModelClassName() {
		return ActionHistory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("actionHistoryId", getActionHistoryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("processOrderId", getProcessOrderId());
		attributes.put("processWorkflowId", getProcessWorkflowId());
		attributes.put("actionDatetime", getActionDatetime());
		attributes.put("stepName", getStepName());
		attributes.put("actionName", getActionName());
		attributes.put("actionNote", getActionNote());
		attributes.put("actionUserId", getActionUserId());
		attributes.put("daysDoing", getDaysDoing());
		attributes.put("daysDelay", getDaysDelay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long actionHistoryId = (Long)attributes.get("actionHistoryId");

		if (actionHistoryId != null) {
			setActionHistoryId(actionHistoryId);
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

		Long processOrderId = (Long)attributes.get("processOrderId");

		if (processOrderId != null) {
			setProcessOrderId(processOrderId);
		}

		Long processWorkflowId = (Long)attributes.get("processWorkflowId");

		if (processWorkflowId != null) {
			setProcessWorkflowId(processWorkflowId);
		}

		Date actionDatetime = (Date)attributes.get("actionDatetime");

		if (actionDatetime != null) {
			setActionDatetime(actionDatetime);
		}

		String stepName = (String)attributes.get("stepName");

		if (stepName != null) {
			setStepName(stepName);
		}

		String actionName = (String)attributes.get("actionName");

		if (actionName != null) {
			setActionName(actionName);
		}

		String actionNote = (String)attributes.get("actionNote");

		if (actionNote != null) {
			setActionNote(actionNote);
		}

		Long actionUserId = (Long)attributes.get("actionUserId");

		if (actionUserId != null) {
			setActionUserId(actionUserId);
		}

		Integer daysDoing = (Integer)attributes.get("daysDoing");

		if (daysDoing != null) {
			setDaysDoing(daysDoing);
		}

		Integer daysDelay = (Integer)attributes.get("daysDelay");

		if (daysDelay != null) {
			setDaysDelay(daysDelay);
		}
	}

	@JSON
	@Override
	public long getActionHistoryId() {
		return _actionHistoryId;
	}

	@Override
	public void setActionHistoryId(long actionHistoryId) {
		_actionHistoryId = actionHistoryId;
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
		_columnBitmask = -1L;

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
	public long getProcessOrderId() {
		return _processOrderId;
	}

	@Override
	public void setProcessOrderId(long processOrderId) {
		_columnBitmask |= PROCESSORDERID_COLUMN_BITMASK;

		if (!_setOriginalProcessOrderId) {
			_setOriginalProcessOrderId = true;

			_originalProcessOrderId = _processOrderId;
		}

		_processOrderId = processOrderId;
	}

	public long getOriginalProcessOrderId() {
		return _originalProcessOrderId;
	}

	@JSON
	@Override
	public long getProcessWorkflowId() {
		return _processWorkflowId;
	}

	@Override
	public void setProcessWorkflowId(long processWorkflowId) {
		_columnBitmask |= PROCESSWORKFLOWID_COLUMN_BITMASK;

		if (!_setOriginalProcessWorkflowId) {
			_setOriginalProcessWorkflowId = true;

			_originalProcessWorkflowId = _processWorkflowId;
		}

		_processWorkflowId = processWorkflowId;
	}

	public long getOriginalProcessWorkflowId() {
		return _originalProcessWorkflowId;
	}

	@JSON
	@Override
	public Date getActionDatetime() {
		return _actionDatetime;
	}

	@Override
	public void setActionDatetime(Date actionDatetime) {
		_actionDatetime = actionDatetime;
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
	public String getActionName() {
		if (_actionName == null) {
			return StringPool.BLANK;
		}
		else {
			return _actionName;
		}
	}

	@Override
	public void setActionName(String actionName) {
		_actionName = actionName;
	}

	@JSON
	@Override
	public String getActionNote() {
		if (_actionNote == null) {
			return StringPool.BLANK;
		}
		else {
			return _actionNote;
		}
	}

	@Override
	public void setActionNote(String actionNote) {
		_actionNote = actionNote;
	}

	@JSON
	@Override
	public long getActionUserId() {
		return _actionUserId;
	}

	@Override
	public void setActionUserId(long actionUserId) {
		_actionUserId = actionUserId;
	}

	@Override
	public String getActionUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getActionUserId(), "uuid",
			_actionUserUuid);
	}

	@Override
	public void setActionUserUuid(String actionUserUuid) {
		_actionUserUuid = actionUserUuid;
	}

	@JSON
	@Override
	public int getDaysDoing() {
		return _daysDoing;
	}

	@Override
	public void setDaysDoing(int daysDoing) {
		_daysDoing = daysDoing;
	}

	@JSON
	@Override
	public int getDaysDelay() {
		return _daysDelay;
	}

	@Override
	public void setDaysDelay(int daysDelay) {
		_daysDelay = daysDelay;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ActionHistory.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ActionHistory toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ActionHistory)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ActionHistoryImpl actionHistoryImpl = new ActionHistoryImpl();

		actionHistoryImpl.setActionHistoryId(getActionHistoryId());
		actionHistoryImpl.setCompanyId(getCompanyId());
		actionHistoryImpl.setGroupId(getGroupId());
		actionHistoryImpl.setUserId(getUserId());
		actionHistoryImpl.setCreateDate(getCreateDate());
		actionHistoryImpl.setModifiedDate(getModifiedDate());
		actionHistoryImpl.setProcessOrderId(getProcessOrderId());
		actionHistoryImpl.setProcessWorkflowId(getProcessWorkflowId());
		actionHistoryImpl.setActionDatetime(getActionDatetime());
		actionHistoryImpl.setStepName(getStepName());
		actionHistoryImpl.setActionName(getActionName());
		actionHistoryImpl.setActionNote(getActionNote());
		actionHistoryImpl.setActionUserId(getActionUserId());
		actionHistoryImpl.setDaysDoing(getDaysDoing());
		actionHistoryImpl.setDaysDelay(getDaysDelay());

		actionHistoryImpl.resetOriginalValues();

		return actionHistoryImpl;
	}

	@Override
	public int compareTo(ActionHistory actionHistory) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				actionHistory.getCreateDate());

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

		if (!(obj instanceof ActionHistory)) {
			return false;
		}

		ActionHistory actionHistory = (ActionHistory)obj;

		long primaryKey = actionHistory.getPrimaryKey();

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
		ActionHistoryModelImpl actionHistoryModelImpl = this;

		actionHistoryModelImpl._originalProcessOrderId = actionHistoryModelImpl._processOrderId;

		actionHistoryModelImpl._setOriginalProcessOrderId = false;

		actionHistoryModelImpl._originalProcessWorkflowId = actionHistoryModelImpl._processWorkflowId;

		actionHistoryModelImpl._setOriginalProcessWorkflowId = false;

		actionHistoryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ActionHistory> toCacheModel() {
		ActionHistoryCacheModel actionHistoryCacheModel = new ActionHistoryCacheModel();

		actionHistoryCacheModel.actionHistoryId = getActionHistoryId();

		actionHistoryCacheModel.companyId = getCompanyId();

		actionHistoryCacheModel.groupId = getGroupId();

		actionHistoryCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			actionHistoryCacheModel.createDate = createDate.getTime();
		}
		else {
			actionHistoryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			actionHistoryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			actionHistoryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		actionHistoryCacheModel.processOrderId = getProcessOrderId();

		actionHistoryCacheModel.processWorkflowId = getProcessWorkflowId();

		Date actionDatetime = getActionDatetime();

		if (actionDatetime != null) {
			actionHistoryCacheModel.actionDatetime = actionDatetime.getTime();
		}
		else {
			actionHistoryCacheModel.actionDatetime = Long.MIN_VALUE;
		}

		actionHistoryCacheModel.stepName = getStepName();

		String stepName = actionHistoryCacheModel.stepName;

		if ((stepName != null) && (stepName.length() == 0)) {
			actionHistoryCacheModel.stepName = null;
		}

		actionHistoryCacheModel.actionName = getActionName();

		String actionName = actionHistoryCacheModel.actionName;

		if ((actionName != null) && (actionName.length() == 0)) {
			actionHistoryCacheModel.actionName = null;
		}

		actionHistoryCacheModel.actionNote = getActionNote();

		String actionNote = actionHistoryCacheModel.actionNote;

		if ((actionNote != null) && (actionNote.length() == 0)) {
			actionHistoryCacheModel.actionNote = null;
		}

		actionHistoryCacheModel.actionUserId = getActionUserId();

		actionHistoryCacheModel.daysDoing = getDaysDoing();

		actionHistoryCacheModel.daysDelay = getDaysDelay();

		return actionHistoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{actionHistoryId=");
		sb.append(getActionHistoryId());
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
		sb.append(", processOrderId=");
		sb.append(getProcessOrderId());
		sb.append(", processWorkflowId=");
		sb.append(getProcessWorkflowId());
		sb.append(", actionDatetime=");
		sb.append(getActionDatetime());
		sb.append(", stepName=");
		sb.append(getStepName());
		sb.append(", actionName=");
		sb.append(getActionName());
		sb.append(", actionNote=");
		sb.append(getActionNote());
		sb.append(", actionUserId=");
		sb.append(getActionUserId());
		sb.append(", daysDoing=");
		sb.append(getDaysDoing());
		sb.append(", daysDelay=");
		sb.append(getDaysDelay());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("org.opencps.processmgt.model.ActionHistory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>actionHistoryId</column-name><column-value><![CDATA[");
		sb.append(getActionHistoryId());
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
			"<column><column-name>processOrderId</column-name><column-value><![CDATA[");
		sb.append(getProcessOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processWorkflowId</column-name><column-value><![CDATA[");
		sb.append(getProcessWorkflowId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionDatetime</column-name><column-value><![CDATA[");
		sb.append(getActionDatetime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stepName</column-name><column-value><![CDATA[");
		sb.append(getStepName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionName</column-name><column-value><![CDATA[");
		sb.append(getActionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionNote</column-name><column-value><![CDATA[");
		sb.append(getActionNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionUserId</column-name><column-value><![CDATA[");
		sb.append(getActionUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDoing</column-name><column-value><![CDATA[");
		sb.append(getDaysDoing());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDelay</column-name><column-value><![CDATA[");
		sb.append(getDaysDelay());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ActionHistory.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ActionHistory.class
		};
	private long _actionHistoryId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _processOrderId;
	private long _originalProcessOrderId;
	private boolean _setOriginalProcessOrderId;
	private long _processWorkflowId;
	private long _originalProcessWorkflowId;
	private boolean _setOriginalProcessWorkflowId;
	private Date _actionDatetime;
	private String _stepName;
	private String _actionName;
	private String _actionNote;
	private long _actionUserId;
	private String _actionUserUuid;
	private int _daysDoing;
	private int _daysDelay;
	private long _columnBitmask;
	private ActionHistory _escapedModel;
}