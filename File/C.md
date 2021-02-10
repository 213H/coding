C

[C-program-language](../../Bookset/编程/C程序设计语言（第2版）.pdf)

[C-primer-plus](../../Bookset/编程/C&#32;Primer&#32;Plus（第五版）.pdf)

起源 Dennis Ritch  Ken Thompson 开发UNIX
标准 1987 Brian Kernighan Dennis Ritchie
    *The C Programing Language*
    标准库 由UNIX提供
ANSI/ISO C C89/C90
C99
C11

- 定义程序的目标
- 设计程序
- 编写代码
- 编译
- 运行程序
- 测试和调试程序
- 维护和修改代码

basename.extenion

GNU gcc cc -v

LLVM Clang cc

main函数 int main(void){}

注释 // /**/

declaration int num;

keyword identifier

命名 避免_ __开始 驼峰命名
|有效|无效|
|--|--|
|wiggles|$z}**|
|Hot_Tub|Hot-Tub|
|taxRate|tax Rate|
|_kcad|don't|
赋值 num = 1;
> lvalue
> rvalue

printf("Hello"); actual argument
printf("Hello\n"); escape sequence
printf("%d", num); 

\t tab
\b backspace 
\n new line
\r return

%d 占位符

return jump

语法错误
语义错误

关键字和保留标识符

常量变量
数据类型 
整数浮点数

整数 int short long  long long %d %hd %ld %lld
    unsigned int %u %lu
    signed int 
    %5d 域宽
|八进制|十六进制|
|-|-|
|%o|%x|
|%#o|%#x %#X|
|0|0x 0X|

字符 char %c 转义
\0oo \xhh ASCII code

_Bool 布尔值 C99

可移植 stdint.h inttype.h C99

浮点 float double long double %f %lf

复数 虚数

其他 数组 指针 结构 联合

刷新输出 printf() buffer 
缓冲区满/换行字符 输入

字符串 character string "string" 'c' character
'\0' null character

strlen() string.h

sizeof strlen char a[4] = {'a', 'b'}
sizeof a = 4 strlen(a) = 2
sizeof 返回值 %zd C99,C11
sizeof(char) 类型
sizeof a sizeof(a) 特定量
建议sizeof()

常量 预处理器
\#TAXRATE 0.015
compile-time substitution 编译时替换
manifest constant 明示变量
大写变量
const int MOUTHS = 12; 限定变量只读
limits.h float.h 类型大小限制
\#define INT_MAX +32767
printf() %d 转换说明 coversion specification

### 常见用法
- 多组输入  while(scanf("%d", &n) != EOF){}
- 文件读取  while((c = getchar())!=EOF){}
- 左右对齐  printf("%-4d", num);
- 输入停止  while((c = getchar()) != '0' && c != EOF) {}



*   预处理
    *   预处理器
        *   \# define 字符替换
        *   \# include 头文件
        *   \# undef
        *   \# ifdef
        *   \# ifndef
        *   \# if
        *   \# else
        *   \# elif
        *   \# endif
        *   \# error
        *   \# pragma
    *   预定义宏
        *   \_\_DATE\_\_
        *   \_\_TIME\_\_
        *   \_\_FILE\_\_
        *   \_\_LINE\_\_
        *   \_\_STDC\_\_
    *   预处理器运算符
        *   宏延续 \\
        *   字符常量化 #
        *   标记粘贴 ##
        *   defined()
    *   参数化宏
        *   \# define square(x) ((x)\*(x))
*   头文件
    *   include"stdio.h"同一工程
    *   include<stdio.h>
    *   include<bits/stdc++.h>
*   数据类型
    *   基本
        *   字符
            *   (unsigned) char %c %s
        *   整数
            * (unsigned) int short long %d %d %l %u
        *   浮点数
            * (unsigned) float double %f %lf %m.nf 5.3f = 5.2 | 5.200| -5.2f = 3.14 |3.14   |
    *   枚举
        *   enum
    *   void
    *   派生
    *   类型转换
        *   (int)
*   变量
    *   标识符
    *   lvaule&rvaule
