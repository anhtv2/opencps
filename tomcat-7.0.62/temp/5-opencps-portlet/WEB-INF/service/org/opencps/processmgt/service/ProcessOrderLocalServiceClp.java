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

package org.opencps.processmgt.service;

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author khoavd
 * @generated
 */
public class ProcessOrderLocalServiceClp implements ProcessOrderLocalService {
	public ProcessOrderLocalServiceClp(
		InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addProcessOrder";

		_methodParameterTypes0 = new String[] {
				"org.opencps.processmgt.model.ProcessOrder"
			};

		_methodName1 = "createProcessOrder";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteProcessOrder";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteProcessOrder";

		_methodParameterTypes3 = new String[] {
				"org.opencps.processmgt.model.ProcessOrder"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchProcessOrder";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getProcessOrder";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getProcessOrders";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getProcessOrdersCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateProcessOrder";

		_methodParameterTypes15 = new String[] {
				"org.opencps.processmgt.model.ProcessOrder"
			};

		_methodName16 = "getBeanIdentifier";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "setBeanIdentifier";

		_methodParameterTypes17 = new String[] { "java.lang.String" };

		_methodName19 = "addProcessOrder";

		_methodParameterTypes19 = new String[] {
				"long", "long", "long", "long", "long", "long", "java.util.Date",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "int", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName20 = "addProcessOrder";

		_methodParameterTypes20 = new String[] {
				"long", "long", "long", "long", "long", "long", "long",
				"java.util.Date", "java.lang.String", "java.lang.String",
				"java.lang.String", "long", "int", "int", "int"
			};

		_methodName21 = "countProcessOrder";

		_methodParameterTypes21 = new String[] { "long", "long", "long" };

		_methodName22 = "getProcessOrder";

		_methodParameterTypes22 = new String[] { "long", "long" };

		_methodName23 = "initProcessOrder";

		_methodParameterTypes23 = new String[] {  };

		_methodName24 = "initProcessOrder";

		_methodParameterTypes24 = new String[] {
				"long", "long", "long", "long", "long", "java.lang.String",
				"java.lang.String", "long", "long", "long", "long"
			};

		_methodName25 = "updateInitStep";

		_methodParameterTypes25 = new String[] { "long", "long" };

		_methodName26 = "initProcessOrder";

		_methodParameterTypes26 = new String[] {
				"long", "long", "long", "long", "long", "java.lang.String",
				"java.lang.String", "long", "long", "long", "long", "long",
				"java.util.Date", "java.lang.String", "java.lang.String",
				"java.lang.String", "long", "int", "int", "int"
			};

		_methodName27 = "searchProcessOrder";

		_methodParameterTypes27 = new String[] {
				"long", "long", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getUserProcessStep";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "updateProcessOrder";

		_methodParameterTypes29 = new String[] {
				"long", "long", "long", "java.util.Date", "java.lang.String",
				"long"
			};

		_methodName30 = "updateProcessOrder";

		_methodParameterTypes30 = new String[] {
				"long", "long", "long", "long", "java.util.Date",
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "int", "int", "int"
			};

		_methodName31 = "updateProcessOrderStatus";

		_methodParameterTypes31 = new String[] { "long", "int" };
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder addProcessOrder(
		org.opencps.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(processOrder) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder createProcessOrder(
		long processOrderId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] { processOrderId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder deleteProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { processOrderId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder deleteProcessOrder(
		org.opencps.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(processOrder) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.DynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					ClpSerializer.translateInput(projection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder fetchProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { processOrderId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder getProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11, new Object[] { processOrderId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<org.opencps.processmgt.model.ProcessOrder> getProcessOrders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.opencps.processmgt.model.ProcessOrder>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getProcessOrdersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder updateProcessOrder(
		org.opencps.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { ClpSerializer.translateInput(processOrder) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName17,
				_methodParameterTypes17,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder addProcessOrder(
		long dossierId, long fileGroupId, long serviceProcessId,
		long processStepId, long processWorkflowId, long actionUserId,
		java.util.Date actionDatetime, java.lang.String stepName,
		java.lang.String actionName, java.lang.String actionNote,
		long assignToUserId, int dossierStatus, int daysDoing, int daysDelay,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] {
						dossierId,
						
					fileGroupId,
						
					serviceProcessId,
						
					processStepId,
						
					processWorkflowId,
						
					actionUserId,
						
					ClpSerializer.translateInput(actionDatetime),
						
					ClpSerializer.translateInput(stepName),
						
					ClpSerializer.translateInput(actionName),
						
					ClpSerializer.translateInput(actionNote),
						
					assignToUserId,
						
					dossierStatus,
						
					daysDoing,
						
					daysDelay,
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder addProcessOrder(
		long userId, long dossierId, long fileGroupId, long serviceProcessId,
		long processStepId, long processWorkflowId, long actionUserId,
		java.util.Date actionDatetime, java.lang.String stepName,
		java.lang.String actionName, java.lang.String actionNote,
		long assignToUserId, int dossierStatus, int daysDoing, int daysDelay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20,
					new Object[] {
						userId,
						
					dossierId,
						
					fileGroupId,
						
					serviceProcessId,
						
					processStepId,
						
					processWorkflowId,
						
					actionUserId,
						
					ClpSerializer.translateInput(actionDatetime),
						
					ClpSerializer.translateInput(stepName),
						
					ClpSerializer.translateInput(actionName),
						
					ClpSerializer.translateInput(actionNote),
						
					assignToUserId,
						
					dossierStatus,
						
					daysDoing,
						
					daysDelay
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countProcessOrder(long processStepId, long loginUserId,
		long actionUserId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21,
					new Object[] { processStepId, loginUserId, actionUserId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder getProcessOrder(
		long dossierId, long fileGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchProcessOrderException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName22,
					_methodParameterTypes22,
					new Object[] { dossierId, fileGroupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.processmgt.NoSuchProcessOrderException) {
				throw (org.opencps.processmgt.NoSuchProcessOrderException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder initProcessOrder()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder initProcessOrder(
		long userId, long companyId, long groupId, long serviceInfoId,
		long dossierTemplateId, java.lang.String govAgencyCode,
		java.lang.String govAgencyName, long govAgencyOrganizationId,
		long serviceProcessId, long dossierId, long fileGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24,
					new Object[] {
						userId,
						
					companyId,
						
					groupId,
						
					serviceInfoId,
						
					dossierTemplateId,
						
					ClpSerializer.translateInput(govAgencyCode),
						
					ClpSerializer.translateInput(govAgencyName),
						
					govAgencyOrganizationId,
						
					serviceProcessId,
						
					dossierId,
						
					fileGroupId
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder updateInitStep(
		long processOrderId, long processStepId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
					new Object[] { processOrderId, processStepId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder initProcessOrder(
		long userId, long companyId, long groupId, long serviceInfoId,
		long dossierTemplateId, java.lang.String govAgencyCode,
		java.lang.String govAgencyName, long govAgencyOrganizationId,
		long serviceProcessId, long dossierId, long fileGroupId,
		long processWorkflowId, java.util.Date actionDatetime,
		java.lang.String stepName, java.lang.String actionName,
		java.lang.String actionNote, long actionUserId, int daysDoing,
		int daysDelay, int dossierStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName26,
					_methodParameterTypes26,
					new Object[] {
						userId,
						
					companyId,
						
					groupId,
						
					serviceInfoId,
						
					dossierTemplateId,
						
					ClpSerializer.translateInput(govAgencyCode),
						
					ClpSerializer.translateInput(govAgencyName),
						
					govAgencyOrganizationId,
						
					serviceProcessId,
						
					dossierId,
						
					fileGroupId,
						
					processWorkflowId,
						
					ClpSerializer.translateInput(actionDatetime),
						
					ClpSerializer.translateInput(stepName),
						
					ClpSerializer.translateInput(actionName),
						
					ClpSerializer.translateInput(actionNote),
						
					actionUserId,
						
					daysDoing,
						
					daysDelay,
						
					dossierStatus
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List searchProcessOrder(long processStepId,
		long loginUserId, long actionUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] {
						processStepId,
						
					loginUserId,
						
					actionUserId,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List getUserProcessStep(long actionUserId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName28,
					_methodParameterTypes28, new Object[] { actionUserId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder updateProcessOrder(
		long processOrderId, long processStepId, long actionUserId,
		java.util.Date actionDatetime, java.lang.String actionNote,
		long assignToUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchProcessOrderException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29,
					new Object[] {
						processOrderId,
						
					processStepId,
						
					actionUserId,
						
					ClpSerializer.translateInput(actionDatetime),
						
					ClpSerializer.translateInput(actionNote),
						
					assignToUserId
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.processmgt.NoSuchProcessOrderException) {
				throw (org.opencps.processmgt.NoSuchProcessOrderException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder updateProcessOrder(
		long processOrderId, long processStepId, long processWorkflowId,
		long actionUserId, java.util.Date actionDatetime,
		java.lang.String actionNote, long assignToUserId,
		java.lang.String stepName, java.lang.String actionName, int daysDoing,
		int daysDelay, int dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchProcessOrderException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName30,
					_methodParameterTypes30,
					new Object[] {
						processOrderId,
						
					processStepId,
						
					processWorkflowId,
						
					actionUserId,
						
					ClpSerializer.translateInput(actionDatetime),
						
					ClpSerializer.translateInput(actionNote),
						
					assignToUserId,
						
					ClpSerializer.translateInput(stepName),
						
					ClpSerializer.translateInput(actionName),
						
					daysDoing,
						
					daysDelay,
						
					dossierStatus
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.processmgt.NoSuchProcessOrderException) {
				throw (org.opencps.processmgt.NoSuchProcessOrderException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public org.opencps.processmgt.model.ProcessOrder updateProcessOrderStatus(
		long processOrderId, int dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchProcessOrderException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName31,
					_methodParameterTypes31,
					new Object[] { processOrderId, dossierStatus });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.opencps.processmgt.NoSuchProcessOrderException) {
				throw (org.opencps.processmgt.NoSuchProcessOrderException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.opencps.processmgt.model.ProcessOrder)ClpSerializer.translateOutput(returnObj);
	}

	private InvokableLocalService _invokableLocalService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
}