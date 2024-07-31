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

package org.opencps.processmgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.opencps.processmgt.model.ServiceProcess;
import org.opencps.processmgt.service.ServiceProcessService;
import org.opencps.processmgt.service.persistence.ActionHistoryPersistence;
import org.opencps.processmgt.service.persistence.ProcessOrderFinder;
import org.opencps.processmgt.service.persistence.ProcessOrderPersistence;
import org.opencps.processmgt.service.persistence.ProcessStepDossierPartPersistence;
import org.opencps.processmgt.service.persistence.ProcessStepPersistence;
import org.opencps.processmgt.service.persistence.ProcessWorkflowPersistence;
import org.opencps.processmgt.service.persistence.ServiceInfoProcessPersistence;
import org.opencps.processmgt.service.persistence.ServiceProcessFinder;
import org.opencps.processmgt.service.persistence.ServiceProcessPersistence;
import org.opencps.processmgt.service.persistence.StepAllowancePersistence;
import org.opencps.processmgt.service.persistence.WorkflowOutputPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the service process remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.processmgt.service.impl.ServiceProcessServiceImpl}.
 * </p>
 *
 * @author khoavd
 * @see org.opencps.processmgt.service.impl.ServiceProcessServiceImpl
 * @see org.opencps.processmgt.service.ServiceProcessServiceUtil
 * @generated
 */
