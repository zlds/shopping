package com.example.core.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: hanchaowei
 * @date 2024/3/27
 * @description:
 */
@Component
@RequestScope
public class UserContext {

	private  String userId;


	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	public UserContext(HttpServletRequest request, RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
		// 从请求中获取Cookie
		Cookie[] cookies = request.getCookies();
		String sessionId = null;
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if ("sessionID".equals(cookie.getName())) { // 假设Cookie的名字是sessionID
					sessionId = cookie.getValue();
					break;
				}
			}
		}

		if (sessionId != null) {
			// 使用sessionId去Redis中查询用户信息
			String key = "session:" + sessionId;
			Object userIdObj = redisTemplate.opsForValue().get(key);
			if (userIdObj != null) {
				// 假设存储的是userId
				userId = (String) userIdObj;
			}
		}
	}

	public String getUserId() {
		return userId;
	}

}
