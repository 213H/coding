//alert("hello!");



var name = "Mark"; //global var
let age = 20;
age = 21;
const sex = "male";
const iscool = true;
const fl = 4.3;
const x = null;
const y = undefined;
let a;
console.log(age + sex);
console.log("My name is " + name + " and my age is " + age);
console.log(`My name is ${name} and my age is ${age}`);
// String,Number,Bollean,null,undefined,symbol
console.log(typeof name);



let s = "Hello world!";
console.log(s.length);
console.log(s.substring(0,5).toUpperCase());
s = "huawei, google, apple, dji, tecent ,ibm, intel, amd";
console.log(s.split(', '));



//Array
const numbers = new Array/*struct*/(1,2,3,4,5);
console.log(numbers);
const fruits = ['apple','pear','watermelon'];
fruits[3] = 'grape';
fruits.push('mango');// add end
//unshift begin
//pop cut the end
console.log(fruits[3]);
console.log(Array.isArray(fruits));
console.log(fruits.indexOf('apple'));



const person = {
    firstName : 'hongliang',
    lastName : 'chen',
    age : 30,
    hobbies :['movies','sports'],
    address : {
        street : 'fifth street',
        city : 'linyi',
        state : 'shandong'
    }
}
console.log(person.address);



//destructing ES6
const { firstName, address: { city}} = person;
console.log(city);
person.email = 'mark@gmail.com';
console.log(person);



const todos = [
    {
        id: 0,
        text: 'Power',
        isCompelet: true 
    },
    {
        id: 1,
        text: 'Reboot',
        isCompelet: true 
    },
    {
        id: 2,
        text: 'Close',
        isCompelet: false
    },
];
 


const todosJSON = JSON.stringify(todos);
console.log(todosJSON);



//FOR LOOP
for(let i = 0; i < 10; i++){
    console.log(i);
}



//while loop
let zoo = 0;
while(zoo < 10){
    console.log(`the loop number is ${zoo}`);
    zoo++;
};

for(let i = 0; i < todos.length; i++){
    console.log(todos.text);
}

for(let todo of todos){
    console.log(todo.text);
}

//forEach, map, filter
todos.forEach(function(todo){
    console.log(todo.text);
});

const tdText = todos.map(function(todo){
    return todo.text;
});
console.log(tdText);

const todoCompelet = todos.filter(function(todo){
    return todo.isCompelet === true;
}).map(function(todo){
    return todo.text;
});
console.log(todoCompelet);

// if else
const zeus = 10;
if(zeus === 10){
    console.log("zeus is 10.");
} else if(zeus >10){
    console.log("zeus is greater than 10.");
}else{
    console.log("zeus is less than 10.");
}//double equal = value    triple equal = strict equal value&type

//switch
const color = 'blue';
switch(color){
    case 'blue':
        console.log('color is blue.');
        break;
    case 'red':
        console.log('color is red.');
        break;
    case 'green':
        console.log('color is green.');
        break;
    default:
        console.log('color is NOT blue, red or green.');
        break;
}



//functions
function addNums(num1 = 12, num2 = 34){ //default value
    console.log(num1+num2);
}
addNums(23, 33);

function addNums_(num1 = 12, num2 = 34){ //default value
    return num1+num2;
}
console.log(addNums(23, 33));

//arrow function
const  addNums__ = (num1 = 12, num2 = 13) => { //default value
    return num1+num2;
}
console.log(addNums(23, 33));

const  addNums___ = (num1 = 12, num2 = 34) => num1+num2;

console.log(addNums(23, 33));

const  addNums_____ = num1  => num1 + 5;

console.log(addNums(12));


function Person(firstName, lastName, dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
}
//Instantiate object
const person1 = new Person('Mark', 'Chen', '1-5-2001');
console.log(person1);
console.log(person1.dob);

//date format
function Person_(firstName, lastName, dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = new Date(dob);
}

const person1_ = new Person_('Mark', 'Chen', '1-5-2001');
console.log(person1_);
console.log(person1_.dob);

//class
class Person__{
    constructor(firstName, lastName, dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
    getBrithYear () {
        return this.dob.getFullYear();
    }
    getFullName () {
        return `${this.firstName} ${this.lastName}`;
    }
}