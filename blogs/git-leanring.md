1. git reset HEAD <file>

   用来取消暂存文件，就是git add 1和2，但是你不想提交2了。那么就可以用该命令去取消。

2. git checkout -- <file>

   用来撤销对文件的修改，在changes not staged for commit 中经常看到，这个是可以还原成它上次提交的时候的样子。需要注意的是，你自上次修改后的内容将全部作废，所以这个命令还是蛮危险的

3. git add /git commit

   - 没有git add出现的问题

   ![image.png](https://i.loli.net/2019/12/25/WextlUsMmFfRNEu.png)

   这里的untacked 是指在本地仓库，就是在文件夹中修改了文件，这里的修改包括你新增文件，或者在原来的基础上进行的修改。

   - 需要git add 才可以使这些红色提醒给去掉

   ![image.png](https://i.loli.net/2019/12/25/9Y6fejpkOJLF7SB.png)

   git add之后，只是将本地推到git里面的索引区，没有真正推到git的栈区，要执行git commit 才可以

![image.png](https://i.loli.net/2019/12/25/DPHsNQa4bpiFodA.png)

![image.png](https://i.loli.net/2019/12/25/afUHQvsroZqDkdm.png)