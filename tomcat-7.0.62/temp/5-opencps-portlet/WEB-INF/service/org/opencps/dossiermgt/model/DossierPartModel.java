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

package org.opencps.dossiermgt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DossierPart service. Represents a row in the &quot;opencps_dossierpart&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.dossiermgt.model.impl.DossierPartModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.dossiermgt.model.impl.DossierPartImpl}.
 * </p>
 *
 * @author trungnt
 * @see DossierPart
 * @see org.opencps.dossiermgt.model.impl.DossierPartImpl
 * @see org.opencps.dossiermgt.model.impl.DossierPartModelImpl
 * @generated
 */
public interface DossierPartModel extends BaseModel<DossierPart> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier part model instance should use the {@link DossierPart} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier part.
	 *
	 * @return the primary key of this dossier part
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier part.
	 *
	 * @param primaryKey the primary key of this dossier part
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dossierpart ID of this dossier part.
	 *
	 * @return the dossierpart ID of this dossier part
	 */
	public long getDossierpartId();

	/**
	 * Sets the dossierpart ID of this dossier part.
	 *
	 * @param dossierpartId the dossierpart ID of this dossier part
	 */
	public void setDossierpartId(long dossierpartId);

	/**
	 * Returns the company ID of this dossier part.
	 *
	 * @return the company ID of this dossier part
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier part.
	 *
	 * @param companyId the company ID of this dossier part
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this dossier part.
	 *
	 * @return the group ID of this dossier part
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this dossier part.
	 *
	 * @param groupId the group ID of this dossier part
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this dossier part.
	 *
	 * @return the user ID of this dossier part
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this dossier part.
	 *
	 * @param userId the user ID of this dossier part
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dossier part.
	 *
	 * @return the user uuid of this dossier part
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dossier part.
	 *
	 * @param userUuid the user uuid of this dossier part
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this dossier part.
	 *
	 * @return the create date of this dossier part
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier part.
	 *
	 * @param createDate the create date of this dossier part
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dossier part.
	 *
	 * @return the modified date of this dossier part
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dossier part.
	 *
	 * @param modifiedDate the modified date of this dossier part
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the dossier template ID of this dossier part.
	 *
	 * @return the dossier template ID of this dossier part
	 */
	public long getDossierTemplateId();

	/**
	 * Sets the dossier template ID of this dossier part.
	 *
	 * @param dossierTemplateId the dossier template ID of this dossier part
	 */
	public void setDossierTemplateId(long dossierTemplateId);

	/**
	 * Returns the part no of this dossier part.
	 *
	 * @return the part no of this dossier part
	 */
	@AutoEscape
	public String getPartNo();

	/**
	 * Sets the part no of this dossier part.
	 *
	 * @param partNo the part no of this dossier part
	 */
	public void setPartNo(String partNo);

	/**
	 * Returns the part name of this dossier part.
	 *
	 * @return the part name of this dossier part
	 */
	@AutoEscape
	public String getPartName();

	/**
	 * Sets the part name of this dossier part.
	 *
	 * @param partName the part name of this dossier part
	 */
	public void setPartName(String partName);

	/**
	 * Returns the part tip of this dossier part.
	 *
	 * @return the part tip of this dossier part
	 */
	@AutoEscape
	public String getPartTip();

	/**
	 * Sets the part tip of this dossier part.
	 *
	 * @param partTip the part tip of this dossier part
	 */
	public void setPartTip(String partTip);

	/**
	 * Returns the part type of this dossier part.
	 *
	 * @return the part type of this dossier part
	 */
	public int getPartType();

	/**
	 * Sets the part type of this dossier part.
	 *
	 * @param partType the part type of this dossier part
	 */
	public void setPartType(int partType);

	/**
	 * Returns the parent ID of this dossier part.
	 *
	 * @return the parent ID of this dossier part
	 */
	public long getParentId();

	/**
	 * Sets the parent ID of this dossier part.
	 *
	 * @param parentId the parent ID of this dossier part
	 */
	public void setParentId(long parentId);

	/**
	 * Returns the sibling of this dossier part.
	 *
	 * @return the sibling of this dossier part
	 */
	public double getSibling();

	/**
	 * Sets the sibling of this dossier part.
	 *
	 * @param sibling the sibling of this dossier part
	 */
	public void setSibling(double sibling);

	/**
	 * Returns the tree index of this dossier part.
	 *
	 * @return the tree index of this dossier part
	 */
	@AutoEscape
	public String getTreeIndex();

	/**
	 * Sets the tree index of this dossier part.
	 *
	 * @param treeIndex the tree index of this dossier part
	 */
	public void setTreeIndex(String treeIndex);

	/**
	 * Returns the form script of this dossier part.
	 *
	 * @return the form script of this dossier part
	 */
	@AutoEscape
	public String getFormScript();

	/**
	 * Sets the form script of this dossier part.
	 *
	 * @param formScript the form script of this dossier part
	 */
	public void setFormScript(String formScript);

	/**
	 * Returns the form report of this dossier part.
	 *
	 * @return the form report of this dossier part
	 */
	@AutoEscape
	public String getFormReport();

	/**
	 * Sets the form report of this dossier part.
	 *
	 * @param formReport the form report of this dossier part
	 */
	public void setFormReport(String formReport);

	/**
	 * Returns the sample data of this dossier part.
	 *
	 * @return the sample data of this dossier part
	 */
	@AutoEscape
	public String getSampleData();

	/**
	 * Sets the sample data of this dossier part.
	 *
	 * @param sampleData the sample data of this dossier part
	 */
	public void setSampleData(String sampleData);

	/**
	 * Returns the required of this dossier part.
	 *
	 * @return the required of this dossier part
	 */
	public boolean getRequired();

	/**
	 * Returns <code>true</code> if this dossier part is required.
	 *
	 * @return <code>true</code> if this dossier part is required; <code>false</code> otherwise
	 */
	public boolean isRequired();

	/**
	 * Sets whether this dossier part is required.
	 *
	 * @param required the required of this dossier part
	 */
	public void setRequired(boolean required);

	/**
	 * Returns the template file no of this dossier part.
	 *
	 * @return the template file no of this dossier part
	 */
	@AutoEscape
	public String getTemplateFileNo();

	/**
	 * Sets the template file no of this dossier part.
	 *
	 * @param templateFileNo the template file no of this dossier part
	 */
	public void setTemplateFileNo(String templateFileNo);

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
	public int compareTo(org.opencps.dossiermgt.model.DossierPart dossierPart);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.dossiermgt.model.DossierPart> toCacheModel();

	@Override
	public org.opencps.dossiermgt.model.DossierPart toEscapedModel();

	@Override
	public org.opencps.dossiermgt.model.DossierPart toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}