let arr = [1,5,2,303,4,56,3,4,50,];
let max = Number.NEGATIVE_INFINITY;
let secondMax = Number.NEGATIVE_INFINITY;
for (let i = 0; i <arr.length; i++){

    if(arr[i] > max){
        secondMax = max;
        max = arr[i]
    }
    if((arr[i] > secondMax) && arr[i] != max){
        secondMax = arr[i];
    }
}
console.log("Largest number is", max);
console.log("Second largest number is", secondMax);
