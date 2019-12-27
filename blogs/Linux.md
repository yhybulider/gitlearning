# 1. 介绍

**Linux**是一套免费使用和自由传播的类Unix操作系统，是一个基于POSIX和Unix的多用户、多任务、支持多线程和多CPU的操作系统。它能运行主要的Unix工具软件、应用程序和网络协议。它支持32位和64位硬件。Linux继承了Unix以网络为核心的设计思想，是一个性能稳定的多用户网络操作系统（度娘）。Linux系统大致分为两种，debian系和redhat系的。现在国产的也有很多，例如优麒麟、以及安全操作系统凝思。



| debian系 | redhat系 |
| -------- | -------- |
| Debian   | RedHat   |
| \|Ubuntu | Fedora   |
| Mint     | Centos   |

#  2. 好处

1. 免费开源：感觉这也是受欢迎的关键点，在国内也有很多自己的版本，比如最近在使用的国产ubuntu优麒麟，正是由于Linux的免费，许多程序员可以根据自己的兴趣去修改，这也让Linux不断壮大发展。
2.  支持多用户、多用户：Linux支持多用户，各个用户对于自己的文件设备有自己特殊的权利，保证了各用户之间互不影响。
3. 良好的界面：有着字符界面和图形界面，在Linux上，可以通过终端来完成所有工作基本上。其实也是一种给人很牛皮的感觉。
4. 支持多平台：Linux可以运行在多种硬件平台上，如具有x86、680x0、SPARC、Alpha等处理器的平台。此外Linux还是一种嵌入式操作系统，可以运行在掌上电脑、机顶盒或游戏机上。之前玩了一阵子的树莓派，树莓派上就可以跑Linux的。

# 3. 常见操作

# 4. Linux命令操作

### dpkg： package manager for Debian

1. \- 安装： dpkg -i package（命令行操作常用）
2. \- 卸载： dpkg -r package
3. \- 卸载并删除配置文件： dpkg -P |--purge package
4. \- 如果安装一个包时、说依赖某些库、 可以先 apt-get install somelib
5. \- 查看软件包安装内容 ：dpkg -L package
6. \- 查看文件由哪个软件包提供： dpkg -S filename
7. \- 另外 dpkg还有 dselect和aptitude 两个frontend

### apt

- \- 安装： apt-get install packs
- \- 更新源：apt-get update
- \- 升级系统：apt-get upgrade（安装东西的时候，都要进行这一步。这里一般都很花费较长时间，有时比较慢，可以考虑换成国内的源。）
- \- 智能升级、安装新软件包，删除废弃的软件包：apt-get dist-upgrade f --fix broken 修复依赖：apt-get f install
- \- 自动删除无用的软件：apt-get autoremove 删除软件：apt-get remove packages

### mount

- \- 用来挂载linux外的文件，非常重要的一个命令，笔者也算是入门水平，还没真正熟悉用这个命令。大家可以多查阅资料去了解更多的内容。
- \- 基本格式:mount -t type [-o options] device dir (device:指定要挂载的设备，磁盘、光驱等 dir 指定把文件系统挂载到哪个目录 type 指定挂载的文件系统类型 options 指定挂载参数)。
- \- [菜鸟教程的链接](https://www.runoob.com/linux/linux-comm-mount.html)
- \- 示例：#mount -o ro /a/b/c——将a/b挂在/c下面
- \- [-o options]—— -o auto打开挂上模式 -o ro 只读 -o rw 读写模式挂载

### man

\- 这个命令是在Linux下提供的帮助手册，也很重要，对于哪个命令不清楚的话。就直接man +命令即可查阅。
![img](https://img-blog.csdnimg.cn/2019111309480482.png)

格式有下面这些；退出阅读界面就直接按q即可。

| 格式        | 说明                                 |
| ----------- | ------------------------------------ |
| NAME        | 名称，可以最简洁得了解该命令         |
| SYNOPSIS    | 概要，用法说明和能够使用的选项       |
| DESCRIPTION | 对各个功能命令的详细解释说明         |
| OPTIONS     | 说明每一项的意义                     |
| AUTHORS     | 伟大的发明创作这个的作者             |
| SEE ALSO    | 另外参照                             |
| COPYRIGHT   | 版权说明，在linux都是可以更改的 free |

 

###  常用命令

- \- df -h——查看磁盘空间（h是以友好的方式进行查看）
- ![img](https://img-blog.csdnimg.cn/20191113101506159.png)

 

-  **find+文件**——可以查看当前目录下的文件，若是文件夹，存在就会列出文件夹中的文件。
-  **netstat -ant**——用来查看本地一些端口信息等，监听使用等，这个命令很重要，之前在设置mysql的时候都有用到，解决一些端口问题上都会用到这个命令。
- ![Linux实例](https://img-blog.csdnimg.cn/20191113101917287.png)
-  **mkdir** ——创建文件夹 eg：mkdir 文件夹名 touch ——创建文件eg：touch 文件名。
-  **du -h 文件**——查看文件的大小，有时要查看文件的大小，在使用vim之前一般都会建议查看一下大小，因为大于100M的文件直接vim打开会出现问题。
- ![实例图片](https://img-blog.csdnimg.cn/20191113104248336.png)
- **su** ——切换用户，比如su -uroot -p切换到root用户下。
- **ping命令**——这个其实不管哪个系统都很重要，是关于tcp/ip的，Ping 是一个十分好用的TCP/IP工具。它是用来检测网络的连通情况和分析网络速度。
-  ![img](https://img-blog.csdnimg.cn/20191113112148837.png)

# 推荐

在这个标题下推荐一些好的链接（书籍、网站、博客等）

\1. **书籍**



| 鸟哥的Linux私房菜                       | 鸟哥（作者） |
| --------------------------------------- | ------------ |
| The Linux Command Line(linux命令行大全) | william E    |
|                                         |              |
|                                         |              |
|                                         |              |

个人感觉要想形成自己的知识体系，就要不断得去学习和阅读书籍，现在的学习环境总体而言太复杂了，太浮躁了，学技术要定下心，沉住气，所以阅读经典实用的书籍是必不可少的，日后对某一种知识遗忘时，随手一翻也可以快速得拾起记忆。

一般这些技术书，我都是上一些二手网站淘回来，例如有路网等，当然京东和当当网也会搞活动有时候，也很划算，刚刚过去的双十一就买了两本。比较划算，包括上面那个Linux command line

![img](https://img2018.cnblogs.com/i-beta/1847641/201911/1847641-20191114090926580-989305844.png)

 

 

 双十一折扣回来两本70多，很香的价格。

下面的截图是*鸟哥的Linux私房菜*截图，个人强烈推荐，对于学生来讲是非常友好的，用易懂的语言去讲解，并不枯燥。

![img](https://img2018.cnblogs.com/i-beta/1847641/201911/1847641-20191114094314704-856124372.png)

 

 


\2. **Github**

- [大佬总结pdf（强烈推荐）]

[https://github.com/xjjdog/javaok/blob/master/%E6%9C%80%E6%9C%89%E7%94%A8Linux%E7%B3%BB%E5%88%97-%E7%99%BE%E9%A1%B5%E7%B2%BE%E5%8D%8E.pdf](https://github.com/xjjdog/javaok/blob/master/最有用Linux系列-百页精华.pdf)
\3. **网站**

 

-  个人感觉挺不错的一个学习实践[开源中国社区](https://linux.cn/)。
- [菜鸟教程](https://www.runoob.com/linux/linux-tutorial.html)-这是一个比较快速入门的网站，但有些地方没细讲，大家可以自行查看。

 