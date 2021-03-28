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
> 大括号

    
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
   



cat a.c 显示a.c的代码    
git clone sshkey 复制下来     
git pull    
vi one.c   
git add one.c    
git commit -m"one"    
git push    
 
