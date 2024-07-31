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

package org.opencps.servicemgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;

import org.opencps.servicemgt.model.ServiceInfo;
import org.opencps.servicemgt.service.ServiceInfoLocalService;
import org.opencps.servicemgt.service.persistence.ServiceFileTemplatePersistence;
import org.opencps.servicemgt.service.persistence.ServiceInfoFinder;
import org.opencps.servicemgt.service.persistence.ServiceInfoPersistence;
import org.opencps.servicemgt.service.persistence.TemplateFileFinder;
import org.opencps.servicemgt.service.persistence.TemplateFilePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the service info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.servicemgt.service.impl.ServiceInfoLocalServiceImpl}.
 * </p>
 *
 * @author khoavd
 * @see org.opencps.servicemgt.service.impl.ServiceInfoLocalServiceImpl
 * @see org.opencps.servicemgt.service.ServiceInfoLocalServiceUtil
 * @generated
 */
public abstract class ServiceInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements ServiceInfoLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.servicemgt.service.ServiceInfoLocalServiceUtil} to access the service info local service.
	 */

	/**
	 * Adds the service info to the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceInfo the service info
	 * @return the service info that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ServiceInfo addServiceInfo(ServiceInfo serviceInfo)
		throws SystemException {
		serviceInfo.setNew(true);

		return serviceInfoPersistence.update(serviceInfo);
	}

	/**
	 * Creates a new service info with the primary key. Does not add the service info to the database.
	 *
	 * @param serviceinfoId the primary key for the new service info
	 * @return the new service info
	 */
	@Override
	public ServiceInfo createServiceInfo(long serviceinfoId) {
		return serviceInfoPersistence.create(serviceinfoId);
	}

	/**
	 * Deletes the service info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceinfoId the primary key of the service info
	 * @return the service info that was removed
	 * @throws PortalException if a service info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ServiceInfo deleteServiceInfo(long serviceinfoId)
		throws PortalException, SystemException {
		return serviceInfoPersistence.remove(serviceinfoId);
	}

	/**
	 * Deletes the service info from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceInfo the service info
	 * @return the service info that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ServiceInfo deleteServiceInfo(ServiceInfo serviceInfo)
		throws SystemException {
		return serviceInfoPersistence.remove(serviceInfo);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(ServiceInfo.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return serviceInfoPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.servicemgt.model.impl.ServiceInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return serviceInfoPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.servicemgt.model.impl.ServiceInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return serviceInfoPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return serviceInfoPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return serviceInfoPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public ServiceInfo fetchServiceInfo(long serviceinfoId)
		throws SystemException {
		return serviceInfoPersistence.fetchByPrimaryKey(serviceinfoId);
	}

	/**
	 * Returns the service info with the matching UUID and company.
	 *
	 * @param uuid the service info's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching service info, or <code>null</code> if a matching service info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo fetchServiceInfoByUuidAndCompanyId(String uuid,
		long companyId) throws SystemException {
		return serviceInfoPersistence.fetchByUuid_C_First(uuid, companyId, null);
	}

	/**
	 * Returns the service info matching the UUID and group.
	 *
	 * @param uuid the service info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching service info, or <code>null</code> if a matching service info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo fetchServiceInfoByUuidAndGroupId(String uuid,
		long groupId) throws SystemException {
		return serviceInfoPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the service info with the primary key.
	 *
	 * @param serviceinfoId the primary key of the service info
	 * @return the service info
	 * @throws PortalException if a service info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo getServiceInfo(long serviceinfoId)
		throws PortalException, SystemException {
		return serviceInfoPersistence.findByPrimaryKey(serviceinfoId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return serviceInfoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the service info with the matching UUID and company.
	 *
	 * @param uuid the service info's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching service info
	 * @throws PortalException if a matching service info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo getServiceInfoByUuidAndCompanyId(String uuid,
		long companyId) throws PortalException, SystemException {
		return serviceInfoPersistence.findByUuid_C_First(uuid, companyId, null);
	}

	/**
	 * Returns the service info matching the UUID and group.
	 *
	 * @param uuid the service info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching service info
	 * @throws PortalException if a matching service info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo getServiceInfoByUuidAndGroupId(String uuid, long groupId)
		throws PortalException, SystemException {
		return serviceInfoPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the service infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.servicemgt.model.impl.ServiceInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service infos
	 * @param end the upper bound of the range of service infos (not inclusive)
	 * @return the range of service infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceInfo> getServiceInfos(int start, int end)
		throws SystemException {
		return serviceInfoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of service infos.
	 *
	 * @return the number of service infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getServiceInfosCount() throws SystemException {
		return serviceInfoPersistence.countAll();
	}

	/**
	 * Updates the service info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param serviceInfo the service info
	 * @return the service info that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ServiceInfo updateServiceInfo(ServiceInfo serviceInfo)
		throws SystemException {
		return serviceInfoPersistence.update(serviceInfo);
	}

	/**
	 * Returns the service file template local service.
	 *
	 * @return the service file template local service
	 */
	public org.opencps.servicemgt.service.ServiceFileTemplateLocalService getServiceFileTemplateLocalService() {
		return serviceFileTemplateLocalService;
	}

	/**
	 * Sets the service file template local service.
	 *
	 * @param serviceFileTemplateLocalService the service file template local service
	 */
	public void setServiceFileTemplateLocalService(
		org.opencps.servicemgt.service.ServiceFileTemplateLocalService serviceFileTemplateLocalService) {
		this.serviceFileTemplateLocalService = serviceFileTemplateLocalService;
	}

	/**
	 * Returns the service file template remote service.
	 *
	 * @return the service file template remote service
	 */
	public org.opencps.servicemgt.service.ServiceFileTemplateService getServiceFileTemplateService() {
		return serviceFileTemplateService;
	}

	/**
	 * Sets the service file template remote service.
	 *
	 * @param serviceFileTemplateService the service file template remote service
	 */
	public void setServiceFileTemplateService(
		org.opencps.servicemgt.service.ServiceFileTemplateService serviceFileTemplateService) {
		this.serviceFileTemplateService = serviceFileTemplateService;
	}

	/**
	 * Returns the service file template persistence.
	 *
	 * @return the service file template persistence
	 */
	public ServiceFileTemplatePersistence getServiceFileTemplatePersistence() {
		return serviceFileTemplatePersistence;
	}

	/**
	 * Sets the service file template persistence.
	 *
	 * @param serviceFileTemplatePersistence the service file template persistence
	 */
	public void setServiceFileTemplatePersistence(
		ServiceFileTemplatePersistence serviceFileTemplatePersistence) {
		this.serviceFileTemplatePersistence = serviceFileTemplatePersistence;
	}

	/**
	 * Returns the service info local service.
	 *
	 * @return the service info local service
	 */
	public org.opencps.servicemgt.service.ServiceInfoLocalService getServiceInfoLocalService() {
		return serviceInfoLocalService;
	}

	/**
	 * Sets the service info local service.
	 *
	 * @param serviceInfoLocalService the service info local service
	 */
	public void setServiceInfoLocalService(
		org.opencps.servicemgt.service.ServiceInfoLocalService serviceInfoLocalService) {
		this.serviceInfoLocalService = serviceInfoLocalService;
	}

	/**
	 * Returns the service info remote service.
	 *
	 * @return the service info remote service
	 */
	public org.opencps.servicemgt.service.ServiceInfoService getServiceInfoService() {
		return serviceInfoService;
	}

	/**
	 * Sets the service info remote service.
	 *
	 * @param serviceInfoService the service info remote service
	 */
	public void setServiceInfoService(
		org.opencps.servicemgt.service.ServiceInfoService serviceInfoService) {
		this.serviceInfoService = serviceInfoService;
	}

	/**
	 * Returns the service info persistence.
	 *
	 * @return the service info persistence
	 */
	public ServiceInfoPersistence getServiceInfoPersistence() {
		return serviceInfoPersistence;
	}

	/**
	 * Sets the service info persistence.
	 *
	 * @param serviceInfoPersistence the service info persistence
	 */
	public void setServiceInfoPersistence(
		ServiceInfoPersistence serviceInfoPersistence) {
		this.serviceInfoPersistence = serviceInfoPersistence;
	}

	/**
	 * Returns the service info finder.
	 *
	 * @return the service info finder
	 */
	public ServiceInfoFinder getServiceInfoFinder() {
		return serviceInfoFinder;
	}

	/**
	 * Sets the service info finder.
	 *
	 * @param serviceInfoFinder the service info finder
	 */
	public void setServiceInfoFinder(ServiceInfoFinder serviceInfoFinder) {
		this.serviceInfoFinder = serviceInfoFinder;
	}

	/**
	 * Returns the template file local service.
	 *
	 * @return the template file local service
	 */
	public org.opencps.servicemgt.service.TemplateFileLocalService getTemplateFileLocalService() {
		return templateFileLocalService;
	}

	/**
	 * Sets the template file local service.
	 *
	 * @param templateFileLocalService the template file local service
	 */
	public void setTemplateFileLocalService(
		org.opencps.servicemgt.service.TemplateFileLocalService templateFileLocalService) {
		this.templateFileLocalService = templateFileLocalService;
	}

	/**
	 * Returns the template file remote service.
	 *
	 * @return the template file remote service
	 */
	public org.opencps.servicemgt.service.TemplateFileService getTemplateFileService() {
		return templateFileService;
	}

	/**
	 * Sets the template file remote service.
	 *
	 * @param templateFileService the template file remote service
	 */
	public void setTemplateFileService(
		org.opencps.servicemgt.service.TemplateFileService templateFileService) {
		this.templateFileService = templateFileService;
	}

	/**
	 * Returns the template file persistence.
	 *
	 * @return the template file persistence
	 */
	public TemplateFilePersistence getTemplateFilePersistence() {
		return templateFilePersistence;
	}

	/**
	 * Sets the template file persistence.
	 *
	 * @param templateFilePersistence the template file persistence
	 */
	public void setTemplateFilePersistence(
		TemplateFilePersistence templateFilePersistence) {
		this.templateFilePersistence = templateFilePersistence;
	}

	/**
	 * Returns the template file finder.
	 *
	 * @return the template file finder
	 */
	public TemplateFileFinder getTemplateFileFinder() {
		return templateFileFinder;
	}

	/**
	 * Sets the template file finder.
	 *
	 * @param templateFileFinder the template file finder
	 */
	public void setTemplateFileFinder(TemplateFileFinder templateFileFinder) {
		this.templateFileFinder = templateFileFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public com.liferay.portlet.asset.service.AssetEntryLocalService getAssetEntryLocalService() {
		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService) {
		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Returns the asset entry remote service.
	 *
	 * @return the asset entry remote service
	 */
	public com.liferay.portlet.asset.service.AssetEntryService getAssetEntryService() {
		return assetEntryService;
	}

	/**
	 * Sets the asset entry remote service.
	 *
	 * @param assetEntryService the asset entry remote service
	 */
	public void setAssetEntryService(
		com.liferay.portlet.asset.service.AssetEntryService assetEntryService) {
		this.assetEntryService = assetEntryService;
	}

	/**
	 * Returns the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {
		this.assetEntryPersistence = assetEntryPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("org.opencps.servicemgt.model.ServiceInfo",
			serviceInfoLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.opencps.servicemgt.model.ServiceInfo");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return ServiceInfo.class;
	}

	protected String getModelClassName() {
		return ServiceInfo.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = serviceInfoPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.servicemgt.service.ServiceFileTemplateLocalService.class)
	protected org.opencps.servicemgt.service.ServiceFileTemplateLocalService serviceFileTemplateLocalService;
	@BeanReference(type = org.opencps.servicemgt.service.ServiceFileTemplateService.class)
	protected org.opencps.servicemgt.service.ServiceFileTemplateService serviceFileTemplateService;
	@BeanReference(type = ServiceFileTemplatePersistence.class)
	protected ServiceFileTemplatePersistence serviceFileTemplatePersistence;
	@BeanReference(type = org.opencps.servicemgt.service.ServiceInfoLocalService.class)
	protected org.opencps.servicemgt.service.ServiceInfoLocalService serviceInfoLocalService;
	@BeanReference(type = org.opencps.servicemgt.service.ServiceInfoService.class)
	protected org.opencps.servicemgt.service.ServiceInfoService serviceInfoService;
	@BeanReference(type = ServiceInfoPersistence.class)
	protected ServiceInfoPersistence serviceInfoPersistence;
	@BeanReference(type = ServiceInfoFinder.class)
	protected ServiceInfoFinder serviceInfoFinder;
	@BeanReference(type = org.opencps.servicemgt.service.TemplateFileLocalService.class)
	protected org.opencps.servicemgt.service.TemplateFileLocalService templateFileLocalService;
	@BeanReference(type = org.opencps.servicemgt.service.TemplateFileService.class)
	protected org.opencps.servicemgt.service.TemplateFileService templateFileService;
	@BeanReference(type = TemplateFilePersistence.class)
	protected TemplateFilePersistence templateFilePersistence;
	@BeanReference(type = TemplateFileFinder.class)
	protected TemplateFileFinder templateFileFinder;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = com.liferay.portlet.asset.service.AssetEntryLocalService.class)
	protected com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService;
	@BeanReference(type = com.liferay.portlet.asset.service.AssetEntryService.class)
	protected com.liferay.portlet.asset.service.AssetEntryService assetEntryService;
	@BeanReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ServiceInfoLocalServiceClpInvoker _clpInvoker = new ServiceInfoLocalServiceClpInvoker();
}