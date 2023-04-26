
let count = 0;
for(let num = 1; num <= 499; num++){
    for(let i = 2; i <= num-1; i++){
        if(num % i == 0){
            count++;
        }
    }
    if (count == 0){
        console.log(num)
    }
    else {
        count = 0;
    }
}