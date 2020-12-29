RegExp

*   通配符
    *   \* 任意个字符
    *   ? 零个或一个
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
    *   *
    *   +
    *   ?
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

runoo+b runoo至少出现一次
runoo*b     任意次
runoo?b     最多一次
[ . ] .