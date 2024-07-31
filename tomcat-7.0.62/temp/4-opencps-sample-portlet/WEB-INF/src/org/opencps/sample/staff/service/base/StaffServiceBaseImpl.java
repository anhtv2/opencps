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

package org.opencps.sample.staff.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.opencps.sample.department.service.persistence.DepartmentPersistence;
import org.opencps.sample.staff.model.Staff;
import org.opencps.sample.staff.service.StaffService;
import org.opencps.sample.staff.service.persistence.StaffPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the staff remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.sample.staff.service.impl.StaffServiceImpl}.
 * </p>
 *
 * @author trungnt
 * @see org.opencps.sample.staff.service.impl.StaffServiceImpl
 * @see org.opencps.sample.staff.service.StaffServiceUtil
 * @generated
 */
public abstract class StaffServiceBaseImpl extends BaseServiceImpl
	implements StaffService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.sample.staff.service.StaffServiceUtil} to access the staff remote service.
	 */

	/**
	 * Returns the staff local service.
	 *
	 * @return the staff local service
	 */
	public org.opencps.sample.staff.service.StaffLocalService getStaffLocalService() {
		return staffLocalService;
	}

	/**
	 * Sets the staff local service.
	 *
	 * @param staffLocalService the staff local service
	 */
	public void setStaffLocalService(
		org.opencps.sample.staff.service.StaffLocalService staffLocalService) {
		this.staffLocalService = staffLocalService;
	}

	/**
	 * Returns the staff remote service.
	 *
	 * @return the staff remote service
	 */
	public org.opencps.sample.staff.service.StaffService getStaffService() {
		return staffService;
	}

	/**
	 * Sets the staff remote service.
	 *
	 * @param staffService the staff remote service
	 */
	public void setStaffService(
		org.opencps.sample.staff.service.StaffService staffService) {
		this.staffService = staffService;
	}

	/**
	 * Returns the staff persistence.
	 *
	 * @return the staff persistence
	 */
	public StaffPersistence getStaffPersistence() {
		return staffPersistence;
	}

	/**
	 * Sets the staff persistence.
	 *
	 * @param staffPersistence the staff persistence
	 */
	public void setStaffPersistence(StaffPersistence staffPersistence) {
		this.staffPersistence = staffPersistence;
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
	 * Returns the department local service.
	 *
	 * @return the department local service
	 */
	public org.opencps.sample.department.service.DepartmentLocalService getDepartmentLocalService() {
		return departmentLocalService;
	}

	/**
	 * Sets the department local service.
	 *
	 * @param departmentLocalService the department local service
	 */
	public void setDepartmentLocalService(
		org.opencps.sample.department.service.DepartmentLocalService departmentLocalService) {
		this.departmentLocalService = departmentLocalService;
	}

	/**
	 * Returns the department remote service.
	 *
	 * @return the department remote service
	 */
	public org.opencps.sample.department.service.DepartmentService getDepartmentService() {
		return departmentService;
	}

	/**
	 * Sets the department remote service.
	 *
	 * @param departmentService the department remote service
	 */
	public void setDepartmentService(
		org.opencps.sample.department.service.DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	/**
	 * Returns the department persistence.
	 *
	 * @return the department persistence
	 */
	public DepartmentPersistence getDepartmentPersistence() {
		return departmentPersistence;
	}

	/**
	 * Sets the department persistence.
	 *
	 * @param departmentPersistence the department persistence
	 */
	public void setDepartmentPersistence(
		DepartmentPersistence departmentPersistence) {
		this.departmentPersistence = departmentPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
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
		return Staff.class;
	}

	protected String getModelClassName() {
		return Staff.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = staffPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.sample.staff.service.StaffLocalService.class)
	protected org.opencps.sample.staff.service.StaffLocalService staffLocalService;
	@BeanReference(type = org.opencps.sample.staff.service.StaffService.class)
	protected org.opencps.sample.staff.service.StaffService staffService;
	@BeanReference(type = StaffPersistence.class)
	protected StaffPersistence staffPersistence;
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
	@BeanReference(type = org.opencps.sample.department.service.DepartmentLocalService.class)
	protected org.opencps.sample.department.service.DepartmentLocalService departmentLocalService;
	@BeanReference(type = org.opencps.sample.department.service.DepartmentService.class)
	protected org.opencps.sample.department.service.DepartmentService departmentService;
	@BeanReference(type = DepartmentPersistence.class)
	protected DepartmentPersistence departmentPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private StaffServiceClpInvoker _clpInvoker = new StaffServiceClpInvoker();
}