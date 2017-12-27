package com.shit.log.common.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Log {
	// id
	protected Long  id;
	// 内容
	protected String  content;
	// 创建时间
	protected java.util.Date  created;
	
	public void setId(Long id) 
	{
		this.id = id;
	}
	/**
	 * 返回 id
	 * @return
	 */
	public Long getId() 
	{
		return this.id;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}
	/**
	 * 返回 内容
	 * @return
	 */
	public String getContent() 
	{
		return this.content;
	}
	public void setCreated(java.util.Date created) 
	{
		this.created = created;
	}
	/**
	 * 返回 创建时间
	 * @return
	 */
	public java.util.Date getCreated() 
	{
		return this.created;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Log)) {
			return false;
		}
		Log rhs = (Log) obj;
		return new EqualsBuilder()
		.append(this.id, rhs.id)
		.append(this.content, rhs.content)
		.append(this.created, rhs.created)
		.isEquals();
	}

	@Override
	public int hashCode() {
		
		return new HashCodeBuilder(-82280557, -700257973)
				.append(this.id) 
				.append(this.content) 
				.append(this.created) 
				.toHashCode();
	}

	@Override
	public String toString() {
		
		return new ToStringBuilder(this)
				.append("id", this.id) 
				.append("content", this.content) 
				.append("created", this.created) 
				.toString();
	}

}