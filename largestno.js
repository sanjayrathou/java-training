let a = [1,5,2,303,4,56,3,4,5,]
let max = Number.NEGATIVE_INFINITY
for (let i = 0; i <=a.length; i++){
    if(a[i] > max){
        max = a[i]
    }
}
console.log("Highest number is", max)


