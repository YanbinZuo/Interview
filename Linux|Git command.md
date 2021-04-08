## Linux Command   
1)cd： 改变目录     
2)cd.. 回退到上一个目录，直接cd进入默认目录     
3)pwd：显示当前所在的目录路径。     
4)ls(||)：都是列出当前目录的所有文件，只不过两个||列出的内容更为详细     
5)touch：新建一个文件，如touch index.js 就会在当前目录下创建一个index.js文件     
6)rm：删除一个文件，rm index.js就会把index.js删除     
7)mkdir：新建一个目录，就是新建一个文件夹。     
8)rm-r：删除一个文件夹, rm-r src删除src目录       
9)mv：文件移动，mv idnex.html src index.html是我们要移动的文件，src是目标文件夹，当然，这样写，必须是在同一目录下      
10)reset：重新初始化终端/清屏      
11)clear：清屏    （windows里叫做cls）    
12)history：查看命令历史    
13)help：帮助    
14)exit：退出    
15)#：表示注释    

（rm -rf/删除电脑所有文件）   

    
sudo（管理员程序）    
clear    
cc -v(gcc -v)查看当前版本    
cd 进入目录    
cd ~ enter home    
pwd 查看当前路径   
ls 包含的文件夹    
ls -l显示当前文件的用户权限 用户 用户组 类型和时间   
touch abcd 创建abcd文件    
rm abcd 删除abcd文件   
mkdir workspace 创建文件夹   
vim(vi) a.c 进入a.c    
esc 编辑状态下按esc进入命令模式    
按shift+：   这时左下角出现冒号，你再输入q，表示退出，wq，保存退出，q!,强制退出，wq!强制保存退出   
i 在当前光标前面加入字符   
a 在当前光标后面加入字符   
shift+i 在本行行首加入字符   
shift+a 在本行末尾加入字符   
o 下一行插入字符   
shift+o 上一行插入字符   
x 删除字符   
dd 删除一整行   
cc a.c 创建a.out    
./a.out 输出代码结果    
sp max.c 分行代码   
ctrl+w+下箭头 跳转到下边的代码    
set nu(number) 打开行号   
set nonumber 关闭行号    
如果9行 9+dd（此时进入剪切板） 然后crtl+w+上箭头 再按P 粘贴    
wqa 把多有的文件都保存并且退出   
gcc -g a.c then, gdb ./a.out进入gdb    
list 打开代码   
start 开始调试    
n 下一行    
p a 打印a  
s(step) 进入    
q 退出   

man [function name] 查看function的具体用法  
man 2 [function name] 查看function的更详细的具体用法    
hexdump [file] 查看binary format file     
hexdump -c [file] 查看binary format file 并且一个byte为单位   
xxd [file] 查看binary format file   
cat ./w [file] | hexdump -c 查看可执行文件输出后的binary format file   
   

## Git Knowledge:   
git init 初始化
git statux 查看当前状态
cat a.c 显示a.c的代码    
git clone sshkey 复制下来     
git pull    
vi one.c   
git add one.c         git add . 添加所有文件到暂存区     
git commit -m"one"    git commit -m提交暂存区的内容到本地仓库    -m 提交信息     
git push    
    git有四个工作区域：工作目录(Working Directory)，暂存区(Stage/Index)，资源库(Repository/Git Directory)和远程的git仓库(Remote Directory)。    
    **Workspace：** 工作区，平时存放代码的地方；        
    **Stage/Index：** 暂存区，用于临时存放你的改动，事实上它只是一个文件，保存即将提交到你的文件列表信息；    
    **Repository：** 仓库区或本地仓库，就是安全存放数据的位置，这里面有你提交到所有版本的数据。其中Head指向最新放入仓库的版本；    
    **Remote：** 远程仓库，托管代码的服务器，可以简单的认为是你项目组中的一台电脑用于远程数据交换。    
    *Working Directory* ----git add files----> *Stage* ----git commit----> *History(local directory)* ----git push----> *Remote Directory*    
    *Remote Directory*  ----git pull----> *History(local directory)* ----git reset----> *Stage* ----git checkout----> *Working Directory*    
**忽略文件(.gitignore)：**
    1. 忽略文件空行或以#开始的行会被忽略    
    2. 可以使用Linux通配符。例如，* 代表任意多个符号，？代表一个字符，[abc]代表可选字符范围，{string1,string2}代表可选字符串    
    3. 如果名称的最前面有一个感叹号 ！，代表例外规则，将不被忽略    
    4. 如果文件最前面有一个路径分隔符 /，表示要忽略的文件在此目录下，而子目录中的文件不忽略    
    5. 如果文件最后面有一个路径分隔符 /，表示要忽略的是此目录下该名称的子目录，而非文件   
    
    *.txt         #忽略所有.txt结尾的文件    
    !lib.txt      #忽略lib.txt除外的所有文件    
    /temp         #忽略项目根目录下的TODO文件，不包括其他目录temp
    build/        #忽略build/目录下的所有文件
    doc/*.txt     #会忽略 doc/notes.txt文件   但不包括doc/server/arch.txt
 
> git bash configuration 
     
    git config -l(l is list)   
    git --system --list：查看系统config     
    git --global --list：查看当前用户配置    
    
> git branch
    git branch                                  列出本地所有分支    
    git branch -r                               列出所有远程分支    
    git branch [name]                           新建一个分支，但依然停留在当前分支    
    git checkout -b [name]                      新建一个分支，并切换到该分支     
    git merge [branch]                          合并指定分支到当前分支     
    git branch -d [name]                        删除分支   
    git push origin --delete [branch-name]      删除远程分支    
    git branch -dr [remote/branch]              删除远程分支    
