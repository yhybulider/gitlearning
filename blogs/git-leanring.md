1. git reset HEAD <file>

   用来取消暂存文件，就是git add 1和2，但是你不想提交2了。那么就可以用该命令去取消。

2. git checkout -- <file>

   用来撤销对文件的修改，在changes not staged for commit 中经常看到，这个是可以还原成它上次提交的时候的样子。需要注意的是，你自上次修改后的内容将全部作废，所以这个命令还是蛮危险的

3. 