---
title: Idea使用小结
toc: true
tags: 随记
categories: 随记
date: 2020-05-25 00:28:47

---



# Idea使用记录小结

## 主题

## 配置-排错

### 解决jdk`发行版本问题`

在一些maven项目开启的时候，常常会有错误出现，因为idea里面当下的项目配置是因为maven的原本的配置给覆盖了。说先有可能是setting出了问题，可以先打开project-setting(在idea里面是左上角的file-project seetting)

解决发行版本问题 强制约束maven中的jdk版本。直接在pom.xml上设置

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <configuration>
                <source>11</source>
                <target>11</target>
            </configuration>
        </plugin>
    </plugins>
</build>
```



## 其他功能

### 打开UML结构图

比较新的版本的Idea是支持UML结构类图的，找到一个类或者是接口，直接右键，看图操作就可以了。

![image-20200525003140655](https://gitee.com/yhycoder/photo/raw/master/image-20200525003140655.png)

最后的结果就是这样了。

![image-20200525003252342](https://gitee.com/yhycoder/photo/raw/master/image-20200525003252342.png)

## Vscode问题总结

1. ### The compiler compliance specified is 11 but a JRE 12 is used

![image-20200526114928021](https://gitee.com/yhycoder/photo/raw/master/image-20200526114928021.png)

