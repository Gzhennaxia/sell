[TOC]

# 数据库

```mysql
create table `seller_info`(
	`seller_id` varchar(32) not null,
	`username` varchar(32) not null,
	`password` varchar(32) not null,
	`openid` varchar(64) not null comment '微信openid',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '更新时间',
	primary key (`seller_id`)
) comment '卖家信息表';
```



# Linux命令

## vim命令

> [vim常用命令总结 （转)](https://www.cnblogs.com/yangjig/p/6014198.html)

1. [模式与模式切换](https://www.cnblogs.com/zzqcn/p/4619012.html)

   vim一共有4个模式：

   * 正常模式 (Normal-mode) 
   * 插入模式 (Insert-mode)
   * 命令模式 (Command-mode)
   * 可视模式 (Visual-mode)

   不论位于什么模式，按下`<Esc>`键(有时需要按两下）都会进入正常模式。

2. 删除字符   

   要删除一个字符，只需要将光标移到该字符上按下"x"。  

3. 删除一行   

   删除一整行内容使用"dd"命令。删除后下面的行会移上来填补空缺。 

4. 删除换行符

   在Vim中你可以把两行合并为一行，也就是说两行之间的换行符被删除了：命令是"J"。  

5. 撤销

   如果你误删了过多的内容。显然你可以再输入一遍，但是命令"u" 更简便，它可以撤消上一次的操作。  

6. 重做

   如果你撤消了多次，你还可以用CTRL-R(重做)来反转撤消的动作。换句话说，它是对撤消的撤消。撤消命令还有另一种形式，"U"命令，它一次撤消对一行的全部操作。第二次使用该命令则会撤消前一个"U"的操作。用"u"和CTRL-R你可以找回任何一个操作状态。

7. 追加

     "i"命令可以在当前光标之前插入文本。
     "a"命令可以在当前光标之后插入文本。
     "o"命令可以在当前行的下面另起一行，并使当前模式转为Insert模式。
     "O"命令(注意是大写的字母O)将在当前行的上面另起一行。

8. 使用命令计数

   假设你要向上移动9行。这可以用"kkkkkkkkk"或"9k"来完成。事实上，很多命令都可以接受一个数字作为重复执行同一命令的次数。比如刚才的例子，要在行尾追加三个感叹号，当时用的命令是"a!!!"。另一个办法是用"3a!"命令。3说明该命令将被重复执行3次。同样，删除3个字符可以用"3x"。指定的数字要紧挨在它所要修饰的命令前面。

9. 退出

    要退出Vim，用命令"ZZ"。该命令保存当前文件并退出Vim。

10. 移动到行首或行尾   "`$`"命令将光标移动到当前行行尾。如果你的键盘上有一个键，它的作用也一样。"^"命令将光标移动到当前行的第一个非空白字符上。"0"命令则总是把光标移动到当前行的第一个字符上。键也是如此。"`$`"命令还可接受一个计数，如"`1$`"会将光标移动到当前行行尾，"`2$`"则会移动到下一行的行尾，如此类推。"0"命令却不能接受类似这样的计数，命令"^"前加上一个计数也没有任何效果。 

## 关机/重启

　Linux centos重启命令：

　　1、reboot
　　2、shutdown -r now 立刻重启(root用户使用)
　　3、shutdown -r 10 过10分钟自动重启(root用户使用)
　　4、shutdown -r 20:35 在时间为20:35时候重启(root用户使用)
　　如果是通过shutdown命令设置重启的话，可以用shutdown -c命令取消重启

　Linux centos关机命令：

　　1、halt 立刻关机
　　2、poweroff 立刻关机
　　3、shutdown -h now 立刻关机(root用户使用)
　　4、shutdown -h 10 10分钟后自动关机

## copy

 cp [选项] 源文件或目录 目标文件或目录 

eg：`cp -r dist/* /opt/data/wwwroot/sell/`

# Markdown

在markdown模式下，配对的美元符号$会作为特殊的环境标志

例如：$abcdefg,hijklmn,opqrst,uvwsyz$

例如：$中文的情况下是这个样子$

# Nginx

## 重启Nginx

```shell
nginx -s reload
```

# windows下hosts文件位置

`C:\Windows\System32\drivers\etc\hosts`

# IDEA

## 快捷键

CTRL + SHIFT + U：将选中的单词转化为大写

CTRL + ALT + B：光标位于接口/类名（方法名）时跳转到其实现/子类（方法实现）

CTRL + B：光标位于接口/类名（方法名）时跳转到其父接口/类（方法实现）

# SpringBoot

## BeanUtil

### copyProperty方法

注意：该方法可能会导致目标对象覆盖源对象原本存在的属性值，使用时注意代码顺序。

![](https://i.loli.net/2018/08/05/5b66c89e125b6.jpg)

![1533465583496](C:\Users\admin\AppData\Local\Temp\1533465583496.png)

## 单位转换

> [项目中使用JsonSerializer将JavaBean中Date毫秒级转秒级的简便方法](https://blog.csdn.net/weixin_38303684/article/details/78410627)

![](https://i.loli.net/2018/08/07/5b68793b05e60.jpg)

![](https://i.loli.net/2018/08/07/5b6879d16fade.jpg)

## 不返回null值字段

> [@JsonInclude 注解不返回null值字段](https://blog.csdn.net/itguangit/article/details/78701110)

1. 局部配置

   ![](https://i.loli.net/2018/08/07/5b6884246fac6.jpg)

2. 全局配置

   ![](https://i.loli.net/2018/08/07/5b68847fc089c.jpg)

## 请求跳转

请求跳转时一般不要用相对路径，因为相对路径是相对于项目入口地址的。

![](https://i.loli.net/2018/08/21/5b7bd6670c169.jpg)

![](https://i.loli.net/2018/08/21/5b7bd6800029e.jpg)

![1534842690595](C:\Users\ADMINI~1\AppData\Local\Temp\1534842690595.png)

# 异常捕获

## 在异常捕获时改变请求响应码

![](https://i.loli.net/2018/08/23/5b7eba58e5250.jpg)

![](https://i.loli.net/2018/08/23/5b7eba7faaf31.jpg)

# Freemarker

## 小技巧

将重新编译的快捷键该为 CTRL + S ，每次更改模板后保存一下，直接刷新页面即可，不用重启项目。

## 判断存在性

![](https://i.loli.net/2018/08/15/5b730eb6655a6.jpg)

## 【遗留问题1】

完结订单的接口在成功时没有把map放入ModelAndView，为什么还是能正常显示和自动跳转呢？

![](https://i.loli.net/2018/08/13/5b71936e3579a.jpg)

![](https://i.loli.net/2018/08/13/5b7193ca171f0.jpg)

# Gson

## TypeToken

字符串--->List

![](https://i.loli.net/2018/08/07/5b6870b76ba1c.jpg)

## @JsonIgnore

在对象转化Json字符串时忽略某字段

![](https://i.loli.net/2018/08/13/5b7071cbc6732.jpg)

# 微信

## 公众号测试号的使用

### 申请测试号

> [申请地址](http://mp.weixin.qq.com/debug/cgi-bin/sandbox?t=sandbox/login )

![](https://i.loli.net/2018/08/09/5b6b194449c67.jpg)

![](https://i.loli.net/2018/08/09/5b6b19995bdb5.jpg)

![](https://i.loli.net/2018/08/09/5b6b1a220c0b0.jpg)

![](https://i.loli.net/2018/08/09/5b6b17c7057af.jpg)

![1533746077710](C:\Users\admin\AppData\Local\Temp\1533746077710.png)

![](https://i.loli.net/2018/08/09/5b6b1bc3a6f92.jpg)

![](https://i.loli.net/2018/08/09/5b6b1b32306d1.jpg)

![](https://i.loli.net/2018/08/09/5b6b1aeb74d5a.jpg)

![](https://i.loli.net/2018/08/09/5b6b1befc2944.jpg)

![](https://i.loli.net/2018/08/09/5b6b1c8a524d7.jpg)

![](https://i.loli.net/2018/08/09/5b6b1cbbc4458.jpg)

## 使用SDK进行微信网页授权

![](https://img.mukewang.com/szimg/5b38afde0001015705000189.jpg)

![](https://i.loli.net/2018/08/10/5b6c82440807b.jpg)

![](https://i.loli.net/2018/08/10/5b6c852423656.jpg)

## 扫码登录

> [网站应用微信登录开发指南](https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1419316505&token=&lang=zh_CN)



# 分布式系统

## 什么是分布式系统

> 旨在支持应用程序和服务的开发,可以利用物理架构,由**多个自治的处理元素**,**不共享主内存**,但通过**网络**发送**消息**合作.   ---Leslie Lanport

### 三个特点

1. 多节点
2. 消息通信
3. 不共享内存

### 三个概念

1. 分布式系统(distributed system)
2. 集群(cluster)
3. 分布式计算(distributed computing)

### 分布式系统与集群

#### 区别和联系

分布式: 主食厨子 + 甜点厨子

集群: 主食厨子 + 主食厨子  或者   甜点厨子 +  甜点厨子

# session

http协议是无状态的

会话可以理解为key-value

## 会话实现方式

从key的角度可以分为: sessionId 和 token

# Java基础

## 字符串格式化

> [String.format()用法](https://blog.csdn.net/qq_25925973/article/details/54407994)

# 网络

## 内网穿透

> [natapp](https://natapp.cn/)

# 测压

> 使用Apache ab模拟并发

# Redis

> [官网](https://redis.io/)
>
> [官网中文翻译版](http://www.redis.cn/)