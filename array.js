var arr = [1,"ug",78,true,98,56,"sanjay"];  // By square bracket
var arr1 = new Array(6,"ug",78,true,98,56,"sanjay"); //  By constructor
var arr2 = Array(6,"ug",true,"pop",56,"sanjay"); // By literal
console.log(arr[3]);
console.log(arr.length);
arr[3] = "rathour";
console.log(arr);
console.log(arr[8]);
console.log(arr1);
for(let i = 0; i < arr1.length; i++){
    console.log(arr1[i]);
}
for(const element of arr2){
    console.log(element);
}

