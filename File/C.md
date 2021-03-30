## Intro

[C-program-language](../../Bookset/编程/C程序设计语言（第2版）.pdf)

[C-primer-plus](../../Bookset/编程/C&#32;Primer&#32;Plus（第五版）.pdf)


- Source Dennis Ritch  Ken Thompson 开发UNIX
- Format 1987 Brian Kernighan Dennis Ritchie
    - *The C Programing Language*
    - 标准库 由UNIX提供
    - ANSI/ISO-C C89/C90
    - C99
    - C11

- 定义程序的目标
- 设计程序
- 编写代码
- 编译
- 运行程序
- 测试和调试程序
- 维护和修改代码

GNU gcc -v

LLVM Clang

### 常见用法
- 多组输入  while(scanf("%d", &n) != EOF){}
- 文件读取  while((c = getchar())!=EOF){}
- 左右对齐  printf("%-4d", num);
- 输入停止  while((c = getchar()) != '0' && c != EOF) {}


-   预处理
    -   预处理器
        -   \# define 字符替换
        -   \# include 头文件
        -   \# undef
        -   \# ifdef
        -   \# ifndef
        -   \# if
        -   \# else
        -   \# elif
        -   \# endif
        -   \# error
        -   \# pragma
    -   预定义宏
        -   \_\_DATE\_\_
        -   \_\_TIME\_\_
        -   \_\_FILE\_\_
        -   \_\_LINE\_\_
        -   \_\_STDC\_\_
    -   预处理器运算符
        -   宏延续 \\
        -   字符常量化 #
        -   标记粘贴 ##
        -   defined()
    -   参数化宏
        -   \# define square(x) ((x)\-(x))
-   头文件
    -   include"tool.h"同一工程
    -   include<stdio.h>
    -   include<bits/stdc++.h>
-   数据类型
    -   基本
        -   字符
            -   (unsigned) char %c %s
        -   整数
            - (unsigned) int short long %d %d %l %u
        -   浮点数
            - (unsigned) float double %f %lf %m.nf
    -   枚举
        -   enum
    -   void
    -   派生
    -   类型转换
        -   (int)
-   变量
    -   标识符
    -   lvaule
    -   rvaule
-   常量
    -   const int
-   转义
    -   \
    -   %#X %#o 前导修饰符
-   数组
    
-   运算符
    -   运算符
        -   单目
        -   双目
        -   三目
    -   优先级
-   语法
    -   语句结束符 ;
    -   注释 
        -   // /--/ 
    -   标识符
    -   关键字
-   函数
    -   scanf
        -  whitespace \n ->gets
        -  overflow unsafe
     -  gets
     -  puts
     -  printf
     -  typedef 
        -  typedef int INTEGER;
     -  malloc
        -  stdlib.h
        -  (int -)malloc(sizeof(int)) malloc(4)
        -  free
-   指针
    -   int *pointer=null;
    -   取地址 & 
    -   取指向 *
    -   变址 [] 
-   函数指针与回调函数
      -   int *p(int,int);
-   枚举
    -   enum DAY{MON=1,TUE,WED,THU,FRI,SAT,SUN};
-   结构体
    -   struct tag{member-list;}variables;
-   共用体
    -   union tag{member-definition;}variables;
-   标准库
    -   assert.h
    -   ctype.h
    -   errno.h
    -   float.h
    -   limits.h
    -   locale.h
    -   math.h
    -   setjmp.h
    -   signal.h
    -   stdarg.h
    -   stddef.h
    -   stdio.h
        -   标准输入输出 standard input/output
    -   stdlib.h
        -   standard library
    -   string.h
    -   time.h
-   内存管理
    -   动态内存
    -   内存
        -   代码区
        -   全局区
        -   栈区
        -   堆区
    -   内存泄漏
