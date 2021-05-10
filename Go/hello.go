package main

import (
	"fmt"
	"math"
	"time"
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
	var tag bool = true
	var str string = "hello"
	fmt.Println(str)
	smart := "hell"
	height := 34
	if tag {
		fmt.Println(height)
	}
	
	fmt.Println(smart)
	
	fmt.Println(math.Exp2(10))
	
	a := [4] int {1, 2, 3, 4}// tuple
	a[3] = 9
	fmt.Println(a)
	
	b := [] int {1, 2, 3}// slice
	b = append(b, 10)
	fmt.Println(b)
	
	hashmap()
	
	forloop()
	
	whileloop()
	
	traversal()
	
	callfunc()
	
	pointer()
	
	structure()
	
	object()

	times()

	hello()
}

func do_math(x int, y int) (int, int){
	return x + y, x * y	// multiple return value
}
func add(n *int){
	*n = *n + 1
}
func hashmap(){
	numbers := make(map[string]int)// map[key]value
	numbers["one"] = 1
	numbers["two"] = 2
	numbers["three"] = 3
	fmt.Println(numbers)
	delete(numbers, "one")
	fmt.Println(numbers)
}
func forloop(){
	for i := 0; i < 2; i++ {
		fmt.Println(i)
	}
}
func whileloop(){
	j := 1
	for j < 4 {//while loop
		fmt.Println(j)
		j++
	}
}
func traversal(){
	a := [4] int {1, 2, 3, 4}
	for k, v := range a {//traversal
		fmt.Println(k, v)
	}
}
func callfunc(){
	sum, product := do_math(4, 7)
	fmt.Println(sum, product)
}
func pointer(){
	n := 0 //pointer
	add(&n)
	fmt.Println(n)
}
func structure(){
	newCat := cat{name: "Kitty", age: 23}// structure
	newCat.age = 4
	fmt.Println(newCat)
}
func object(){
	var num myFloat = 3.4
	num.show()				//method
}
func times(){
	fmt.Println(time.Now())
}

func hello(){
	fmt.Println("My name is chenhongliang, my height is", 140 * 1.1, "cm and my weight is", 60 * 1.1)
}