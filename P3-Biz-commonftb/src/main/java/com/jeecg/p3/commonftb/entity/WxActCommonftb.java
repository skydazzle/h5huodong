package com.jeecg.p3.commonftb.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActCommonftb:砍价子活动表<br>
 * @author pituo
 * @since：2016年01月05日 11时07分05秒 星期二 
 * @version:1.0
 */
public class WxActCommonftb implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 *是否关注用户参与 0否1是
	 */
	private String foucsUserCanJoin;
	/**
	 *是否绑定手机可参加 0否1是
	 */
	private String bindingMobileCanJoin;

		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String getName() {
	public String getJwidName() {
		return jwidName;
	}
	public void setJwidName(String jwidName) {
		this.jwidName = jwidName;
	}
	public String getBinner() {
		return binner;
	}
	public void setBinner(String binner) {
		this.binner = binner;
	}
	public String getFoucsUserCanJoin() {
		return foucsUserCanJoin;
	}
	public void setFoucsUserCanJoin(String foucsUserCanJoin) {
		this.foucsUserCanJoin = foucsUserCanJoin;
	}
	public String getBindingMobileCanJoin() {
		return bindingMobileCanJoin;
	}
	public void setBindingMobileCanJoin(String bindingMobileCanJoin) {
		this.bindingMobileCanJoin = bindingMobileCanJoin;
	}
	public String getIfCutMin() {
		return ifCutMin;
	}
	public void setIfCutMin(String ifCutMin) {
		this.ifCutMin = ifCutMin;
	}
	
}
