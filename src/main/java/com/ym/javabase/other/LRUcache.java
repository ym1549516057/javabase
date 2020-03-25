package com.ym.javabase.other;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author YM
 * @date 2020/3/9 14:49
 */
public class LRUcache extends LinkedHashMap {
    private final int CACHE_SIZE;

    /**
     * 传递进来最多能缓存多少数据
     *
     * @param cacheSize 缓存大小
     */
    public LRUcache(int cacheSize) {
        super((int) (Math.ceil(cacheSize / 0.75) + 1), 0.75f, true);
        CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        //当map中的数据量大于指定的缓存个数的时候,自动删除最老的数据
        return size() > CACHE_SIZE;
    }
}
