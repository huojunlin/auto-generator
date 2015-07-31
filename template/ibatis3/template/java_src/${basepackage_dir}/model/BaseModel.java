package ${basepackage}.model;

import java.io.Serializable;

/**
 * model基类
 *
 * @version : Ver 1.0
 * @author	: <a href="mailto:hubo@95190.com">hubo</a>
 * @date	: 2015-5-28 下午12:59:26
 */
public class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 排序字段 */
	private String sortColumns;

	public String getSortColumns() {
		return sortColumns;
	}

	public void setSortColumns(String sortColumns) {
		this.sortColumns = sortColumns;
	}
 
}
