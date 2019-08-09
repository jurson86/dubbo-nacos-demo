<h1> DNacosDemo </h1>


**项目说明** 
- 本项目已大量重构,精简了大量代码减少第三方依赖，最干净的脚手架。
- 引入了lombok 大量简化了代码
- 引入了MyBatis Plus 大量简化了SQL
- 引入dubbo 工具包 规范工具类


**setting.xml 阿里镜像:**
<mirror>
<id>alimaven</id>
<name>aliyun maven</name>
<url>http://maven.aliyun.com/nexus/content/groups/public/</url>
<mirrorOf>central</mirrorOf> 
</mirror>


**模块说明**
<pre>
模块由:facade,model,repository,rpc,service五个model组成，版本为：1.0-SNAPSHOT
1.facade：dubbo接口（maven项目）
   这个包提供出去的所有接口，必须满足对外服务的能力；不开放的服务接口，在service模块实现接口，不通过dubbo接口提供出去！
2.model：实体、工具类（maven项目）
   对外提供的对象实体定义，如：外部接口中的对象，对外协议中的字典信息等
3.repository：mapper文件、mapper类（maven项目）
  持久层对象及其基础操作；
4.rpc：dubbo接口实现、Controller（boot项目）
  rpc:  对外实现 dubbo接口；
  controller : 对外实现 restful接口
  service:  服务功能实现
  注意：
  内部spring上下文对象，采用注解： 
    import org.springframework.stereotype.Service;
  注册到dubbo服务的接口，采用注解：
    import com.alibaba.dubbo.config.annotation.Service;
</pre>


**环境** 
- jdk 1.8
- mysql 5.7
- redis


**项目结构** 
<pre>

├─doc  基础环境配置数据 
│  ├─db.sql 项目SQL语句
│  ├─nginx.confi nginx 配置文件
│ 
│ 
│
├─facade dubbo接口模块
│ 
│ 
├─model 对外提供的共享数据
│  ├─constant  对外公共字典数据
│  ├─enums     对外公共枚举数据
│  ├─model     接口中的对象定义
│ 
├─repository 持久层对象及其基础操作
│  ├─config   持久层配置
│  ├─mybatis  mysql数据库操作
│  ├─redis    redis数据库操作
│  ├─resources    持久层配置 ，持久层地址配置信息，从服务配置里面，按照不同环境进行配置。
│     ├─mapping   mybatis对应mapping对象
│     ├─application-mybatis.yml   mybatis配置信息,通过： spring.profiles.include:mybatis 方式引入到服务配置中
│ 
├─rpc 服务模块
│  ├─config 配置信息
│  ├─controller rest接口实现包
│  ├─rpc  dubbo接口实现包
│  ├─service  内部服务实现包
│  └─util  util工具包
│ 
├─Application 项目启动类
│  
├──resources 
│  ├─application.yml 基础服务配置
│  ├─application-dubbo.yml dubbo配置信息，通过： spring.profiles.include:dubbo 方式引入到服务配置中
│  ├─logback.xml log配置
│  └─banner.txt  banner定义

</pre>

