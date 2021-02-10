package main

import (
	"fmt"
	"os"
	"time"
)

func main(){
	kit := make(map[string]string)
	kit["ph"] = "15197175562"
	kit["gmail"] = "u78k4l67@gmail.com"
	kit["163"] = "u78k4l67@163.com"
	fmt.Println(kit)



	format := make(map[string]map[string]string)
	QQ := make(map[string]string)
	csdn := make(map[string]string)
	qq := make(map[string]string)
	QQ["3324910753"] = "010501chl"
	format["QQ"] = QQ
	csdn["ph"] = "010501"
	format["CSDN"] = csdn
	qq["2819328865"] = "qq010501"
	format["qq"] = qq
	fmt.Println(format)
	var euro string
	fmt.Scanln(&euro)
	fmt.Println(format[euro])


	file, err := os.Create("data.txt")
	if err != nil {
		fmt.Println(err)
	}

	defer file.Close()

	file.WriteString(time.Now().Local().String())
}