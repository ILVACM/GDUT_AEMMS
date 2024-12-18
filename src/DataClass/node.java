package src.DataClass;

public class node 
{
    /**
     * 这是节点定义类，用于定义数据结构中最基本的节点组成。
     * 便于其他高级操作的调用和实现。
     * 同时该类所创建的实例也是程序用于在数据库中检索相关信息的索引值
    // @author Bokai Huang
    // @version 1.0
     *
     */

    public int PID;
    public short PNo;
    public short port;

    public node( int PID, short PNo, short port)
    {
        this.PID = PID;
        this.PNo = PNo;
        this.port = port;
    }
}
