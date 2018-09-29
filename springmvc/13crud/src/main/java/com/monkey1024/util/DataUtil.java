package com.monkey1024.util;

import com.monkey1024.bean.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 模拟生成数据的工具类 Dao层
 */
public class DataUtil {

    private static HashMap<String, User> dataMap = new HashMap<>();

    //模拟初始化数据 new User 得益于带参数的User构造方法
    static {
        User user1 = new User("jack", "13233332222", "北京", LocalDate.of(2012, 01, 01));
        User user2 = new User("paul", "13222223333", "南京", LocalDate.of(2002, 03, 02));
        User user3 = new User("andy", "15656565656", "上海", LocalDate.of(2011, 05, 03));

        dataMap.put("1",user1);
        dataMap.put("2",user2);
        dataMap.put("3",user3);
    }

    /**
     * 查询全部数据
     * @return
     */
    public static HashMap<String, User> findAll() {
        return dataMap;
    }

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    public static User findUserById(String id){
        return dataMap.get(id);
    }

    /**
     * 添加操作
     * @param user
     * @throws Exception
     */
    public static void create(User user) throws Exception {
        //遍历map，找到key的最大值
        //通过entrySet()方法将map集合中的映射关系取出（这个关系就是Map.Entry类型）
        //Set<Map.Entry<String, User>> entries = dataMap.entrySet();
        //将关系集合entrySet进行迭代，存放到迭代器中
        //Iterator<Map.Entry<String, User>> iterator = entries.iterator();

        Iterator<Map.Entry<String, User>> iterator = dataMap.entrySet().iterator();

        int max = 3;

        while (iterator.hasNext()){
            //获取Map.Entry关系对象next
            Map.Entry<String, User> next = iterator.next();//这样就拿到map了
            //通过关系对象获取key 转成int类型
            int i = Integer.parseInt(next.getKey());//拿到key
            if(max < i){
                max = i;
            }
        }

        //将最大值做自增运算,然后作为key放到map里面 ,+ ""表示转成string类型
        dataMap.put(++max + "",user);

        //　Set<Map.Entry<K,V>> entrySet() 返回映射所包含的映射关系的Set集合（一个关系就是
        // 一个键-值对），就是把(key-value)作为一个整体一对一对地存放到Set集合当中的。

    }

    /**
     * 修改操作
     * @param id
     * @param user
     * @throws Exception
     */
    public static void update(String id, User user) throws Exception {
        dataMap.put(id, user);//替换操作
    }

    /**
     * 删除用户操作
     * @param id
     * @throws Exception
     */
    public static void delete(String id) throws Exception {
        dataMap.remove(id);
    }
}
