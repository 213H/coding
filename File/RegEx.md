# RegExp

[reg](https://deerchao.cn/tutorials/regex/regex.htm)

*   通配符
    *   \* 任意个字符
    *   ? 零个或一个
    *   . 任意一个
    *   ^ 行的开始
    *   $ 行的结束
    *   [ 0-9 ] 数字
    *   [ a-z ] 字母
    *   [] 多个单字符
    *   +一个或多个
*   元字符
    *   . 除换行符
    *   \ w word
    *   \ s space
    *   \ d digit
    *   \ b word begin end
    *   \ r return
    *   ^ begin position
    *   $ end
    *   反义
        *   \ W
        *   [ x ] anti x
        *   [ aeiou ] anti aeiou
    *   转义
        *   \
*   限定符
    *   *   0+
    *   +   1+
    *   ?   0, 1
    *   {n} 匹配确定次
    *   {n,} 匹配至少n次
    *   {n,m} 匹配n至m次
*   修饰符 标记
*   /pattern/flags
*   /i ignore
*   /g golbal
*   /m multi line
*   /s
*   注释
    *   (?\# 注释)
    *   #
*   匹配空行
    *   ^[ \t]*\n 
    *   ^\s*\n

runoo+b 
runoo*b     
runoo?b     
runoo{3}b
runoo{2, 7}b
runoo{2,}b  2+
[ . ]       .