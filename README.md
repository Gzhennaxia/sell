# 数据库

```mysql
create table `product_info`{
	`product_id varchar(32) not null,
	`product_name` varchar(64) not null comment '商品名称',
	`product_price` decimal(8.2) not null comment '单价',
	`product_stock` int not null comment '库存',
	`product_description` varchar(64) comment '描述',
	`product_icon` varchar(512) comment '小图',
	`category_type` int not null comment '类目编号',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	
} comment '商品表';
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

# SpringBoot

## BeanUtil

### copyProperty方法

注意：该方法可能会导致目标对象覆盖源对象原本存在的属性值，使用时注意代码顺序。

![](https://i.loli.net/2018/08/05/5b66c89e125b6.jpg)

![1533465583496](C:\Users\admin\AppData\Local\Temp\1533465583496.png)



