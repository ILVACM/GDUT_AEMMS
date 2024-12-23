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

    // BTS 自定义快速幂函数
    public static int power(int x, int y) 
    {
        if (y < 0) 
        {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        int result = 1;
        while (y > 0) 
        {
            if ((y & 1) == 1) 
            { // 如果n是奇数
                result *= x;
            }
            x *= x;
            y >>= 1; // 将n右移一位，相当于n除以2
        }
        return result;
    }

    // BTS 检索数组中点查找辅助函数
    public int MidSearch( int length)
    {
        if ( length == 0) 
        {
            return 0;
        }

        if ( length == 1) 
        {
            return 1;
        }

        if ( length == 2) 
        {
            return 2;
        }

        if ( length == 3) 
        {
            return 2;
        }

        int deep = 0;
        temp = length;
        while ( temp > 0) 
        {
            temp >>= 1;
            deep++;
        }

        int temp_1 = power( 2, deep-1);        //调用自定义快速幂函数
        int temp_2 = power( 2, deep-2);        //调用自定义快速幂函数

        if ( length - ( temp_1 - 1) > temp_2 ) 
        {
            return temp_1 - 1;
        }
        else
        {
            return length - temp_2 + 1;
        }
    }

    // BTS 整理排序函数
    public int sort()
    {
        /*
         * 对基底数组进行排序，并将下标整理到检索数组便于查找
         */
        //
        update();

        DataIndex.removeAll(DataIndex);

        mark.removeAll(mark);
        for (int i = 0; i < amount; i++)
        {
            mark.add(false);
        }

        if ( amount == 0 )
        {
            order = true;

            return 0;
        }
        else
        {
            DataStore.sort(compare);

            int flag = 0;
            int flag_start = -1;
            int flag_length = 0;
            int flag_process = 0;
            int midlength = 0;
            temp = deepth;

            while ( flag_process < amount) 
            {
                while( flag < amount) 
                {
                    if (mark.get(flag)) 
                    {
                        //
                        midlength = MidSearch( flag_length);

                        DataIndex.add( flag_start +midlength -1);

                        mark.set( flag_start +midlength -1, true);

                        flag_start = -1;
                        flag_length = 0;
                        flag_process++;

                        if ( flag_process >= amount) 
                        {
                            break;
                        }
                        //
                    }
                    else
                    {
                        if ( flag_start == -1) 
                        {
                            flag_start = flag;
                        }

                        flag_length++;
                    }

                    flag++;
                }

                //
                if ( flag_process >= amount) 
                {
                    break;
                }

                midlength = MidSearch( flag_length);

                DataIndex.add( flag_start +midlength -1);

                mark.set( flag_start +midlength -1, true);

                flag_start = -1;
                flag_length = 0;
                flag_process++;
                //
                
                flag = 0;
            }
        }

        order = true;
            
        return 0;
    }

    // BTS 实例添加新的数据节点（两种添加方式，通过重载实现）
    public int add(node New)
    {
        DataStore.add(New);

        amount++;

        order = false;

        return 1;
    }

    public int add(int PID, short PNo, short port)
    {
        DataStore.add( new node(PID, PNo, port));

        amount++;

        order = false;

        return 1;
    }

    // BTS 实例删除数据节点

    // BTS 实例查找数据节点

    // BTS 实例修改数据节点
    
}
