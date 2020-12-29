 source file extenion .cc .cxx .cpp .cp .C <compoiler>
 command
 $ cc prog1.cc
 可执行文件 Windows prog1.exe UNIX a.out
 run 
 |Windows|UNIX|
 |--|--|
 |prog1|a.out|
 |.\prog1|./a.out|
 |当前目录||
 返回值 
 windows $ echo %ERRORLEVEL% 
 UNIX $ echo $?

 GNU $ g++ -o prog1 prog1.cc
    C++11 -std=c++0x
Visual Studio C:\Users\me\Programs> cl /EHsc prog1.cpp

IO 标准库 standard library iostream
IO对象 cin cout cerr clog

std::cout<<"Enter two numbers:"<<std::endl;
== (std::cout<<"Enter two numbers:") <<std::endl;
== std::cout<<"Enter two numbers:";
    std::cout<<std::endl;
<<输出运算符
第一行 打印一个字符串字面值常量
string literal
第二行 打印endl 操纵符 manipulator 结束当前行
buffer 刷到设备 刷新流
std:: std namespace
::作用域运算符
>>输入运算符
注释
单行 //
界定符 /**/ 不能嵌套