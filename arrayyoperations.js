var arr = Array("delhi","mumbai","ghaziabad","Kolkata");
arr.push ( "sanjay","rathour");
console.log(arr);
const x = arr.pop();
console.log(x ,"is deleted");
console.log(arr)
arr.shift(); // shift is used to remove the first element
console.log(arr)
arr.unshift("VIP"); // unshift is used to add at the first position
console.log(arr)
arr.splice(2,1,"lucknow") // replace
console.log(arr)

