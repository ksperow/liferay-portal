/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.trash.model;

import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the TrashVersion service. Represents a row in the &quot;TrashVersion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.trash.model.impl.TrashVersionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.trash.model.impl.TrashVersionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TrashVersion
 * @see com.liferay.portlet.trash.model.impl.TrashVersionImpl
 * @see com.liferay.portlet.trash.model.impl.TrashVersionModelImpl
 * @generated
 */
public interface TrashVersionModel extends AttachedModel, BaseModel<TrashVersion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a trash version model instance should use the {@link TrashVersion} interface instead.
	 */

	/**
	 * Returns the primary key of this trash version.
	 *
	 * @return the primary key of this trash version
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this trash version.
	 *
	 * @param primaryKey the primary key of this trash version
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the version ID of this trash version.
	 *
	 * @return the version ID of this trash version
	 */
	public long getVersionId();

	/**
	 * Sets the version ID of this trash version.
	 *
	 * @param versionId the version ID of this trash version
	 */
	public void setVersionId(long versionId);

	/**
	 * Returns the entry ID of this trash version.
	 *
	 * @return the entry ID of this trash version
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this trash version.
	 *
	 * @param entryId the entry ID of this trash version
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the fully qualified class name of this trash version.
	 *
	 * @return the fully qualified class name of this trash version
	 */
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this trash version.
	 *
	 * @return the class name ID of this trash version
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this trash version.
	 *
	 * @param classNameId the class name ID of this trash version
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this trash version.
	 *
	 * @return the class p k of this trash version
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this trash version.
	 *
	 * @param classPK the class p k of this trash version
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the status of this trash version.
	 *
	 * @return the status of this trash version
	 */
	public int getStatus();

	/**
	 * Sets the status of this trash version.
	 *
	 * @param status the status of this trash version
	 */
	public void setStatus(int status);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(TrashVersion trashVersion);

	public int hashCode();

	public CacheModel<TrashVersion> toCacheModel();

	public TrashVersion toEscapedModel();

	public String toString();

	public String toXmlString();
}