public abstract class ServiceProcessServiceBaseImpl extends BaseServiceImpl
	implements ServiceProcessService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.processmgt.service.ServiceProcessServiceUtil} to access the service process remote service.
	 */

	/**
	 * Returns the action history local service.
	 *
	 * @return the action history local service
	 */
	public org.opencps.processmgt.service.ActionHistoryLocalService getActionHistoryLocalService() {
		return actionHistoryLocalService;
	}

	/**
	 * Sets the action history local service.
	 *
	 * @param actionHistoryLocalService the action history local service
	 */
	public void setActionHistoryLocalService(
		org.opencps.processmgt.service.ActionHistoryLocalService actionHistoryLocalService) {
		this.actionHistoryLocalService = actionHistoryLocalService;
	}

	/**
	 * Returns the action history remote service.
	 *
	 * @return the action history remote service
	 */
	public org.opencps.processmgt.service.ActionHistoryService getActionHistoryService() {
		return actionHistoryService;
	}

	/**
	 * Sets the action history remote service.
	 *
	 * @param actionHistoryService the action history remote service
	 */
	public void setActionHistoryService(
		org.opencps.processmgt.service.ActionHistoryService actionHistoryService) {
		this.actionHistoryService = actionHistoryService;
	}

	/**
	 * Returns the action history persistence.
	 *
	 * @return the action history persistence
	 */
	public ActionHistoryPersistence getActionHistoryPersistence() {
		return actionHistoryPersistence;
	}

	/**
	 * Sets the action history persistence.
	 *
	 * @param actionHistoryPersistence the action history persistence
	 */
	public void setActionHistoryPersistence(
		ActionHistoryPersistence actionHistoryPersistence) {
		this.actionHistoryPersistence = actionHistoryPersistence;
	}

	/**
	 * Returns the process order local service.
	 *
	 * @return the process order local service
	 */
	public org.opencps.processmgt.service.ProcessOrderLocalService getProcessOrderLocalService() {
		return processOrderLocalService;
	}

	/**
	 * Sets the process order local service.
	 *
	 * @param processOrderLocalService the process order local service
	 */
	public void setProcessOrderLocalService(
		org.opencps.processmgt.service.ProcessOrderLocalService processOrderLocalService) {
		this.processOrderLocalService = processOrderLocalService;
	}

	/**
	 * Returns the process order remote service.
	 *
	 * @return the process order remote service
	 */
	public org.opencps.processmgt.service.ProcessOrderService getProcessOrderService() {
		return processOrderService;
	}

	/**
	 * Sets the process order remote service.
	 *
	 * @param processOrderService the process order remote service
	 */
	public void setProcessOrderService(
		org.opencps.processmgt.service.ProcessOrderService processOrderService) {
		this.processOrderService = processOrderService;
	}

	/**
	 * Returns the process order persistence.
	 *
	 * @return the process order persistence
	 */
	public ProcessOrderPersistence getProcessOrderPersistence() {
		return processOrderPersistence;
	}

	/**
	 * Sets the process order persistence.
	 *
	 * @param processOrderPersistence the process order persistence
	 */
	public void setProcessOrderPersistence(
		ProcessOrderPersistence processOrderPersistence) {
		this.processOrderPersistence = processOrderPersistence;
	}

	/**
	 * Returns the process order finder.
	 *
	 * @return the process order finder
	 */
	public ProcessOrderFinder getProcessOrderFinder() {
		return processOrderFinder;
	}

	/**
	 * Sets the process order finder.
	 *
	 * @param processOrderFinder the process order finder
	 */
	public void setProcessOrderFinder(ProcessOrderFinder processOrderFinder) {
		this.processOrderFinder = processOrderFinder;
	}

	/**
	 * Returns the process step local service.
	 *
	 * @return the process step local service
	 */
	public org.opencps.processmgt.service.ProcessStepLocalService getProcessStepLocalService() {
		return processStepLocalService;
	}

	/**
	 * Sets the process step local service.
	 *
	 * @param processStepLocalService the process step local service
	 */
	public void setProcessStepLocalService(
		org.opencps.processmgt.service.ProcessStepLocalService processStepLocalService) {
		this.processStepLocalService = processStepLocalService;
	}

	/**
	 * Returns the process step remote service.
	 *
	 * @return the process step remote service
	 */
	public org.opencps.processmgt.service.ProcessStepService getProcessStepService() {
		return processStepService;
	}

	/**
	 * Sets the process step remote service.
	 *
	 * @param processStepService the process step remote service
	 */
	public void setProcessStepService(
		org.opencps.processmgt.service.ProcessStepService processStepService) {
		this.processStepService = processStepService;
	}

	/**
	 * Returns the process step persistence.
	 *
	 * @return the process step persistence
	 */
	public ProcessStepPersistence getProcessStepPersistence() {
		return processStepPersistence;
	}

	/**
	 * Sets the process step persistence.
	 *
	 * @param processStepPersistence the process step persistence
	 */
	public void setProcessStepPersistence(
		ProcessStepPersistence processStepPersistence) {
		this.processStepPersistence = processStepPersistence;
	}

	/**
	 * Returns the process step dossier part local service.
	 *
	 * @return the process step dossier part local service
	 */
	public org.opencps.processmgt.service.ProcessStepDossierPartLocalService getProcessStepDossierPartLocalService() {
		return processStepDossierPartLocalService;
	}

	/**
	 * Sets the process step dossier part local service.
	 *
	 * @param processStepDossierPartLocalService the process step dossier part local service
	 */
	public void setProcessStepDossierPartLocalService(
		org.opencps.processmgt.service.ProcessStepDossierPartLocalService processStepDossierPartLocalService) {
		this.processStepDossierPartLocalService = processStepDossierPartLocalService;
	}

	/**
	 * Returns the process step dossier part remote service.
	 *
	 * @return the process step dossier part remote service
	 */
	public org.opencps.processmgt.service.ProcessStepDossierPartService getProcessStepDossierPartService() {
		return processStepDossierPartService;
	}

	/**
	 * Sets the process step dossier part remote service.
	 *
	 * @param processStepDossierPartService the process step dossier part remote service
	 */
	public void setProcessStepDossierPartService(
		org.opencps.processmgt.service.ProcessStepDossierPartService processStepDossierPartService) {
		this.processStepDossierPartService = processStepDossierPartService;
	}

	/**
	 * Returns the process step dossier part persistence.
	 *
	 * @return the process step dossier part persistence
	 */
	public ProcessStepDossierPartPersistence getProcessStepDossierPartPersistence() {
		return processStepDossierPartPersistence;
	}

	/**
	 * Sets the process step dossier part persistence.
	 *
	 * @param processStepDossierPartPersistence the process step dossier part persistence
	 */
	public void setProcessStepDossierPartPersistence(
		ProcessStepDossierPartPersistence processStepDossierPartPersistence) {
		this.processStepDossierPartPersistence = processStepDossierPartPersistence;
	}

	/**
	 * Returns the process workflow local service.
	 *
	 * @return the process workflow local service
	 */
	public org.opencps.processmgt.service.ProcessWorkflowLocalService getProcessWorkflowLocalService() {
		return processWorkflowLocalService;
	}

	/**
	 * Sets the process workflow local service.
	 *
	 * @param processWorkflowLocalService the process workflow local service
	 */
	public void setProcessWorkflowLocalService(
		org.opencps.processmgt.service.ProcessWorkflowLocalService processWorkflowLocalService) {
		this.processWorkflowLocalService = processWorkflowLocalService;
	}

	/**
	 * Returns the process workflow remote service.
	 *
	 * @return the process workflow remote service
	 */
	public org.opencps.processmgt.service.ProcessWorkflowService getProcessWorkflowService() {
		return processWorkflowService;
	}

	/**
	 * Sets the process workflow remote service.
	 *
	 * @param processWorkflowService the process workflow remote service
	 */
	public void setProcessWorkflowService(
		org.opencps.processmgt.service.ProcessWorkflowService processWorkflowService) {
		this.processWorkflowService = processWorkflowService;
	}

	/**
	 * Returns the process workflow persistence.
	 *
	 * @return the process workflow persistence
	 */
	public ProcessWorkflowPersistence getProcessWorkflowPersistence() {
		return processWorkflowPersistence;
	}

	/**
	 * Sets the process workflow persistence.
	 *
	 * @param processWorkflowPersistence the process workflow persistence
	 */
	public void setProcessWorkflowPersistence(
		ProcessWorkflowPersistence processWorkflowPersistence) {
		this.processWorkflowPersistence = processWorkflowPersistence;
	}

	/**
	 * Returns the service info process local service.
	 *
	 * @return the service info process local service
	 */
	public org.opencps.processmgt.service.ServiceInfoProcessLocalService getServiceInfoProcessLocalService() {
		return serviceInfoProcessLocalService;
	}

	/**
	 * Sets the service info process local service.
	 *
	 * @param serviceInfoProcessLocalService the service info process local service
	 */
	public void setServiceInfoProcessLocalService(
		org.opencps.processmgt.service.ServiceInfoProcessLocalService serviceInfoProcessLocalService) {
		this.serviceInfoProcessLocalService = serviceInfoProcessLocalService;
	}

	/**
	 * Returns the service info process remote service.
	 *
	 * @return the service info process remote service
	 */
	public org.opencps.processmgt.service.ServiceInfoProcessService getServiceInfoProcessService() {
		return serviceInfoProcessService;
	}

	/**
	 * Sets the service info process remote service.
	 *
	 * @param serviceInfoProcessService the service info process remote service
	 */
	public void setServiceInfoProcessService(
		org.opencps.processmgt.service.ServiceInfoProcessService serviceInfoProcessService) {
		this.serviceInfoProcessService = serviceInfoProcessService;
	}

	/**
	 * Returns the service info process persistence.
	 *
	 * @return the service info process persistence
	 */
	public ServiceInfoProcessPersistence getServiceInfoProcessPersistence() {
		return serviceInfoProcessPersistence;
	}

	/**
	 * Sets the service info process persistence.
	 *
	 * @param serviceInfoProcessPersistence the service info process persistence
	 */
	public void setServiceInfoProcessPersistence(
		ServiceInfoProcessPersistence serviceInfoProcessPersistence) {
		this.serviceInfoProcessPersistence = serviceInfoProcessPersistence;
	}

	/**
	 * Returns the service process local service.
	 *
	 * @return the service process local service
	 */
	public org.opencps.processmgt.service.ServiceProcessLocalService getServiceProcessLocalService() {
		return serviceProcessLocalService;
	}

	/**
	 * Sets the service process local service.
	 *
	 * @param serviceProcessLocalService the service process local service
	 */
	public void setServiceProcessLocalService(
		org.opencps.processmgt.service.ServiceProcessLocalService serviceProcessLocalService) {
		this.serviceProcessLocalService = serviceProcessLocalService;
	}

	/**
	 * Returns the service process remote service.
	 *
	 * @return the service process remote service
	 */
	public org.opencps.processmgt.service.ServiceProcessService getServiceProcessService() {
		return serviceProcessService;
	}

	/**
	 * Sets the service process remote service.
	 *
	 * @param serviceProcessService the service process remote service
	 */
	public void setServiceProcessService(
		org.opencps.processmgt.service.ServiceProcessService serviceProcessService) {
		this.serviceProcessService = serviceProcessService;
	}

	/**
	 * Returns the service process persistence.
	 *
	 * @return the service process persistence
	 */
	public ServiceProcessPersistence getServiceProcessPersistence() {
		return serviceProcessPersistence;
	}

	/**
	 * Sets the service process persistence.
	 *
	 * @param serviceProcessPersistence the service process persistence
	 */
	public void setServiceProcessPersistence(
		ServiceProcessPersistence serviceProcessPersistence) {
		this.serviceProcessPersistence = serviceProcessPersistence;
	}

	/**
	 * Returns the service process finder.
	 *
	 * @return the service process finder
	 */
	public ServiceProcessFinder getServiceProcessFinder() {
		return serviceProcessFinder;
	}

	/**
	 * Sets the service process finder.
	 *
	 * @param serviceProcessFinder the service process finder
	 */
	public void setServiceProcessFinder(
		ServiceProcessFinder serviceProcessFinder) {
		this.serviceProcessFinder = serviceProcessFinder;
	}

	/**
	 * Returns the step allowance local service.
	 *
	 * @return the step allowance local service
	 */
	public org.opencps.processmgt.service.StepAllowanceLocalService getStepAllowanceLocalService() {
		return stepAllowanceLocalService;
	}

	/**
	 * Sets the step allowance local service.
	 *
	 * @param stepAllowanceLocalService the step allowance local service
	 */
	public void setStepAllowanceLocalService(
		org.opencps.processmgt.service.StepAllowanceLocalService stepAllowanceLocalService) {
		this.stepAllowanceLocalService = stepAllowanceLocalService;
	}

	/**
	 * Returns the step allowance remote service.
	 *
	 * @return the step allowance remote service
	 */
	public org.opencps.processmgt.service.StepAllowanceService getStepAllowanceService() {
		return stepAllowanceService;
	}

	/**
	 * Sets the step allowance remote service.
	 *
	 * @param stepAllowanceService the step allowance remote service
	 */
	public void setStepAllowanceService(
		org.opencps.processmgt.service.StepAllowanceService stepAllowanceService) {
		this.stepAllowanceService = stepAllowanceService;
	}

	/**
	 * Returns the step allowance persistence.
	 *
	 * @return the step allowance persistence
	 */
	public StepAllowancePersistence getStepAllowancePersistence() {
		return stepAllowancePersistence;
	}

	/**
	 * Sets the step allowance persistence.
	 *
	 * @param stepAllowancePersistence the step allowance persistence
	 */
	public void setStepAllowancePersistence(
		StepAllowancePersistence stepAllowancePersistence) {
		this.stepAllowancePersistence = stepAllowancePersistence;
	}

	/**
	 * Returns the workflow output local service.
	 *
	 * @return the workflow output local service
	 */
	public org.opencps.processmgt.service.WorkflowOutputLocalService getWorkflowOutputLocalService() {
		return workflowOutputLocalService;
	}

	/**
	 * Sets the workflow output local service.
	 *
	 * @param workflowOutputLocalService the workflow output local service
	 */
	public void setWorkflowOutputLocalService(
		org.opencps.processmgt.service.WorkflowOutputLocalService workflowOutputLocalService) {
		this.workflowOutputLocalService = workflowOutputLocalService;
	}

	/**
	 * Returns the workflow output remote service.
	 *
	 * @return the workflow output remote service
	 */
	public org.opencps.processmgt.service.WorkflowOutputService getWorkflowOutputService() {
		return workflowOutputService;
	}

	/**
	 * Sets the workflow output remote service.
	 *
	 * @param workflowOutputService the workflow output remote service
	 */
	public void setWorkflowOutputService(
		org.opencps.processmgt.service.WorkflowOutputService workflowOutputService) {
		this.workflowOutputService = workflowOutputService;
	}

	/**
	 * Returns the workflow output persistence.
	 *
	 * @return the workflow output persistence
	 */
	public WorkflowOutputPersistence getWorkflowOutputPersistence() {
		return workflowOutputPersistence;
	}

	/**
	 * Sets the workflow output persistence.
	 *
	 * @param workflowOutputPersistence the workflow output persistence
	 */
	public void setWorkflowOutputPersistence(
		WorkflowOutputPersistence workflowOutputPersistence) {
		this.workflowOutputPersistence = workflowOutputPersistence;
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
		return ServiceProcess.class;
	}

	protected String getModelClassName() {
		return ServiceProcess.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = serviceProcessPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.processmgt.service.ActionHistoryLocalService.class)
	protected org.opencps.processmgt.service.ActionHistoryLocalService actionHistoryLocalService;
	@BeanReference(type = org.opencps.processmgt.service.ActionHistoryService.class)
	protected org.opencps.processmgt.service.ActionHistoryService actionHistoryService;
	@BeanReference(type = ActionHistoryPersistence.class)
	protected ActionHistoryPersistence actionHistoryPersistence;
	@BeanReference(type = org.opencps.processmgt.service.ProcessOrderLocalService.class)
	protected org.opencps.processmgt.service.ProcessOrderLocalService processOrderLocalService;
	@BeanReference(type = org.opencps.processmgt.service.ProcessOrderService.class)
	protected org.opencps.processmgt.service.ProcessOrderService processOrderService;
	@BeanReference(type = ProcessOrderPersistence.class)
	protected ProcessOrderPersistence processOrderPersistence;
	@BeanReference(type = ProcessOrderFinder.class)
	protected ProcessOrderFinder processOrderFinder;
	@BeanReference(type = org.opencps.processmgt.service.ProcessStepLocalService.class)
	protected org.opencps.processmgt.service.ProcessStepLocalService processStepLocalService;
	@BeanReference(type = org.opencps.processmgt.service.ProcessStepService.class)
	protected org.opencps.processmgt.service.ProcessStepService processStepService;
	@BeanReference(type = ProcessStepPersistence.class)
	protected ProcessStepPersistence processStepPersistence;
	@BeanReference(type = org.opencps.processmgt.service.ProcessStepDossierPartLocalService.class)
	protected org.opencps.processmgt.service.ProcessStepDossierPartLocalService processStepDossierPartLocalService;
	@BeanReference(type = org.opencps.processmgt.service.ProcessStepDossierPartService.class)
	protected org.opencps.processmgt.service.ProcessStepDossierPartService processStepDossierPartService;
	@BeanReference(type = ProcessStepDossierPartPersistence.class)
	protected ProcessStepDossierPartPersistence processStepDossierPartPersistence;
	@BeanReference(type = org.opencps.processmgt.service.ProcessWorkflowLocalService.class)
	protected org.opencps.processmgt.service.ProcessWorkflowLocalService processWorkflowLocalService;
	@BeanReference(type = org.opencps.processmgt.service.ProcessWorkflowService.class)
	protected org.opencps.processmgt.service.ProcessWorkflowService processWorkflowService;
	@BeanReference(type = ProcessWorkflowPersistence.class)
	protected ProcessWorkflowPersistence processWorkflowPersistence;
	@BeanReference(type = org.opencps.processmgt.service.ServiceInfoProcessLocalService.class)
	protected org.opencps.processmgt.service.ServiceInfoProcessLocalService serviceInfoProcessLocalService;
	@BeanReference(type = org.opencps.processmgt.service.ServiceInfoProcessService.class)
	protected org.opencps.processmgt.service.ServiceInfoProcessService serviceInfoProcessService;
	@BeanReference(type = ServiceInfoProcessPersistence.class)
	protected ServiceInfoProcessPersistence serviceInfoProcessPersistence;
	@BeanReference(type = org.opencps.processmgt.service.ServiceProcessLocalService.class)
	protected org.opencps.processmgt.service.ServiceProcessLocalService serviceProcessLocalService;
	@BeanReference(type = org.opencps.processmgt.service.ServiceProcessService.class)
	protected org.opencps.processmgt.service.ServiceProcessService serviceProcessService;
	@BeanReference(type = ServiceProcessPersistence.class)
	protected ServiceProcessPersistence serviceProcessPersistence;
	@BeanReference(type = ServiceProcessFinder.class)
	protected ServiceProcessFinder serviceProcessFinder;
	@BeanReference(type = org.opencps.processmgt.service.StepAllowanceLocalService.class)
	protected org.opencps.processmgt.service.StepAllowanceLocalService stepAllowanceLocalService;
	@BeanReference(type = org.opencps.processmgt.service.StepAllowanceService.class)
	protected org.opencps.processmgt.service.StepAllowanceService stepAllowanceService;
	@BeanReference(type = StepAllowancePersistence.class)
	protected StepAllowancePersistence stepAllowancePersistence;
	@BeanReference(type = org.opencps.processmgt.service.WorkflowOutputLocalService.class)
	protected org.opencps.processmgt.service.WorkflowOutputLocalService workflowOutputLocalService;
	@BeanReference(type = org.opencps.processmgt.service.WorkflowOutputService.class)
	protected org.opencps.processmgt.service.WorkflowOutputService workflowOutputService;
	@BeanReference(type = WorkflowOutputPersistence.class)
	protected WorkflowOutputPersistence workflowOutputPersistence;
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
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ServiceProcessServiceClpInvoker _clpInvoker = new ServiceProcessServiceClpInvoker();
}