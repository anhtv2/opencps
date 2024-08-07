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

package org.opencps.usermgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.opencps.usermgt.model.Employee;

/**
 * The persistence interface for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoavd
 * @see EmployeePersistenceImpl
 * @see EmployeeUtil
 * @generated
 */
public interface EmployeePersistence extends BasePersistence<Employee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employees where mainJobPosId = &#63;.
	*
	* @param mainJobPosId the main job pos ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByMainJobPosId(
		long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where mainJobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mainJobPosId the main job pos ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByMainJobPosId(
		long mainJobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where mainJobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mainJobPosId the main job pos ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByMainJobPosId(
		long mainJobPosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where mainJobPosId = &#63;.
	*
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByMainJobPosId_First(
		long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where mainJobPosId = &#63;.
	*
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByMainJobPosId_First(
		long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where mainJobPosId = &#63;.
	*
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByMainJobPosId_Last(
		long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where mainJobPosId = &#63;.
	*
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByMainJobPosId_Last(
		long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set where mainJobPosId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] findByMainJobPosId_PrevAndNext(
		long employeeId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Removes all the employees where mainJobPosId = &#63; from the database.
	*
	* @param mainJobPosId the main job pos ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMainJobPosId(long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where mainJobPosId = &#63;.
	*
	* @param mainJobPosId the main job pos ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByMainJobPosId(long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_W(
		long groupId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where groupId = &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_W(
		long groupId, long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where groupId = &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_W(
		long groupId, long workingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_W_First(long groupId,
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_W_First(long groupId,
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_W_Last(long groupId,
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_W_Last(long groupId,
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] findByG_W_PrevAndNext(
		long employeeId, long groupId, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns all the employees that the user has permission to view where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @return the matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_W(
		long groupId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees that the user has permission to view where groupId = &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_W(
		long groupId, long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees that the user has permissions to view where groupId = &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_W(
		long groupId, long workingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set of employees that the user has permission to view where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] filterFindByG_W_PrevAndNext(
		long employeeId, long groupId, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Removes all the employees where groupId = &#63; and workingUnitId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_W(long groupId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_W(long groupId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees that the user has permission to view where groupId = &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @return the number of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_W(long groupId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_W_MJP(
		long groupId, long workingUnitId, long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_W_MJP(
		long groupId, long workingUnitId, long mainJobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_W_MJP(
		long groupId, long workingUnitId, long mainJobPosId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_W_MJP_First(
		long groupId, long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_W_MJP_First(
		long groupId, long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_W_MJP_Last(long groupId,
		long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_W_MJP_Last(
		long groupId, long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] findByG_W_MJP_PrevAndNext(
		long employeeId, long groupId, long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns all the employees that the user has permission to view where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @return the matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_W_MJP(
		long groupId, long workingUnitId, long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees that the user has permission to view where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_W_MJP(
		long groupId, long workingUnitId, long mainJobPosId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees that the user has permissions to view where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_W_MJP(
		long groupId, long workingUnitId, long mainJobPosId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set of employees that the user has permission to view where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] filterFindByG_W_MJP_PrevAndNext(
		long employeeId, long groupId, long workingUnitId, long mainJobPosId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Removes all the employees where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_W_MJP(long groupId, long workingUnitId,
		long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_W_MJP(long groupId, long workingUnitId,
		long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees that the user has permission to view where groupId = &#63; and workingUnitId = &#63; and mainJobPosId = &#63;.
	*
	* @param groupId the group ID
	* @param workingUnitId the working unit ID
	* @param mainJobPosId the main job pos ID
	* @return the number of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_W_MJP(long groupId, long workingUnitId,
		long mainJobPosId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByWorkingUnitId(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByWorkingUnitId(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByWorkingUnitId(
		long workingUnitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByWorkingUnitId_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByWorkingUnitId_First(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByWorkingUnitId_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByWorkingUnitId_Last(
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set where workingUnitId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] findByWorkingUnitId_PrevAndNext(
		long employeeId, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Removes all the employees where workingUnitId = &#63; from the database.
	*
	* @param workingUnitId the working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByWorkingUnitId(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where workingUnitId = &#63;.
	*
	* @param workingUnitId the working unit ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByWorkingUnitId(long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N_W(
		long groupId, java.lang.String fullName, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N_W(
		long groupId, java.lang.String fullName, long workingUnitId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N_W(
		long groupId, java.lang.String fullName, long workingUnitId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_N_W_First(long groupId,
		java.lang.String fullName, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_N_W_First(long groupId,
		java.lang.String fullName, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_N_W_Last(long groupId,
		java.lang.String fullName, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_N_W_Last(long groupId,
		java.lang.String fullName, long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] findByG_N_W_PrevAndNext(
		long employeeId, long groupId, java.lang.String fullName,
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns all the employees that the user has permission to view where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @return the matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N_W(
		long groupId, java.lang.String fullName, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees that the user has permission to view where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N_W(
		long groupId, java.lang.String fullName, long workingUnitId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees that the user has permissions to view where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N_W(
		long groupId, java.lang.String fullName, long workingUnitId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set of employees that the user has permission to view where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] filterFindByG_N_W_PrevAndNext(
		long employeeId, long groupId, java.lang.String fullName,
		long workingUnitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns all the employees that the user has permission to view where groupId = &#63; and fullName LIKE any &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param workingUnitId the working unit ID
	* @return the matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N_W(
		long groupId, java.lang.String[] fullNames, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees that the user has permission to view where groupId = &#63; and fullName LIKE any &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N_W(
		long groupId, java.lang.String[] fullNames, long workingUnitId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees that the user has permission to view where groupId = &#63; and fullName LIKE any &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N_W(
		long groupId, java.lang.String[] fullNames, long workingUnitId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where groupId = &#63; and fullName LIKE any &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param workingUnitId the working unit ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N_W(
		long groupId, java.lang.String[] fullNames, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where groupId = &#63; and fullName LIKE any &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N_W(
		long groupId, java.lang.String[] fullNames, long workingUnitId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where groupId = &#63; and fullName LIKE any &#63; and workingUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param workingUnitId the working unit ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N_W(
		long groupId, java.lang.String[] fullNames, long workingUnitId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employees where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_N_W(long groupId, java.lang.String fullName,
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_N_W(long groupId, java.lang.String fullName,
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where groupId = &#63; and fullName LIKE any &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param workingUnitId the working unit ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_N_W(long groupId, java.lang.String[] fullNames,
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees that the user has permission to view where groupId = &#63; and fullName LIKE &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param workingUnitId the working unit ID
	* @return the number of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_N_W(long groupId, java.lang.String fullName,
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees that the user has permission to view where groupId = &#63; and fullName LIKE any &#63; and workingUnitId = &#63;.
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param workingUnitId the working unit ID
	* @return the number of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_N_W(long groupId, java.lang.String[] fullNames,
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N(
		long groupId, java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where groupId = &#63; and fullName LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N(
		long groupId, java.lang.String fullName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where groupId = &#63; and fullName LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N(
		long groupId, java.lang.String fullName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_N_First(long groupId,
		java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_N_First(long groupId,
		java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_N_Last(long groupId,
		java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_N_Last(long groupId,
		java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] findByG_N_PrevAndNext(
		long employeeId, long groupId, java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns all the employees that the user has permission to view where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @return the matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N(
		long groupId, java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees that the user has permission to view where groupId = &#63; and fullName LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N(
		long groupId, java.lang.String fullName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees that the user has permissions to view where groupId = &#63; and fullName LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N(
		long groupId, java.lang.String fullName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set of employees that the user has permission to view where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] filterFindByG_N_PrevAndNext(
		long employeeId, long groupId, java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns all the employees that the user has permission to view where groupId = &#63; and fullName LIKE any &#63;.
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @return the matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N(
		long groupId, java.lang.String[] fullNames)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees that the user has permission to view where groupId = &#63; and fullName LIKE any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N(
		long groupId, java.lang.String[] fullNames, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees that the user has permission to view where groupId = &#63; and fullName LIKE any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByG_N(
		long groupId, java.lang.String[] fullNames, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where groupId = &#63; and fullName LIKE any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N(
		long groupId, java.lang.String[] fullNames)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where groupId = &#63; and fullName LIKE any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N(
		long groupId, java.lang.String[] fullNames, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where groupId = &#63; and fullName LIKE any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByG_N(
		long groupId, java.lang.String[] fullNames, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employees where groupId = &#63; and fullName LIKE &#63; from the database.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_N(long groupId, java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_N(long groupId, java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where groupId = &#63; and fullName LIKE any &#63;.
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_N(long groupId, java.lang.String[] fullNames)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees that the user has permission to view where groupId = &#63; and fullName LIKE &#63;.
	*
	* @param groupId the group ID
	* @param fullName the full name
	* @return the number of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_N(long groupId, java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees that the user has permission to view where groupId = &#63; and fullName LIKE any &#63;.
	*
	* @param groupId the group ID
	* @param fullNames the full names
	* @return the number of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_N(long groupId, java.lang.String[] fullNames)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set where groupId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] findByGroupId_PrevAndNext(
		long employeeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns all the employees that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set of employees that the user has permission to view where groupId = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee[] filterFindByGroupId_PrevAndNext(
		long employeeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Removes all the employees where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching employees that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee where groupId = &#63; and email = &#63; or throws a {@link org.opencps.usermgt.NoSuchEmployeeException} if it could not be found.
	*
	* @param groupId the group ID
	* @param email the email
	* @return the matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_E(long groupId,
		java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the employee where groupId = &#63; and email = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param email the email
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_E(long groupId,
		java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee where groupId = &#63; and email = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param email the email
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_E(long groupId,
		java.lang.String email, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee where groupId = &#63; and email = &#63; from the database.
	*
	* @param groupId the group ID
	* @param email the email
	* @return the employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee removeByG_E(long groupId,
		java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the number of employees where groupId = &#63; and email = &#63;.
	*
	* @param groupId the group ID
	* @param email the email
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_E(long groupId, java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee where groupId = &#63; and employeeNo = &#63; or throws a {@link org.opencps.usermgt.NoSuchEmployeeException} if it could not be found.
	*
	* @param groupId the group ID
	* @param employeeNo the employee no
	* @return the matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_ENO(long groupId,
		java.lang.String employeeNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the employee where groupId = &#63; and employeeNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param employeeNo the employee no
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_ENO(long groupId,
		java.lang.String employeeNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee where groupId = &#63; and employeeNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param employeeNo the employee no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_ENO(long groupId,
		java.lang.String employeeNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee where groupId = &#63; and employeeNo = &#63; from the database.
	*
	* @param groupId the group ID
	* @param employeeNo the employee no
	* @return the employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee removeByG_ENO(long groupId,
		java.lang.String employeeNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the number of employees where groupId = &#63; and employeeNo = &#63;.
	*
	* @param groupId the group ID
	* @param employeeNo the employee no
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_ENO(long groupId, java.lang.String employeeNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee where groupId = &#63; and mappingUserId = &#63; or throws a {@link org.opencps.usermgt.NoSuchEmployeeException} if it could not be found.
	*
	* @param groupId the group ID
	* @param mappingUserId the mapping user ID
	* @return the matching employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByG_U(long groupId,
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the employee where groupId = &#63; and mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param mappingUserId the mapping user ID
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_U(long groupId,
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee where groupId = &#63; and mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param mappingUserId the mapping user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByG_U(long groupId,
		long mappingUserId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the employee where groupId = &#63; and mappingUserId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param mappingUserId the mapping user ID
	* @return the employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee removeByG_U(long groupId,
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the number of employees where groupId = &#63; and mappingUserId = &#63;.
	*
	* @param groupId the group ID
	* @param mappingUserId the mapping user ID
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_U(long groupId, long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee in the entity cache if it is enabled.
	*
	* @param employee the employee
	*/
	public void cacheResult(org.opencps.usermgt.model.Employee employee);

	/**
	* Caches the employees in the entity cache if it is enabled.
	*
	* @param employees the employees
	*/
	public void cacheResult(
		java.util.List<org.opencps.usermgt.model.Employee> employees);

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param employeeId the primary key for the new employee
	* @return the new employee
	*/
	public org.opencps.usermgt.model.Employee create(long employeeId);

	/**
	* Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee
	* @return the employee that was removed
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee remove(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	public org.opencps.usermgt.model.Employee updateImpl(
		org.opencps.usermgt.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee with the primary key or throws a {@link org.opencps.usermgt.NoSuchEmployeeException} if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee
	* @throws org.opencps.usermgt.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee findByPrimaryKey(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.usermgt.NoSuchEmployeeException;

	/**
	* Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee, or <code>null</code> if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.usermgt.model.Employee fetchByPrimaryKey(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees.
	*
	* @return the employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.Employee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the job poses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the job poses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.JobPos> getJobPoses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the job poses associated with the employee.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the employee
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of job poses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.JobPos> getJobPoses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the job poses associated with the employee.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the employee
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of job poses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.usermgt.model.JobPos> getJobPoses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of job poses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the number of job poses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public int getJobPosesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the job pos is associated with the employee.
	*
	* @param pk the primary key of the employee
	* @param jobPosPK the primary key of the job pos
	* @return <code>true</code> if the job pos is associated with the employee; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsJobPos(long pk, long jobPosPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the employee has any job poses associated with it.
	*
	* @param pk the primary key of the employee to check for associations with job poses
	* @return <code>true</code> if the employee has any job poses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsJobPoses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the job pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPK the primary key of the job pos
	* @throws SystemException if a system exception occurred
	*/
	public void addJobPos(long pk, long jobPosPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the job pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPos the job pos
	* @throws SystemException if a system exception occurred
	*/
	public void addJobPos(long pk, org.opencps.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the job poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPKs the primary keys of the job poses
	* @throws SystemException if a system exception occurred
	*/
	public void addJobPoses(long pk, long[] jobPosPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the job poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPoses the job poses
	* @throws SystemException if a system exception occurred
	*/
	public void addJobPoses(long pk,
		java.util.List<org.opencps.usermgt.model.JobPos> jobPoses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the employee and its job poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee to clear the associated job poses from
	* @throws SystemException if a system exception occurred
	*/
	public void clearJobPoses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the job pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPK the primary key of the job pos
	* @throws SystemException if a system exception occurred
	*/
	public void removeJobPos(long pk, long jobPosPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the job pos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPos the job pos
	* @throws SystemException if a system exception occurred
	*/
	public void removeJobPos(long pk, org.opencps.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the job poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPKs the primary keys of the job poses
	* @throws SystemException if a system exception occurred
	*/
	public void removeJobPoses(long pk, long[] jobPosPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the job poses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPoses the job poses
	* @throws SystemException if a system exception occurred
	*/
	public void removeJobPoses(long pk,
		java.util.List<org.opencps.usermgt.model.JobPos> jobPoses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the job poses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPosPKs the primary keys of the job poses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public void setJobPoses(long pk, long[] jobPosPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the job poses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param jobPoses the job poses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public void setJobPoses(long pk,
		java.util.List<org.opencps.usermgt.model.JobPos> jobPoses)
		throws com.liferay.portal.kernel.exception.SystemException;
}