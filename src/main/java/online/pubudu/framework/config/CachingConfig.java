package online.pubudu.framework.config;

import com.google.common.base.Ticker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableCaching
public class CachingConfig {
//
//    @Bean
//    public RedisCacheManager redisCacheManager(RedisConnectionFactory connectionFactory) {
//
//        RedisCacheWriter redisCacheWriter = RedisCacheWriter.lockingRedisCacheWriter(connectionFactory);
//        RedisSerializationContext.SerializationPair<Object> valueSerializationPair = RedisSerializationContext.SerializationPair
//                .fromSerializer(new GenericJackson2JsonRedisSerializer());
//        RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig();
//        cacheConfiguration = cacheConfiguration.serializeValuesWith(valueSerializationPair);
//        cacheConfiguration = cacheConfiguration.prefixKeysWith("myPrefix");
//        cacheConfiguration = cacheConfiguration.entryTtl(Duration.ofSeconds(30));
//
//        RedisCacheManager redisCacheManager = new RedisCacheManager(redisCacheWriter, cacheConfiguration);
//        return redisCacheManager;
//    }
}
