## vim

### 模式

- 普通
- 命令行
- 插入
- 选择
- 可视
- Ex

#### 插入
esc
- i pre
- I line pre
- a end
- A line end
- o pre void line
- O end void line
- s del 
- S del line

Del 
d
- 0 line pre
- ^ line pre
- $ line end
- b word pre
- e word end
- w next word pre
- gg doc pre
- G doc end
2d del No.2 line

p cut paster

y copy

```进入编辑模式，按 o 进行编辑

编辑结束，按ESC 键 跳到命令模式，然后输入退出命令：

:w保存文件但不退出vi 编辑

:w! 强制保存，不退出vi 编辑

:w file将修改另存到file中，不退出vi 编辑

:wq保存文件并退出vi 编辑

:wq!强制保存文件并退出vi 编辑

q:不保存文件并退出vi 编辑

:q!不保存文件并强制退出vi 编辑

:e!放弃所有修改，从上次保存文件开始在编辑
```
## 命令

|command|parameter|note|
|:--|:--:|--:|
|mkdir|new folder||
|cd|change document||
|ls|list||
|dir|directory||
|cp|copy||
|rm|remove||
||-r|recurive
||-f|force
|gcc|||
||-g||
||-c||
||-o||
|vi|||
|cat|preclsview||
|pwd|print working directory||
|touch|new file||
|sudo|superuserdo||
## WSL
kali-win-kex
传统模式：Linux命令kex或kex –win，具有全屏和窗口模式。

停止使用Linux命令kex –stop或kex –win –stop，退出子系统图形化界面。

全屏或窗口模式切换中【F8】是唯一的子系统功能键，可退出全屏模式。

进入超级用户模式的Linux命令为sudo kex或sudo kex –win


融合模式：运行Linux命令kex –sl、停止Linux命令kex –sl –stop
进入超级用户模式的Linux命令sudo kex –sl

传统模式中全屏状态带来不弱于物理系统的感受，但是由于环境限制，运行资源效率稍弱。
融合模式中Linux和Windows程序对话框窗口遵守常规的层位关系，不存在双系统之间应用置顶现象。

kex -s
kex --sound

sudo apt update && sudo apt upgrade