package src.DataClass;

import java.util.*;

import src.DataClass.node;

public class BTS
{
    /*
     * 基础数据结构方法实现
     * 增删查改
     */

    // BST 基底数据储存数组
    private ArrayList<node> DataStore;

    // BST 检索数组
    private ArrayList<Integer> DataIndex;

    // BST 辅助标记数组
    private ArrayList<Boolean> mark;

    // BST 特征记录成员变量?????????
    public int amount;
    public int deepth;
    public boolean order;

    // BST 辅助变量
    private int temp;

    // BST 构造函数
    public BTS()
    {
        /*
         * 构造函数，初始化数据结构
         * .........
         */

        // 核心数据数组创建
        this.DataStore = new ArrayList<>();
        this.DataIndex = new ArrayList<Integer>();
        this.mark = new ArrayList<Boolean>();

        // 关键特征变量赋值
        amount = 0;
        deepth = 0;
        order = true;

    }

    // BST 深度更新函数
    public int updateDeepth()
    {
        /*
         * 更新深度
         * .........
         */

        temp = amount;

        do 
        {
            temp /= 2;
            deepth++;
        } 
        while ( temp > 0 );

        return 0;
    }

    // BST 实例添加新的数据节点（两种添加方式，通过重载实现）
    public int add(node New)
    {
        DataStore.add(New);

        amount++;

        updateDeepth();

        order = false;

        return 0;
    }

    public int add(int PID, short PNo, short port)
    {
        DataStore.add( new node(PID, PNo, port));

        amount++;

        updateDeepth();

        order = false;
        
        return 0;
    }
}
