package src.DataClass;

import java.util.*;

import src.DataClass.node;

public class BTS
{
    /*
     * 基础数据结构方法实现
     * 增删查改
     */

    // BTS 基底数据储存数组
    private ArrayList<node> DataStore;

    // BTS 检索数组
    private ArrayList<Integer> DataIndex;

    // BTS 辅助标记数组
    private ArrayList<Boolean> mark;

    // BTS 特征记录成员变量
    public int amount;
    public int deepth;
    public boolean order;

    // BTS 辅助变量
    private int temp;

    // BTS 排序辅助比较器
    Comparator<node> compare = new Comparator<node>() 
    {
        @Override
        public int compare(node o1, node o2)
        {
            if(o1.PID == o2.PID)
            {
                if (o1.PNo == o2.PNo) 
                {
                    return o1.port - o2.port;
                } 
                else 
                {
                    return o1.PNo - o2.PNo;
                }
            }
            else
            {
                return o1.PID - o2.PID;
            }
        }
    };

    // BTS 构造函数
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

    // BTS 基本特征变量更新函数
    public int update()
    {
        /*
         * 更新深度
         * .........
         */

        amount = DataStore.size();

        temp = amount;

        do 
        {
            temp /= 2;
            deepth++;
        } 
        while ( temp > 0 );

        return 0;
    }


    // BTS 整理排序函数
    public int sort()
    {
        /*
         * 对基底数组进行排序，并将下标整理到检索数组便于查找
         */
        //
        update();

        if ( amount == 0 )
        {
            order = true;

            return 0;
        }
        else
        {
            DataStore.sort(compare);

            DataIndex.removeAll(DataIndex);

            mark.removeAll(mark);
            for (int i = 0; i < amount; i++)
            {
                mark.add(false);
            }

            //

            order = true;
            
            return 0;
        }

    }

    // BTS 实例添加新的数据节点（两种添加方式，通过重载实现）
    public int add(node New)
    {
        DataStore.add(New);

        amount++;

        order = false;

        return 0;
    }

    public int add(int PID, short PNo, short port)
    {
        DataStore.add( new node(PID, PNo, port));

        amount++;

        order = false;

        return 0;
    }
}
