package me.chanjar.weixin.channel.bean.vip;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 视频号小店-会员功能 - 订单详情
 *
 * @author <a href="https://github.com/asushiye">asushiye</a>
 *
 */
@Data
@NoArgsConstructor
public class UserInfo implements Serializable {

  private static final long serialVersionUID = 8523354700203385190L;
  /** 手机号 */
  @JsonProperty("phone_number")
  protected String phoneNumber;
}
