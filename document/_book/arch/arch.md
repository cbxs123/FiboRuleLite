##技术架构
###结构图
架构图的地址如下：
https://www.processon.com/view/link/63849862e0b34d37c4717942   
主要分为以下几端：  
`应用端` 应用端使用SDK，按照业务场景，定一个场景节点的类型、节点的条件判断或者计算逻辑、节点的可配置变量。并定义App的一些基本信息。  
`SDK` SDK可以编译成一个独立Jar包，由应用端开发场景应用时进行依赖。主要进行基础类的定义、注解的定义以及扫描、逻辑流的执行、和服务器的信息交互等  
`服务器` 服务器主要节点配置信息的保存更新、和SDK进行节点信息的推送同步等。使用MySQL机型信息的存储，以及客户端列表的存储  
`H5端` H5端主要是后端管理系统，负责应用管理、引擎管理、流程的拖拉拽编辑等界面操作

这4端的交互关系详见流程图