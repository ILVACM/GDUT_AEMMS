<h1 align="center"> 课设项目基本信息说明 </h1>  

----------------------------------------------------------  
目录？  

----------------------------------------------------------  
中文名称：  
    自适应边缘监控管理系统  

English name:  
    Adaptive edge monitoring management system  
    (AEMMS)  

----------------------------------------------------------  
课题背景：  
    本项目起源于本人在 实验室（广工物理信息融合重点实验室-CPS） 参与的校企合作横向科研应用项目，系 导师 与 南方电网集团下属南网研究院 的合作项目。  
    该项目从实际生产出发，以实际场景为导向，提出需求，团队结合当下热门前沿的信息技术研究应用方向制定解决方案，并最终实现。  
    另外 数据结构 课程关于期末课程设计说明中所提到的 "学以致用" "与实际结合" 等精神。  
    在与任课老师协商并经过同意后，将基于该项目及其背景，结合课内题目所提出功能要求和考核标准，自拟期末课程设计题干内容并实现。  

----------------------------------------------------------  
项目内容：
    本项目目标是设计实现一个中央边缘监控点信息维护管理系统。  
    该系统部署于客户中央服务器上，通过多种连接方式( Lan\ Wlan\ Bluetooth\\)与边缘监控设备建立连接，并接受来自边缘设备的采集数据输入，经过处理后保存至服务器本地。另外系统提供界面供用户操作交互，将相关数据信息展示给用户，同时接受来自用户的指令并执行反馈结果。  

    其中规定关于监控点的数据内容：  

二叉排序树  

|  数据名称  |  内容说明   |         备注         |
|:------:|:-------:|:------------------:|
| 监控点ID号 | 标识不同监控点 |     int\ str\      |
| 监控点地址  | 字段，便于查询 | 国-省-市-县（区）-作业场景-编号 |
| 监控设备类型 | 显示设备参数  |       是否固定等        |
| 设备运行状态 | 显示设备状态  |     是否运作，是否正常      |
|  数据信息  |  采集方式   |  图片(JPG等) 视频(mp4)  |
|        |         |                    |  
|        |         |                    |  
|        |         |                    |  
|        |         |                    |  
|        |         |                    |  
|        |         |                    |  
|        |         |                    |  
|        |         |                    |  
|        |         |                    |  
|        |         |                    |  

----------------------------------------------------------  
功能设计：  
    Basic  
        1. 增删查改  
        2. 数据导入导出（数据库）  
        3. 数据查询（可视化？）  
    Advance  
        1. 高级查询  
        2. 实时视频监控检测分析（操控摄像头？）  
        3. GUI界面？  
        4. 自动化运维检测（报告生成）  
        5. 跨平台兼容性？  
        6. 接口/API？  
        7. NAS？  
