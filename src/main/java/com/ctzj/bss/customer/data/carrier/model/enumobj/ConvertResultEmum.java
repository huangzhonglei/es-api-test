package com.ctzj.bss.customer.data.carrier.model.enumobj;

/**
 * 
 * @Description: 装换结果
 * @author pengzz
 * @date 2017年7月21日
 *
 */
public enum ConvertResultEmum {
	SUCCESS,//转换成功
	ERROR,//转换失败
	AWAIT,//需要等待,关联表未同步
	OUTDATE,//有相同的记录，该记录比较老
	UNTRIGGER,//非触发记录
	DATA_NOT_FOUND,//错误的rowId
	UNDEFINE,//为定义的转换结果
	ERRORLOG,//错误日志
	
	REDO//错误重试
}