*   常量
    *   const int var
*   转义
    *   \x6d \107
    *   \n \t
    *   %#X %#o 前导修饰符
    *   '0' "0"
        *   单引号对包括的只能是单个字母，表示一个字母，没有其它任何东西。在存储器中只占用存放一个字母所需的空间。
            双引号对包括的是一个字符串，字符串的结尾必须以'\0'字符(数值0)作为结尾标志。如果包括的是单个字母，表示
            这个字符串只有一个字母成员，再包括末尾的'\0'字符(数值0)作为结尾标志，这样在存储器中实际占用存放两个字
            母所需的空间。
*   数组
    *   a\[100\]
    
*   运算符
    *   运算符
        *   单目
        *   双目
        *   三目
    *   优先级
        *   括号成员是老大;      // 括号运算符 []() 成员运算符.  ->

            全体单目排老二;      // 所有的单目运算符比如++、 --、 +(正)、 -(负) 、指针运算*、&

            乘除余三,加减四;    // 这个"余"是指取余运算即%

            移位五，关系六;     // 移位运算符：<< >> ，关系：> < >= <= 等

            等与不等排行七;     // 即 == 和 !=

            位与异或和位或;     // 这几个都是位运算: 位与(&)异或(^)位或(|)    

            "三分天下"八九十;  

            逻辑与，逻辑或;    // 逻辑运算符: || 和 &&

            十一十二紧挨着;    // 注意顺序: 优先级(||)  底于 优先级(&&) 

            条件只比赋值高,    // 三目运算符优先级排到 13 位只比赋值运算符和 "," 高

            逗号运算最低级!    //逗号运算符优先级最低 
*   语法
    *   tokens
    *   语句结束符 ;
    *   注释 
        *   行注释// 
        *   块注释/\*\*/
    *   标识符
    *   关键字
*   函数
    *   int function(int a,int b){}
    *   scanf
        *  不能读取space \n ->gets
        *  %6d 23333333 = 233333
        *  溢出 不安全性
     *  gets
     *  puts
     *  printf
        *  double float 混用%f
        *  %4d 0004
     *  typedef 
        *  对类型的封装
        *  typedef int INTEGER;
     *  malloc
        *  stdlib.h
        *  (int *)malloc(sizeof(int)) malloc(4)
        *  返回值 void *pointer
        *  free()
*   参数
    *   形参
    *   实参
    *   main参数
*   指针
    *   int \*pointer=&a; 基类型 初始化
    *   内存 
        *   字节为单位 地址值->机器字长 
    *   & \*互为逆运算 
        *   \*降维计算 微分积分
    *   int \*\*pointer=NULL; 二级指针
    *   数组指针 
        *   p=&a\[0\]==p=a \*(p+i)=\*(a+i)=a\[i\] \[\]变址运算 多维数组\*降维
    *   字符串指针
*   函数指针与回调函数
      *   int \*p(int,int);
*   枚举
    *   enum DAY{MON=1,TUE,WED,THU,FRI,SAT,SUN};
    *   MON default=0
    *   enum{spring,summer=3,autumn,winter};0 3 4 5
*   结构体
    *   struct tag{member-list;}variable-list;
*   共用体
    *   union tag{member-definition;}variable
*   标准库
    *   assert.h
    *   ctype.h
    *   errno.h
    *   float.h
    *   limits.h
    *   locale.h
    *   math.h
    *   setjmp.h
    *   signal.h
    *   stdarg.h
    *   stddef.h
    *   stdio.h
        *   标准输入输出 standard input/output
    *   stdlib.h
        *   standard library
    *   string.h
    *   time.h
*   内存管理
    *   动态内存
    *   内存
        *   代码区
        *   全局区
        *   栈区
        *   堆区
    *   内存泄漏
*  数据结构
   *  链表
      *  静态链表
      *  单链表
         *  创建链表
         *  插入节点
         *  创建节点
         *  删除节点
         *  遍历节点
      *  双链表
         *  前驱
         *  后驱
      *  循环链表
         *  头节点连接尾节点