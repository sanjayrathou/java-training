// DATATYPES IN JS

// number

var num1 = 455;
var num_ = 67.5;
var $num = 78.45;
console.log(num_);

// String 
var str1 = "xyz";
var str1 = 'xyz';
var $str = `xyz`;
console.log(str1)

// boolean 
let a = true;
 a = false;

 // null 
let b = null;

// undefined 
let c;
console.log(c);

// array
let arr = ['xyz', 23, 56.5, true, null];
console.log(arr);

// objects 
let obj1 = {a : 1, b : 23, d : 'uyir'};

const obj2= {a : 1, b : 23, c : 'uyuiuihr'};
obj2.c = 78;  // we are changing the object key and value.
console.log(obj2);

// others are bigint, function, date, 

console.log(a == b);
console.log(a === b);
console.log(typeof(arr));


// new line in js  \n only strings.
console.log("good \nmorning");

const student = {name : "rahul", age : 67, cgpa : 9, isPass : true};
student["cgpa"] = 8;                    // here cgpa is updated.
console.log(student["name"]);
console.log(student["cgpa"]);   

let n = 9;
let  m = 8;
console.log(m+n, m*n);

// PROMPT IN JS
let x = prompt("Enter a number");
x % 5 == 0 ? console.log("yes number is divisible by 5") : console.log("num is not duvisible by 5");
