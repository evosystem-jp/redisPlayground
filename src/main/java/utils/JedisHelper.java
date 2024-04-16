package utils;

import constants.Configurations;
import redis.clients.jedis.JedisPool;

/**
 * Jedisヘルパー.
 * 
 * @author evosystem
 */
public class JedisHelper {

	/**
	 * クライアントを取得.
	 */
	public static JedisPool getJedisPool() {
		return new JedisPool(Configurations.REDIS_HOST, Configurations.REDIS_PORT, Configurations.REDIS_USERNAME,
				Configurations.REDIS_PASSWORD);
	}
}