package com.shit.log.common.domain;

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

}