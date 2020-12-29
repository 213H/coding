package main

import (
	"fmt"
	"math"
)

type cat struct {
	name string
	age int
}

type myFloat float64
func (n myFloat) show() {//method
	fmt.Println(n)
}

func main() {
	fmt.Println("Hello, World!")
	
	var age int = 123
	fmt.Println(age)
	var str string = "hello"
	fmt.Println(str)
	smart := "hell"
	height := 34
	fmt.Println(height)
	fmt.Println(smart)
	
	fmt.Println(math.Exp2(10))
	
	a := [4] int {1, 2, 3, 4}//tuple
	a[3] = 9
	fmt.Println(a)
	
	b := [] int {1, 2, 3}//切片
	b = append(b, 10)
	fmt.Println(b)
	
	numbers := make(map[string]int)//map[key]value
	numbers["one"] = 1
	numbers["two"] = 2
	numbers["three"] = 3
	fmt.Println(numbers)
	delete(numbers, "one")
	fmt.Println(numbers)
	
	for i := 0; i < 4; i++ {
		fmt.Println(i)
	}
	
	j := 1
	for j < 4 {//while loop
		fmt.Println(j)
		j++
	}
	
	for k, v := range a {//traversal
		fmt.Println(k, v)
	}
	
	sum, product := do_math(4, 7)
	fmt.Println(sum, product)
	
	n := 0 //pointer
	add(&n)
	fmt.Println(n)
	
	newCat := cat{name: "Kitty", age: 23}// structure
	newCat.age = 4
	fmt.Println(newCat)
	
	var num myFloat = 3.4
	num.show()
}

func do_math(x int, y int) (int, int){
	return x + y, x * y
}
func add(n *int){
	*n = *n + 1
}