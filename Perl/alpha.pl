#!usr/bin/perl #-w

# use strict
# use warning
# perl -w

print("Hello world!\n");
print "Hello world!\n";
$x = 23;
$y = 023;
$z = 0x23;

$s = 1.23e-2;
$t = 2_234_345_233;
$a = 123;

@a = {1..8};
@b = qw(ssss eee rrr);
$c = shift(@a);
$d = unshift(@a,"see");
$f = pop(@a);
%g = push(@a,677);

@a[-1];
@#a;      #last one

%a = {"huawei"=>1,"apple"=>2,"google"=>3};
print"\$a = $a\n";
print"\$a[0] = $a[0]\n";
print"\$a{"huawei"} = $a{"huawei"}";

g-print(){
    my $x = 123;
    print("$x");
}

f-print(){
    local $x = 1;
    g-print;
}

RegEx{
    data =~ m/RegEx/ 
    # m// = //  m!! m%%
    /reg/
    $_ = m/reg/
    $& #引用匹配内容
    $` #匹配前
    $' #匹配后
    m/REG/i
    # i 忽略大小写
    # g 全局
    # c g失败 不重置
    # m 多行
    # s . -> \n
    # x 允许REG使用空白 原本空白失去意义 \s匹配空白
    # o 执行一次
    # n 非捕获模式
    # p ${^PREMATCH} ${^MATCH} ${^POSTMATCH} $` $&  $'
}