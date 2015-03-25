package wangxf.redistest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * 
 * @author wangxf
 *
 * @param <K>
 * @param <V>
 */
public abstract class AbstractBaseRedisDao<K, V> {
	
	@Autowired
	protected StringRedisTemplate redisTemplate;

	/**
	 * 设置redisTemplate
	 * @param redisTemplate the redisTemplate to set
	 */
	public void setRedisTemplate(StringRedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	/**
	 * 获取 RedisSerializer
	 * <br>------------------------------<br>
	 */
	protected RedisSerializer<String> getRedisSerializer() {
		return redisTemplate.getStringSerializer();
	}
}