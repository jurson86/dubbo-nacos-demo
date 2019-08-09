package com.amd.mybatis.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;


/**
 * 用户表
 * 
 * @author gus
 * @email gus@163.com
 * @date 2019-08
 */
@Data
@Builder
@TableName("t_user")
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class User extends Model<User> implements Serializable {
	private static final long serialVersionUID = 1L;

		//
		@TableId
		private Long id;
		//username
		private String username;
		//password
		private String password;
	
}
