// Copyright (C) 2011 - Will Glozer.  All rights reserved.

package com.lambdaworks.redis.protocol;

/**
 * Redis commands.
 * 
 * @author Will Glozer
 */
public enum CommandType implements ProtocolKeyword {
    // Connection

    AUTH, ECHO, PING, QUIT, READONLY, READWRITE, SELECT,

    // Server

    BGREWRITEAOF, BGSAVE, CLIENT, COMMAND, CONFIG, DBSIZE, DEBUG, FLUSHALL, FLUSHDB, INFO, MYID, LASTSAVE, ROLE, MONITOR, SAVE, SHUTDOWN, SLAVEOF, SLOWLOG, SYNC,

    // Keys

    DEL, DUMP, EXISTS, EXPIRE, EXPIREAT, KEYS, MIGRATE, MOVE, OBJECT, PERSIST, PEXPIRE, PEXPIREAT, PTTL, RANDOMKEY, RENAME, RENAMENX, RESTORE, TTL, TYPE, SCAN,

    // String

    APPEND, GET, GETRANGE, GETSET, MGET, MSET, MSETNX, SET, SETEX, PSETEX, SETNX, SETRANGE, STRLEN,

    // Numeric

    DECR, DECRBY, INCR, INCRBY, INCRBYFLOAT,

    // List

    BLPOP, BRPOP, BRPOPLPUSH, LINDEX, LINSERT, LLEN, LPOP, LPUSH, LPUSHX, LRANGE, LREM, LSET, LTRIM, RPOP, RPOPLPUSH, RPUSH, RPUSHX, SORT,

    // Hash

    HDEL, HEXISTS, HGET, HGETALL, HINCRBY, HINCRBYFLOAT, HKEYS, HLEN, HSTRLEN, HMGET, HMSET, HSET, HSETNX, HVALS, HSCAN,

    // Transaction

    DISCARD, EXEC, MULTI, UNWATCH, WATCH,

    // HyperLogLog

    PFADD, PFCOUNT, PFMERGE,

    // Pub/Sub

    PSUBSCRIBE, PUBLISH, PUNSUBSCRIBE, SUBSCRIBE, UNSUBSCRIBE, PUBSUB,

    // Sets

    SADD, SCARD, SDIFF, SDIFFSTORE, SINTER, SINTERSTORE, SISMEMBER, SMEMBERS, SMOVE, SPOP, SRANDMEMBER, SREM, SUNION, SUNIONSTORE, SSCAN,

    // Sorted Set

    ZADD, ZCARD, ZCOUNT, ZINCRBY, ZINTERSTORE, ZRANGE, ZRANGEBYSCORE, ZRANK, ZREM, ZREMRANGEBYRANK, ZREMRANGEBYSCORE, ZREVRANGE, ZREVRANGEBYSCORE, ZREVRANK, ZSCORE, ZUNIONSTORE, ZSCAN, ZLEXCOUNT, ZREMRANGEBYLEX, ZRANGEBYLEX,

    // Scripting

    EVAL, EVALSHA, SCRIPT,

    // Bits

    BITCOUNT, BITOP, GETBIT, SETBIT, BITPOS,

    // Geo
    GEOADD, GEORADIUS, GEORADIUSBYMEMBER, GEOENCODE, GEODECODE, GEOPOS, GEODIST,

    // Others
    TIME, WAIT,

    // SENTINEL
    SENTINEL,

    // CLUSTER
    ASKING, CLUSTER;

    public final byte[] bytes;

    private CommandType() {
        bytes = name().getBytes(LettuceCharsets.ASCII);
    }

    @Override
    public byte[] getBytes() {
        return bytes;
    }
}
