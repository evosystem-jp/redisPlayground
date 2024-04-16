package mains;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import utils.JedisHelper;

/**
 * Jedisテスト.
 *
 * @author evosystem
 */
public class JedisFlush {

	/**
	 * メイン.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("■start.");
		try {
			// JedisPoolを取得
			JedisPool jedisPool = JedisHelper.getJedisPool();

			// Jedisを取得
			try (Jedis jedis = jedisPool.getResource()) {
				// 全ての値を削除
				jedis.flushDB();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("■done.");
		}
	}
}