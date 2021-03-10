[Go语言](https://www.bilibili.com/video/BV1jJ411c7s3)

[学习Go语言](../../Bookset/编程/学习Go语言(Golang).pdf)

[Go](https://www.bilibili.com/video/BV16E411H7og)

[doc](https://golang.google.cn/doc/)

## demo.go
```go
// 当前程序的包名
package main

// 导入其他包
import . "fmt"

// 常量定义
const PI = 3.14

// 全局变量的声明和赋值
var name = "gopher"

// 一般类型声明
type newType int

// 结构的声明
type gopher struct{}

// 接口的声明
type golang interface{}

// 由main函数作为程序入口点启动
func main() {
    Println("Hello World!")
}
```