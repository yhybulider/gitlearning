# 前言
 Electron 是一个用 HTML，CSS 和 JavaScript 来构建跨平台桌面应用程序的一个开源库。由GitHub开发的。

![](https://img2018.cnblogs.com/blog/1847641/201912/1847641-20191212235206399-1173994357.png)
其原理是 Electron 通过将 Chromium 和 Node.js 合并到同一个运行时环境中，并将其打包为 Mac，Windows 和 Linux 系统下的应用来实现这一目的。

*在公司里用到了Linux系统，所以就花了一点时间试着搭了一个体验一下。*

1.  安装这个网站走完安装部署[步骤](https://www.linuxidc.com/Linux/2019-10/161183.htm)

 2. 创建electron桌面项目代码等结构参照以下链接[github](https://github.com/thelostwind/electron-clock)
 3. 一开始按照网上进行操作，最后会报错，无法执行，直接抛出——throw new Error('Electron failed to
    install correctly, please delete node_modules/electron and try
    installing again') 如图

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191121142141593.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDMwNDM4Nw==,size_16,color_FFFFFF,t_70)
 - 操作的一些记录
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191121142043608.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDMwNDM4Nw==,size_16,color_FFFFFF,t_70)

 - 查阅了一小会资料，原来是我的Ubuntu上缺少了一些库环境，不过每个人的情况不一样，先是确保你的Python版本在2.7.x，以及安装了node.js那些,就是以及完成了那些该走的步骤，再来就是安装下面的库了。

```
sudo apt-get install build-essential clang libdbus-1-dev libgtk-3-dev \
                       libnotify-dev libgnome-keyring-dev \
                       libasound2-dev libcap-dev libcups2-dev libxtst-dev \
                       libxss1 libnss3-dev gcc-multilib g++-multilib curl \
                       gperf bison python-dbusmock openjdk-8-jre
```


我的就是上面库没装，再次试了一遍之后就成功运行了。



最后运行成功如下
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191121141809436.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDMwNDM4Nw==,size_16,color_FFFFFF,t_70)![success](https://img-blog.csdnimg.cn/20191121143650122.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDMwNDM4Nw==,size_16,color_FFFFFF,t_70)

 - 参考解决方法
   [stackoverflow上的解决方法](https://stackoverflow.com/questions/53393675/problem-installing-electron-on-linux-macos)
   [官方文档](https://electronjs.org/docs/development/build-instructions-linux)
   
 - [参考搭建](https://juejin.im/post/5c46ab47e51d45522b4f55b1)
   
   





